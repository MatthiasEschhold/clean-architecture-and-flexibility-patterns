package de.novatec.clean.architecture.external.service.auth;


import java.nio.charset.StandardCharsets;

import de.novatec.ddd.partner.branch.auth.Authentication;
import org.springframework.http.HttpHeaders;
import org.springframework.util.Base64Utils;
import org.springframework.util.MultiValueMap;

public class HttpBasicAuth implements Authentication {
    private String username;
    private String password;

    public HttpBasicAuth() {
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void applyToParams(MultiValueMap<String, String> queryParams, HttpHeaders headerParams, MultiValueMap<String, String> cookieParams) {
        if (this.username != null || this.password != null) {
            String var10000 = this.username == null ? "" : this.username;
            String str = var10000 + ":" + (this.password == null ? "" : this.password);
            headerParams.add("Authorization", "Basic " + Base64Utils.encodeToString(str.getBytes(StandardCharsets.UTF_8)));
        }
    }
}
