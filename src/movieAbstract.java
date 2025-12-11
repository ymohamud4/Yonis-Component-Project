public abstract class movieAbstract implements MovieSecondaryKernel {

    @Override
    public boolean doesItExist(String movieTitle) {
        boolean exists = false;
        int sz = this.size();

        String[] holder = new String[sz];

        for (int index = 0; index < sz; index++) {
            holder[index] = this.removeAny();
            if (holder[index].equals(movieTitle)) {
                exists = true;
            }
        }
        for (int i = 0; i < sz; i++) {
            this.addMovie(holder[i]);

        }
        return exists;
    }

    @Override
    public void shuffle() {

        int size = this.size();
        if (size <= 1) {
            return;

        }

        String[] holder = new String[size];

        for (int i = 0; i < size; i++) {
            holder[i] = this.removeAny();
        }

        for (int i = 0; i < size - 1; i++) {
            String t = holder[i];
            holder[i] = holder[i + 1];
            holder[i + 1] = t;

        }

        for (int i = 0; i < size; i++) {
            this.addMovie(holder[i]);
        }
    }

    @Override
    public void joinPlaylist(MovieSecondaryKernel other) {

        while (other.size() > 0) {
            String replaceMovie = other.removeAny();
            this.addMovie(replaceMovie);

        }
    }

}
