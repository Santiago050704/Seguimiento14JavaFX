package com.example.seguimiento14javafx;

import java.time.LocalDate;

public class Registration {
    private double amount;
    private String description;
    private Type type;
    private LocalDate date;

    public Registration(double amount, String description, Type type, LocalDate date) {
        this.amount = amount;
        this.description = description;
        this.type = type;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type.toString();
    }

    public void setType(Type type) {
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
