package mommy;

class Mommy {
    private String inputString;

    Mommy(String inputString) {
        this.inputString = inputString;
    }

    String mommify() {
        if (percentOfVowelsIsMoreThan30()) {
            String mommifiedString = "";
            int noOfVowels = 0;
            int i = 0;
            while (i < inputString.length()) {
                if (isCharacterAVowel(inputString.charAt(i))) {
                    noOfVowels++;
                } else
                    noOfVowels = 0;
                if (noOfVowels < 2) {
                    mommifiedString = mommifiedString.concat(mommifySingleCharacter(inputString.charAt(i)));
                }
                i++;
            }
            return mommifiedString;
        } else return inputString;
    }

    private boolean percentOfVowelsIsMoreThan30() {
        if (inputString.length() > 2) {
            double numberOfVowels = 0;
            for (int i = 0; i < inputString.length(); i++) {
                if (isCharacterAVowel(inputString.charAt(i))) {
                    numberOfVowels++;
                }
            }
            return ((numberOfVowels / inputString.length()) * 100) > 30.0;
        } else return true;
    }

    private String mommifySingleCharacter(char singleCharacter) {
        if (isCharacterAVowel(singleCharacter)) {
            return "mommy";
        }
        return singleCharacter + "";
    }

    private boolean isCharacterAVowel(char singleCharacter) {
        return singleCharacter == 'a' || singleCharacter == 'e' || singleCharacter == 'i'
                || singleCharacter == 'o' || singleCharacter == 'u';
    }
}