package com.nagornov.BackendLab.infrastructure;

import io.github.cdimascio.dotenv.Dotenv;

public final class EnvLoader {

    private EnvLoader() {}

    public static void init() {
        try {

            Dotenv dotenv = Dotenv.configure().load();

            dotenv.entries().forEach(entry ->
                System.setProperty(entry.getKey(), entry.getValue())
            );

        } catch (Exception e) {
            throw new RuntimeException("Failed to initialize env loader", e);
        }
    }

}
