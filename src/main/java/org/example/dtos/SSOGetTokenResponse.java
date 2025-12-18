package org.example.dtos;

public class SSOGetTokenResponse {
    private String accessToken;

    public String getAccessToken() {
        return this.accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public SSOGetTokenResponse(String accessToken) {
        this.accessToken = accessToken;
    }
}
