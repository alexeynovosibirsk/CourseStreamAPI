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
          assertTrue("Use: sorted()", content.contains("sorted("));
          assertTrue("Use: getAge()", content.contains("getAge()"));
        if (content.contains("sorted((")) {
            assertTrue("Use: ->", content.contains("->"));
        }
      } catch (IOException e) {
          throw new RuntimeException(e);
      }
  }

}