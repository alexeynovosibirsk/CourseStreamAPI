import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertTrue;

public class Tests {
    @Test
    public void testSolution() {
        try {
            String content = new String(Files.readAllBytes(Paths.get("src/Task.java")));
            assertTrue("Use: getFirstName()", content.contains("getFirstName()"));
            assertTrue("Use: substring(0,", content.contains("substring(0,"));
            assertTrue("Use: 3", content.contains("3"));
            assertTrue("Use: forEach(System.out::println)", content.contains("forEach(System.out::println)"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
