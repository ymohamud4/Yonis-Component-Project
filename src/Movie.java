import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Movie {
    private List<String> moviePlayList;

    /**Making sure this part is properly documentated */
    /*
     *
     * These are the methods that I am deciding on, most of them are standard
     * like, addmovie, removemovie, seeallmovies, are the basic methods for
     * right not , I will be narrowing down the kernel methods, but I will see
     * in the part what I will keep
     *
     */
    public Movie() {
        this.moviePlayList = new ArrayList<>();
    }

    public void addMovie(String movieName) {
        this.moviePlayList.add(movieName);
    }

    public void removeMovie(String movieName) {

        this.moviePlayList.remove(movieName);
    }

    public boolean containsMovie(String MovieName) {
        return this.moviePlayList.contains(MovieName);
    }

    public int moveSize() {
        return this.moviePlayList.size();
    }

    public void clear() {
        this.moviePlayList.clear();
    }

    public void shuffleMovies() {
        Random randomGen = new Random();

        for (int i = this.moviePlayList.size() - 1; i > 0; i--) {
            int k = randomGen.nextInt(i + 1);

            String temporaryholder = this.moviePlayList.get(i);
            this.moviePlayList.set(i, this.moviePlayList.get(k));
            this.moviePlayList.set(k, temporaryholder);

        }
    }

    public void seeAllMovies() {
        System.out.print("moviePlayList");
        for (int i = 0; i < this.moviePlayList.size(); i++) {
            System.out.println((i + 1) + ". " + this.moviePlayList.get(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Movie saturdayVibez = new Movie();

        saturdayVibez.addMovie("mazerunner");
        saturdayVibez.addMovie("harryPotter");
        saturdayVibez.addMovie("Friday");
        saturdayVibez.addMovie("Gladiator");
        saturdayVibez.addMovie("Trolls");
        saturdayVibez.addMovie("Bee Movie");
        saturdayVibez.addMovie("Tomb Raider");
        saturdayVibez.addMovie("GET OUT 1");
        saturdayVibez.addMovie("GET OUT 2");
        saturdayVibez.addMovie("Zootopia");

        saturdayVibez.removeMovie("Bee Movie");
        saturdayVibez.seeAllMovies();

        System.out.println(saturdayVibez.containsMovie("GET OUT 1"));

        System.out.println(saturdayVibez.moveSize());

        saturdayVibez.shuffleMovies();
        saturdayVibez.seeAllMovies();

        saturdayVibez.clear();

    }
}
