package com.junitexample;

public class NumberValidator {
  public boolean validate(int num) {
    int mult = 0;
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        mult++;
      }
    }
    if (mult == 0) {
      return true;
    } else {
      return false;
    }
  }
}
