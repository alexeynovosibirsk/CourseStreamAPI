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
                assertTrue("Use: flatMap", content.contains(".flatMap"));
                assertTrue("Use: Collection::stream", content.contains("Collection::stream"));
                assertTrue("Use: toList()", content.contains("toList()"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
