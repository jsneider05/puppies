package com.puppies.post.domain.exception;

public class ExternalApiException extends RuntimeException {

  public ExternalApiException(String message) {
    super(message);
  }
}
