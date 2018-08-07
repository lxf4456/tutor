package com.education.tutor.service;

import com.alibaba.fastjson.JSON;
import com.education.classin.ClassInService;
import com.education.tutor.api.classin.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;

/**
 * Created by 雪峰 on 2018/7/19.
 */
@Service
public class LiveClassInService {
    @Autowired
    ClassInService classInService;
    @Autowired
    LiveService liveService;

    private final Log logger = LogFactory.getLog(this.getClass());

    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.S'Z'");

    //注册
    public RegisterRes registre(RegisterReq req) {
        RegisterRes res = new RegisterRes();
        com.education.classin.vo.RegisterRes registerRes = classInService.registre(req.getTelephone(),req.getNickname(),req.getPassword());

        if(registerRes.getErrno()!= 1&&registerRes.getErrno()!= 135){
            res.setCode(101);
            res.setMessage(registerRes.getError());
            return res;
        }
        res.setStudentId(registerRes.getStudentId());
        res.setCode(0);
        return res;
    }

    //增加课程
    public AddCourseRes addCourse(AddCourseReq req) {
        AddCourseRes res = new AddCourseRes();
        com.education.classin.vo.AddCourseRes addCourseRes =  classInService.addCourse(req.getCourseName(),req.getFolderId(),req.getFiledata(),req.getExpiryTime());
        if(addCourseRes.getErrno()!= 1){
            res.setCode(101);
            res.setMessage(addCourseRes.getError());
            return res;
        }
        res.setCourseId(addCourseRes.getCourseId());
        res.setCode(0);
        return res;
    }

    //给课程增加学生
    public AddCourseStudentRes addCourseStudent(AddCourseStudentReq req) {
        AddCourseStudentRes res = new AddCourseStudentRes();

        com.education.classin.vo.AddCourseStudentRes addCourseStudentRes = classInService.addCourseStudent( req.getCourseId(), req.getIdentity(), req.getStudentAccount(), req.getStudentName());

        if(addCourseStudentRes.getErrno()!= 1){
            res.setCode(101);
            res.setMessage(addCourseStudentRes.getError());
            return res;
        }
        res.setCode(0);
        return res;
    }
    //增加老师
    public AddTeacherRes addTeacher(AddTeacherReq req){
        AddTeacherRes res = new AddTeacherRes();
        com.education.classin.vo.AddTeacherRes addTeacherRes = classInService.addTeacher(    req.getTeacherAccount(), req.getTeacherName(), req.getFiledata()) ;
        if(addTeacherRes.getErrno()!= 1){
            res.setCode(101);
            res.setMessage(addTeacherRes.getError());
            return res;
        }
        res.setCode(0);
        res.setTeachId(addTeacherRes.getTeachId());
        return res;
    }


    //增加课节
    public AddOneCourseClassRes addOneCourseClass(AddOneCourseClassReq req) {
        AddOneCourseClassRes res = new AddOneCourseClassRes();
        com.education.classin.vo.AddOneCourseClassRes addOneCourseClassRes = classInService.addOneCourseClass(  req.getCourseId(),  req.getClassName(), req.getBeginTime(), req.getEndTime(), req.getTeacherAccount(), req.getTeacherName(), req.getSeatNum(),req.getFolderId());

        if(addOneCourseClassRes.getErrno()!= 1){
            res.setCode(101);
            res.setMessage(addOneCourseClassRes.getError());
            return res;
        }
        res.setCode(0);
        res.setClassId(addOneCourseClassRes.getClassId());
        return res;
    }

    //变更老师
    public ChangeTeacherRes changeTeacher(ChangeTeacherReq req) {
        ChangeTeacherRes res = new ChangeTeacherRes();
        com.education.classin.vo.ChangeTeacherRes changeTeacherRes = classInService.changeTeacher(req.getCourseId(),req.getTeacherAccount());
        if(changeTeacherRes.getErrno()!= 1){
            res.setCode(101);
            res.setMessage(changeTeacherRes.getError());
            return res;
        }
        res.setCode(0);
        return res;
    }



    //编辑老师信息
    public EditTeacherRes editTeacher(EditTeacherReq req) {
        EditTeacherRes res = new EditTeacherRes();
        com.education.classin.vo.EditTeacherRes editTeacherRes = classInService.editTeacher(req.getSt_id(),req.getTeacherName(),req.getFiledata());
        if(editTeacherRes.getErrno()!= 1){
            res.setCode(101);
            res.setMessage(editTeacherRes.getError());
            return res;
        }
        res.setCode(0);
        return res;
    }

    //删除课节
    public DelCourseClassRes delCourseClass(DelCourseClassReq req) {
        DelCourseClassRes res = new DelCourseClassRes();
        com.education.classin.vo.DelCourseClassRes delCourseClassRes = classInService.delCourseClass(req.getCourseId(),req.getClassId());
        if(delCourseClassRes.getErrno()!= 1){
            res.setCode(101);
            res.setMessage(delCourseClassRes.getError());
            return res;
        }
        res.setCode(0);
        return res;

    }


    //删除课程
    public DelCourseRes delCourse(DelCourseReq req) {
        DelCourseRes res = new DelCourseRes();
        com.education.classin.vo.DelCourseRes delCourseClass = classInService.delCourse(req.getCourseId());
        if(delCourseClass.getErrno()!= 1){
            res.setCode(101);
            res.setMessage(delCourseClass.getError());
            return res;
        }
        res.setCode(0);
        return res;
    }


