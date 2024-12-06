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
            assertTrue("Use: mapToInt(u -> u.getFirstName().length())",
                    content.contains("mapToInt(") && content.contains("->") && content.contains("getFirstName().length()"));
            boolean usedMax = content.contains("max()");
            if (usedMax) {
                assertTrue("Use: getAsInt())", content.contains("getAsInt()"));
            } else {
                assertTrue("Use: summaryStatistics())", content.contains("summaryStatistics()"));
                assertTrue("Use: getMax())", content.contains("getMax()"));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
