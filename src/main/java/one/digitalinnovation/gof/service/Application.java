package one.digitalinnovation.gof.service;

import jdk.internal.misc.InnocuousThread;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr sendo usado
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 *
 */
@EnableFeignClients
@SpringBootApplication
public class Application {

    public static InnocuousThread springApplication;

    public static void main(String[] args) {
        springApplication.run();
    }


}
