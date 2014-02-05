package com.green.assessment;

/**
 * User: EthanArcher
 * Date: 14/05/2013
 * Time: 16:25
 */
public class green {

    public static void main (String[] args)
    {

        Song song1, song2, song3, song4;

        song1 = new Song ("Super Trouper", "Abba", new MyDate (21, "July", 1980), 1.50, 1.20);
        song2 = new Song ("Hallelujah", "Burke", new MyDate (14, "December", 2008), 0.99, 0.89);
        song3 = new Song ("The Prayer", "Bocelli", new MyDate (15, "April", 2005), 0.89, 0.79);

        System.out.println("First three songs printed separately");
        System.out.println("TITLE \t | ARTIST | RELEASED | RRP | SALE");
        song1.printSong();
        song2.printSong();
        song3.printSong();

        System.out.println();

        Song[] songArray = new Song[4];
        songArray[0] = song1;
        songArray[1] = song2;
        songArray[2] = song3;
        songArray[3] = new Song ("Avicii", "Levels", new MyDate(1, "January", 2010), 1.50, 0.99);

        System.out.println("Printing using a for loop");

        for (int i=0; i<4; i++)
        {
            songArray[i].printSong();
        }

        System.out.println();

        System.out.println("Song after the year 2000 printed from the array");

        for (int i=0; i<4; i++)
        {
            if (songArray[i].release.year >= 2000)
            {
                songArray[i].printSong();
            }


        }








    }



}
