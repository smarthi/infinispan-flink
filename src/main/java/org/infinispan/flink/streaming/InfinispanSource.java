package org.infinispan.flink.streaming;

import org.apache.flink.streaming.api.functions.source.RichParallelSourceFunction;
import org.apache.flink.streaming.api.functions.source.SourceFunction;

public class InfinispanSource extends RichParallelSourceFunction {

  @Override
  public void run(SourceContext sourceContext) throws Exception {

  }

  @Override
  public void cancel() {

  }
}
