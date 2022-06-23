package service;

import entity.Wine;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneOffset;

public class WineService {
    public double countDays(LocalDate date, Wine хуй ){
        LocalDate dateOfPouring = хуй.getDate();
        long seconds = date.toEpochSecond(LocalTime.MAX, ZoneOffset.MAX);
        long wineSeconds = dateOfPouring.toEpochSecond(LocalTime.MAX, ZoneOffset.MAX);
        long result = seconds - wineSeconds;
        return (double) result / (365 * 86400);
    }
}
