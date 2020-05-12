package com.mydemo.springbootstrategy.service;

import com.mydemo.springbootstrategy.config.GiftInfo;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class GiftInfoContext {

    @Autowired
    private Map<String, IGiftInfoStrategyService> giftInfoStrategyServiceMap;


    public GiftInfo getGiftInfo(int subjectId, int activityId){
        IGiftInfoStrategyService giftInfoStrategyService = giftInfoStrategyServiceMap.get("a");
        Assert.assertNotNull(giftInfoStrategyService);
        return giftInfoStrategyService.getGiftInfo(activityId);
    }

}
