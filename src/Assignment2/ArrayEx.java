package Assignment2;

public class ArrayEx {
    public static void main(String[] args) {
        String[] words = {"I", "like", "to", "eat", "apples", "and", "bananas"};

        for (String word : words) {
            String lowerCaseWord = word.toLowerCase();
            if (lowerCaseWord.startsWith("a") || lowerCaseWord.startsWith("e") || lowerCaseWord.startsWith("i") || lowerCaseWord.startsWith("o") || lowerCaseWord.startsWith("u")) {
                System.out.println(word);
            }
        }
    }
}
