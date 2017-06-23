安装rabbitmq
>
>cd /etc/init.d/

>rabbitmqctl add_user  lin  lin

>rabbitmqctl set_user_tags lin administrator

########################
#RabbitMQ 权限控制：
########################
默认virtual host："/"
默认用户：guest 
guest具有"/"上的全部权限，仅能有localhost访问RabbitMQ包括Plugin，建议删除或更改密码。可通过将配置文件中loopback_users置孔来取消其本地访问的限制：

###为用户赋予权限

没有这句项目启动会报错

>rabbitmqctl  set_permissions -p /  lin '.*' '.*' '.*'

