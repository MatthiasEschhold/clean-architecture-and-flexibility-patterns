package de.novatec.clean.architecture.external.service.api;

import de.novatec.clean.architecture.external.service.ApiClient;
import de.novatec.clean.architecture.external.service.model.CarMasterdata;

import de.novatec.clean.architecture.external.service.model.Car;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-15T18:33:33.250539+02:00[Europe/Berlin]")
public class CarsApi {
    private ApiClient apiClient;

    public CarsApi() {
        this(new ApiClient());
    }

    @Autowired
    public CarsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Liefert die Stammdaten eines Fahrzeugs
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>503</b> - Service Unavailable
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param apiKey Car-API-Key (BearerToken)
     * @param id ID of car
     * @return Car
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getCarRequestCreation(String apiKey, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'apiKey' is set
        if (apiKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'apiKey' when calling getCar", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getCar", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Car> localVarReturnType = new ParameterizedTypeReference<Car>() {};
        return apiClient.invokeAPI("/cars/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Liefert die Stammdaten eines Fahrzeugs
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>503</b> - Service Unavailable
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param apiKey Car-API-Key (BearerToken)
     * @param id ID of car
     * @return Car
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Car> getCar(String apiKey, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Car> localVarReturnType = new ParameterizedTypeReference<Car>() {};
        return getCarRequestCreation(apiKey, id).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<Car>> getCarWithHttpInfo(String apiKey, String id) throws WebClientResponseException {
        ParameterizedTypeReference<Car> localVarReturnType = new ParameterizedTypeReference<Car>() {};
        return getCarRequestCreation(apiKey, id).toEntity(localVarReturnType);
    }
    /**
     * Liefert die Stammdaten eines Fahrzeugs
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>503</b> - Service Unavailable
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param apiKey Car-API-Key (BearerToken)
     * @param id ID of car
     * @return CarMasterdata
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getCarMasterDataRequestCreation(String apiKey, String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'apiKey' is set
        if (apiKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'apiKey' when calling getCarMasterData", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getCarMasterData", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<CarMasterdata> localVarReturnType = new ParameterizedTypeReference<CarMasterdata>() {};
        return apiClient.invokeAPI("/cars/{id}/masterdata", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Liefert die Stammdaten eines Fahrzeugs
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>503</b> - Service Unavailable
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param apiKey Car-API-Key (BearerToken)
     * @param id ID of car
     * @return CarMasterdata
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CarMasterdata> getCarMasterData(String apiKey, String id) throws WebClientResponseException {
        ParameterizedTypeReference<CarMasterdata> localVarReturnType = new ParameterizedTypeReference<CarMasterdata>() {};
        return getCarMasterDataRequestCreation(apiKey, id).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<CarMasterdata>> getCarMasterDataWithHttpInfo(String apiKey, String id) throws WebClientResponseException {
        ParameterizedTypeReference<CarMasterdata> localVarReturnType = new ParameterizedTypeReference<CarMasterdata>() {};
        return getCarMasterDataRequestCreation(apiKey, id).toEntity(localVarReturnType);
    }
}
