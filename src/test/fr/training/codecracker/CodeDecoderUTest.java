package fr.training.codecracker;

import org.junit.Assert;
import org.junit.Test;

public class CodeDecoderUTest {
    CodeDecoder codeDecoder = new CodeDecoder();

    @org.junit.Before
    public void setUp() {
    }

    @Test
    public void compareOutputSize(){
        String input = "a";

        String result = codeDecoder.decode(input);

        Assert.assertEquals(1,result.length());
    }
}