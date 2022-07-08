package de.novatec.clean.architecture.external.service.api;

import de.novatec.clean.architecture.external.service.ApiClient;
import de.novatec.clean.architecture.external.service.model.Car;
import de.novatec.clean.architecture.external.service.model.CarRating;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-15T18:33:33.250539+02:00[Europe/Berlin]")
public class CarRatingApi {
    private ApiClient apiClient;

    public CarRatingApi() {
        this(new ApiClient());
    }

    @Autowired
    public CarRatingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Erzeugt eine ein Fahrzeug für die Fahrzeugbewertung
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>503</b> - Service Unavailable
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param apiKey Car-API-Key (BearerToken)
     * @param id Car-API-Key (BearerToken)
     * @param car The car parameter
     * @return List&lt;Car&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createCarForRatingRequestCreation(String apiKey, String id, Car car) throws WebClientResponseException {
        Object postBody = car;
        // verify the required parameter 'apiKey' is set
        if (apiKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'apiKey' when calling createCarForRating", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling createCarForRating", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (apiKey != null)
        headerParams.add("apiKey", apiClient.parameterToString(apiKey));
        final String[] localVarAccepts = { 
            "*/*", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Car> localVarReturnType = new ParameterizedTypeReference<Car>() {};
        return apiClient.invokeAPI("/car-ratings/{id}/car", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Erzeugt eine ein Fahrzeug für die Fahrzeugbewertung
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>503</b> - Service Unavailable
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param apiKey Car-API-Key (BearerToken)
     * @param id Car-API-Key (BearerToken)
     * @param car The car parameter
     * @return List&lt;Car&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<Car> createCarForRating(String apiKey, String id, Car car) throws WebClientResponseException {
        ParameterizedTypeReference<Car> localVarReturnType = new ParameterizedTypeReference<Car>() {};
        return createCarForRatingRequestCreation(apiKey, id, car).bodyToFlux(localVarReturnType);
    }

    public Mono<ResponseEntity<List<Car>>> createCarForRatingWithHttpInfo(String apiKey, String id, Car car) throws WebClientResponseException {
        ParameterizedTypeReference<Car> localVarReturnType = new ParameterizedTypeReference<Car>() {};
        return createCarForRatingRequestCreation(apiKey, id, car).toEntityList(localVarReturnType);
    }
    /**
     * Erzeugt eine initiale Fahrzeugbewertung
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>503</b> - Service Unavailable
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param apiKey Car-API-Key (BearerToken)
     * @param carRating The carRating parameter
     * @return List&lt;CarRating&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createCarRatingRequestCreation(String apiKey, CarRating carRating) throws WebClientResponseException {
        Object postBody = carRating;
        // verify the required parameter 'apiKey' is set
        if (apiKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'apiKey' when calling createCarRating", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (apiKey != null)
        headerParams.add("apiKey", apiClient.parameterToString(apiKey));
        final String[] localVarAccepts = { 
            "*/*", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<CarRating> localVarReturnType = new ParameterizedTypeReference<CarRating>() {};
        return apiClient.invokeAPI("/car-ratings", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Erzeugt eine initiale Fahrzeugbewertung
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>503</b> - Service Unavailable
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param apiKey Car-API-Key (BearerToken)
     * @param carRating The carRating parameter
     * @return List&lt;CarRating&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<CarRating> createCarRating(String apiKey, CarRating carRating) throws WebClientResponseException {
        ParameterizedTypeReference<CarRating> localVarReturnType = new ParameterizedTypeReference<CarRating>() {};
        return createCarRatingRequestCreation(apiKey, carRating).bodyToFlux(localVarReturnType);
    }

    public Mono<ResponseEntity<List<CarRating>>> createCarRatingWithHttpInfo(String apiKey, CarRating carRating) throws WebClientResponseException {
        ParameterizedTypeReference<CarRating> localVarReturnType = new ParameterizedTypeReference<CarRating>() {};
        return createCarRatingRequestCreation(apiKey, carRating).toEntityList(localVarReturnType);
    }
    /**
     * Erzeugt eine initiale Fahrzeugbewertung
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>503</b> - Service Unavailable
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param apiKey Car-API-Key (BearerToken)
     * @param id Car-API-Key (BearerToken)
     * @param carRating The carRating parameter
     * @return List&lt;CarRating&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateCarRatingRequestCreation(String apiKey, String id, CarRating carRating) throws WebClientResponseException {
        Object postBody = carRating;
        // verify the required parameter 'apiKey' is set
        if (apiKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'apiKey' when calling updateCarRating", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling updateCarRating", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (apiKey != null)
        headerParams.add("apiKey", apiClient.parameterToString(apiKey));
        final String[] localVarAccepts = { 
            "*/*", "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<CarRating> localVarReturnType = new ParameterizedTypeReference<CarRating>() {};
        return apiClient.invokeAPI("/car-ratings/{id}/calculate", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Erzeugt eine initiale Fahrzeugbewertung
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>503</b> - Service Unavailable
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param apiKey Car-API-Key (BearerToken)
     * @param id Car-API-Key (BearerToken)
     * @param carRating The carRating parameter
     * @return List&lt;CarRating&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<CarRating> updateCarRating(String apiKey, String id, CarRating carRating) throws WebClientResponseException {
        ParameterizedTypeReference<CarRating> localVarReturnType = new ParameterizedTypeReference<CarRating>() {};
        return updateCarRatingRequestCreation(apiKey, id, carRating).bodyToFlux(localVarReturnType);
    }

    public Mono<ResponseEntity<List<CarRating>>> updateCarRatingWithHttpInfo(String apiKey, String id, CarRating carRating) throws WebClientResponseException {
        ParameterizedTypeReference<CarRating> localVarReturnType = new ParameterizedTypeReference<CarRating>() {};
        return updateCarRatingRequestCreation(apiKey, id, carRating).toEntityList(localVarReturnType);
    }
}
