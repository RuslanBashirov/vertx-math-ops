package org.bashirov.vertx_math_ops;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;

public class ArithmeticOperationsVerticle extends AbstractVerticle {
  private int val1;
  private char operation;
  private int val2;

  @Override
  public void start(){
    int result = executeOperationAndGetResult();
    System.out.println("sending to logging verticle result = " + result);
    vertx.eventBus().send("vertx-math-ops", new MathOperationMessage(result));
  }

  public static void main(String[] args) {
    Vertx vertx = Vertx.vertx();
    vertx.eventBus().registerDefaultCodec(MathOperationMessage.class, new MathOperationMessageCodec());
    vertx.deployVerticle(new ArithmeticOperationsVerticle(10, '*', 25));
    vertx.deployVerticle(new LoggingVerticle());
  }


  public ArithmeticOperationsVerticle(int val1, char operation, int val2) {
    this.val1 = val1;
    this.operation = operation;
    this.val2 = val2;
  }

  private int executeOperationAndGetResult() {
    int result;
    switch (operation) {
      case '+':
        result = val1 + val2;
        break;
      case '-':
        result = val1 - val2;
        break;
      case '*':
        result = val1 * val2;
        break;
      case '/':
        result = val1 / val2;
        break;
      default:
        throw new ArithmeticException("wrong operation " + operation);
    }
    return result;
  }
}
