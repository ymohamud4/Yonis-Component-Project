package components;




/*

Enhanced kernel interface for movielist

This interface extends {@code Moviekernel} giving us secondary operations
that give even more enhanced features for {@code Movie}.

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
     * takes movies from one playlist and puts it in another, and clearing the other
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
