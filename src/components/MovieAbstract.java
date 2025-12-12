package components;
/**
 * Secondary implementation layer for the Movie playlist component.
 *
 * 
 *
 * Provides implementations for:
 *  - doesItExist
 *  - shuffle
 *  - joinPlaylist
 *
 * 
 *
 * @author Yonis Mohamud
 */
public abstract class MovieAbstract implements MovieSecondaryKernel {

    @Override
    public boolean doesItExist(String movieTitle) {
       

        int sz = this.size();
    boolean exists = false;

    String[] temp = new String[sz];

    for (int i = 0; i < sz; i++) {
        String z = this.removeAny();
        temp[i] = z;

        if (z.equals(movieTitle)) {
            exists = true;
        }
    }

    for (int i = 0; i < sz; i++) {
        this.addMovie(temp[i]);
    }

    return exists;
    }

    @Override
    public void shuffle() {
        int sz = this.size();
        if (sz <= 1) {
            return;
        }

        String[] holder = new String[sz];

      
        for (int i = 0; i < sz; i++) {
            holder[i] = this.removeAny();
        }

        for (int i = 0; i < sz - 1; i++) {
            String temp = holder[i];
            holder[i] = holder[i + 1];
            holder[i + 1] = temp;
        }

        
        for (int i = 0; i < sz; i++) {
            this.addMovie(holder[i]);
        }
    }

    @Override
    public void joinPlaylist(MovieSecondaryKernel other) {
        
        while (other.size() > 0) {
            this.addMovie(other.removeAny());
        }
    }

    @Override
    public void replaceExisting(String oldT, String newT) {
    int sz = this.size();
    String[] holder = new String[sz];

    for (int i = 0; i < sz; i++) {
        String removal = this.removeAny();
        if (removal.equals(oldT)) {
            holder[i] = newT;
        } else {
            holder[i] = removal;
        }
    }

    for (String m : holder) {
        this.addMovie(m);
    }
}
}
