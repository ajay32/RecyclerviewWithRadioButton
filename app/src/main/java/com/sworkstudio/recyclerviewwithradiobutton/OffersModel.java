package com.sworkstudio.recyclerviewwithradiobutton;

public class OffersModel {

    String taline;
    int money;






    OffersModel(String taa , int meony){

        taline = taa;
        money = meony;
    }



    public String getOffer() {
        return taline;
    }



    public int getSavings() {
        return money;
    }

}
