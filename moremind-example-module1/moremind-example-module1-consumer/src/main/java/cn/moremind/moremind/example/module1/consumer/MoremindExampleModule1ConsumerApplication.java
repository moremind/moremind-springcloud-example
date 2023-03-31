package cn.moremind.moremind.example.module1.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "cn.moremind.*")
public class MoremindExampleModule1ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoremindExampleModule1ConsumerApplication.class, args);
	}

}
