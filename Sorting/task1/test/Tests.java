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
        boolean check = content.contains("Comparator.comparing(User::getAge)");
        if (!check) {
            assertTrue(content.contains("sorted(("));
            assertTrue(content.contains("->"));
            assertTrue(content.contains("getAge()"));
        } else {
            assertTrue(check);
            assertTrue(content.contains("reversed()"));
        }
      } catch (IOException e) {
          throw new RuntimeException(e);
      }
  }

}