package top.truism.springbootunittestprovider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "top.truism.springbootunittestprovider")
public class SpringBootUnitTestProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootUnitTestProviderApplication.class, args);
    }

}
