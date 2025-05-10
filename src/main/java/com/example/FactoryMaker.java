package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryMaker {

  private static final Map<String, Supplier<BikeFactoy>> bikeTypes = 
  new HashMap<>();

  static {
    bikeTypes.put("ROAD", RoadBikeFactoy::new);
    bikeTypes.put("MOUNTAIN", MountainBikeFactoy::new);
  }

  public static BikeFactoy createBikeFactory(String factoryType) {
     if(bikeTypes.get(factoryType) != null) {
      return bikeTypes.get(factoryType).get();
     } else {
      throw new IllegalArgumentException("Wrong bike type!!");
     }
  }

  
}
