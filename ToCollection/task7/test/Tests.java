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
                assertTrue("Use: collect(Collectors.groupingBy(User::getNationality))",
                        content.contains("collect(Collectors.groupingBy(User::getNationality))"));
                assertTrue("Use: get(\"EN\")",
                        content.contains("get(\"EN\")"));
                assertTrue("Use: min(Comparator.comparing(User::getAge)",
                        content.contains("min(Comparator.comparing(User::getAge)"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
