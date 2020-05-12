package my.demo.springbootstrategy2;

import my.demo.springbootstrategy2.config.GiftInfo;
import my.demo.springbootstrategy2.config.GiftInfoContext;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootStrategy2Application {
	@Autowired
	private GiftInfoContext giftInfoContext;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStrategy2Application.class, args);
	}

}
