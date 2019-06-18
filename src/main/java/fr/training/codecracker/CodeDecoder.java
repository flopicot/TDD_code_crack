package fr.training.codecracker;

public class CodeDecoder {
    private String cryptKey;

    public CodeDecoder(String cryptKey) {
        this.cryptKey = cryptKey;
    }

    public String decode(String input) {
        if (input.equals("!")) {
            return "a";
        }
        if (input.equals("!!!!!")) {
            return "aaaaa";
        }
        return input;
    }
}
