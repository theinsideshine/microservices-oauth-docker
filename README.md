
 microservicios-oauth
 
 La intencion de este proyecto es familiarizarse con el ecosistema
 requerido para un crud de usuarios con Oauth, y dos microservicios a modo didactico,
 para usar balanceo de carga y servidor de configuracion de microservicios
 Se le agrego opciones de trazabilidad con zipkin , rabbitMq.
 
 El ecosistema fue desplegado con docker en el local y luego en google cloud platform.

 
 
Microservicios levantados 
 
 ![](images/eclipse.png)
 
 
Eureka 
 
![](images/eureka.png)
  
Login
  
![](images/token.png)
   
Balanceo de carga 
   
![](images/balanceo1.png)

![](images/balanceo2.png)
	
	
	
Servidor de configuracion

![](images/config-server.png)


Ecosistema

![oauth](images/ecosistema_1.png)

![items-producto](images/ecosistema_2.png)
	
![spring cloud config](images/ecosistema3.png)
 
Trazabilidad 

zipkin error de Login 


![](images/zipkin-errorLogin.png)

zipkin tag error 

![](images/zipkin-tagError.png)

zipkin Mysql 

![](images/zipkin-mySql.png)

rabbitmq 

![](images/rabbitMq.png)



[Dependencia y configuracion](doc/config-ecosistema.pdf)

[![Despliegue con docker en local](images/docker-ms.gif)](https://www.youtube.com/watch?v=D8KEeTIcJeU) 


[Guia para despliegue en google cloud platform](doc/cgp-despliegue-docker-compose.pdf)

 


[![Despliegue en gcp usando docker-compose](images/gcp.gif)](https://www.youtube.com/watch?v=DzVGOHpBsGI) 
