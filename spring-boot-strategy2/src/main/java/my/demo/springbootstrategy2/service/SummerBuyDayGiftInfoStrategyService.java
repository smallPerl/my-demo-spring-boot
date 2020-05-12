package my.demo.springbootstrategy2.service;

import my.demo.springbootstrategy2.config.GiftInfo;
import my.demo.springbootstrategy2.config.GiftInfoContext;
import org.springframework.stereotype.Service;

@Service
public class SummerBuyDayGiftInfoStrategyService implements IGiftInfoStrategyService {
    static {
        GiftInfoContext.registerProvider(1, SummerBuyDayGiftInfoStrategyService.class);
    }

    public GiftInfo getGiftInfo(int activityId) {
        GiftInfo giftInfo = new GiftInfo();
        giftInfo.setGiftId(901);
        giftInfo.setGiftName("铁锅三件套");
        return giftInfo;
    }
}
