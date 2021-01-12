/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shahed.classes;


public class CashSale extends Sale {

    public CashSale() {
        super();

    }

    public CashSale(double amount) {
        super(amount);
    }

    public CashSale(CashSale cashSaleObject) {
        super(cashSaleObject);
    }

    @Override
    public void saleDetails() {
        System.out.println("The sale amount is " + getAmount() + " \n" + "And the payment method: cash");
    }

    public void saleDetailsSuper() {
        super.saleDetails();
    }

}
