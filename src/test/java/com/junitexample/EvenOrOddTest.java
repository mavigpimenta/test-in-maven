package com.junitexample;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.junitexample.EvenOrOdd;

public class EvenOrOddTest {
  private final EvenOrOdd validator = new EvenOrOdd();

  @Test
  void validate() {
    assertEquals(validator.validate(3), false);
    assertEquals(validator.validate(4), true);
  }
}
