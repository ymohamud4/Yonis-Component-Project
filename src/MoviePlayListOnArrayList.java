import java.util.ArrayList;

public class MoviePlayListOnArrayList extends MoviePlayListSecondaryMethods {

    private ArrayList<String> movieList;

    public MoviePlayListOnArrayList() {
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
    public int size() {
        return this.movieList.size();
    }

    @Override
    public void replaceMovie(String movieName) {
        int half = this.size() / 2;
        this.movieList.set(half, movieName);
    }

    @Override
    public String removeAny() {
        int half = this.size() / 2;
        return this.movieList.remove(half);
    }

    @Override
    public MoviePlaylistKernel newInstance() {
        return new MoviePlayListOnArrayList();
    }

    @Override
    public void clear() {
        this.movieList.clear();

    }

    @Override
    public void transferFrom(MoviePlaylistKernel other) {
        assert other != null;
        assert other != this;
        assert other instanceof MoviePlayListOnArrayList;

        MoviePlayListOnArrayList src = (MoviePlayListOnArrayList) other;

        this.movieList = src.movieList;
        src.movieList = new ArrayList<>();
    }

}