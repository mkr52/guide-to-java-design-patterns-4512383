package com.example;

public class MediaPlayerProxy implements MediaPlayer {

  private MovieMediaPlayer mediaPlayer;

  @Override
  public void playMedia() {
    if(mediaPlayer == null) {
      mediaPlayer = new MovieMediaPlayer();
    }
    mediaPlayer.playMedia();
  }
  
}
