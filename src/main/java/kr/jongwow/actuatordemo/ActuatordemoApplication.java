package kr.jongwow.actuatordemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class})
public class ActuatordemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActuatordemoApplication.class, args);
	}

//	https://thecodinglog.github.io/spring/security/2020/01/10/disable-security-auto-config.html
}
