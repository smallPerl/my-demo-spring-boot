package my.demo.springbootstrategylist.service;

import my.demo.springbootstrategylist.config.GiftInfo;
import org.springframework.stereotype.Service;

@Service
public class DoubleElevenGiftInfoStrategyService implements IGiftInfoStrategyService{

    @Override
    public GiftInfo getGiftInfo(int activityId) {
        GiftInfo giftInfo = new GiftInfo();
        giftInfo.setGiftId(902);
        giftInfo.setGiftName("双十一：空气净化器");
        return giftInfo;
    }

    @Override
    public int getTypeId() {
        return 2;
    }
}
