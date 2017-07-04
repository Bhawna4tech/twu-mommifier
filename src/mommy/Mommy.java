package mommy;

class Mommy {
    public static final String MOMMY = "mommy";
    public static final String EMPTY_STRING = "";
    public static final double PERCENT_CONDITION_TO_MOMMIFY = 30.00;
    public static final int HUNDRED = 100;
    private String inputString;

    Mommy(String inputString) {
        this.inputString = inputString;
    }

    String mommify() {
        if (!percentOfVowelsIsMoreThan30()) {
            return inputString;
        } else {
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
        }
    }

    private boolean percentOfVowelsIsMoreThan30() {
        double numberOfVowels = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (isCharacterAVowel(inputString.charAt(i))) {
                numberOfVowels++;
            }
        }
        return ((numberOfVowels / inputString.length()) * HUNDRED) > PERCENT_CONDITION_TO_MOMMIFY;
    }

    private String mommifySingleCharacter(char singleCharacter) {
        return isCharacterAVowel(singleCharacter) ? MOMMY : singleCharacter + EMPTY_STRING;
    }

    private boolean isCharacterAVowel(char singleCharacter) {
        return singleCharacter == 'a' || singleCharacter == 'e' || singleCharacter == 'i'
                || singleCharacter == 'o' || singleCharacter == 'u';
    }
}