# SystemApi

All URIs are relative to *http://localhost:7000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**doLogin**](SystemApi.md#doLogin) | **POST** /login | Login at Car Service Authenticator
[**doLogout**](SystemApi.md#doLogout) | **DELETE** /logout | Logout at Car Service Authenticator



## doLogin

> String doLogin(basicAuth)

Login at Car Service Authenticator

### Example

```java
// Import classes:

import de.novatec.clean.architecture.external.car.service.ApiClient;
import de.novatec.clean.architecture.external.car.service.ApiException;
import de.novatec.clean.architecture.external.car.service.Configuration;
import de.novatec.clean.architecture.external.car.service.models.*;
import SystemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:7000");

        SystemApi apiInstance = new SystemApi(defaultClient);
        BasicAuth basicAuth = new BasicAuth(); // BasicAuth | 
        try {
            String result = apiInstance.doLogin(basicAuth);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemApi#doLogin");
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
 **basicAuth** | [**BasicAuth**](BasicAuth.md)|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*


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


## doLogout

> ApiAnswer doLogout(apiKey)

Logout at Car Service Authenticator

### Example

```java
// Import classes:

import de.novatec.clean.architecture.external.car.service.ApiClient;
import de.novatec.clean.architecture.external.car.service.ApiException;
import de.novatec.clean.architecture.external.car.service.Configuration;
import de.novatec.clean.architecture.external.car.service.models.*;
import SystemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:7000");

        SystemApi apiInstance = new SystemApi(defaultClient);
        String apiKey = "apiKey_example"; // String | internal API-Key
        try {
            ApiAnswer result = apiInstance.doLogout(apiKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SystemApi#doLogout");
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
 **apiKey** | **String**| internal API-Key |

### Return type

[**ApiAnswer**](ApiAnswer.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


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

