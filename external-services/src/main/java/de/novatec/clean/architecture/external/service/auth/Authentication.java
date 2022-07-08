package de.novatec.clean.architecture.external.service.auth;

import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;

public interface Authentication {
    void applyToParams(MultiValueMap<String, String> var1, HttpHeaders var2, MultiValueMap<String, String> var3);
}
