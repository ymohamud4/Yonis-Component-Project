import components.MovieKImplement;
import components.Moviekernel;

/**
 * Test for MovieKImplement.
 */
public final class MovieKImplementTest extends MovieTest {

    @Override
    protected final Moviekernel constructorTest() {
        return new MovieKImplement();
    }

    @Override
    protected final Moviekernel constructorRef() {
        return new MovieKImplement();
    }
}
