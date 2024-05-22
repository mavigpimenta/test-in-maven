package com.junitexample;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.junitexample.CollatzValidator;

public class CollatzTest {
  private final CollatzValidator validator = new CollatzValidator();

  @Test
  void validate() {
    assertEquals(validator.validate(2f), true);
    assertEquals(validator.validate(-2f), false);
  }
}
