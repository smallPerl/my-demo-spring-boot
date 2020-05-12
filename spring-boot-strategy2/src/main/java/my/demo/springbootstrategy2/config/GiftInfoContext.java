package my.demo.springbootstrategy2.config;

import my.demo.springbootstrategy2.service.IGiftInfoStrategyService;
import my.demo.springbootstrategy2.tools.SpringUtils;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class GiftInfoContext {

    private static final Logger logger = LoggerFactory.getLogger(GiftInfoContext.class);

    //策略映射map
    private static final Map<Integer, Class<?>> providers = new HashMap<>();

    //提供给策略具体实现类的注册返回
    public static void registerProvider(int subjectId, Class<?> provider){
        providers.put(subjectId, provider);
    }

    public static GiftInfo getGiftInfo(int subjectId, int activityId){
        Class<?> providerClazz = providers.get(subjectId);
        Assert.assertNotNull(providerClazz);
        Object bean = SpringUtils.getBean(providerClazz);
        Assert.assertNotNull(bean);
        if(bean instanceof IGiftInfoStrategyService){
            IGiftInfoStrategyService strategyService = (IGiftInfoStrategyService) bean;
            return strategyService.getGiftInfo(activityId);
        }
        logger.error("Not Class with IGiftInfoListService: {}", providerClazz.getName());
        return null;
    }



}
