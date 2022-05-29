package org.bashirov.vertx_math_ops;


public class MathOperationMessage {

  private int result;

  public int getResult() {
    return result;
  }

  public MathOperationMessage(int result) {
    this.result = result;
  }

  @Override
  public String toString() {
    return "MathOperationMessage{" +
      "result=" + result +
      '}';
  }
}


