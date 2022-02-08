package com.lagou.edu.message.util;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: ma wei long
 * @date:   2020年6月30日 下午5:07:31
 */
@Slf4j
//@Data
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class ServerConfigUtils {

	@Autowired
    private ApplicationContext context;
	
	public static ServerConfigUtils instance;
	
	@Value("${spring.security.oauth2.jwt.signingKey}")
    private String signingKey;
    @Value("${spring.application.name}")
    private String appName;
    @Value("${webSocket.origin}")
    private String webSocketOrigin;
    @Value("${webSocket.context}")
    private String webSocketContext;
    @Value("${webSocket.port}")
    private Integer webSocketPort;
    
    @Value("${spring.redis.host}")
    private String redisHost;
    @Value("${spring.redis.port}")
    private Integer redisPort;

    public ApplicationContext getContext() {
        return context;
    }

    public void setContext(ApplicationContext context) {
        this.context = context;
    }

    public static ServerConfigUtils getInstance() {
        return instance;
    }

    public static void setInstance(ServerConfigUtils instance) {
        ServerConfigUtils.instance = instance;
    }

    public String getSigningKey() {
        return signingKey;
    }

    public void setSigningKey(String signingKey) {
        this.signingKey = signingKey;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getWebSocketOrigin() {
        return webSocketOrigin;
    }

    public void setWebSocketOrigin(String webSocketOrigin) {
        this.webSocketOrigin = webSocketOrigin;
    }

    public String getWebSocketContext() {
        return webSocketContext;
    }

    public void setWebSocketContext(String webSocketContext) {
        this.webSocketContext = webSocketContext;
    }

    public Integer getWebSocketPort() {
        return webSocketPort;
    }

    public void setWebSocketPort(Integer webSocketPort) {
        this.webSocketPort = webSocketPort;
    }

    public String getRedisHost() {
        return redisHost;
    }

    public void setRedisHost(String redisHost) {
        this.redisHost = redisHost;
    }

    public Integer getRedisPort() {
        return redisPort;
    }

    public void setRedisPort(Integer redisPort) {
        this.redisPort = redisPort;
    }

    @PostConstruct
    public void init() {
		try {
			instance = (ServerConfigUtils)context.getBean(Class.forName("com.lagou.edu.message.util.ServerConfigUtils"));
		} catch (Exception e) {
			log.error("ServerConfigUtils - init - error",e);
		}
    }
}
