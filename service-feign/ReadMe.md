在服务架构中，业务都会被拆分成一个独立的服务，服务与服务的通讯是基于http restful的。

一种是feign(本模块)，另一种是ribbon+restTemplate

Feign是一个声明式的web服务客户端，它使得写web服务变得更简单。使用Feign,只需要创建一个接口并注解。它具有可插拔的注解特性，包括Feign 注解和JAX-RS注解。Feign同时支持可插拔的编码器和解码器。spring cloud对Spring mvc添加了支持，同时在spring web中次用相同的HttpMessageConverter。当我们使用feign的时候，spring cloud 整和了Ribbon和eureka去提供负载均衡。

简而言之：

> feign采用的是接口加注解

> feign 整合了ribbon