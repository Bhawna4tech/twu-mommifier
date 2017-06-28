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

    @Test
    public void shouldMommifySingleVowel(){
        Mommy singleNonVowel = new Mommy("a");
        assertEquals("mommy", singleNonVowel.mommify());
    }

    @Test
    public void shouldMommifyOnlyVowelsInTwoCharactersString(){
        Mommy vowelConsonant = new Mommy("ax");
        assertEquals("mommyx", vowelConsonant.mommify());
    }

    @Test
    public void shouldNotMommifyTwoConstantsInTwoCharactersString(){
        Mommy vowelConsonant = new Mommy("xx");
        assertEquals("xx", vowelConsonant.mommify());
    }

}
