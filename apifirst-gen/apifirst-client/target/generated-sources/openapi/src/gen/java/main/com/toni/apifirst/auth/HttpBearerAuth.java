package com.toni.apifirst.auth;

import java.util.Optional;
import java.util.function.Supplier;
import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-04T10:41:17.687869989+02:00[Europe/Madrid]")
public class HttpBearerAuth implements Authentication {
    private final String scheme;
    private Supplier<String> tokenSupplier;

    public HttpBearerAuth(String scheme) {
        this.scheme = scheme;
    }

    public String getBearerToken() {
        return tokenSupplier.get();
    }

    public void setBearerToken(String bearerToken) {
        this.tokenSupplier = () -> bearerToken;
    }
    
    public void setBearerToken(Supplier<String> tokenSupplier) {
        this.tokenSupplier = tokenSupplier;
    }

    @Override
    public void applyToParams(MultiValueMap<String, String> queryParams, HttpHeaders headerParams, MultiValueMap<String, String> cookieParams) {
        String bearerToken = Optional.ofNullable(tokenSupplier).map(Supplier::get).orElse(null);
        if (bearerToken == null) {
            return;
        }
        headerParams.add(HttpHeaders.AUTHORIZATION, (scheme != null ? upperCaseBearer(scheme) + " " : "") + bearerToken);
    }

    private static String upperCaseBearer(String scheme) {
        return ("bearer".equalsIgnoreCase(scheme)) ? "Bearer" : scheme;
    }
}