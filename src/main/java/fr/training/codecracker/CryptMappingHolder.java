package fr.training.codecracker;

import fr.training.codecracker.exception.IllegalKeyLengthException;

public class CryptMappingHolder {
    public CryptMappingHolder(String key) throws IllegalKeyLengthException {
        if (key.length() != 26) {
            throw new IllegalKeyLengthException();
        }
    }
}
