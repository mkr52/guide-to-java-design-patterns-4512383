package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactorMaker {

  private static final Map<String, Supplier<UIFactory>> factoryMap = 
  new HashMap<>();

  static {
    factoryMap.put("RED", RedUIFactory::new);
    factoryMap.put("BLUE", BlueUIFactory::new);
  }

  public static UIFactory createUIFactory(String factoryType) {
    if(factoryMap.get(factoryType) != null) {
      return factoryMap.get(factoryType).get();
    } else {
      throw new IllegalArgumentException("Color not supported");
    }
  }
  
}
