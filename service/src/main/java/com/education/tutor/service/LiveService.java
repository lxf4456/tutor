package com.education.tutor.service;

import com.duobeiyun.DuobeiYunClient;
import com.education.duobei.DuoBeiService;
import com.education.tutor.api.live.*;
import com.education.tutor.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by 雪峰 on 2018/5/9.
 */
@Service
public class LiveService {

    @Autowired
    DuoBeiService duoBeiService;

    //创建房间
    public CreateRoomRes createRoom(CreateRoomReq req)throws Exception{
        CreateRoomRes res = new CreateRoomRes();

        //创建多贝课堂
        String roomType = DuobeiYunClient.COURSE_TYPE_1v1;
        if(req.getMenNum()==2){
            roomType = DuobeiYunClient.COURSE_TYPE_1vN;
        }else if (req.getMenNum() == 3){
            roomType = DuobeiYunClient.COURSE_TYPE_SMALL;
        }




        //String title, boolean video, Date startTime, int duration, String roomType
        com.education.duobei.vo.CreateRoomRes createRoomRes = duoBeiService.createRoom(req.getTitle(),true, DateUtils.getDate2Str(req.getStartTime(),DateUtils.FORMATSTR),req.getLength(),roomType);

        if(!createRoomRes.isSuccess()){
            res.setCode(101);
            res.setMessage(createRoomRes.getError());
            return res;
        }

        Room room = new Room();
        room.setEndTime(createRoomRes.getRoom().getEndTime());
        room.setHostCode(createRoomRes.getRoom().getHostCode());
        room.setRoomId(createRoomRes.getRoom().getRoomId());
        room.setTitle(createRoomRes.getRoom().getTitle());
        room.setStartTime(createRoomRes.getRoom().getStartTime());
        room.setValidEndTime(createRoomRes.getRoom().getValidEndTime());

        res.setRoom(room);
        res.setCode(0);
        return res;
    }


    //编辑房间
    public EditRoomRes editroom(EditRoomReq req){
        EditRoomRes res = new EditRoomRes();
        //编辑多贝课程名称
        duoBeiService.updateRoomTitle(req.getRoomId(),req.getTitle());
        //编辑课程时间
      //  duoBeiService.updateRoomSchedule(req.getRoomId(),req.getStartTime(),req.getDuration());
        res.setCode(0);
        return res;
    }

    //上传文件到房间
    public UploadDocumentRes uploadDocument(UploadDocumentReq req){
        UploadDocumentRes res = new UploadDocumentRes();
        //编辑课程时间
        com.education.duobei.vo.UploadDocumentRes uploadDocumentRes = duoBeiService.uploadDocument(req.getFilename(),req.getSlidesFile());
        if(!uploadDocumentRes.isSuccess()){
            res.setCode(101);
            res.setMessage(uploadDocumentRes.getError());
            return res;
        }

        res.setUuid(uploadDocumentRes.getUuid());


        duoBeiService.attatchDocument(uploadDocumentRes.getUuid(),req.getRoomId());

        res.setCode(0);
        return res;
    }

    //上传文件到房间
    public UploadFileUrlRes uploadFileUrl(UploadFileUrlReq req){
        UploadFileUrlRes res = new UploadFileUrlRes();
        try {
            File file = getFileFromUrl(req.getFileUrl());

            //编辑课程时间
            com.education.duobei.vo.UploadDocumentRes uploadDocumentRes = duoBeiService.uploadDocument(req.getFilename(), new File(req.getFileUrl()));
            if (!uploadDocumentRes.isSuccess()) {
                res.setCode(101);
                res.setMessage(uploadDocumentRes.getError());
                return res;
            }

            res.setUuid(uploadDocumentRes.getUuid());


            duoBeiService.attatchDocument(uploadDocumentRes.getUuid(), req.getRoomId());
            res.setCode(0);
            deleteFile(file);
        }catch (Exception e){
            res.setCode(101);
            e.printStackTrace();
        }


        return res;
    }



