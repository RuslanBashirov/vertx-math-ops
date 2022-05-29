package org.bashirov.vertx_math_ops;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.impl.logging.Logger;
import io.vertx.core.impl.logging.LoggerFactory;

public class LoggingVerticle extends AbstractVerticle {

  private final Logger logger = LoggerFactory.getLogger(LoggingVerticle.class);

  @Override
  public void start() {
    vertx.eventBus().consumer("vertx-math-ops", message -> {
      MathOperationMessage mathOpn = (MathOperationMessage) message.body();
      System.out.println(mathOpn.getResult());

      logger.debug("Got message " + mathOpn.getResult());
    });
  }
}
