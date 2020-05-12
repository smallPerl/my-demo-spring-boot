package my.demo.springbootstrategy2.service;

import my.demo.springbootstrategy2.config.GiftInfo;

public interface IGiftInfoStrategyService {

    GiftInfo getGiftInfo(int activityId);
}