    private  File  getFileFromUrl(String urlStr) throws IOException {
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        //设置超时间为3秒
        conn.setConnectTimeout(3*1000);
        //防止屏蔽程序抓取而返回403错误
        conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");

        //得到输入流
        InputStream inputStream = conn.getInputStream();
        //获取自己数组
        byte[] getData = readInputStream(inputStream);

        //文件保存位置
        return new File(System.getProperty("java.io.tmpdir"));

    }

    private void deleteFile(File file) {
        if (file.exists()) {//判断文件是否存在
            if (file.isFile()) {//判断是否是文件
                file.delete();//删除文件
            } else if (file.isDirectory()) {//否则如果它是一个目录
                File[] files = file.listFiles();//声明目录下所有的文件 files[];
                for (int i = 0; i < files.length; i++) {//遍历目录下所有的文件
                    this.deleteFile(files[i]);//把每个文件用这个方法进行迭代
                }
                file.delete();//删除文件夹
            }
        } else {
            System.out.println("所删除的文件不存在");
        }

    }
    public static  byte[] readInputStream(InputStream inputStream) throws IOException {
        byte[] buffer = new byte[1024];
        int len = 0;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        while((len = inputStream.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }
        bos.close();
        return bos.toByteArray();
    }

    //给房间关联讲义

    public AttatchDocumentRes attatchDocument(AttatchDocumentReq req){
        AttatchDocumentRes res = new AttatchDocumentRes();
        duoBeiService.attatchDocument(req.getDocumentId(),req.getRoomId());
        res.setCode(0);
        return res;
    }


    //删除房间文档
    public RemoveDocumentRes removeDocument(RemoveDocumentReq req){
        RemoveDocumentRes res = new RemoveDocumentRes();
        //编辑课程时间
        com.education.duobei.vo.RemoveDocumentRes removeDocumentRes = duoBeiService.removeDocument(req.getDocumentId(),req.getRoomId());
        if(!removeDocumentRes.isSuccess()){
            res.setCode(101);
            res.setMessage(removeDocumentRes.getError());
            return res;
        }

        res.setCode(0);
        return res;
    }




    //生成文档预览地址
    public PreviewDocUrlRes previewDocUrl(PreviewDocUrlReq req){
        PreviewDocUrlRes res = new PreviewDocUrlRes();
        //编辑课程时间
        com.education.duobei.vo.PreviewDocUrlRes removeDocumentRes = duoBeiService.generateDocPreviewUrl(req.getDocumentId());
        if(!removeDocumentRes.isSuccess()){
            res.setCode(101);
            res.setMessage(removeDocumentRes.getError());
            return res;
        }

        res.setCode(0);
        return res;
    }


    //删除房间
    public DeleteRoomRes deleteRoom(DeleteRoomReq req){
        DeleteRoomRes res = new DeleteRoomRes();
        //删除房间
        com.education.duobei.vo.DeleteRoomRes removeDocumentRes = duoBeiService.deleteRoom(req.getRoomId());
        if(!removeDocumentRes.isSuccess()){
            res.setCode(101);
            res.setMessage(removeDocumentRes.getError());
            return res;
        }

        res.setCode(0);
        return res;
    }

    //获得多贝房间地址
    public GetRoomEnterUrlRes getDuoBeiRoomEnterUrl(GetRoomEnterUrlReq req){
        GetRoomEnterUrlRes res = new GetRoomEnterUrlRes();

        String userRole ;

        switch(req.getUserRole()) {
            case 1:
                userRole = DuobeiYunClient.ROLE_TEACHER;
                break;
            case 2:
                userRole = DuobeiYunClient.ROLE_STUDENT;
                break;
            case 3:
                userRole = DuobeiYunClient.ROLE_MONITOR;
                break;
            case 4:
                userRole = DuobeiYunClient.ROLE_ASSISTANT;
                break;
            default:
                userRole= "";
        }


        String  deviceType =DuobeiYunClient.DEVICE_TYPE_PC;
        if(req.getDeviceType() == 1){
            deviceType = DuobeiYunClient.DEVICE_TYPE_MOBILE;
        }

        com.education.duobei.vo.GetRoomEnterUrlRes cres = duoBeiService.generateRoomEnterUrl(req.getUserName(),req.getNickname(),req.getRoomId(),userRole,deviceType);
        res.setUrl(cres.getUrl());
        res.setCode(0);
        return res;
    }





}
