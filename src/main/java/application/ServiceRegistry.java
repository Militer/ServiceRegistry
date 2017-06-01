package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * User: militer
 * Date: 25.05.2017.
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistry {
    public static void main(String[] args){
        SpringApplication.run(ServiceRegistry.class);
    }
}
