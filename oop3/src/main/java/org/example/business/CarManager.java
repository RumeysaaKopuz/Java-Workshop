package org.example.business;

import org.example.core.logging.Logger;
import org.example.dataAccess.CarDao;
import org.example.dataAccess.HibernateCarDao;
import org.example.dataAccess.JdbcCarDao;
import org.example.entities.Car;

import java.util.List;

public class CarManager {
    private CarDao carDao;
    private Logger[] loggers;

    public CarManager(CarDao carDao, Logger[] loggers) {
        this.carDao = carDao;
        this.loggers = loggers;
    }
    public void add(Car car) throws Exception {
        // is kurallari
        if (car.getYear() < 2017) {
            throw new Exception("Arabanın yılı 2017 öncesi olamaz");
        }

        //JdbcCarDao carDao = new JdbcCarDao();
        carDao.add(car);

        for (Logger logger: loggers) {
            logger.log(car.getBrand());
        }

    }
}
