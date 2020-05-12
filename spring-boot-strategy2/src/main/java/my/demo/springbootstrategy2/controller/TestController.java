package my.demo.springbootstrategy2.controller;

import com.alibaba.fastjson.JSONObject;
import my.demo.springbootstrategy2.config.GiftInfo;
import my.demo.springbootstrategy2.config.GiftInfoContext;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private GiftInfoContext giftInfoContext;

    @RequestMapping("/test")
    public void test(){
        int subjectId = 1;
        int activityId = 901;
        GiftInfo giftInfo = giftInfoContext.getGiftInfo(subjectId, activityId);
        Assert.assertNotNull(giftInfo);
        logger.info("giftInfo:{}", JSONObject.toJSONString(giftInfo));
    }
}
