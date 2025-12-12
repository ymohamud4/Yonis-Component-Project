package components.demos;

import components.MovieKImplement;
import components.MovieSecondaryKernel;

public class anime {
    public static void main(String[] args){


        // I love anime, I named this is a movie playlist 
        // but I love anime and I didn't think about it when I was making this playlist
        //so I appologize

        MovieSecondaryKernel myTopAnimeBingeWatches = new MovieKImplement();


        myTopAnimeBingeWatches.addMovie("one Piece");
        myTopAnimeBingeWatches.addMovie("Naruto");
        myTopAnimeBingeWatches.addMovie("Black Clover");
        myTopAnimeBingeWatches.addMovie("Bleach");
        myTopAnimeBingeWatches.addMovie("Akegakill");
        myTopAnimeBingeWatches.addMovie("One Punchman");


        System.out.println(myTopAnimeBingeWatches.seeAll());


        //lets say i am indecisive one day and don't know what to pick one day
        // so i just close my eyes and shuffle 

        myTopAnimeBingeWatches.shuffle();
        System.out.println(myTopAnimeBingeWatches.seeAll());


        //lets say that i want to replace a certain anime with a different one

        myTopAnimeBingeWatches.replaceMovie("Bleach", "JJk");

        System.out.println(myTopAnimeBingeWatches.seeAll());


        //you want too see if a specific anime is in the playlist
        System.out.println(myTopAnimeBingeWatches.doesItExist("Naruto") );


        // you want to add your friends favorites in to your playlist to see why he likes
        // those anime so much
        MovieSecondaryKernel whatsTheHype = new MovieKImplement();
        whatsTheHype.addMovie("Attack on Titan");
        whatsTheHype.addMovie("JoJO's Bizarre Adventura");
        whatsTheHype.addMovie("Cowboy Bebop");
        whatsTheHype.addMovie("Spirited Away");




       myTopAnimeBingeWatches.joinPlaylist(whatsTheHype);

       System.out.println(myTopAnimeBingeWatches.seeAll());




      















    }
}
