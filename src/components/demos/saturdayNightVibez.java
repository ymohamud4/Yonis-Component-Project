package components.demos;

import components.MovieKImplement;
import components.MovieSecondaryKernel;

public class saturdayNightVibez {
    public static void main(String[] args){


        // this is more of a run down of basic functionality, for more fun go to the 
        //anime.java file
        
       
       // intializing a new movie playlist to watch with your family on a weekend
        MovieSecondaryKernel mySaturdayVibez = new MovieKImplement();

        // you add you movies to your list on netflix or something
        mySaturdayVibez.addMovie("Gladiator");
        mySaturdayVibez.addMovie("MazeRunner 2012");
        mySaturdayVibez.addMovie("The Minecraft Movie");
        mySaturdayVibez.addMovie("The Lord of the ringer");
        mySaturdayVibez.addMovie("cats 2019, the live action");


        //you want to see the list of movies to make sure 
        // your siblings didn't pick a crap movie 

        mySaturdayVibez.seeAll();

        //you realize they did pick a crap movie and you need new family members
        // you remove their terrible choice

        mySaturdayVibez.eraseMovie("cats 2019, the live action");

        System.out.print(mySaturdayVibez.seeAll());

        //you want to see how many movies you have to watch with your family on
        // family movie night

        mySaturdayVibez.size();

        // you want to add your friends playlist to your

        MovieSecondaryKernel friendsList = new MovieKImplement();

        friendsList.addMovie("avengers");
        friendsList.addMovie("harry potter and the globet of fire");
        friendsList.addMovie("chicken litter");
        friendsList.addMovie("mulan");

        mySaturdayVibez.joinPlaylist(friendsList);

        System.out.println(mySaturdayVibez.seeAll());

        // your done watching your movies and it is time to lock in
        mySaturdayVibez.clear();
        













        


        




    }
}
