package com.junode.edu.boss;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import com.alicp.jetcache.anno.config.EnableMethodCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableMethodCache(basePackages = "com.junode.edu")
@EnableCreateCacheAnnotation
@EnableFeignClients("com.junode.edu")
@ComponentScan({"com.junode.edu"})
public class EduBossApplication {
    public static void main(String[] args) {
        SpringApplication.run(EduBossApplication.class, args);
    }
}
