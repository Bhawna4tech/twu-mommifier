package mommy;

class Mommy {
    private String inputString;

    Mommy(String inputString) {
        this.inputString = inputString;
    }

    String mommify() {
        String mommifiedString = "";
        int noOfVowels = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (isCharacterAVowel(inputString.charAt(i))){
                noOfVowels++;
            }
            if (noOfVowels<2){
            mommifiedString = mommifiedString.concat(mommifySingleCharacter(inputString.charAt(i)));
            }
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