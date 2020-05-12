package com.mydemo.springbootstrategy.service;

import com.mydemo.springbootstrategy.config.GiftInfo;
import org.springframework.stereotype.Service;

/**
 * 夏季购物节
 */
@Service
public class SummerBuyDayGiftInfoStrategyService implements IGiftInfoStrategyService{

    @Override
    public GiftInfo getGiftInfo(int activityId) {
        GiftInfo giftInfo = new GiftInfo();
        giftInfo.setGiftId(1);
        giftInfo.setGiftName("铁锅三件套");
        return giftInfo;
    }
}
