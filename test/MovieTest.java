import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

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
        Moviekernel testAdding = this.constructorTest();
        testAdding.addMovie("Inception");
        testAdding.addMovie("Avatar");
        assertEquals(2, testAdding.size());
        assertTrue(testAdding.doesItExist("Avatar"));
        assertTrue(testAdding.doesItExist("Inception"));
       
    }


     @Test
    public final void testAddMovie3() {
        Moviekernel testAdding = this.constructorTest();
        testAdding.addMovie("Inception");
        testAdding.addMovie("Avatar");
        testAdding.addMovie("Ghostrider");
        assertEquals(3, testAdding.size());
        assertTrue(testAdding.doesItExist("Inception"));
        assertTrue(testAdding.doesItExist("Avatar"));
        assertTrue(testAdding.doesItExist("Ghostrider"));

    }

    @Test
    public final void testEraseMovie1() {
        Moviekernel elim = this.constructorTest();
        elim.addMovie("Inception");
        elim.addMovie("Minecraft Movie");
        elim.eraseMovie("Minecraft Movie");
        assertEquals(1, elim.size());

        assertFalse(elim.doesItExist("Minecraft Movie"));
        assertTrue(elim.doesItExist("Inception"));
       
    }

   @Test
public final void testEraseMovie2() {
    Moviekernel elim = this.constructorTest();
    elim.addMovie("A");
    elim.addMovie("B");
    elim.addMovie("C");

    elim.eraseMovie("B");

    assertEquals(2, elim.size());
    assertFalse(elim.doesItExist("B"));
    assertTrue(elim.doesItExist("A"));
    assertTrue(elim.doesItExist("C"));
}

