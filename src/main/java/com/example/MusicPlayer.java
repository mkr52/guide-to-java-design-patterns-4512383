package com.example;

public class MusicPlayer {

    private static final RecommendationsProxy proxy = new RecommendationsProxy();


    public static void main(String[] args) {
        var user = new User("Jill");
        loadHomePage(user);
        loadDiscoverPage(user);
    }

    private static void loadHomePage(User user) {
        System.out.println("Loading home page...");
        proxy.showRecommendations(user);
    }

    private static void loadDiscoverPage(User user) {
        System.out.println("Loading discover page...");
        proxy.showRecommendations(user);
    }

}
