package components;




/*

Enhanced kernel interface for movielist

*/
public interface MovieSecondaryKernel extends Moviekernel {

   
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

     
}
