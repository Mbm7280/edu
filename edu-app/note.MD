该部分是我在调通项目过程中，自己做的一些笔记：
+ 修改网关配置，将/user鉴权屏蔽，不对/user鉴权
+ 屏蔽spring boot admin，之前是个人做测试时增加的依赖

在`edit configuration -> VM选项`添加skywalking参数：
```shell
# 客户模块
-javaagent:D:/eclipse/apache-skywalking-apm-bin-es7/agent/skywalking-agent.jar
-Dskywalking.collector.grpc_channel_check_interval=2
-Dskywalking.collector.app_and_service_register_check_interval=2
-Dcollector.discovery_check_interval=2
-Dskywalking.collector.backend_service=localhost:11800
-Dskywalking.agent.service_name=EduUserApp
-Dskywalking.logging.level=warn
-Dskywalking.plugin.toolkit.log.grpc.reporter.server_host=localhost
-Dskywalking.plugin.toolkit.log.grpc.reporter.server_port=11800
-Dskywalking.plugin.toolkit.log.grpc.reporter.max_message_size=10485760
-Dskywalking.plugin.toolkit.log.grpc.reporter.upstream_timeout=30

# 网关模块类似，仅修改service_name即可：
-Dskywalking.agent.service_name=EduGatewayApp
```
