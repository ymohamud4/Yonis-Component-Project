/*
the Enhanced Kernel implementations

this interface extends from {@code MoviePlaylistKernel}

these are the enhanced kernel methods for {@code MoviePlaylist}

@author Yonis Mohamud
*/

public interface MoviePlaylist extends MoviePlaylistKernel {

    /*
     * @param movieTitle the title of the movie you want to check
     *
     * @returns returns true or false if the title exists in the playlist
     *
     * @requires movieTitle to not be null, movieTitle != null
     *
     * @ensure doesItExist = either movieTitle is in #this or not.
     *
     *
     *
     */
    boolean doesItExist(String movieTitle);

    /*
     *
     * @updates this
     *
     * @ensure shuffle = the order of this != the order of #this
     */

    void shuffle();

    /*
     * @param moviePlayList2 another movie playlist
     *
     * @updates this
     *
     * @clears moviePlayList2
     *
     * @requires anotherPlayList != this
     *
     * @ensures, joinPlayList = #this properly concatenates with moviePlayList2
     *
     *
     */
    void joinPlaylist();

}