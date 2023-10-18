package spharosMSAtest.MSAtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsAtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAtestApplication.class, args);
	}

}
