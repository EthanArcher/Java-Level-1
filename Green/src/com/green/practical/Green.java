package com.green.practical;

/**
 * User: EthanArcher
 * Date: 06/03/2013
 * Time: 22:19
 */
public class Green {

    public static void main(String[] args){

        Song song1, song2, song3;

        song1 = new Song ("Super Trouper", "Abba", new MyDate (21, "July", 1980), 1.50, 1.20);
        song2 = new Song ("Hallelujah", "Burke", new MyDate (14, "December", 2008), 0.99, 0.89);
        song3 = new Song ("The Prayer", "Bocelli", new MyDate (15, "April", 2005) , 0.89, 0.79);

        song1.printSong();

        System.out.println();

        Song [] songNum = new Song [4];

        songNum [0] = song1;
        songNum [1] = song2;
        songNum [2] = song3;
        songNum [3] = new Song ("Levels", "Avicii", new MyDate(1, "September", 2011), 0.99, 0.89);

        for (int i=0; i<4; i++){

            songNum[i].printSong();

        }

        System.out.println();

        for (int j=0; j<4; j++){

            if (songNum[j].getDate().getYear() > 2000){

                songNum[j].printSong();

            }

        }

    }

}