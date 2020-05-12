package com.mydemo.springbootstrategy.controller;

import com.alibaba.fastjson.JSONObject;
import com.mydemo.springbootstrategy.config.GiftInfo;
import com.mydemo.springbootstrategy.service.GiftInfoContext;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    Logger logger = LoggerFactory.getLogger(TestController.class);

    @Resource
    private GiftInfoContext giftInfoContext;

    public GiftInfo getGiftInfo(int subjectId, int activityId){
        GiftInfo giftInfo = giftInfoContext.getGiftInfo(subjectId, activityId);
        Assert.assertNotNull(giftInfo);
        return giftInfo;
    }

    @RequestMapping("/test")
    public void test(){
        logger.info("giftInfo:{}", JSONObject.toJSONString(getGiftInfo(1, 1)));
    }
}
