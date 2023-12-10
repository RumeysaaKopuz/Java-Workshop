package org.example.core.logging;

public class DatabaseLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.print("Veritabanına loglandı: " + data);
    }
}
