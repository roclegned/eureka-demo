# eureka-demo
Eureka server相比于Zookeeper每个节点是平等的，侧重CAP原则中的Availability（可用性）
### 一、DEMO实现了以下功能：
 * 多eureka server互相注册实现高可用
 * 整合Ribbon实现负载均衡
 * 持续更新中...
 
### 二、单机测试
  + 修改注意host文件，windows下修改`C:\Windows\System32\drivers\etc\hosts` 文件，添加 `127.0.0.1       peer1 peer2`
  + 执行下面命令启动两个Eureka server节点 
  ```
  java -jar eureka-server-1.0-SNAPSHOT.jar --spring.profiles.active=peer1 
  java -jar eureka-server-1.0-SNAPSHOT.jar --spring.profiles.active=peer2
  ```
  + 开启两个provider
  ```
  java -jar simple-provider-1.0-SNAPSHOT.jar  默认8000 端口
  java -jar simple-provider-1.0-SNAPSHOT.jar --server.prot=8001 
  ```
  + 启动consumer测试
  `java -jar simple-consumer-1.0-SNAPSHOT.jar  `
  > 访问 http://localhost:8010/log-instance 尝试多次刷新网页，控制台输出如下
  ``` 
   2018-11-20 22:15:36.913  INFO 51772 : simple-user-provider:172.17.5.160:8001
   2018-11-20 22:15:37.184  INFO 51772 : simple-user-provider:172.17.5.160:8000
   2018-11-20 22:15:37.404  INFO 51772 : simple-user-provider:172.17.5.160:8001
   2018-11-20 22:15:37.608  INFO 51772 : simple-user-provider:172.17.5.160:8000
   2018-11-20 22:15:37.800  INFO 51772 : simple-user-provider:172.17.5.160:8001
   2018-11-20 22:15:38.023  INFO 51772 : simple-user-provider:172.17.5.160:8000
```
 > 尝试停止一台Eureka Server再次访问http://localhost:8010/log-instance 多次刷新，控制台输出如下
``` 
    2018-11-20 22:26:30.694  INFO 51772 : simple-user-provider:172.17.5.160:8000
    2018-11-20 22:26:30.882  INFO 51772 : simple-user-provider:172.17.5.160:8001
    2018-11-20 22:26:31.065  INFO 51772 : simple-user-provider:172.17.5.160:8000
    2018-11-20 22:26:31.239  INFO 51772 : simple-user-provider:172.17.5.160:8001
    2018-11-20 22:26:31.407  INFO 51772 : simple-user-provider:172.17.5.160:8000
    2018-11-20 22:26:31.588  INFO 51772 : simple-user-provider:172.17.5.160:8001
```
 
 
 
  
