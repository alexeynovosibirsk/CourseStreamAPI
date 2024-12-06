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
            assertTrue("Use: collect()", content.contains("collect("));
            assertTrue("Use: Collectors.toMap()", content.contains("Collectors.toMap"));
            assertTrue("Use: User::getId", content.contains("User::getId"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