@Test
public final void testEraseMovie3() {
    Moviekernel elim = this.constructorTest();
    elim.addMovie("A");
    elim.addMovie("B");
    elim.addMovie("C");
    elim.addMovie("D");
    elim.addMovie("E");
    elim.addMovie("F");
    elim.addMovie("G");


    elim.eraseMovie("B");
    elim.eraseMovie("C");
    elim.eraseMovie("F");
    elim.eraseMovie("G");


    assertEquals(3, elim.size());
    assertFalse(elim.doesItExist("B"));
    assertFalse(elim.doesItExist("G"));
    assertFalse(elim.doesItExist("F"));
    assertFalse(elim.doesItExist("C"));
    

}

    @Test
    public final void testRemoveAny1() {
    Moviekernel removal = this.constructorTest();
    removal.addMovie("A");
   

    String removed = removal.removeAny();

    assertEquals(0, removal.size());
    assertFalse(removal.doesItExist(removed));
}
   
    @Test
    public final void testRemoveAny2() {
    Moviekernel removal = this.constructorTest();
    removal.addMovie("A");
    removal.addMovie("B");
    removal.addMovie("C");

    String removed = removal.removeAny();
    String removed2 = removal.removeAny();


    assertEquals(1, removal.size());
    assertFalse(removal.doesItExist(removed));
    assertFalse(removal.doesItExist(removed2));
}

    @Test
    public final void testRemoveAny3() {
        Moviekernel testRemove = this.constructorTest();
        testRemove.addMovie("A");
        testRemove.addMovie("B");
        testRemove.addMovie("C");
        testRemove.addMovie("D");
        testRemove.addMovie("E");
        testRemove.addMovie("F");
        testRemove.addMovie("G");

        String erase = testRemove.removeAny();
        String erase2 = testRemove.removeAny();
        String erase3 = testRemove.removeAny();

        assertEquals(4, testRemove.size());
      
        assertFalse(testRemove.doesItExist(erase));
         assertFalse(testRemove.doesItExist(erase2));
          assertFalse(testRemove.doesItExist(erase3));
    }

    @Test
    public final void testReplaceMovie1() {
        Moviekernel replacr = this.constructorTest();
        replacr.addMovie("A");
        replacr.addMovie("B");
        replacr.addMovie("C");

        replacr.replaceMovie("B","X");

        assertTrue(replacr.doesItExist("A"));
        assertTrue(replacr.doesItExist("X"));
        assertFalse(replacr.doesItExist("B"));
        assertEquals(3, replacr.size());
    }

     @Test
    public final void testReplaceMovie2() {
        Moviekernel replacr = this.constructorTest();
        replacr.addMovie("A");
        replacr.addMovie("B");
        replacr.addMovie("C");

        replacr.replaceMovie("A", "E");

        assertTrue(replacr.doesItExist("E"));
        assertTrue(replacr.doesItExist("B"));
        assertTrue(replacr.doesItExist("C"));
        assertFalse(replacr.doesItExist("A"));
        

   
        assertEquals(3, replacr.size());
    }

    @Test
    public final void testReplaceMovie3() {
        Moviekernel replacr = this.constructorTest();
        replacr.addMovie("A");
        replacr.addMovie("B");
        replacr.addMovie("C");
        replacr.addMovie("D");
        replacr.addMovie("E");
        replacr.replaceMovie("A", "E");
         replacr.replaceMovie("B", "X");
          replacr.replaceMovie("D", "Z");


        assertTrue(replacr.doesItExist("E"));
        assertTrue(replacr.doesItExist("X"));
        assertTrue(replacr.doesItExist("Z"));
      
        assertFalse(replacr.doesItExist("A"));
        assertFalse(replacr.doesItExist("B"));
        assertFalse(replacr.doesItExist("D"));

   
        assertEquals(5, replacr.size());
    }




    @Test
    public final void testSize1() {
        Moviekernel testsize = this.constructorTest();
        testsize.addMovie("A");
        testsize.addMovie("B");
        assertEquals(2, testsize.size());
    }

     @Test
    public final void testSize2() {
        Moviekernel testsize = this.constructorTest();
        testsize.addMovie("Avatar");
        testsize.addMovie("Paranomal activity");
        testsize.addMovie("GhostRider");
        testsize.addMovie("Transformers");

        assertEquals(4, testsize.size());
    }

    @Test
    public final void testSize3() {
        Moviekernel testsize = this.constructorTest();
        
        assertEquals(0, testsize.size());
    }



    @Test
    public final void testSeeAll1() {
    Moviekernel test = this.constructorTest();
    
    

    List<String> res = test.seeAll();

    assertEquals(0, res.size());
    assertTrue(res.isEmpty());
    
}

    @Test
    public final void testSeeAll12() {
    Moviekernel test = this.constructorTest();
    test.addMovie("A");
    

    List<String> res = test.seeAll();

    assertEquals(1, res.size());
    assertTrue(res.contains("A"));
    
}
    @Test
    public final void testSeeAll3() {
    Moviekernel test = this.constructorTest();
    test.addMovie("A");
    test.addMovie("B");
    test.addMovie("C");

    List<String> res = test.seeAll();

    assertEquals(3, res.size());
    assertTrue(res.contains("A"));
    assertTrue(res.contains("B"));
    assertTrue(res.contains("C"));
}

   
@Test
    public final void testClear1() {
        Moviekernel clear = this.constructorTest();
        clear.addMovie("A");
        clear.addMovie("B");

        clear.clear();
        assertEquals(0, clear.size());
        
    }

    @Test
    public final void testClear2() {
        Moviekernel clear = this.constructorTest();
        clear.addMovie("A");
        clear.addMovie("B");
        clear.addMovie("c");
        clear.addMovie("D");


        clear.clear();
        assertEquals(0, clear.size());
        
    }

     @Test
    public final void testClear3() {
        Moviekernel clear = this.constructorTest();
        clear.addMovie("A");
        clear.addMovie("B");
        clear.addMovie("c");
        clear.addMovie("D");
        clear.addMovie("E");
        clear.addMovie("F");



        clear.clear();
        assertEquals(0, clear.size());
        
    }


    @Test
    public final void testNewInstance1() {
        Moviekernel z = this.constructorTest();
        Moviekernel newInst = z.newInstance();

        assertEquals(0, newInst.size());
        
    }

    @Test
    public final void testTransferFrom1() {
    Moviekernel newL = this.constructorTest();
    Moviekernel oldL = this.constructorTest();

    oldL.addMovie("A");
    oldL.addMovie("B");

    newL.transferFrom(oldL);

    assertTrue(newL.doesItExist("A"));
    assertTrue(newL.doesItExist("B"));
    assertEquals(2, newL.size());

  
    assertEquals(0, oldL.size());
}
}
