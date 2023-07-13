package org.example.lecture03;

import java.io.IOException;
import java.util.Date;

/**
 * Создание собственного класса исключений
 */
public class SavedException extends IOException {
    private Date startDate;

    public SavedException(String message, Date startDate, Exception e) {
        super(message, e);
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return startDate;
    }
}
