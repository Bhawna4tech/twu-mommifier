package mommy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bhawnakumari on 6/28/17.
 */
public class MommyTest {

    @Test
    public void shouldNotMommifyEmptyString(){
        Mommy nullMommy = new Mommy("");
        assertEquals("",nullMommy.mommify());
    }

    @Test
    public void shouldNotMommifySingleNonVowel(){
        Mommy singleNonVowel = new Mommy("x");
        assertEquals("x", singleNonVowel.mommify());
    }
}
