package common;

import org.junit.After;
import org.junit.Before;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

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

    protected void useFileInput(String filename) throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File input = new File(classLoader.getResource(filename).getFile());
        System.setIn(new FileInputStream(input));
    }

    protected String getReferenceOutputFromFile(String filename) throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File output = new File(classLoader.getResource(filename).getFile());

        return new String(Files.readAllBytes(Paths.get(output.getAbsolutePath())));
    }
}
