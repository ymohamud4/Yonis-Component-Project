package components;


import java.util.ArrayList;
import java.util.List;

/**
 * Standard Kernel Implementations for a {@code Movie}
 * 
 * Movie1 implements {@code MovieKernel} giving us implementations
 * for our {@code Movie} class
 * 
 * @convention
 *         Movielist is not null
 * @correspondance
 *        this = [the sequence of the movie titles movie1[0..movieList.size() - 1]]
 *          
 * 
 * 
 * standard methods, such as addmovie, eraseMovie,
 *  seeAll, size, doesItExist, clear, etc
 */
public final class Movie1 extends movieSecondary {

    /**
     * my representation is an arraylist 
     */
    private ArrayList<String> movieList;

    /**
     *  constructor  to initializ an empty arraylist for your list of movies.
     */
    public Movie1() {
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
        public void replaceMovie(String oldT, String newT) {
        int sz = this.size();
        String[] movieHolder = new String[sz];

        for (int movie = 0; movie < sz; movie++) {
            String removedMovie = this.removeAny();
            if (removedMovie.equals(oldT)) {
                movieHolder[movie] = newT;
            } else {
                movieHolder[movie] = removedMovie;
            }
        }

        for (String movies : movieHolder) {
            this.addMovie(movies);
        }
}


  @Override
    public boolean doesItExist(String movieTitle) {
       

        int sz = this.size();
        boolean doesExists = false;

        String[] movieHolder = new String[sz];

        for (int movie = 0; movie < sz; movie++) {
        String removedMovie = this.removeAny();
        movieHolder[movie] = removedMovie;

        if (removedMovie.equals(movieTitle)) {
            doesExists = true;
        }
    }

    for (int movie = 0; movie < sz; movie++) {
        this.addMovie(movieHolder[movie]);
    }

    return doesExists;
    }
   
    @Override
    public String removeAny() {
        

        return this.movieList.remove(this.movieList.size() - 1);
    }

    @Override
    public Moviekernel newInstance() {
        return new Movie1();
    }

    @Override
    public void clear() {
        this.movieList.clear();
    }

    @Override
    public void transferFrom(Moviekernel source) {
        

        Movie1 movieList = (Movie1) source;

        this.movieList = movieList.movieList;
        movieList.movieList = new ArrayList<>();
    }
}
