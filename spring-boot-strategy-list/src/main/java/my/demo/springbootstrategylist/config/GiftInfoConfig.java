package my.demo.springbootstrategylist.config;

import my.demo.springbootstrategylist.service.IGiftInfoStrategyService;
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

    @Bean
    public Map<Integer, IGiftInfoStrategyService> giftInfoStrategyServiceMap(){
        Map<Integer, IGiftInfoStrategyService> dataMap = new HashMap<>();
        dataMap.put(1, doubleElevenGiftInfoStrategyService);
        dataMap.put(2, summerBuyDayGiftInfoStrategyService);
        return dataMap;
    }
}
