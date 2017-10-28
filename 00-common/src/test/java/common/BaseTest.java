package common;

import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class BaseTest {
    private InputStream origIn;
    private PrintStream origOut;
    private ByteArrayOutputStream out;

    @Before
    public void setup() {
        origIn = System.in;
        origOut = System.out;

        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @After
    public void teardown() {
        System.setOut(origOut);
        System.setIn(origIn);
    }

    protected void setInput(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    protected String getOutput() {
        return out.toString();
    }
}
