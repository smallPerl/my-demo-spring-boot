package my.demo.springbootstrategy2;

import com.alibaba.fastjson.JSONObject;
import my.demo.springbootstrategy2.config.GiftInfo;
import my.demo.springbootstrategy2.config.GiftInfoContext;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest(classes = SpringBootStrategy2Application.class)
@RunWith(SpringRunner.class)
public class GiftInfoTest {
    static Logger logger = LoggerFactory.getLogger(GiftInfoTest.class);

    @Autowired
    private GiftInfoContext giftInfoContext;

    @Test
    public void getGiftInfoTest(){
        int subjectId = 1;
        int activityId = 901;
        GiftInfo giftInfo = giftInfoContext.getGiftInfo(subjectId, activityId);
        Assert.assertNotNull(giftInfo);
        logger.info("giftInfo:{}", JSONObject.toJSONString(giftInfo));
    }
}
