package com.bandit.program;

import com.bandit.program.BanditPerformance;

public interface BatchedBandit {

  public BanditStatistics getBanditStatistics(BanditPerformance performance);

}
