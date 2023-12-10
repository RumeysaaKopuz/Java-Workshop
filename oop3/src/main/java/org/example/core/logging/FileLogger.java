package org.example.core.logging;

import java.awt.*;

public class FileLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.print("Dosya ile loglandı: " + data);
    }
}
