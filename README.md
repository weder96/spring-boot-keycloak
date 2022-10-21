# spring-boot-keycloak
Securing Spring Boot REST APIs with Keycloak


## KeyCloak Application using docker-compose

docker-compose -f docker-compose.yml up

## Configuration KeyCloak

### Create Realm Settings

![figura01](https://github.com/weder96/spring-boot-keycloak/blob/main/documentation/figura01.png)

![figura01_1](https://github.com/weder96/spring-boot-keycloak/blob/main/documentation/figura01_1.png)

### Create ClientID

![figura02](https://github.com/weder96/spring-boot-keycloak/blob/main/documentation/figura02.png)

### Create Realm Role

![figura03](https://github.com/weder96/spring-boot-keycloak/blob/main/documentation/figura03.png)

### Create Users add Password

![figura04](https://github.com/weder96/spring-boot-keycloak/blob/main/documentation/figura04.png)

![figura04_1](https://github.com/weder96/spring-boot-keycloak/blob/main/documentation/figura04_1.png)

### Verify Endpoint KeyCloak (Token)

![figura04_2](https://github.com/weder96/spring-boot-keycloak/blob/main/documentation/figura04_2.png)

## Test Access by Postman

### Get Token BY Auth 2.0

![figura05](https://github.com/weder96/spring-boot-keycloak/blob/main/documentation/figura05.png)

### Access jwt.io verify data token

![figura05_1](https://github.com/weder96/spring-boot-keycloak/blob/main/documentation/figura05_1.png)

## Run Application Employee

mvn spring-boot:run

## Test Call Api pass param token KeyCloak

### 401 Unauthorized

![figura06](https://github.com/weder96/spring-boot-keycloak/blob/main/documentation/figura06.png)

### 200 Authorized

![figura07](https://github.com/weder96/spring-boot-keycloak/blob/main/documentation/figura07.png)