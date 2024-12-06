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
            assertTrue("Use: collect() or mapToDouble()",
                    content.contains("collect(Collectors.averagingDouble(User::getAge))") ||
                            content.contains(".summaryStatistics().getAverage()") ||
                            content.contains("average().getAsDouble()"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
