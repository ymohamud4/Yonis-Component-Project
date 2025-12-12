package components;


import java.util.ArrayList;
import java.util.List;

/**
 * Standard Kernel Implementations for Movielist
 * 
 * standard methods, such as addmovie, eraseMovie, seeAll, size,etc
 */
public final class MovieKImplement extends MovieAbstract {

    /**
     * my representation is an arraylist 
     */
    private ArrayList<String> movieList;

    /**
     *  constructor  to initializ an empty playlist.
     */
    public MovieKImplement() {
        this.movieList = new ArrayList<>();
    }

    @Override
    public void addMovie(String movieTitle) {
        
        this.movieList.add(movieTitle);
    }

    @Override
    public void eraseMovie(String movieTitle) {
    
        this.movieList.remove(movieTitle);
    }

    @Override
    public List<String> seeAll() {
        return new ArrayList<>(this.movieList);
    }

    @Override
    public int size() {
        return this.movieList.size();
    }

    @Override
    public void replaceMovie(String movieTitle) {
     

        int index = this.size() / 2;
        this.movieList.set(index, movieTitle);
    }

    @Override
    public String removeAny() {
        

        return this.movieList.remove(this.movieList.size() - 1);
    }

    @Override
    public Moviekernel newInstance() {
        return new MovieKImplement();
    }

    @Override
    public void clear() {
        this.movieList.clear();
    }

    @Override
    public void transferFrom(Moviekernel source) {
        

        MovieKImplement sourcePlaylist = (MovieKImplement) source;

        this.movieList = sourcePlaylist.movieList;
        sourcePlaylist.movieList = new ArrayList<>();
    }
}
