package components;




/*

Enhanced kernel interface for movielist

*/
public interface MovieSecondaryKernel extends Moviekernel {

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

    /**
     * shuffles the movies in the playlist
     *
     * @updates this
     * @ensures this ≠ #this
     *          
     */
    void shuffle();

    /**
     * takes movies from one playlist and puts it in another
     *
     * @param other
     *            another movie playlist
     * @updates this
     * 
     * 
     * @ensures this = #this * #other
     * 
     */
    void joinPlaylist(MovieSecondaryKernel other);

     /**
     * allows you to replace a movie with another
     *
     * @param oldT the movie title to replace
     * @param newT the new movie title
     * @updates this
     */
    void replaceExisting(String oldT, String newT);
}
