package org.example;

import org.example.adapter.Application;
import org.example.adapter.LegacyLogger;
import org.example.adapter.LegacyLoggerAdapter;
import org.example.adapter.Logger;

public class AdapterMain {
    public static void main(String[] args) {
        // Instancia o legado
        LegacyLogger legacy = new LegacyLogger();

        // Cria o adapter passando o legado
        Logger logger = new LegacyLoggerAdapter(legacy);

        // Injeta no cliente e executa
        Application app = new Application(logger);
        app.run();
    }
}