package org.bashirov.vertx_math_ops;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.impl.logging.Logger;
import io.vertx.core.impl.logging.LoggerFactory;

public class LoggingVerticle extends AbstractVerticle {

  private final Logger logger = LoggerFactory.getLogger(LoggingVerticle.class);

  @Override
  public void start() {
    vertx.eventBus().consumer("vertx-math-ops", message -> {
      MathOperationMessage mathOpMessage = (MathOperationMessage) message.body();

      if (mathOpMessage.getErrorMessage() == null) {
        logger.debug("Got math expression result " + mathOpMessage.getResult());
      } else {
        logger.error(mathOpMessage.getErrorMessage());
      }
    });
  }
}
