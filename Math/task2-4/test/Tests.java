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
            assertTrue(content.contains("mapToInt(") && content.contains("->") && content.contains("getFirstName().length()"));
            boolean usedMax = content.contains("max()");
            if (usedMax) {
                assertTrue(content.contains("getAsInt()"));
            } else {
                assertTrue(content.contains("summaryStatistics()"));
                assertTrue(content.contains("getMax()"));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
