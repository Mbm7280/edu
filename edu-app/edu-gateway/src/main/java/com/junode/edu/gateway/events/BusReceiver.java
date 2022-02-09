package com.junode.edu.gateway.events;

import com.junode.edu.gateway.service.IRouteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.stereotype.Component;

@Component
public class BusReceiver {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private IRouteService routeService;

    public void handleMessage(RouteDefinition routeDefinition) {
        log.info("Received Message:<{}>", routeDefinition);
        // 待实现动态del路由
        routeService.save(routeDefinition);
    }
}
