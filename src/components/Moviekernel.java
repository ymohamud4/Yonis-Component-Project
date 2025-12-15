package components;

import java.util.List;

/**
 * Kernel interface for a {@code Movie}.
 * 
 * that provides basic functions for our Movie Class
 *
 * 
 *
 * @author Yonis Mohamud
 */
public interface Moviekernel extends Standard<Moviekernel> {

    /**
     * adds the given movie into the list
     *
     * @param movieTitle 
     *          the movie you want to add
     * @updates this
     *
     * @ensures movieTitle is in this
     */
    void addMovie(String movieTitle);

    /**
     * erase a given movie
     *
     * @param movieTitle 
     *          the movie to erase
     * @updates this
     * 
     * @ensures that the given movie is no longer exist in this
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
    tells you alls movies in list
    
    @returns a list of all movies in this
    */
     List<String> seeAll();

    /**
     * allows you to replace a movie with another
     *
     * @param oldT the movie title you want to replace
     * @param newT the new movie title to replace the old one with
     * @updates this
     */
    void replaceMovie(String oldT, String newT);

    /**
     * Removes and returns any movie from this playlist.
     *
     * @updates this
     * @requires this.size() > 0
     * @ensures removeAny , will return any movie
     */
    String removeAny();

     /**
     * Reports whether the given movie title exists in this playlist.
     *
     * @param movieTitle
     *            the movie title to check
     * @return true if movieTitle is in this, false otherwise
     * 
     * @ensures doesItExist = movietitle is in the playlist
     */
    boolean doesItExist(String movieTitle);

}
