package mommy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void shouldMommifySetOfContinous2VowelsIntoSingleMommy(){
        Mommy setOf2Vowels = new Mommy("aa");
        assertEquals("mommy",setOf2Vowels.mommify());
    }

    @Test
    public void shouldMommifyStringHavingMoreThan30PercentOfVowelsWithoutContinuousSet(){
        Mommy moreThan30PercentVowel = new Mommy("axa");
        assertEquals("mommyxmommy",moreThan30PercentVowel.mommify());
    }

    @Test
    public void shouldMommifyStringHavingMoreThan30PercentOfVowelsWithContinuousSet(){
        Mommy moreThan30PercentVowel = new Mommy("aax");
        assertEquals("mommyx",moreThan30PercentVowel.mommify());
    }

    @Test
    public void shouldNotMommifyStringHavingLessThan30PercentOfVowels(){
        Mommy moreThan30PercentVowel = new Mommy("axxxxxxxxxxa");
        assertEquals("axxxxxxxxxxa",moreThan30PercentVowel.mommify());
    }

    @Test
    public void shouldNotMommifyStringHaving30PercentOfVowels(){
        Mommy moreThan30PercentVowel = new Mommy("aeixxxxxxx");
        assertEquals("aeixxxxxxx",moreThan30PercentVowel.mommify());
    }
}