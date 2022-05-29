package org.bashirov.vertx_math_ops;

import io.vertx.core.buffer.Buffer;
import io.vertx.core.eventbus.MessageCodec;

public class MathOperationMessageCodec implements MessageCodec<MathOperationMessage, MathOperationMessage> {
  @Override
  public void encodeToWire(Buffer buffer, MathOperationMessage mathOperationMessage) {

  }

  @Override
  public MathOperationMessage decodeFromWire(int i, Buffer buffer) {
    return null;
  }

  @Override
  public MathOperationMessage transform(MathOperationMessage mathOperationMessage) {
    return mathOperationMessage;
  }

  @Override
  public String name() {
    return "MathOperationMessageCodec";
  }

  @Override
  public byte systemCodecID() {
    return -1;
  }
}
