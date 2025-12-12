import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import components.Moviekernel;

/**
 *  tests for Movie kernel methods.
 *
 */
public abstract class MovieTest {

    /**
     * instantiats and returns the test implementation of the Movie component.
     */
    protected abstract Moviekernel constructorTest();

    /**
     * instantiats and returns a ref instance of the Movie component.
     */
    protected abstract Moviekernel constructorRef();

    @Test
public final void testConstructor() {
    Moviekernel test = this.constructorTest();
    assertEquals(0, test.size());
}

    @Test
    public final void testAddMovie1() {
        Moviekernel movieaddition = this.constructorTest();
        movieaddition.addMovie("Inception");
        assertEquals(1, movieaddition.size());
        assertTrue(movieaddition.doesItExist("Inception"));
    }

    @Test
    public final void testAddMovie2() {
        Moviekernel test = this.constructorTest();
        test.addMovie("Inception");
        test.addMovie("Avatar");
        assertEquals(2, test.size());
        assertTrue(test.doesItExist("Inception"));
        assertTrue(test.doesItExist("Avatar"));
    }

    @Test
    public final void testEraseMovie1() {
        Moviekernel elim = this.constructorTest();
        elim.addMovie("Inception");
        elim.eraseMovie("Inception");
        assertFalse(elim.doesItExist("Inception"));
        assertEquals(0, elim.size());
    }

    @Test
    public final void testEraseMovie2() {
        Moviekernel elim = this.constructorTest();
        elim.addMovie("A");
        elim.addMovie("B");
        elim.addMovie("C");

        elim.eraseMovie("B");

        assertFalse(elim.doesItExist("B"));
        assertTrue(elim.doesItExist("A"));
        assertTrue(elim.doesItExist("C"));
        assertEquals(2, elim.size());
    }

    @Test
    public final void testRemoveAny1() {
        Moviekernel removal = this.constructorTest();
        removal.addMovie("A");
        String removed = removal.removeAny();
        assertEquals("A", removed);
        assertEquals(0, removal.size());
    }

    @Test
    public final void testRemoveAny2() {
        Moviekernel testRemove = this.constructorTest();
        testRemove.addMovie("A");
        testRemove.addMovie("B");

        String erase = testRemove.removeAny();

        assertEquals(1, testRemove.size());
        assertTrue(testRemove.doesItExist("A") || testRemove.doesItExist("B"));
        assertFalse(testRemove.doesItExist(erase));
    }

    @Test
    public final void testReplaceMovie1() {
        Moviekernel replacr = this.constructorTest();
        replacr.addMovie("A");
        replacr.addMovie("B");
        replacr.addMovie("C");

        replacr.replaceMovie("X");

        assertTrue(replacr.doesItExist("A"));
        assertTrue(replacr.doesItExist("X"));
        assertTrue(replacr.doesItExist("C"));
        assertEquals(3, replacr.size());
    }

    @Test
    public final void testSize1() {
        Moviekernel testsize = this.constructorTest();
        testsize.addMovie("A");
        testsize.addMovie("B");
        assertEquals(2, testsize.size());
    }

    @Test
    public final void testClear1() {
        Moviekernel clear = this.constructorTest();
        clear.addMovie("A");
        clear.addMovie("B");

        clear.clear();
        assertEquals(0, clear.size());
        assertFalse(clear.doesItExist("A"));
    }

    @Test
    public final void testNewInstance1() {
        Moviekernel z = this.constructorTest();
        Moviekernel newInst = z.newInstance();

        assertEquals(0, newInst.size());
        assertFalse(newInst.doesItExist("X"));
    }

    @Test
public final void testTransferFrom1() {
    Moviekernel newLocation = this.constructorTest();
    Moviekernel originator = this.constructorTest();

    originator.addMovie("A");
    originator.addMovie("B");

    newLocation.transferFrom(originator);

    assertTrue(newLocation.doesItExist("A"));
    assertTrue(newLocation.doesItExist("B"));
    assertEquals(2, newLocation.size());

  
    assertEquals(0, originator.size());
}
}
