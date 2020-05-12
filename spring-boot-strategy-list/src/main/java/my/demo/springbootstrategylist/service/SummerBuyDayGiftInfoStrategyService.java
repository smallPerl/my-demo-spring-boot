package my.demo.springbootstrategylist.service;

import my.demo.springbootstrategylist.config.GiftInfo;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;
import org.springframework.stereotype.Service;

@Service
public class SummerBuyDayGiftInfoStrategyService implements IGiftInfoStrategyService{

    @Override
    public GiftInfo getGiftInfo(int activityId) {
        GiftInfo giftInfo = new GiftInfo();
        giftInfo.setGiftId(1);
        giftInfo.setGiftName("铁锅三件套");
        return giftInfo;
    }

    @Override
    public int getTypeId() {
        return 1;
    }
}
