package com.education.tutor.web.controller;

import com.education.tutor.api.live.*;
import com.education.tutor.service.LiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 雪峰 on 2018/5/13.
 */
@RestController
@RequestMapping("/live")
public class LiveController extends AuthenticatedController{

    @Autowired
    LiveService liveService;

    /**
     *
     * 创建房间
     * */
    @RequestMapping(method = RequestMethod.POST, path = "/createRoom", produces = "application/json;charset=utf8")
    @ResponseBody
    public CreateRoomRes createRoom(@RequestBody CreateRoomReq req)throws Exception {
        CreateRoomRes res = liveService.createRoom(req);
        return res;
    }

    /**
     *
     * 编辑房间信息
     * */
    @RequestMapping(method = RequestMethod.POST, path = "/editRoom", produces = "application/json;charset=utf8")
    @ResponseBody
    public EditRoomRes editRoom(@RequestBody EditRoomReq req) {
        EditRoomRes res = liveService.editroom(req);
        return res;
    }

    /**
     *
     * 房间上传文档
     * */
    @RequestMapping(method = RequestMethod.POST, path = "/uploadDocument", produces = "application/json;charset=utf8")
    @ResponseBody
    public UploadDocumentRes uploadDocument(@RequestBody UploadDocumentReq req) {
        UploadDocumentRes res = liveService.uploadDocument(req);
        return res;
    }



    /**
     *
     * 房间上传文档2 fileUrl
     * */
    @RequestMapping(method = RequestMethod.POST, path = "/uploadFileUrl", produces = "application/json;charset=utf8")
    @ResponseBody
    public UploadFileUrlRes uploadDocument(@RequestBody UploadFileUrlReq req) {
        UploadFileUrlRes res = liveService.uploadFileUrl(req);
        return res;
    }
    /**
     *
     * 房间关联讲义
     * */
    @RequestMapping(method = RequestMethod.POST, path = "/attatchDocument", produces = "application/json;charset=utf8")
    @ResponseBody
    public AttatchDocumentRes attatchDocument(@RequestBody AttatchDocumentReq req) {
        AttatchDocumentRes res = liveService.attatchDocument(req);
        return res;
    }


    /**
     *
     * 删除房间文档
     * */
    @RequestMapping(method = RequestMethod.POST, path = "/removeDocument", produces = "application/json;charset=utf8")
    @ResponseBody
    public RemoveDocumentRes removeDocument(@RequestBody RemoveDocumentReq req) {
        RemoveDocumentRes res = liveService.removeDocument(req);
        return res;
    }

    /**
     *
     * 查看预览文档
     * */
    @RequestMapping(method = RequestMethod.POST, path = "/previewDocUrl", produces = "application/json;charset=utf8")
    @ResponseBody
    public PreviewDocUrlRes previewDocUrl(@RequestBody PreviewDocUrlReq req) {
        PreviewDocUrlRes res = liveService.previewDocUrl(req);
        return res;
    }
    /**
     *
     * 删除房间
     * */

    @RequestMapping(method = RequestMethod.POST, path = "/deleteRoom", produces = "application/json;charset=utf8")
    @ResponseBody
    public DeleteRoomRes deleteRoom(@RequestBody DeleteRoomReq req) {
        DeleteRoomRes res = liveService.deleteRoom(req);
        return res;
    }

    /**
     *
     * 获取进入房间地址
     * */
    @RequestMapping(method = RequestMethod.POST, path = "/getRoomEnterUrl", produces = "application/json;charset=utf8")
    @ResponseBody
    public GetRoomEnterUrlRes getRoomEnterUrlRes(@RequestBody GetRoomEnterUrlReq req) {
        GetRoomEnterUrlRes res = liveService.getDuoBeiRoomEnterUrl(req);
        return res;
    }


}
