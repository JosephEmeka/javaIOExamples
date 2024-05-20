package Chapter14;

public class CharacterClass {
    public static void main(String[] args) {
        System.out.println(Character.isAlphabetic(65));// to test if the unicode is alphabetic.
        System.out.println(Character.isJavaIdentifierStart('i'));// to check if it can start as a variable name/ java identifier.
    }
}
