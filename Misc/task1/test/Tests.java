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
            boolean isReduce = content.contains("reduce");
            if(isReduce) {
                assertTrue(content.contains("getAge()"));
            } else {
                assertTrue(content.contains("max(Comparator.comparing"));
                assertTrue(content.contains("User::getAge"));
            }
            assertTrue(content.contains("ifPresent(System.out::println)"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
