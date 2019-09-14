package pl.zankowski.fixparser.serviceregistry.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FixParserServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(FixParserServiceRegistryApplication.class, args);
    }

}
