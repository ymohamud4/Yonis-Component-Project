import components.Movie1;
import components.Moviekernel;

/**
 * Test for MovieKImplement.
 */
public final class Movie1test extends MovieTest {

    @Override
    protected final Moviekernel constructorTest() {
        return new Movie1();
    }

    @Override
    protected final Moviekernel constructorRef() {
        return new Movie1();
    }
}
