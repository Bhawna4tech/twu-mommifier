package mommy;

class Mommy {
    private String inputString;

    Mommy(String inputString) {
        this.inputString = inputString;
    }

    String mommify() {
        String mommifiedString = "";
        for (int i = 0; i < this.inputString.length(); i++) {
            mommifiedString = mommifiedString.concat(mommifySingleCharacter(this.inputString.charAt(i)));
        }
        return mommifiedString;
    }

    private String mommifySingleCharacter(char singleCharacter) {
        if(isCharacterAVowel(singleCharacter))
        {
            return "mommy";
        }
        return singleCharacter+"";
    }

    private boolean isCharacterAVowel(char singleCharacter) {
        return singleCharacter == 'a' || singleCharacter == 'e' || singleCharacter == 'i'
                || singleCharacter == 'o' || singleCharacter == 'u';
    }
}