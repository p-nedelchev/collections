package com.clouway.collections.pagebean;

public class NextPageNotFoundException extends Exception {
  public NextPageNotFoundException() {
    super("\nYou are on the last page.");
  }
}
