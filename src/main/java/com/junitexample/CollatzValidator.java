package com.junitexample;

public class CollatzValidator {
  public Boolean validate(float num) {
    while (num > 1) {
      if (num % 2 == 0) {
        num = num/2;
      } else {
        num =  3 * num + 1;
      }
    }
    return num == 1 ? true : false;
  }
}
