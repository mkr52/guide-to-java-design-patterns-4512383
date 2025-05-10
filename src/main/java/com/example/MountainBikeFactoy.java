package com.example;

public class MountainBikeFactoy implements BikeFactoy {

  @Override
  public Handlebars createHandlebars() {
    return new MountainBikeHandlebars();
  }

  @Override
  public Pedals createPedals() {
    return new MountainBikePedals();
  }

  @Override
  public Tire createTire() {
    return new MountainBikeTire();
  }
}
