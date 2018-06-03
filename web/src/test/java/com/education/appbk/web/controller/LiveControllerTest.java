package com.education.appbk.web.controller;

import com.education.Application;
import com.education.tutor.api.live.UploadFileUrlReq;
import com.education.tutor.api.live.UploadFileUrlRes;
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


}
