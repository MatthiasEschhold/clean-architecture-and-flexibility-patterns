package de.novatec.clean.architecture.external.service.api;

import de.novatec.clean.architecture.external.service.ApiClient;
import de.novatec.clean.architecture.external.service.model.ApiAnswer;
import de.novatec.clean.architecture.external.service.model.BasicAuth;

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
public class SystemApi {
    private ApiClient apiClient;

    public SystemApi() {
        this(new ApiClient());
    }

    @Autowired
    public SystemApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Login at Car Service Authenticator
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>503</b> - Service Unavailable
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param basicAuth The basicAuth parameter
     * @return String
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec doLoginRequestCreation(BasicAuth basicAuth) throws WebClientResponseException {
        Object postBody = basicAuth;
        // verify the required parameter 'basicAuth' is set
        if (basicAuth == null) {
            throw new WebClientResponseException("Missing the required parameter 'basicAuth' when calling doLogin", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI("/login", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Login at Car Service Authenticator
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>503</b> - Service Unavailable
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param basicAuth The basicAuth parameter
     * @return String
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<String> doLogin(BasicAuth basicAuth) throws WebClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<String>() {};
        return doLoginRequestCreation(basicAuth).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<String>> doLoginWithHttpInfo(BasicAuth basicAuth) throws WebClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<String>() {};
        return doLoginRequestCreation(basicAuth).toEntity(localVarReturnType);
    }
    /**
     * Logout at Car Service Authenticator
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>503</b> - Service Unavailable
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param apiKey internal API-Key
     * @return ApiAnswer
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec doLogoutRequestCreation(String apiKey) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'apiKey' is set
        if (apiKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'apiKey' when calling doLogout", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
            "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ApiAnswer> localVarReturnType = new ParameterizedTypeReference<ApiAnswer>() {};
        return apiClient.invokeAPI("/logout", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Logout at Car Service Authenticator
     * 
     * <p><b>500</b> - Internal Server Error
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>503</b> - Service Unavailable
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - OK
     * @param apiKey internal API-Key
     * @return ApiAnswer
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ApiAnswer> doLogout(String apiKey) throws WebClientResponseException {
        ParameterizedTypeReference<ApiAnswer> localVarReturnType = new ParameterizedTypeReference<ApiAnswer>() {};
        return doLogoutRequestCreation(apiKey).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ApiAnswer>> doLogoutWithHttpInfo(String apiKey) throws WebClientResponseException {
        ParameterizedTypeReference<ApiAnswer> localVarReturnType = new ParameterizedTypeReference<ApiAnswer>() {};
        return doLogoutRequestCreation(apiKey).toEntity(localVarReturnType);
    }
}
