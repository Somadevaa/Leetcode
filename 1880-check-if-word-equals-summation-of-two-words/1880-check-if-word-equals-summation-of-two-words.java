class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return cv(firstWord) + cv(secondWord) == cv(targetWord);

    }

    private int cv(String Word) {
        StringBuilder sb = new StringBuilder();
        for (char c : Word.toCharArray()) {
            sb.append(c-'a');
            

        }
        return Integer.parseInt(sb.toString());


    }
}