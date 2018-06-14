package com.education.appbk.web.controller;

import com.education.Application;
import com.education.tutor.api.live.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by 雪峰 on 2018/6/2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = { Application.class }, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class LiveControllerTest {
    @Autowired
    TestRestTemplate testRestTemplate;

    private final Log logger = LogFactory.getLog(this.getClass());


    @Test
    public void uploadFileUrl() {
        UploadFileUrlReq req = new UploadFileUrlReq();
        req.setFilename("testFile");
        req.setFileUrl("https://image.oilup.com/group1/M00/00/AB/rBWxWlpi6yGAf1AjAAPGt8FyjJE671.jpg");
        req.setRoomId("1234567890123sdsd");


        UploadFileUrlRes res = testRestTemplate.postForObject("/live/uploadFileUrl", req, UploadFileUrlRes.class);
        logger.info("====="+res.getUuid());
    }


    @Test
    public void previewDocUrl() {
        PreviewDocUrlReq req = new PreviewDocUrlReq();
        req.setDocumentId("2d9b565d-2dc4-455c-9324-80fc07dc2e11");


        PreviewDocUrlRes res = testRestTemplate.postForObject("/live/previewDocUrl", req, PreviewDocUrlRes.class);
        logger.info("====="+res.getUrl());
    }

    @Test
    public void removeDocument() {
        RemoveDocumentReq req = new RemoveDocumentReq();
        req.setDocumentId("e724fd67-7f3c-477e-a73b-c7b2a3f937701");
        req.setRoomId("jz8cd1d208159c42beb73852823eccc1bb");

        RemoveDocumentRes res = testRestTemplate.postForObject("/live/removeDocument", req, RemoveDocumentRes.class);
        logger.info("====="+res.getCode());
    }


    @Test
    public void createRoom() {
        CreateRoomReq req = new CreateRoomReq();
        req.setTitle("liu test  room");
        req.setStartTime("2018-08-23T09:20:05Z");
        req.setMenNum(1);
        req.setLength(60);


        CreateRoomRes res = testRestTemplate.postForObject("http://39.106.143.18:7080/live/createRoom", req, CreateRoomRes.class);

    }
}
