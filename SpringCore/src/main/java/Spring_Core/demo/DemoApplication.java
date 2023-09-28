package Spring_Core.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication
{
	public static void main(String[] args)
	{
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		Car car = context.getBean(Car.class);
		System.out.println(car.getEngineData());
	}

}
