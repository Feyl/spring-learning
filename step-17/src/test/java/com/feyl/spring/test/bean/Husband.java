package com.feyl.spring.test.bean;

import java.time.LocalDate;

/**
 * @author Feyl
 */
public class Husband {

    private String wifeName;

    private LocalDate marriageDate;

    public String getWifeName() {
        return wifeName;
    }

    public void setWifeName(String wifiName) {
        this.wifeName = wifiName;
    }

    public LocalDate getMarriageDate() {
        return marriageDate;
    }

    public void setMarriageDate(LocalDate marriageDate) {
        this.marriageDate = marriageDate;
    }

    @Override
    public String toString() {
        return "Husband{" +
                "wifiName='" + wifeName + '\'' +
                ", marriageDate=" + marriageDate +
                '}';
    }
}
