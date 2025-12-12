package components;

import java.util.List;

/**
 * Kernel interface for a Movie Playlist.
 *
 *
 *
 * @author Yonis Mohamud
 */
public interface Moviekernel extends Standard<Moviekernel> {

    /**
     * adds the given movie into the list
     *
     * @param movieTitle the movie you want to add
     * @updates this
     *
     * @ensures movieTitle is in this
     */
    void addMovie(String movieTitle);

    /**
     * erase a given movie
     *
     * @param movieTitle the movie erase
     * @updates this
     * 
     * @ensures movie no longer exist in this
     */
    void eraseMovie(String movieTitle);




    /**
     * Reports the number of movies in this playlist.
     *
     * @return number of movies in list
     * @ensures size = |this|
     */
    int size();


    /*
    show alls movies in list
    
    @returns a list of all movies
    */
     List<String> seeAll();

    /**
     * replaces movie with another of your choice
     *
     * @param movieTitle replacement movie title
     * @updates this
     
     * @ensures that a movietitle was replaced with another
     */
    void replaceMovie(String movieTitle);

    /**
     * Removes and returns any movie from this playlist.
     *
     * @updates this
     * @requires this.size() > 0
     * @ensures removeAny is in #this
     */
    String removeAny();

    /*
    @return
        if the movie exist in this, true or false
    
     */
    boolean doesItExist(String string);
}
