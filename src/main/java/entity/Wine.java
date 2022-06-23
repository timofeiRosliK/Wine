package entity;

import java.time.LocalDate;

public class Wine {
    private String name;
    private String mark;
    private Country country;
    private LocalDate date;
    private String note;

    public Wine() {

    }

    public Wine(String name, String mark, Country country, LocalDate date, String note) {
        this.name = name;
        this.mark = mark;
        this.country = country;
        this.date = date;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "name='" + name + '\'' +
                ", mark='" + mark + '\'' +
                ", country=" + country +
                ", date=" + date +
                ", note='" + note + '\'' +
                '}';
    }
}
