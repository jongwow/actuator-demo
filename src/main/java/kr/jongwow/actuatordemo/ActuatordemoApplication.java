package kr.jongwow.actuatordemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication()
public class ActuatordemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActuatordemoApplication.class, args);
    }
}
