package com.salim.core_api.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("app-secrets")
public record SecretsConfigProperties(
        String dbHost,
        String dbName,
        String dbUsername,
        String dbPassword,
        String apiPrefix
) { }
