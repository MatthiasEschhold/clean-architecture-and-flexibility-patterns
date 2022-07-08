package de.novatec.clean.architecture.external.service.auth;


import de.novatec.ddd.partner.branch.auth.Authentication;
import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;

public class HttpBearerAuth implements Authentication {
    private final String scheme;
    private String bearerToken;

    public HttpBearerAuth(String scheme) {
        this.scheme = scheme;
    }

    public String getBearerToken() {
        return this.bearerToken;
    }

    public void setBearerToken(String bearerToken) {
        this.bearerToken = bearerToken;
    }

    public void applyToParams(MultiValueMap<String, String> queryParams, HttpHeaders headerParams, MultiValueMap<String, String> cookieParams) {
        if (this.bearerToken != null) {
            String var10002 = this.scheme != null ? upperCaseBearer(this.scheme) + " " : "";
            headerParams.add("Authorization", var10002 + this.bearerToken);
        }
    }

    private static String upperCaseBearer(String scheme) {
        return "bearer".equalsIgnoreCase(scheme) ? "Bearer" : scheme;
    }
}
