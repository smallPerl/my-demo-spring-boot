package my.demo.springbootstrategylist.config;

import my.demo.springbootstrategylist.service.IGiftInfoStrategyService;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Component
public class GiftInfoContext {

    @Resource
    private List<IGiftInfoStrategyService> giftInfoStrategyServiceList;

    public GiftInfo getGiftInfo(int subjectId, int activityId){
        Optional<IGiftInfoStrategyService> optional = giftInfoStrategyServiceList.stream().
                filter(service -> service.getTypeId() == subjectId)
                .findFirst();

        if(! optional.isPresent()){
            Assert.assertNotNull(giftInfoStrategyServiceList);
        }

        return optional.get().getGiftInfo(activityId);
    }
}
