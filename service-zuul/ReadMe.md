Zuul的主要功能是路由和过滤器

zuul不仅只是路由，并且还能过滤，做一些安全验证

以/api-a/ 开头的请求都指向service-ribbon

以/api-b/ 开头的请求都指向service-feign