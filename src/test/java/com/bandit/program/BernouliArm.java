package com.bandit.program;

import cern.jet.random.engine.RandomEngine;

public class BernouliArm {
  private final double conversionRate;
  private final RandomEngine randomEngine;

  public BernouliArm(double conversionRate, RandomEngine randomEngine) {
    this.conversionRate = conversionRate;
    this.randomEngine = randomEngine;
  }

  public boolean draw() {
    if (randomEngine.nextFloat() > conversionRate) {
      return false;
    }
    return true;
  }

  public double getConversionRate() {
    return conversionRate;
  }
}
