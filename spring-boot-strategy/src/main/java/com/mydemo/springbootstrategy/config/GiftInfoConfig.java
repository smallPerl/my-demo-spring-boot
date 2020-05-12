package com.mydemo.springbootstrategy.config;

import com.mydemo.springbootstrategy.service.IGiftInfoStrategyService;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class GiftInfoConfig {

    @Resource
    private IGiftInfoStrategyService doubleElevenGiftInfoStrategyService;

    @Resource
    private IGiftInfoStrategyService summerBuyDayGiftInfoStrategyService;

    /**
     * 注入 bean
     */
    @Bean
    public Map<String, IGiftInfoStrategyService> giftInfoStrategyServiceMap(){
        Map<String, IGiftInfoStrategyService> dataMap = new HashMap<>();
        dataMap.put("a", summerBuyDayGiftInfoStrategyService);
        dataMap.put("b", doubleElevenGiftInfoStrategyService);
        return dataMap;
    }

}
