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
            if(content.contains("reduce")) {
                assertTrue(content.contains("getAge()"));
            } else {
                assertTrue("Use: max(Comparator.comparing()", content.contains("max(Comparator.comparing"));
                assertTrue("Use: User::getAge", content.contains("User::getAge"));
            }
            assertTrue("Use: ifPresent(System.out::println)", content.contains("ifPresent(System.out::println)"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
