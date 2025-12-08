/**
 * Kernel interface for a Movie Playlist.
 *
 * these are the kernel for {@code MusicPlayListKernel} which extends from
 * {@code Standard}
 *
 * @author Yonis Mohamud
 *
 *         this project is cool
 *
 */

public interface MoviePlaylistKernel extends Standard<MoviePlaylistKernel> {

    /*
     *
     * @param movieTitle the name of the movieTitle you will add
     *
     * @updates addMovie = #this with movieTitle Added
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
}