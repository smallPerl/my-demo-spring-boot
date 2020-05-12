package my.demo.springbootstrategylist;

import com.alibaba.fastjson.JSONObject;
import my.demo.springbootstrategylist.config.GiftInfo;
import my.demo.springbootstrategylist.config.GiftInfoContext;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = SpringBootStrategyListApplication.class)
@RunWith(SpringRunner.class)
public class GiftInfoTest {

    static Logger logger = LoggerFactory.getLogger(GiftInfoTest.class);

    @Resource
    private GiftInfoContext giftInfoContext;

    @Test
    public void test(){
        int subjectId = 1;
        int activityId = 901;
        GiftInfo giftInfo = giftInfoContext.getGiftInfo(subjectId, activityId);
        Assert.assertNotNull(giftInfo);
        logger.info("giftInfo:{}", JSONObject.toJSONString(giftInfo));
    }
}
