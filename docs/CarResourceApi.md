# CarResourceApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**carsGet**](CarResourceApi.md#carsGet) | **GET** /cars | 
[**carsIdDelete**](CarResourceApi.md#carsIdDelete) | **DELETE** /cars/{id} | 
[**carsIdGet**](CarResourceApi.md#carsIdGet) | **GET** /cars/{id} | 
[**carsIdPut**](CarResourceApi.md#carsIdPut) | **PUT** /cars/{id} | 
[**carsPost**](CarResourceApi.md#carsPost) | **POST** /cars | 

<a name="carsGet"></a>
# **carsGet**
> List&lt;Car&gt; carsGet()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CarResourceApi;


CarResourceApi apiInstance = new CarResourceApi();
try {
    List<Car> result = apiInstance.carsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CarResourceApi#carsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Car&gt;**](Car.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="carsIdDelete"></a>
# **carsIdDelete**
> carsIdDelete(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CarResourceApi;


CarResourceApi apiInstance = new CarResourceApi();
String id = "id_example"; // String | 
try {
    apiInstance.carsIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CarResourceApi#carsIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="carsIdGet"></a>
# **carsIdGet**
> carsIdGet(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CarResourceApi;


CarResourceApi apiInstance = new CarResourceApi();
String id = "id_example"; // String | 
try {
    apiInstance.carsIdGet(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CarResourceApi#carsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="carsIdPut"></a>
# **carsIdPut**
> carsIdPut(id, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CarResourceApi;


CarResourceApi apiInstance = new CarResourceApi();
String id = "id_example"; // String | 
Car body = new Car(); // Car | 
try {
    apiInstance.carsIdPut(id, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CarResourceApi#carsIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**Car**](Car.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="carsPost"></a>
# **carsPost**
> carsPost(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CarResourceApi;


CarResourceApi apiInstance = new CarResourceApi();
Car body = new Car(); // Car | 
try {
    apiInstance.carsPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling CarResourceApi#carsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Car**](Car.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

