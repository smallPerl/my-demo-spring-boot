package com.mydemo.springbootstrategy.service;

import com.mydemo.springbootstrategy.config.GiftInfo;
import org.springframework.stereotype.Service;

@Service
public class DoubleElevenGiftInfoStrategyService implements IGiftInfoStrategyService{

    @Override
    public GiftInfo getGiftInfo(int activityId) {
        GiftInfo giftInfo = new GiftInfo();
        giftInfo.setGiftId(1);
        giftInfo.setGiftName("双十一空气净化器");
        return giftInfo;
    }
}
