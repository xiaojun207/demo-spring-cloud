# Demo-Spring-Cloud

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

# demo-spring-cloud简介
this is a spring cloud demo，demo中spring boot 2.x。该demo为学习记录，如果还有人能从中受益，那就再好不过了。

# 1、注册中心
* eureka-server，使用简单，增加了密码校验功能
* nacos注册配置中心

# 2、配置中心
配置中心，包括spring cloud config，也有携程的apollo配置中心
* config-server配置中心，根据目前项目特点，使用的是本地配置，而非git（程序运行环境与git环境不通）等方式；
* apollo携程开源的配置中心，支持灰度、版本管理，用户权限管理，集群管理，使用比较简单。
* nacos注册配置中心，是alibaba开源的注册配置中心

# 3、路由
gateway-server，新一代微服路由选择

# 4、应用1
client-service

# 5、应用2
app

>其中，包含了：服务调用、熔断等


edit by xiaojun207@126.com
