package com.example;

public class App {

    private static final MediaPlayerProxy proxy = new MediaPlayerProxy();

    public static void main(String[] args) {
        goToMovieLibrary();
        goToFavoriteMovies();
    }

    private static void goToMovieLibrary() {
        System.out.println("Loading movie library...");
        proxy.playMedia();
    }

    private static void goToFavoriteMovies() {
        System.out.println("Loading favorite movies...");
        proxy.playMedia();
    }

}
