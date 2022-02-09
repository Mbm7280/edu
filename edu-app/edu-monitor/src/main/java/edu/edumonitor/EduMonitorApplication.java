package edu.edumonitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 模块参考；https://www.51cto.com/article/699076.html
 */
@SpringBootApplication
@EnableAdminServer // 开启SBA服务
public class EduMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(EduMonitorApplication.class, args);
    }

}
