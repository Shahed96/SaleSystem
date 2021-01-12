/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shahed.classes;

/**
 *
 * @author DELL
 */
import java.util.Scanner;

public class Date {

    private String month;
    private int day;
    private int year;//four digits only 

    //default constructor:
    public Date() {
        month = "January";
        day = 1;
        year = 1999;
    }

    //constructor with parameters:
    public Date(int day, String month, int year) {
        setDay(day);
        this.month = month;
        setYear(year);

    }

    //constructor with parameters (int month):
    public Date(int day, int month, int year) {
        this.day = day;
        setMmonthInteger(month);
        setYear(year);

    }

    //copy constructor:
    public Date(Date object) {
        if (object == null) {
            System.out.println("Fatal error: null object! ");
            System.exit(0);
        }
        day = object.day;
        month = object.month;
        year = object.year;
    }
    //motator functions:

    public void setMmonthInteger(int month) {
        switch (month) {
            case 1:
                this.month = "January";
            case 2:
                this.month = "February";
            case 3:
                this.month = "January";
            case 4:
                this.month = "January";
            case 5:
                this.month = "January";
            case 6:
                this.month = "January";
            case 7:
                this.month = "January";
            case 8:
                this.month = "January";
            case 9:
                this.month = "January";
            case 10:
                this.month = "October";
            case 11:
                this.month = "November";
            case 12:
                this.month = "December";
            default:
                System.out.println("Enter between 1-12 number");

        }

    }

    public void setDay(int day) {
        if ((day > 31) || (day <= 0)) {
            System.out.println("Fatal error!");
        }
        this.day = day;
    }

    public void setMonthString(String month) {
        if (monthOK(month)) {
            this.month = month;
        }
    }

    public void setYear(int year) {
        if (year > 9999) {
            System.out.println("Please enter 4 digits");
        }
        this.year = year;
    }

    public void setDate(String monthIn, int dayIn, int yearIn) {
        setMonthString(monthIn);
        setDay(dayIn);
        setYear(yearIn);

    }
//Accessor functions:

    public int getDay() {
        return day;
    }

    public String getMonthName() {
        return month;
    }

    public int getYear() {
        return year;
    }

    /**
     *
     * @return
     */
    public int getMonthNumber() {
        if (month.equalsIgnoreCase("January")) {
            return 1;
        } else if (month.equalsIgnoreCase("February")) {
            return 2;
        } else if (month.equalsIgnoreCase("March")) {
            return 3;
        } else if (month.equalsIgnoreCase("April")) {
            return 4;
        } else if (month.equalsIgnoreCase("may")) {
            return 5;
        } else if (month.equalsIgnoreCase("June")) {
            return 6;
        } else if (month.equalsIgnoreCase("July")) {
            return 7;
        } else if (month.equalsIgnoreCase("August")) {
            return 8;
        } else if (month.equalsIgnoreCase("september")) {
            return 9;
        } else if (month.equalsIgnoreCase("October")) {
            return 10;
        } else if (month.equalsIgnoreCase("November")) {
            return 11;
        } else if (month.equalsIgnoreCase("December")) {
            return 12;
        } else {
            System.out.println("no such month");
        }
        System.exit(0);
        return 0;
    }

    /**
     *
     * @return the date
     */
    @Override
    public String toString() {
        return (month + " " + day + " " + year);

    }

    public boolean equals(Date date) {
        return ((day == date.day) && (year == date.year) && (month.equalsIgnoreCase(date.month)));

    }

    public boolean monthOK(String month) {
        return (month.equalsIgnoreCase("January")
                && month.equalsIgnoreCase("February")
                && month.equalsIgnoreCase("January")
                && month.equalsIgnoreCase("January")
                && month.equalsIgnoreCase("January")
                && month.equalsIgnoreCase("January")
                && month.equalsIgnoreCase("January")
                && month.equalsIgnoreCase("January")
                && month.equalsIgnoreCase("January")
                && month.equalsIgnoreCase("January")
                && month.equalsIgnoreCase("January")
                && month.equalsIgnoreCase("January"));

    }

    public boolean dateOK(String monthIn, int dayIn, int yearIn) {
        return (monthOK(monthIn) && (dayIn > 0 && dayIn <= 31) && (yearIn > 0 && yearIn < 9999));

    }

    public void readInput() {
        boolean flag = true;
        Scanner input = new Scanner(System.in);
        while (flag) {
            System.out.println("Enter month, day, and year respectivly: ");
            String monthInput = input.next();
            int dayInput = input.nextInt();
            int yearInput = input.nextInt();
            if (dateOK(monthInput, dayInput, yearInput)) {
                setDate(monthInput, dayInput, yearInput);
                flag = false;

            }
            else 
            {
                System .out.println("Illegal input, retry!");
            }

        }
    }

}
