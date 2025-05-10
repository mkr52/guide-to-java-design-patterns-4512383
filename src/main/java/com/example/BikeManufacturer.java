package com.example;

public class BikeManufacturer {

    public static void main(String[] args) {
        Bike roadBike = buildBike("ROAD");
        Bike mountainBike = buildBike("MOUNTAIN");

        System.out.println(roadBike);
        System.out.println(mountainBike);

    }

    private static Bike buildBike(String bikeType) {
        var factoryType = FactoryMaker.createBikeFactory(bikeType);
        var handleBars = factoryType.createHandlebars();
        var pedals = factoryType.createPedals();
        var frontTire = factoryType.createTire();
        var backTire = factoryType.createTire();
        return new Bike(handleBars, pedals, frontTire, backTire);
        // if (bikeType.equalsIgnoreCase("ROAD")) {
        // var roadBikeFactoy = new RoadBikeFactoy();
        // var handleBars = roadBikeFactoy.createHandlebars();
        // var pedals = roadBikeFactoy.createPedals();
        // var frontTire = roadBikeFactoy.createTire();
        // var backTire = roadBikeFactoy.createTire();
        // return new Bike(handleBars, pedals, frontTire, backTire);
        // } else if (bikeType.equalsIgnoreCase("MOUNTAIN")) {
        // var mountainBikeFactoy = new MountainBikeFactoy();
        // var handleBars = mountainBikeFactoy.createHandlebars();
        // var pedals = mountainBikeFactoy.createPedals();
        // var frontTire = mountainBikeFactoy.createTire();
        // var backTire = mountainBikeFactoy.createTire();
        // return new Bike(handleBars, pedals, frontTire, backTire);
        // } else {
        // throw new IllegalArgumentException("Bike type not supported");
        // }

    }

}
