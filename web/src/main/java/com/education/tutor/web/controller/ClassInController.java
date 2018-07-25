package com.education.tutor.web.controller;

import com.education.tutor.api.classin.*;
import com.education.tutor.service.LiveClassInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 雪峰 on 2018/5/13.
 */
@RestController
@RequestMapping("/classIn")
public class ClassInController extends AuthenticatedController{

    @Autowired
    LiveClassInService liveClassInService;

    /**
     *
     * 用户注册
     * */
    @RequestMapping(method = RequestMethod.POST, path = "/registre", produces = "application/json;charset=utf8")
    @ResponseBody
    public RegisterRes registre(@RequestBody RegisterReq req)throws Exception {
        RegisterRes res = liveClassInService.registre(req);
        return res;
    }

    /**
     *
     * 增加课程
     * */
    @RequestMapping(method = RequestMethod.POST, path = "/addCourse", produces = "application/json;charset=utf8")
    @ResponseBody
    public AddCourseRes addCourse(@RequestBody AddCourseReq req) {
        AddCourseRes res = liveClassInService.addCourse(req);
        return res;
    }

    /**
     *
     * 增加学生
     * */
    @RequestMapping(method = RequestMethod.POST, path = "/addCourseStudent", produces = "application/json;charset=utf8")
    @ResponseBody
    public AddCourseStudentRes addCourseStudent(@RequestBody AddCourseStudentReq req) {
        AddCourseStudentRes res = liveClassInService.addCourseStudent(req);
        return res;
    }



    /**
     *
     * 在增加老师
     * */
    @RequestMapping(method = RequestMethod.POST, path = "/addTeacher", produces = "application/json;charset=utf8")
    @ResponseBody
    public AddTeacherRes addTeacher(@RequestBody AddTeacherReq req) {
        AddTeacherRes res = liveClassInService.addTeacher(req);
        return res;
    }
    /**
     *
     * 增加课节
     * */
    @RequestMapping(method = RequestMethod.POST, path = "/addOneCourseClass", produces = "application/json;charset=utf8")
    @ResponseBody
    public AddOneCourseClassRes addOneCourseClass(@RequestBody AddOneCourseClassReq req) {
        AddOneCourseClassRes res = liveClassInService.addOneCourseClass(req);
        return res;
    }


    /**
     *
     * 变更老师
     * */
    @RequestMapping(method = RequestMethod.POST, path = "/changeTeacher", produces = "application/json;charset=utf8")
    @ResponseBody
    public ChangeTeacherRes changeTeacher(@RequestBody ChangeTeacherReq req) {
        ChangeTeacherRes res = liveClassInService.changeTeacher(req);
        return res;
    }

    /**
     *
     * 编辑老师信息
     * */
    @RequestMapping(method = RequestMethod.POST, path = "/editTeacher", produces = "application/json;charset=utf8")
    @ResponseBody
    public EditTeacherRes editTeacher(@RequestBody EditTeacherReq req) {
        EditTeacherRes res = liveClassInService.editTeacher(req);
        return res;
    }
    /**
     * 删除课节
     * */

    @RequestMapping(method = RequestMethod.POST, path = "/delCourseClass", produces = "application/json;charset=utf8")
    @ResponseBody
    public DelCourseClassRes delCourseClass(@RequestBody DelCourseClassReq req) {
        DelCourseClassRes res = liveClassInService.delCourseClass(req);
        return res;
    }

    /**
     *
     * 删除课程
     * */
    @RequestMapping(method = RequestMethod.POST, path = "/delCourse", produces = "application/json;charset=utf8")
    @ResponseBody
    public DelCourseRes delCourse(@RequestBody DelCourseReq req) {
        DelCourseRes res = liveClassInService.delCourse(req);
        return res;
    }

    /**
     *
     * 删除可接学生
     * */
    @RequestMapping(method = RequestMethod.POST, path = "/delCourseStudent", produces = "application/json;charset=utf8")
    @ResponseBody
    public DelCourseStudentRes getRoomEnterUrlRes(@RequestBody DelCourseStudentReq req) {
        DelCourseStudentRes res = liveClassInService.delCourseStudent(req);
        return res;
    }
    /**
     *
     * 删除课节信息
     * */
    @RequestMapping(method = RequestMethod.POST, path = "/editCourseClass", produces = "application/json;charset=utf8")
    @ResponseBody
    public EditCourseClassRes getRoomEnterUrlRes(@RequestBody EditCourseClassReq req) {
        EditCourseClassRes res = liveClassInService.editCourseClass(req);
        return res;
    }
    /**
     *
     * 编辑课程
     * */
    @RequestMapping(method = RequestMethod.POST, path = "/editCourse", produces = "application/json;charset=utf8")
    @ResponseBody
    public EditCourseRes editCourse(@RequestBody EditCourseReq req) {
        EditCourseRes res = liveClassInService.editCourse(req);
        return res;
    }
    /**
     *
     * 修改密码
     * */
    @RequestMapping(method = RequestMethod.POST, path = "/editPasswort", produces = "application/json;charset=utf8")
    @ResponseBody
    public EditPasswortRes editPasswort(@RequestBody EditPasswortReq req) {
        EditPasswortRes res = liveClassInService.editPasswort(req);
        return res;
    }
    /**
     *
     * 编辑基本信息
     * */
    @RequestMapping(method = RequestMethod.POST, path = "/editUserBasic", produces = "application/json;charset=utf8")
    @ResponseBody
    public EditUserBasicRes editUserBasic(@RequestBody EditUserBasicReq req) {
        EditUserBasicRes res = liveClassInService.editUserBasic(req);
        return res;
    }
    /**
     *
     * 获取进入房间地址
     * */
    @RequestMapping(method = RequestMethod.POST, path = "/getTempLoginKey", produces = "application/json;charset=utf8")
    @ResponseBody
    public GetTempLoginKeyRes getTempLoginKey(@RequestBody GetTempLoginKeyReq req) {
        GetTempLoginKeyRes res = liveClassInService.getTempLoginKey(req);
        return res;
    }
    /**
     *
     * 创建文件夹
     * */
    @RequestMapping(method = RequestMethod.POST, path = "/createFolder", produces = "application/json;charset=utf8")
    @ResponseBody
    public CreateFolderRes getRoomEnterUrlRes(@RequestBody CreateFolderReq req) {
        CreateFolderRes res = liveClassInService.createFolder(req);
        return res;
    }
    /**
     *
     * 上传文件
     * */
    @RequestMapping(method = RequestMethod.POST, path = "/uploadFile", produces = "application/json;charset=utf8")
    @ResponseBody
    public UploadFileRes getRoomEnterUrlRes(@RequestBody UploadFileReq req) {
        UploadFileRes res = liveClassInService.uploadFile(req);
        return res;
    }
    /**
     *
     * 获取进入房间地址
     * */
    @RequestMapping(method = RequestMethod.POST, path = "/delFile", produces = "application/json;charset=utf8")
    @ResponseBody
    public DelFileRes getRoomEnterUrlRes(@RequestBody DelFileReq req) {
        DelFileRes res = liveClassInService.delFile(req);
        return res;
    }

}
