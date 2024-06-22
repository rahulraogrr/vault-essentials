package com.vault.controller;

import com.vault.config.VaultConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/vault")
@RequiredArgsConstructor
public class VaultController {
    private final VaultConfig vaultConfig;

    @GetMapping
    public void getDataFromVault() {
        log.info("DB Username          {}",vaultConfig.getUsername());
        log.info("DB Password          {}",vaultConfig.getPassword());
        log.info("DB Driver class name {}",vaultConfig.getDriverClassName());
        log.info("DB URL               {}",vaultConfig.getUrl());
    }

}
