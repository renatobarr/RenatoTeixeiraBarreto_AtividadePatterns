package org.example.adapter;

public class Application {
    private final Logger logger;

    // Depende apenas da interface Logger, nunca da LegacyLogger
    public Application(Logger logger) {
        this.logger = logger;
    }

    public void run() {
        logger.info("Iniciando aplicação");
        logger.error("Falha ao conectar no banco");
    }
}
