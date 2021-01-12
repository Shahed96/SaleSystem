/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shahed.classes;

public class CreditCardSale extends Sale {

    private String nameOnCard;
    private Date expiredDate;
    private String creditCardNumber;

    public CreditCardSale() {
        super();
        expiredDate = new Date();
        creditCardNumber = "0000 0000 0000 0000";
    }

    public CreditCardSale(double amount, String nameOnCard, Date expiredDate, String creditCardNumber) {
        super(amount);
        this.nameOnCard = nameOnCard;
        this.expiredDate = new Date(expiredDate);
        if (!(creditCardNumber.isEmpty()) && (creditCardNumber.length() < 16)) {
            this.creditCardNumber = creditCardNumber;
        }
    }

    public CreditCardSale(CreditCardSale creditCardSaleObject) {
        super(creditCardSaleObject);
        nameOnCard = creditCardSaleObject.nameOnCard;
        expiredDate = new Date(creditCardSaleObject.expiredDate);
        if (!(creditCardSaleObject.creditCardNumber.isEmpty()) && (creditCardSaleObject.creditCardNumber.length() < 16)) {
            this.creditCardNumber = creditCardSaleObject.creditCardNumber;
        }
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = new Date(expiredDate);
    }

    public void setCreditCardNumber(String creditCardNumber) {
        if (!(creditCardNumber.isEmpty()) && (creditCardNumber.length() < 16)) {
            this.creditCardNumber = creditCardNumber;
        }

    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public Date getExpiredDate() {
        return new Date(expiredDate);
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    @Override
    public void saleDetails() {
        System.out.println("The sale amount is " + getAmount() + " \n" + "The payment method: credit card" + "\n" + "Name on card: "
                + getNameOnCard() + "\n" + "Expired date: " + getExpiredDate() + "\n" + "Credit card number: " + getCreditCardNumber());
    }

    public void saleDetailsSuper() {
        super.saleDetails();
    }

}
