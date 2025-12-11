/**
 * Kernel interface for a Movie Playlist.
 *
 * these are the kernel for {@code MovePlayListKernel} which extends from
 * {@code Standard}
 *
 * @author Yonis Mohamud
 *
 *         this project is cool
 *
 */

public interface Moviekernel extends Standard<Moviekernel> {

    /*
     *
     * @param movieTitle the name of the movieTitle you will add
     *
     * @updates addMovie = #this with movieTitle Added njbj
     *
     *
     */

    
    void addMovie(String movieTitle);

    /*
     *
     * @param movieTitle the name of the movie you will remove
     *
     * @updates #this = #this with the specifc movieTitle removed
     *
     * @Requires #this = contains movieTitle
     *
     * @ensure eraseMovie = #this with specific movieTitle removed
     *
     */

    void eraseMovie(String movieTitle);

    /*
     *
     * @return returns the amount of movies in the playlist #this
     *
     */

    int size();

    /*
     *
     * @Param movieTitle movie to insert
     *
     * @update this
     *
     * @requires this.size >0
     *
     * @ensure this = at least one movie title has been replace
     *
     */

    void replaceMovie(String movieTitle);

    /**
     * Removes and returns any movie from the playlist.
     *
     * @updates this
     * @ensures removeAny is in #this
     */
    String removeAny();
}