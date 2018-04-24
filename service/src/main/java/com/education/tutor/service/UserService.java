package com.education.tutor.service;

import com.education.tutor.api.BaseRes;
import com.education.tutor.api.TreeNode;
import com.education.tutor.api.TupleIdValue;
import com.education.tutor.api.UserBasic;
import com.education.tutor.api.user.*;
import com.education.tutor.db.FieldConstants;
import com.education.tutor.db.domain.*;
import com.education.tutor.db.mapper.LoginMapper;
import com.education.tutor.db.mapper.TblMenuMapper;
import com.education.tutor.db.mapper.TblUserMainMapper;
import com.education.tutor.db.mapper.UserMapper;
import com.education.tutor.vo.UserPrincipalVO;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserService {

    private final Log logger = LogFactory.getLog(this.getClass());

    @Autowired
    TblUserMainMapper tblUserMainMapper;

    @Autowired
    LoginMapper loginMapper;

    @Autowired
    TblMenuMapper tblMenuMapper;

    @Autowired
    UserMapper userMapper;

    @Autowired
    CommonService commonService;

    @Autowired
    I18nService i18nService;

    ObjectMapper om = new ObjectMapper();

    @Autowired
    StringRedisTemplate redisTemplate;

    @Value("${im.user.prefix}")
    String imUserPrefix;

    @Value("${redis-user-logintoken.duration.seconds}")
    private long duration = 3600 * 72;

    final static String ORG_PREFIX = "o_";

    final static String USER_PREFIX = "u_";

    public final static String USERPRINCIPAL_KEY_PREFIX = "UP:USERPRINCIPAL_";

    public final static String TOPIC_LABEL_MAIN_ORDER_BY = "LABEL_MAIN:LABEL_MAIN_ORDER";

    private String USERSIGNISOK = "SIGN:USERSIGNISOK_";//当日是否签到

    @Value("${gold.partner.num}")
    String goldPartnerNum;

    @PostConstruct
    public void init() {
        om.setSerializationInclusion(Include.NON_NULL);
    }



    public UserPrincipalVO getUserPrincipalVO(String username) {
        UserPrincipalVO vo = new UserPrincipalVO();
        TblUserMainExample umExample = new TblUserMainExample();
        umExample.createCriteria().andUsernameEqualTo(username);
        List<TblUserMain> result = tblUserMainMapper.selectByExample(umExample);
        if (result.isEmpty()) {
            return null;
        }
        vo.setBasic(result.get(0));
        vo.setAuthorities(loginMapper.getUserAuthorities(username));
        logger.debug(username + " authorities " + vo.getAuthorities().stream().collect(Collectors.joining()));
        List<TupleIdValue> groups = loginMapper.getRoles(username);
        vo.setRoles(groups.stream().map(TupleIdValue::getValue).collect(Collectors.toList()));
        logger.debug(username + " roles " + vo.getRoles().stream().collect(Collectors.joining()));
        List<Long> groupIds = groups.stream().map(TupleIdValue::getId).collect(Collectors.toList());



        vo.setGroups(loginMapper.getGroups(username));

        return vo;
    }





    public MyInfoRes myInfo(MyInfoReq req, UserPrincipalVO user) {
        Long userId = user.getBasic().getUserMainId();
        TblUserMain record = tblUserMainMapper.selectByPrimaryKey(userId);
        UserBasic ub = mapUserBasic(record);


        MyInfoRes res = new MyInfoRes(ub);
        res.setCode(0);
        return res;
    }

    public ModifyMyInfoRes modifyMyInfo(ModifyMyInfoReq req, UserPrincipalVO user) throws Exception {
        Long userId = user.getBasic().getUserMainId();
        TblUserMain record = tblUserMainMapper.selectByPrimaryKey(userId);
        if (StringUtils.isNotEmpty(req.getAvatar())) {
            record.setAvatar(req.getAvatar());
        }
        if (req.getLang() != null) {
            record.setUserLang((short) FieldConstants.USER_MAIN_LANG.valueOf(req.getLang()).ordinal());
        }
        record.setProfession(req.getProfession());
        record.setProfile(req.getIntroduction());
        if (req.getSex() != null) {
            record.setGender((short) (req.getSex() - 1));
        }

        record.setOrganization(req.getOrganization());
        record.setLivingCountry(req.getLivingCountry());
        record.setLivingProvince(req.getLivingProvince());
        record.setLivingCity(req.getLivingCity());

        if (StringUtils.isNotEmpty(req.getNickName())) {
            record.setNickName(req.getNickName());
        }
        if (StringUtils.isNotEmpty(req.getMobile())) {
            record.setMobile(req.getMobile());
        }
        if (StringUtils.isNotEmpty(req.getEmail())) {
            record.setEmail(req.getEmail());
        }
        record.setCountryCode(req.getCountryCode());

        record.setGivenName(req.getName());

        record.setUpdatedAt(new Date());
        tblUserMainMapper.updateByPrimaryKey(record);
        reloadRedis(user.getBasic().getUsername());



        ModifyMyInfoRes res = new ModifyMyInfoRes();
        res.setCode(0);
        return res;
    }



    public static String composeLivingAddress(TblUserMain record) {
        StringBuilder sb = new StringBuilder();
        sb.append(Optional.ofNullable(record.getLivingCountry()).orElse("")).append(" ")
                .append(Optional.ofNullable(record.getLivingProvince()).orElse("")).append(" ")
                .append(Optional.ofNullable(record.getLivingCity()).orElse("")).append(" ")
                .append(Optional.ofNullable(record.getLivingArea()).orElse("")).append(" ")
                .append(Optional.ofNullable(record.getLivingStreet()).orElse(""));
        return sb.toString();
    }

    public static String composeLivingAddressByComma(TblUserMain record) {
        StringBuilder sb = new StringBuilder();

        if (record.getLivingCountry() != null && StringUtils.isNotEmpty(record.getLivingCountry())) {
            sb.append(record.getLivingCountry());
        }
        if (record.getLivingProvince() != null && StringUtils.isNotEmpty(record.getLivingProvince())) {
            sb.append(",").append(record.getLivingProvince());
        }
        if (record.getLivingCity() != null && StringUtils.isNotEmpty(record.getLivingCity())) {
            sb.append(",").append(record.getLivingCity());
        }
        if (record.getLivingArea() != null && StringUtils.isNotEmpty(record.getLivingArea())) {
            sb.append(",").append(record.getLivingArea());
        }
        if (record.getLivingStreet() != null && StringUtils.isNotEmpty(record.getLivingStreet())) {
            sb.append(",").append(record.getLivingStreet());
        }

        //
        // sb.append(Optional.ofNullable(record.getLivingCountry()).orElse("")).append(",")
        // .append(Optional.ofNullable(record.getLivingProvince()).orElse("")).append(",")
        // .append(Optional.ofNullable(record.getLivingCity()).orElse("")).append(",")
        // .append(Optional.ofNullable(record.getLivingArea()).orElse("")).append(",")
        // .append(Optional.ofNullable(record.getLivingStreet()).orElse(""));
        return sb.toString();
    }





    public List<TblUserMain> getUserMainListByUsername(String username) {
        TblUserMainExample umExample = new TblUserMainExample();
        umExample.createCriteria().andUsernameEqualTo(username);
        List<TblUserMain> result = tblUserMainMapper.selectByExample(umExample);
        return result;
    }

    public static List<UserBasic> mapUserBasic(List<TblUserMain> records) {
        return records.stream().map(record -> mapUserBasic(record)).collect(Collectors.toList());
    }

    public static UserBasic mapUserBasic(TblUserMain record) {
        UserBasic ub = new UserBasic();
        ub.setUserId(record.getUserMainId());
        ub.setUserName(record.getUsername());
        if (record.getUserLevel() != null) {
            ub.setUserLevel(record.getUserLevel());
        }
        if (record.getGender() != null) {
            ub.setSex(record.getGender() + 1);
        } else {
            // unknown sex value
            ub.setSex(3);
        }
        ub.setAvatar(record.getAvatar());
        ub.setIntroduction(record.getProfile());
        ub.setOrganization(record.getOrganization());
        ub.setProfession(record.getProfession());
        ub.setLocation(composeLivingAddress(record));
        ub.setAddress(composeLivingAddressByComma(record));
        ub.setNickName(record.getNickName());
        ub.setEmail(record.getEmail());
        ub.setCountryCode(record.getCountryCode());
        ub.setMobile(record.getMobile());
        ub.setPartnerNo(record.getPartnerNo());
        ub.setUserLevel(record.getPartnerLevel() == null ? 0 : record.getPartnerLevel());
        ub.setName(record.getGivenName());
        return ub;
    }


    public UserPrincipalVO reloadRedis(String username) {
        try {
            UserPrincipalVO vo = getUserPrincipalVO(username);
            if (vo == null) {
                throw new Exception(username + " not found from user_main with username, mobile, email");
            }
            String data = om.writeValueAsString(vo);
            String key = USERPRINCIPAL_KEY_PREFIX + username;
            redisTemplate.opsForValue().set(key, data, duration, TimeUnit.SECONDS);
            return vo;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public String loadUserPrincipalStringFromRedis(String username) {
        String key = UserService.USERPRINCIPAL_KEY_PREFIX + username;
        String data = redisTemplate.opsForValue().get(key);
        if (data != null) {
            Date now = new Date();
            redisTemplate.expireAt(key, new Date(now.getTime() + (duration * 1000)));
        }
        return data;
    }

    public SetMyLanguageRes setMyLanguage(String lang, UserPrincipalVO user) {
        SetMyLanguageRes res = new SetMyLanguageRes();
        short userLang = (short) FieldConstants.USER_MAIN_LANG.valueOf(lang).ordinal();
        user.getBasic().setUserLang(userLang);
        user.getBasic().setUpdatedAt(new Date());
        tblUserMainMapper.updateByPrimaryKey(user.getBasic());
        reloadRedis(user.getBasic().getUsername());
        res.setCode(0);
        return res;
    }


    public void setUserDevice(UserPrincipalVO user, String userAgent, String userIp) {
        TblUserMain userMain = tblUserMainMapper.selectByPrimaryKey(user.getBasic().getUserMainId());
        userMain.setLastLoginDevice(userAgent);
        userMain.setLastLoginIp(userIp);
        tblUserMainMapper.updateByPrimaryKey(userMain);

    }



    String[] nodesFromRoot(TblOrganization fRoot, TblOrganization o) {
        String rootToNode = o.getOrgPath().substring(o.getOrgPath().indexOf(fRoot.getOrganizationId() + ""));
        String[] nodes = rootToNode.split(",");
        return nodes;
    }

    void setOrgTreeNode(HashMap<String, TreeNode> tnMap, TblOrganization o) {
        TreeNode ptn = tnMap.get(ORG_PREFIX + o.getOrgParentId());
        TreeNode child = tnMap.get(ORG_PREFIX + o.getOrganizationId());
        ptn.getChildren().add(child);
        logger.debug("--> add org child " + child.getId() + " to parent " + ptn.getId());
    }


    public UserBasic setNickName(UserBasic user) {
        if (user != null) {
            user.setNickName(getNickName(user.getNickName(), user.getUserName()));
        }
        return user;
    }



    /**
     * 获取用户信息
     *
     * @param userId
     * @return
     */
    public UserBasic getBaseUser(Long userId) {
        if (userId != null) {
            return userMapper.getUserById(userId);
        }
        return null;
    }


    public String getNickName(String nickName, String userName) {
        if ((nickName == null || "".equals(nickName)) && userName != null && !"".equals(userName)) {
            StringBuilder strb = new StringBuilder();
            for (int i = 0; i < userName.length(); i++) {
                if (userName.indexOf("@") > 0) {
                    if (i > 3 && i < userName.indexOf(".")) {
                        strb.append("*");
                    } else {
                        strb.append(userName.charAt(i));
                    }
                } else {
                    if (i > 2 && i < userName.length() - 4) {
                        strb.append("*");
                    } else {
                        strb.append(userName.charAt(i));
                    }
                }
            }
            return strb.toString();
        }
        return nickName;
    }


}
