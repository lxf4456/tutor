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
        req.setFileUrl("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1527957989054&di=b8cd5bc332a2df2960eaa38923900ec5&imgtype=0&src=http%3A%2F%2Fimg5.duitang.com%2Fuploads%2Fblog%2F201412%2F04%2F20141204111500_4NVEK.thumb.700_0.png");
        req.setRoomId("1234567890123sdsd");


        UploadFileUrlRes res = testRestTemplate.postForObject("/live/uploadFileUrl", req, UploadFileUrlRes.class);
        logger.info("====="+res.getUuid());
    }


}