    //删除课节下的学生
    public DelCourseStudentRes delCourseStudent(DelCourseStudentReq req) {
        DelCourseStudentRes res = new DelCourseStudentRes();
        com.education.classin.vo.DelCourseStudentRes delCourseStudentRes = classInService.delCourseStudent( req.getCourseId(), req.getIdentity(), req.getStudentAccount());
        if(delCourseStudentRes.getErrno()!= 1){
            res.setCode(101);
            res.setMessage(delCourseStudentRes.getError());
            return res;
        }
        res.setCode(0);
        return res;
    }


    //修改课节信息
    public EditCourseClassRes editCourseClass(EditCourseClassReq req) {
        EditCourseClassRes res = new EditCourseClassRes();
        com.education.classin.vo.EditCourseClassRes editCourseClassRes = classInService.editCourseClass( req.getCourseId(), req.getClassId(), req.getClassName(), req.getBeginTime(), req.getEndTime(), req.getTeacherAccount(), req.getTeacherName());
        if(editCourseClassRes.getErrno()!= 1){
            res.setCode(101);
            res.setMessage(editCourseClassRes.getError());
            return res;
        }
        res.setCode(0);
        return res;
    }


    //修改课程
    public EditCourseRes editCourse( EditCourseReq req) {
        EditCourseRes res = new EditCourseRes();
        com.education.classin.vo.EditCourseRes editCourseRes = classInService.editCourse(   req.getCourseName(), req.getFolderId(), req.getFiledata(), req.getExpiryTime(), req.getCourseId());
        if(editCourseRes.getErrno()!= 1){
            res.setCode(101);
            res.setMessage(editCourseRes.getError());
            return res;
        }
        res.setCode(0);
        return res;
    }


    //修改密码
    public EditPasswortRes editPasswort(EditPasswortReq req) {
        EditPasswortRes res = new EditPasswortRes();
        com.education.classin.vo.EditPasswortRes editPasswortRes = classInService.editPasswort(  req.getTelephone(),  req.getPassword(),getMD5Str(req.getOldPass()));
        if(editPasswortRes.getErrno()!= 1){
            res.setCode(101);
            res.setMessage(editPasswortRes.getError());
            return res;
        }
        res.setCode(0);
        return res;
    }

    //编辑用户基本信息
    public EditUserBasicRes editUserBasic(EditUserBasicReq req) {
        EditUserBasicRes res = new EditUserBasicRes();
        com.education.classin.vo.EditUserBasicRes editUserBasicRes = classInService.editUserBasic(  req.getTelephone(),  req.getNickname());
        if(editUserBasicRes.getErrno()!= 1){
            res.setCode(101);
            res.setMessage(editUserBasicRes.getError());
            return res;
        }
        res.setCode(0);
        return res;
    }



    //获取登录key
    public GetTempLoginKeyRes getTempLoginKey(GetTempLoginKeyReq req) {
        GetTempLoginKeyRes res = new GetTempLoginKeyRes();
        com.education.classin.vo.GetTempLoginKeyRes tempLoginKeyRes = classInService.getTempLoginKey(  req.getTelephone());
        if(tempLoginKeyRes.getErrno()!= 1){
            res.setCode(101);
            res.setMessage(tempLoginKeyRes.getError());
            return res;
        }
        res.setKey(tempLoginKeyRes.getKey());
        res.setCode(0);
        return res;
    }


    //创建文件夹
    public CreateFolderRes createFolder(CreateFolderReq req) {
        CreateFolderRes res = new CreateFolderRes();
        com.education.classin.vo.CreateFolderRes createFolderRes = classInService.createFolder(req.getFolderId(),req.getFolderName());
        if(createFolderRes.getErrno()!= 1){
            res.setCode(101);
            res.setMessage(createFolderRes.getError());
            return res;
        }
        logger.debug("CreateFolderRes======="+ JSON.toJSONString(res));
        res.setFolderId(createFolderRes.getFolderId());
        res.setCode(0);
        return res;
    }



    //上传文件
    public UploadFileRes uploadFile(UploadFileReq req) throws IOException {
        UploadFileRes res = new UploadFileRes();


        com.education.classin.vo.UploadFileRes uploadFileRes = classInService.uploadFile(req.getFolderId(),liveService.getFileFromUrl(req.getUrl()));
        if(uploadFileRes.getErrno()!= 1){
            res.setCode(101);
            res.setMessage(uploadFileRes.getError());
            return res;
        }
        res.setFileId(uploadFileRes.getFileId());
        res.setCode(0);
        return res;
    }

    //删除文件
    public DelFileRes delFile(DelFileReq req) {
        DelFileRes res = new DelFileRes();
        com.education.classin.vo.DelFileRes delFileRes = classInService.delFile(req.getFileId());
        if(delFileRes.getErrno()!= 1){
            res.setCode(101);
            res.setMessage(delFileRes.getError());
            return res;
        }
        res.setCode(0);
        return res;
    }


    private String getMD5Str(String str) {
        String result = "";
        try {

            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update((str).getBytes("UTF-8"));
            byte b[] = md5.digest();

            int i;
            StringBuffer buf = new StringBuffer("");

            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0) {
                    i += 256;
                }
                if (i < 16) {
                    buf.append("0");
                }
                buf.append(Integer.toHexString(i));
            }

            result = buf.toString();
        }catch (Exception e){
            e.printStackTrace();
        }
        return  result;
    }
}
