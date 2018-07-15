package com.education.duobei;

import com.duobeiyun.DuobeiYunClient;
import com.education.duobei.vo.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Created by 雪峰 on 2018/5/8.
 */
@Service
public class DuoBeiService {

    private DuobeiYunClient client = new DuobeiYunClient();

    private final Log logger = LogFactory.getLog(this.getClass());

    ObjectMapper om = new ObjectMapper();

    //创建房间
    public CreateRoomRes createRoom(String title, boolean video, Date startTime, int length, String roomType) {
        String result = client.createRoomByMinute(title, startTime,length, video, roomType);
        logger.debug("CreateRoomRes------>"+result);
        CreateRoomRes res = new CreateRoomRes();
        try {
             res = om.readValue(result, CreateRoomRes.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }
    //更新房间信息
    public EditRoomTitleRes updateRoomTitle(String roomId,String title){
        String result = client.updateRoomTitle(roomId,title);
        logger.debug("updateRoomTitle------>"+result);
        EditRoomTitleRes res = new EditRoomTitleRes();
        try {
             res = om.readValue(result, EditRoomTitleRes.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }

    //删除房间
    public DeleteRoomRes deleteRoom(String roomId){
        String result = client.deleteRoom(roomId);
        logger.debug("DeleteRoomRes------>"+result);
        DeleteRoomRes res = new DeleteRoomRes();
        try {
             res = om.readValue(result, DeleteRoomRes.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }

    //修改房间和时长
    public EditRoomScheduleRes updateRoomSchedule(String roomId, Date startTime, int length){
        String result = client.updateRoomScheduleByMinute(roomId,startTime,length);
        logger.debug("updateRoomSchedule------>"+result);
        EditRoomScheduleRes res = new EditRoomScheduleRes();
        try {
             res = om.readValue(result, EditRoomScheduleRes.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }
    //获取进入放假你的url
    public GetRoomEnterUrlRes generateRoomEnterUrl(String uid, String nickname, String roomId, String userRole, String deviceType){
        String result = client.generateRoomEnterUrl(uid,nickname,roomId,userRole,deviceType);
        logger.debug("generateRoomEnterUrl------>"+result);
        GetRoomEnterUrlRes res =new GetRoomEnterUrlRes();
        res.setSuccess(true);
        res.setUrl(result);
        return res;
    }

    //获取用户信息和url
    public GetAuthInfoUrlRes generateAuthInfoUrl(String uid, String nickname, String roomId, String userRole){
        String result = client.generateAuthInfoUrl(uid,nickname,roomId,userRole);
        logger.debug("generateAuthInfoUrl------>"+result);
        GetAuthInfoUrlRes res = new GetAuthInfoUrlRes();
        res.setUrl(result);
        res.setSuccess(true);
        return res;
    }


    //文章预览URL
    public PreviewDocUrlRes generateDocPreviewUrl(String documentId){
        String result = client.generateDocPreviewUrl(documentId);
        logger.debug("generateDocPreviewUrl------>"+result);
        PreviewDocUrlRes res = new PreviewDocUrlRes();
        res.setUrl(result);
        res.setSuccess(true);
        return res;
    }

    //开通微信直播
    public OpenWeixinLiveRes openWeixinLive(String roomId, String teacherName, String teacherBrief, String description){
        String result = client.openWeixinLive(roomId,teacherName,teacherBrief,description);
        logger.debug("openWeixinLive------>"+result);
        OpenWeixinLiveRes res = new OpenWeixinLiveRes();
        try {
             res = om.readValue(result, OpenWeixinLiveRes.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }



    //修改微信直播
    public EditWeixinLiveRes updateWeixinLive(String roomId, String teacherName, String teacherBrief, String description){
        String result = client.updateWeixinLive(roomId,teacherName,teacherBrief,description);
        logger.debug("updateWeixinLive------>"+result);
        EditWeixinLiveRes res = new EditWeixinLiveRes();
        try {
             res = om.readValue(result, EditWeixinLiveRes.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }



    //关闭微信直播
    public CloseWeixinLiveRes closeWeixinLive(String roomId){
        String result = client.closeWeixinLive(roomId);
        logger.debug("closeWeixinLive------>"+result);
        CloseWeixinLiveRes res = new CloseWeixinLiveRes();
        try {
             res = om.readValue(result, CloseWeixinLiveRes.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }

    //上传文档
    public UploadDocumentRes uploadDocument(String filename,File file){

        String result = client.uploadDocument(filename,file);
        logger.debug("uploadDocument------>"+result);
        UploadDocumentRes res = new UploadDocumentRes();
        try {
             res = om.readValue(result, UploadDocumentRes.class);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }


    //上传文档
    public AttatchDocumentRes attatchDocument(String documentId,String roomId){

        String result = client.attatchDocument(roomId,documentId);
        logger.debug("attatchDocument------>"+result);
        AttatchDocumentRes res = new AttatchDocumentRes();
        try {
             res = om.readValue(result, AttatchDocumentRes.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }


    //删除文档
    public RemoveDocumentRes removeDocument(String documentId,String roomId){

        String result ="";
        RemoveDocumentRes res = new RemoveDocumentRes();
        if(roomId !=null&& StringUtils.isNotEmpty(roomId)){
             result = client.removeDocument(roomId,documentId);
        }else {
            result = client.deleteDocumet(documentId);
        }
        logger.debug("removeDocument------>"+result);
        try {
             res = om.readValue(result, RemoveDocumentRes.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }



}
