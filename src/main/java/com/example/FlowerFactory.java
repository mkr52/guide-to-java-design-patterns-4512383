package com.example;

import java.util.HashMap;
import java.util.Map;

public class FlowerFactory {

  private static final Map<String, Flower> flowerMap = new HashMap<>();

  public static Flower createFlower(String name) {
    return flowerMap.computeIfAbsent(name, Flower::new);
  }
  
}
