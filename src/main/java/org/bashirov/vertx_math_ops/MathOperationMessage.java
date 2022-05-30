package org.bashirov.vertx_math_ops;


public class MathOperationMessage {

  private int result;
  private String errorMessage;

  public MathOperationMessage() {
  }

  public int getResult() {
    return result;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }
}


