package my.demo.springbootstrategylist.service;

import my.demo.springbootstrategylist.config.GiftInfo;

public interface IGiftInfoStrategyService {
    GiftInfo getGiftInfo(int activityId);

    int getTypeId();
}
