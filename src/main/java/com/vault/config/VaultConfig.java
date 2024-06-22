package com.vault.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties("db")
public class VaultConfig {
    private String driverClassName;
    private String password;
    private String url;
    private String username;
}