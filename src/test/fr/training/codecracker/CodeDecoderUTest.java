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

    @Test
    public void checkDecodingExclamationPoint() {
        String input = "!";

        String result = codeDecoder.decode(input);

        Assert.assertEquals("a", result);
    }

    @Test
    public void checkDecodingExclamationPoint5 (){
        String input = "!!!!!";

        String result = codeDecoder.decode(input);

        Assert.assertEquals(5,result.length());

        Assert.assertEquals("aaaaa", result);
    }
}