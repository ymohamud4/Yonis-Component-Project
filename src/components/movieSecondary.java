package components;
/**
 * Secondary implementation layer for the Movie playlist component.
 *
 * 
 *
 * Provides implementations for:
 * 
 *  - shuffle
 *  - joinPlaylist
 * 
 *  This abstract class implements {@code MovieSecondaryKernel} and provides
 * implementations for our secondary methods for the {@Movie class}
 *
 * 
 *
 * @author Yonis Mohamud
 */
public abstract class movieSecondary implements MovieSecondaryKernel {

    /*
    
    movie playlist shuffle which rearrages the list of movies
    */

    @Override
    public void shuffle() {
        int sz = this.size();
        if (sz <= 1) {
            return;
        }

        String[] movieHolder = new String[sz];

      
        for (int movie = 0; movie < sz; movie++) {
            movieHolder[movie] = this.removeAny();
        }

        for (int movie = 0; movie < sz - 1; movie++) {
            String temp = movieHolder[movie];
            movieHolder[movie] = movieHolder[movie + 1];
            movieHolder[movie + 1] = temp;
        }

        
        for (int movie = 0; movie < sz; movie++) {
            this.addMovie(movieHolder[movie]);
        }
    }

    /*
    takes all the movies of one playlist and puts it in another
    */
    @Override
    public void joinPlaylist(MovieSecondaryKernel other) {
        
        while (other.size() > 0) {
            this.addMovie(other.removeAny());
        }
    }

    
}
