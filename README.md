# swagger-java-client

openapi-swaggerui-quickstart API
- API version: 1.0.0-SNAPSHOT
  - Build date: 2024-09-20T05:00:37.574508435Z[GMT]

No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.CarResourceApi;

import java.io.File;
import java.util.*;

public class CarResourceApiExample {

    public static void main(String[] args) {
        
        CarResourceApi apiInstance = new CarResourceApi();
        try {
            List<Car> result = apiInstance.carsGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CarResourceApi#carsGet");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.CarResourceApi;

import java.io.File;
import java.util.*;

public class CarResourceApiExample {

    public static void main(String[] args) {
        
        CarResourceApi apiInstance = new CarResourceApi();
        String id = "id_example"; // String | 
        try {
            apiInstance.carsIdDelete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling CarResourceApi#carsIdDelete");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.CarResourceApi;

import java.io.File;
import java.util.*;

public class CarResourceApiExample {

    public static void main(String[] args) {
        
        CarResourceApi apiInstance = new CarResourceApi();
        String id = "id_example"; // String | 
        try {
            apiInstance.carsIdGet(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling CarResourceApi#carsIdGet");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.CarResourceApi;

import java.io.File;
import java.util.*;

public class CarResourceApiExample {

    public static void main(String[] args) {
        
        CarResourceApi apiInstance = new CarResourceApi();
        String id = "id_example"; // String | 
        Car body = new Car(); // Car | 
        try {
            apiInstance.carsIdPut(id, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling CarResourceApi#carsIdPut");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.CarResourceApi;

import java.io.File;
import java.util.*;

public class CarResourceApiExample {

    public static void main(String[] args) {
        
        CarResourceApi apiInstance = new CarResourceApi();
        Car body = new Car(); // Car | 
        try {
            apiInstance.carsPost(body);
        } catch (ApiException e) {
            System.err.println("Exception when calling CarResourceApi#carsPost");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to */*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CarResourceApi* | [**carsGet**](docs/CarResourceApi.md#carsGet) | **GET** /cars | 
*CarResourceApi* | [**carsIdDelete**](docs/CarResourceApi.md#carsIdDelete) | **DELETE** /cars/{id} | 
*CarResourceApi* | [**carsIdGet**](docs/CarResourceApi.md#carsIdGet) | **GET** /cars/{id} | 
*CarResourceApi* | [**carsIdPut**](docs/CarResourceApi.md#carsIdPut) | **PUT** /cars/{id} | 
*CarResourceApi* | [**carsPost**](docs/CarResourceApi.md#carsPost) | **POST** /cars | 

## Documentation for Models

 - [Attributes](docs/Attributes.md)
 - [Car](docs/Car.md)
 - [Features](docs/Features.md)
 - [Location](docs/Location.md)
 - [LocationProperties](docs/LocationProperties.md)
 - [TirePressure](docs/TirePressure.md)
 - [TirePressureProperties](docs/TirePressureProperties.md)
 - [Vehicle](docs/Vehicle.md)
 - [VehicleProperties](docs/VehicleProperties.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


