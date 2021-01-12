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
public class Sale {

    private double amount;

    public Sale() {
        amount = 0.0;
    }

    public Sale(double amount) {
        this.amount = amount;
    }

    public Sale(Sale saleObject) {
        this.amount = saleObject.amount;

    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;

    }

    public void saleDetails() {
        System.out.println("The sale amount is " + amount);
    }
}
