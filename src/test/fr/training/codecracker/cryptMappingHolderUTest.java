package fr.training.codecracker;

import fr.training.codecracker.exception.IllegalKeyLengthException;
import org.junit.Test;

public class cryptMappingHolderUTest {
    @Test(expected= IllegalKeyLengthException.class)
    public void checkKeyLength() throws IllegalKeyLengthException {
        CryptMappingHolder cryptMappingHolder = new CryptMappingHolder("123456789");
    }

}