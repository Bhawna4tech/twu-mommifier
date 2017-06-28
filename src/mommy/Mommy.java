package mommy;

/**
 * Created by bhawnakumari on 6/28/17.
 */
public class Mommy {
    private String inputString;

    Mommy(String inputString) {
        this.inputString = inputString;
    }

    String mommify() {
        String mommifiedString = new String("");
        for (int i = 0; i < this.inputString.length(); i++) {
            mommifiedString = mommifiedString.concat(mommifySingleCharacter(this.inputString.charAt(i)));
        }
        return mommifiedString;
    }

    private String mommifySingleCharacter(char singleCharacter) {
        if(singleCharacter == 'a' || singleCharacter == 'e' || singleCharacter == 'i'
                || singleCharacter == 'o' || singleCharacter == 'u'){
            return "mommy";
        }
        return singleCharacter+"";
    }
}