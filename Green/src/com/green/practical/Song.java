package com.green.practical;

/**
 * User: EthanArcher
 * Date: 06/03/2013
 * Time: 22:19
 */
public class Song {

    private String title;
    private String singer;
    private MyDate date;
    private Double recommended, salePrice;


    public Song (String title, String singer, MyDate date, Double recommended, Double salePrice){

        this.title = title;
        this.singer = singer;
        this.date = date;
        this.recommended = recommended;
        this.salePrice = salePrice;

    }

    public String getTitle(){
        return title;
    }

    public String getSinger(){
        return singer;
    }

    public MyDate getDate(){
        return date;
    }

    public Double getRecommended(){
        return recommended;
    }

    public Double getSalePrice(){
        return salePrice;
    }

    public void printSong (){

        System.out.println(title + " " + singer + " " + date.toString() + " " + recommended + " " + salePrice);

    }

}
