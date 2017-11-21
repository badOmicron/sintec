SINTEC REPORTEADOR
===================

###RESTful API SINTEC

___NOTA___: Se recomienda hacer uso de SO basado en linux.
 
Servicios web  para generar los reportes SINTEC
` Reporte1,Reporte2,Reporte3,Reporte4,Reporte5`

Distribuciòn del còdigo
-----------------------
* `core`
* `web`

core
------------
Modelo de Datos, Capa de Servicio, Controladores REST.

web
------------
Cliente web.

Prerequisites
-------------
Asegurate de tener las siguientes herramientas instaladas:

Abre una terminal CDM/BASH, dependiendo tu SO, Windows o Linux.

 * Java Development Kit 8.
 
~~~cmd
    java -version 
~~~

* Maven 3.X.X

~~~cmd
    mvn -v 
~~~

* SVN 1.9.4
 
~~~cmd
  svn --version
~~~

* Python  2.7.10
 
~~~cmd
  python --version
~~~

Tecnologías
-------------
El proyecto esta construido con las siguientes tecnologías.

 - Maven
 - Java 8
 - Spring Boot
 - Hibernate/JPA
 - Angular 4
 
 
# Construye 
```
mvn clean pakcage
```

# Despliega

```
cd core
```

```
mvn spring-boot:run
```  

# Verifica

Abre tu navegador y revisa la url:

```
http://localhost:8080/
```  
