package com.mydemo.springbootstrategy.service;

import com.mydemo.springbootstrategy.config.GiftInfo;

public interface IGiftInfoStrategyService {

    GiftInfo getGiftInfo(int activityId);
}
