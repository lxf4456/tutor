package com.education.classin;

import com.education.classin.vo.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;

/**
 * Created by 雪峰 on 2018/5/6.
 */
@Service
public class ClassInService {

    @Autowired
    ClassInSender classInSender;

    ObjectMapper om = new ObjectMapper();

    //注册
    public RegisterRes registre(  String telephone, String nickname, String password) {
        RegisterRes res = new RegisterRes();
        try {
            RegisterReq req = new RegisterReq();
            req.setNickname(nickname);
            req.setPassword(password);
            req.setTelephone(telephone);
            ClassInBasicRes classInBasicRes =classInSender.send(req);
            if(classInBasicRes.getErrno() == 1){
                res.setStudentId(Long.parseLong(classInBasicRes.getData()));
            }
            res.setErrno(classInBasicRes.getErrno());
            res.setError(classInBasicRes.getError());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    //增加课程
    public AddCourseRes addCourse(String courseName, String folderId, File filedata, long expiryTime) {
        AddCourseRes res = new AddCourseRes();
        try {

            AddCourseReq req = new AddCourseReq();
            req.setCourseName(courseName);
            req.setExpiryTime(expiryTime);
            req.setFiledata(filedata);
            req.setFolderId(folderId);

            ClassInBasicRes classInBasicRes = classInSender.send(req);
            if(classInBasicRes.getErrno() == 1){
                res.setCourseId(Long.parseLong(classInBasicRes.getData()));
            }
            res.setErrno(classInBasicRes.getErrno());
            res.setError(classInBasicRes.getError());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    //给课程增加学生
    public AddCourseStudentRes addCourseStudent(     long courseId,long identity,String studentAccount,String studentName) {
        AddCourseStudentRes res = new AddCourseStudentRes();
        try {
            AddCourseStudentReq req = new AddCourseStudentReq();
            req.setCourseId(courseId);
            req.setIdentity(identity);
            req.setStudentAccount(studentAccount);
            req.setStudentName(studentName);
            ClassInBasicRes classInBasicRes = classInSender.send(req);

            res.setErrno(classInBasicRes.getErrno());
            res.setError(classInBasicRes.getError());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
    //增加老师
    public AddTeacherRes addTeacher(   String teacherAccount,String teacherName,File Filedata){
        AddTeacherRes res = new AddTeacherRes();
        try {
            AddTeacherReq req = new AddTeacherReq();
            req.setFiledata(Filedata);
            req.setTeacherAccount(teacherAccount);
            req.setTeacherName(teacherName);
            ClassInBasicRes classInBasicRes = classInSender.send(req);
            if(classInBasicRes.getErrno() == 1){
                res.setTeachId(Long.parseLong(classInBasicRes.getData()));
            }
            res.setErrno(classInBasicRes.getErrno());
            res.setError(classInBasicRes.getError());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }


//增加课程
    public AddOneCourseClassRes addOneCourseClass( long courseId, String className,long beginTime,long endTime,String teacherAccount,String teacherName,int seatNum) {
        AddOneCourseClassRes res = new AddOneCourseClassRes();
        try {
            AddOneCourseClassReq req = new AddOneCourseClassReq();
            req.setBeginTime(beginTime/1000);
            req.setClassName(className);
            req.setCourseId(courseId);
            req.setEndTime(endTime/1000);
            req.setTeacherAccount(teacherAccount);
            req.setTeacherName(teacherName);

            ClassInBasicRes classInBasicRes = classInSender.send(req);
            if(classInBasicRes.getErrno() == 1){
                res.setClassId(Long.parseLong(classInBasicRes.getData()));
            }
            res.setErrno(classInBasicRes.getErrno());
            res.setError(classInBasicRes.getError());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    //变更老师
    public ChangeTeacherRes changeTeacher(  long courseId,String teacherAccount) {
        ChangeTeacherRes res = new ChangeTeacherRes();
        try {
            ChangeTeacherReq req =new ChangeTeacherReq();
            req.setCourseId(courseId);
            req.setTeacherAccount(teacherAccount);
            ClassInBasicRes classInBasicRes = classInSender.send(req);

            res.setErrno(classInBasicRes.getErrno());
            res.setError(classInBasicRes.getError());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }



    //编辑老师信息
    public EditTeacherRes editTeacher(long st_id,String teacherName,File Filedata) {
        EditTeacherRes res = new EditTeacherRes();
        try {
            EditTeacherReq req =new EditTeacherReq();
            req.setTeacherName(teacherName);
            req.setSt_id(st_id);
            req.setFiledata(Filedata);
            ClassInBasicRes classInBasicRes = classInSender.send(req);

            res.setErrno(classInBasicRes.getErrno());
            res.setError(classInBasicRes.getError());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    //删除课节
    public DelCourseClassRes delCourseClass(    long courseId, long classId) {
        DelCourseClassRes res = new DelCourseClassRes();
        try {
            DelCourseClassReq req = new DelCourseClassReq();
            req.setClassId(classId);
            req.setCourseId(courseId);
            ClassInBasicRes classInBasicRes = classInSender.send(req);

            res.setErrno(classInBasicRes.getErrno());
            res.setError(classInBasicRes.getError());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }


    //删除课程
    public DelCourseRes delCourse( long courseId) {
        DelCourseRes res = new DelCourseRes();
        try {
            DelCourseReq req = new DelCourseReq();
            req.setCourseId(courseId);
            ClassInBasicRes classInBasicRes = classInSender.send(req);

            res.setErrno(classInBasicRes.getErrno());
            res.setError(classInBasicRes.getError());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }


    //删除课节下的学生
    public DelCourseStudentRes delCourseStudent( long courseId,long identity,String studentAccount) {
        DelCourseStudentRes res = new DelCourseStudentRes();
        try {

            DelCourseStudentReq req = new DelCourseStudentReq();
            req.setCourseId(courseId);
            req.setIdentity(identity);
            req.setStudentAccount(studentAccount);
            ClassInBasicRes classInBasicRes = classInSender.send(req);

            res.setErrno(classInBasicRes.getErrno());
            res.setError(classInBasicRes.getError());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }


    //修改课节信息
    public EditCourseClassRes editCourseClass(long courseId,long classId,String className,long beginTime,long endTime,String teacherAccount,String teacherName) {
        EditCourseClassRes res = new EditCourseClassRes();
        try {
            EditCourseClassReq req = new EditCourseClassReq();
            req.setBeginTime(beginTime/1000);
            req.setClassId(classId);
            req.setClassName(className);
            req.setEndTime(endTime/1000);
            req.setTeacherAccount(teacherAccount);
            req.setTeacherName(teacherName);
            req.setCourseId(courseId);
            ClassInBasicRes classInBasicRes = classInSender.send(req);

            res.setErrno(classInBasicRes.getErrno());
            res.setError(classInBasicRes.getError());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }


    //修改课程
    public EditCourseRes editCourse(  String courseName,String folderId,File filedata,long expiryTime,long courseId) {
        EditCourseRes res = new EditCourseRes();
        try {
            EditCourseReq req  = new EditCourseReq();
            req.setCourseId(courseId);
            req.setCourseName(courseName);
            req.setExpiryTime(expiryTime);
            req.setFiledata(filedata);
            req.setFolderId(folderId);

            ClassInBasicRes classInBasicRes = classInSender.send(req);

            res.setErrno(classInBasicRes.getErrno());
            res.setError(classInBasicRes.getError());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }


    //修改密码
    public EditPasswortRes editPasswort(  String telephone,
             String password,String oldMd5pass) {
        EditPasswortRes res = new EditPasswortRes();
        try {
            EditPasswortReq req = new EditPasswortReq();
            req.setPassword(password);
            req.setTelephone(telephone);
            req.setOldMd5pass(oldMd5pass);
            ClassInBasicRes classInBasicRes = classInSender.send(req);

            res.setErrno(classInBasicRes.getErrno());
            res.setError(classInBasicRes.getError());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }



    //修改学生账号
    public EditStudentPhoneRes editStudentPhone( String oldTelephone,
             String telephone) {
        EditStudentPhoneRes res = new EditStudentPhoneRes();
        try {
            EditStudentPhoneReq req = new EditStudentPhoneReq();
            req.setOldTelephone(oldTelephone);
            req.setTelephone(telephone);
            ClassInBasicRes classInBasicRes = classInSender.send(req);

            res.setErrno(classInBasicRes.getErrno());
            res.setError(classInBasicRes.getError());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }


    //编辑课程老师e
    public EditTeacherRes eitTeacher(     long st_id,String teacherName,File filedata) {
        EditTeacherRes res = new EditTeacherRes();
        try {
            EditTeacherReq req = new EditTeacherReq();
            req.setFiledata(filedata);
            req.setSt_id(st_id);
            req.setTeacherName(teacherName);
            ClassInBasicRes classInBasicRes = classInSender.send(req);

            res.setErrno(classInBasicRes.getErrno());
            res.setError(classInBasicRes.getError());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }


    //编辑用户基本信息
    public EditUserBasicRes editUserBasic(   String telephone,
            String nickname) {
        EditUserBasicRes res = new EditUserBasicRes();
        try {
            EditUserBasicReq req = new EditUserBasicReq();
            req.setNickname(nickname);
            req.setTelephone(telephone);
            ClassInBasicRes classInBasicRes = classInSender.send(req);

            res.setErrno(classInBasicRes.getErrno());
            res.setError(classInBasicRes.getError());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    //获取直播，录播视频地址
    public GetClassVideoUrlRes getClassVideoUr(  long courseId,long classId) {
        GetClassVideoUrlRes res = new GetClassVideoUrlRes();
        try {
            GetClassVideoUrlReq req = new GetClassVideoUrlReq();
            req.setClassId(classId);
            req.setCourseId(courseId);
            ClassInBasicRes classInBasicRes = (ClassInBasicRes)classInSender.send(req);
            if(classInBasicRes.getErrno() == 1){
                res= om.readValue(classInBasicRes.getData(), GetClassVideoUrlRes.class);
            }
            res.setErrno(classInBasicRes.getErrno());
            res.setError(classInBasicRes.getError());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    //获取客户端下载地址
    public GetDownloadClientUrlRes getDownloadClientUrl() {
        GetDownloadClientUrlRes res = new GetDownloadClientUrlRes();
        try {
            ClassInBasicRes classInBasicRes = (ClassInBasicRes)classInSender.send(new GetDownloadClientUrlReq());
            if(classInBasicRes.getErrno() == 1){
                res= om.readValue(classInBasicRes.getData(), GetDownloadClientUrlRes.class);
            }
            res.setErrno(classInBasicRes.getErrno());
            res.setError(classInBasicRes.getError());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
    //获取登录key
    public GetTempLoginKeyRes getTempLoginKey(String telephone) {
        GetTempLoginKeyRes res = new GetTempLoginKeyRes();
        try {
            GetTempLoginKeyReq req = new GetTempLoginKeyReq();
            req.setTelephone(telephone);
            ClassInBasicRes classInBasicRes = classInSender.send(req);
            if(classInBasicRes.getErrno() == 1){
                res.setKey(classInBasicRes.getData());
            }
            res.setErrno(classInBasicRes.getErrno());
            res.setError(classInBasicRes.getError());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }


    //获取客户端连接地址
    public GetLoginLinkedRes getLoginLinked(String telephone,long courseId,long classId) {
        GetLoginLinkedRes res = new GetLoginLinkedRes();
        try {
            GetLoginLinkedReq req = new GetLoginLinkedReq();
            req.setClassId(classId);
            req.setCourseId(courseId);
            req.setTelephone(telephone);
            ClassInBasicRes classInBasicRes = classInSender.send(req);
            if(classInBasicRes.getErrno() == 1){
                res.setUrl(classInBasicRes.getData());
            }
            res.setErrno(classInBasicRes.getErrno());
            res.setError(classInBasicRes.getError());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }


    //创建文件夹
    public CreateFolderRes createFolder(String folderId,String folderName) {
        CreateFolderRes res = new CreateFolderRes();
        try {
            CreateFolderReq req = new CreateFolderReq();
            req.setFolderId(folderId);
            req.setFolderName(folderName);
            ClassInBasicRes classInBasicRes = classInSender.send(req);

            res.setErrno(classInBasicRes.getErrno());
            res.setError(classInBasicRes.getError());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }


    //上传文件
    public UploadFileRes uploadFile(String folderId,File folderName) {
        UploadFileRes res = new UploadFileRes();
        try {
            UploadFileReq req = new UploadFileReq();
            req.setFolderId(folderId);
            req.setFiledata(folderName);
            ClassInBasicRes classInBasicRes = classInSender.send(req);
            if(classInBasicRes.getErrno() == 1){
                res.setFileId(classInBasicRes.getData());
            }
            res.setErrno(classInBasicRes.getErrno());
            res.setError(classInBasicRes.getError());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    //删除文件
    public DelFileRes delFile(String folderId) {
        DelFileRes res = new DelFileRes();
        try {
            DelFileReq req = new DelFileReq();
            req.setFileId(folderId);
            ClassInBasicRes classInBasicRes = classInSender.send(req);

            res.setErrno(classInBasicRes.getErrno());
            res.setError(classInBasicRes.getError());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
}
