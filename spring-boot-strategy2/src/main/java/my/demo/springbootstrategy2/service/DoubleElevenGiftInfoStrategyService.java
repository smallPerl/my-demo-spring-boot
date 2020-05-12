package my.demo.springbootstrategy2.service;

import my.demo.springbootstrategy2.config.GiftInfo;
import my.demo.springbootstrategy2.config.GiftInfoContext;
import org.springframework.stereotype.Service;

@Service
public class DoubleElevenGiftInfoStrategyService implements IGiftInfoStrategyService {
    //静态代码块中注册关联
    static {
        GiftInfoContext.registerProvider(2, DoubleElevenGiftInfoStrategyService.class);
    }

    public GiftInfo getGiftInfo(int activityId) {
        GiftInfo giftInfo = new GiftInfo();
        giftInfo.setGiftId(902);
        giftInfo.setGiftName("双十一空气净化器");
        return giftInfo;
   }
}
