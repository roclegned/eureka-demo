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
  
 
 
 
  
