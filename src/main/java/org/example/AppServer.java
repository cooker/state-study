package org.example;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@MapperScan(value = "org.example.mapper")
@SpringBootApplication
public class AppServer
{
    public static void main( String[] args )
    {
        SpringApplication.run(AppServer.class, args);
    }
}
