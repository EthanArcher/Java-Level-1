package com.green.assessment;

/**
 * User: EthanArcher
 * Date: 14/05/2013
 * Time: 13:46
 */
public class Song {

    String title, artist;
    MyDate release;
    double recommended, salePrice;

    public Song (String title, String artist, MyDate release, double recommended, double salePrice)
    {
        this.title = title;
        this.artist = artist;
        this.release = release;
        this.recommended = recommended;
        this.salePrice = salePrice;

    }

    public void printSong()
    {
        System.out.println(title + "\t" + artist + "\t" + release + "\t" + recommended + "\t" + salePrice);
    }



}
