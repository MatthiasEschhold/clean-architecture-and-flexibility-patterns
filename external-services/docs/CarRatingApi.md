# CarRatingApi

All URIs are relative to *http://localhost:7000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCarForRating**](CarRatingApi.md#createCarForRating) | **POST** /car-ratings/{id}/car | Erzeugt eine ein Fahrzeug für die Fahrzeugbewertung
[**createCarRating**](CarRatingApi.md#createCarRating) | **POST** /car-ratings | Erzeugt eine initiale Fahrzeugbewertung
[**updateCarRating**](CarRatingApi.md#updateCarRating) | **PUT** /car-ratings/{id}/calculate | Erzeugt eine initiale Fahrzeugbewertung



## createCarForRating

> List&lt;Car&gt; createCarForRating(apiKey, id, car)

Erzeugt eine ein Fahrzeug für die Fahrzeugbewertung

### Example

```java
// Import classes:

import de.novatec.clean.architecture.external.car.service.ApiClient;
import de.novatec.clean.architecture.external.car.service.ApiException;
import de.novatec.clean.architecture.external.car.service.Configuration;
import de.novatec.clean.architecture.external.car.service.models.*;
import CarRatingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:7000");

        CarRatingApi apiInstance = new CarRatingApi(defaultClient);
        String apiKey = "apiKey_example"; // String | Car-API-Key (BearerToken)
        String id = "id_example"; // String | Car-API-Key (BearerToken)
        Car car = new Car(); // Car | 
        try {
            List<Car> result = apiInstance.createCarForRating(apiKey, id, car);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CarRatingApi#createCarForRating");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| Car-API-Key (BearerToken) |
 **id** | **String**| Car-API-Key (BearerToken) |
 **car** | [**Car**](Car.md)|  | [optional]

### Return type

[**List&lt;Car&gt;**](Car.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | Internal Server Error |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **503** | Service Unavailable |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **200** | OK |  -  |


## createCarRating

> List&lt;CarRating&gt; createCarRating(apiKey, carRating)

Erzeugt eine initiale Fahrzeugbewertung

### Example

```java
// Import classes:

import de.novatec.clean.architecture.external.car.service.ApiClient;
import de.novatec.clean.architecture.external.car.service.ApiException;
import de.novatec.clean.architecture.external.car.service.Configuration;
import de.novatec.clean.architecture.external.car.service.models.*;
import CarRatingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:7000");

        CarRatingApi apiInstance = new CarRatingApi(defaultClient);
        String apiKey = "apiKey_example"; // String | Car-API-Key (BearerToken)
        CarRating carRating = new CarRating(); // CarRating | 
        try {
            List<CarRating> result = apiInstance.createCarRating(apiKey, carRating);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CarRatingApi#createCarRating");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| Car-API-Key (BearerToken) |
 **carRating** | [**CarRating**](CarRating.md)|  | [optional]

### Return type

[**List&lt;CarRating&gt;**](CarRating.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | Internal Server Error |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **503** | Service Unavailable |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **200** | OK |  -  |


## updateCarRating

> List&lt;CarRating&gt; updateCarRating(apiKey, id, carRating)

Erzeugt eine initiale Fahrzeugbewertung

### Example

```java
// Import classes:

import de.novatec.clean.architecture.external.car.service.ApiClient;
import de.novatec.clean.architecture.external.car.service.ApiException;
import de.novatec.clean.architecture.external.car.service.Configuration;
import de.novatec.clean.architecture.external.car.service.models.*;
import CarRatingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:7000");

        CarRatingApi apiInstance = new CarRatingApi(defaultClient);
        String apiKey = "apiKey_example"; // String | Car-API-Key (BearerToken)
        String id = "id_example"; // String | Car-API-Key (BearerToken)
        CarRating carRating = new CarRating(); // CarRating | 
        try {
            List<CarRating> result = apiInstance.updateCarRating(apiKey, id, carRating);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CarRatingApi#updateCarRating");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| Car-API-Key (BearerToken) |
 **id** | **String**| Car-API-Key (BearerToken) |
 **carRating** | [**CarRating**](CarRating.md)|  | [optional]

### Return type

[**List&lt;CarRating&gt;**](CarRating.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | Internal Server Error |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **503** | Service Unavailable |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **200** | OK |  -  |

