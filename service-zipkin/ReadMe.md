Spring Cloud Sleuth 主要功能就是在分布式系统中提供追踪解决方案，并且兼容支持了 zipkin，你只需要在pom文件中引入相应的依赖即可
参考文章：http://blog.csdn.net/forezp/article/details/70162074

#####1.启动server-zipkin
#####2.访问http://localhost:7000
#####3.访问http://locahost:7001/zipkin-first?name=1
#####4.查看2中的控台即可追踪访问链路