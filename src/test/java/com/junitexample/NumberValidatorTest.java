package com.junitexample;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.junitexample.NumberValidator;

public class NumberValidatorTest {
  private final NumberValidator validator = new NumberValidator();

  @Test
  void validate() {
    assertEquals(validator.validate(4), false);
    assertEquals(validator.validate(2), true);
  }
}
