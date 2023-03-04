package common;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BaseTest {
    private InputStream origIn;
    private PrintStream origOut;
    private ByteArrayOutputStream out;

    @BeforeEach
    public void setup() {
        origIn = System.in;
        origOut = System.out;

        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @AfterEach
    public void teardown() {
        System.setOut(origOut);
        System.setIn(origIn);
    }

    protected void setInput(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    protected String getOutput() {
        return out.toString().replaceAll("\r", "");
    }

    protected void useFileInput(String filename) throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        // Under windows the path contains %20 for spaces
        File input = new File(classLoader.getResource(filename).getFile().replaceAll("%20", " "));
        System.setIn(new FileInputStream(input));
    }

    protected String getReferenceOutputFromFile(String filename) throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        // Under windows the path contains %20 for spaces
        File output = new File(classLoader.getResource(filename).getFile().replaceAll("%20", " "));
        return new String(Files.readAllBytes(Paths.get(output.getAbsolutePath())));
    }
}
