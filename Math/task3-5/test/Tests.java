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
            assertTrue(content.contains("map(User::getNationality)"));
            assertTrue(content.contains("distinct()"));
            assertTrue(content.contains("count()"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
