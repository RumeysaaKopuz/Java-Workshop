package org.example;

import org.example.business.CarManager;
import org.example.core.logging.DatabaseLogger;
import org.example.core.logging.FileLogger;
import org.example.core.logging.Logger;
import org.example.core.logging.MailLogger;
import org.example.dataAccess.CarDao;
import org.example.dataAccess.HibernateCarDao;
import org.example.dataAccess.JdbcCarDao;
import org.example.entities.Car;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Car car1 = new Car(1, "Mercedes", (int) 145000, 2019 );

        Logger[] loggers = {new DatabaseLogger(), new FileLogger() };


        CarManager carManager = new CarManager(new HibernateCarDao(), loggers);
        carManager.add(car1);

    }
}