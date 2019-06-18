package fr.training.codecracker;

public class CodeDecoder {
    public String decode(String input) {
        if (input.equals("!")) {
            return "a";
        }
        return input;
    }
}
