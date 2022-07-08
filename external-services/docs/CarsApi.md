# CarsApi

All URIs are relative to *http://localhost:7000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCar**](CarsApi.md#getCar) | **GET** /cars/{id} | Liefert die Stammdaten eines Fahrzeugs
[**getCarMasterData**](CarsApi.md#getCarMasterData) | **GET** /cars/{id}/masterdata | Liefert die Stammdaten eines Fahrzeugs



## getCar

> Car getCar(apiKey, id)

Liefert die Stammdaten eines Fahrzeugs

### Example

```java
// Import classes:

import de.novatec.clean.architecture.external.car.service.ApiClient;
import de.novatec.clean.architecture.external.car.service.ApiException;
import de.novatec.clean.architecture.external.car.service.Configuration;
import de.novatec.clean.architecture.external.car.service.models.*;
import CarsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:7000");

        CarsApi apiInstance = new CarsApi(defaultClient);
        String apiKey = "apiKey_example"; // String | Car-API-Key (BearerToken)
        String id = "id_example"; // String | ID of car
        try {
            Car result = apiInstance.getCar(apiKey, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CarsApi#getCar");
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
 **id** | **String**| ID of car |

### Return type

[**Car**](Car.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
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


## getCarMasterData

> CarMasterdata getCarMasterData(apiKey, id)

Liefert die Stammdaten eines Fahrzeugs

### Example

```java
// Import classes:

import de.novatec.clean.architecture.external.car.service.ApiClient;
import de.novatec.clean.architecture.external.car.service.ApiException;
import de.novatec.clean.architecture.external.car.service.Configuration;
import de.novatec.clean.architecture.external.car.service.models.*;
import CarsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:7000");

        CarsApi apiInstance = new CarsApi(defaultClient);
        String apiKey = "apiKey_example"; // String | Car-API-Key (BearerToken)
        String id = "id_example"; // String | ID of car
        try {
            CarMasterdata result = apiInstance.getCarMasterData(apiKey, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CarsApi#getCarMasterData");
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
 **id** | **String**| ID of car |

### Return type

[**CarMasterdata**](CarMasterdata.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
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

