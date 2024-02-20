package com.ty.play_audio;

import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;
 
// To play sound using Clip, the process need to be alive.
// Hence, we use a Swing application.
public class playSoundDemo extends JFrame {
 
   // Constructor
   public playSoundDemo() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setTitle("Play Sound Demo");
      this.setSize(300, 200);
      this.setVisible(true);
 
      try {
         URL url = this.getClass().getResource("DemoSong.wav");
         AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
         Clip clip = AudioSystem.getClip();
         clip.open(audioIn);
         clip.start();
      } catch (UnsupportedAudioFileException e) {
         e.printStackTrace();
         
      } catch (IOException e) {
         e.printStackTrace();
      } catch (LineUnavailableException e) {
         e.printStackTrace();
      }
   }
 
   public static void main(String[] args) {
      new playSoundDemo();
   }
}