package objectgame;

import javax.sound.sampled.*;
import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Sound {
    private Scanner scanner;
    public Sound(){
        scanner = new Scanner(System.in);
    }
    public void playSound(String path){
        try {
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(new File(path));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void playSoundFireOfPlayer(){
        playSound("../sound/gun1.wav");
    }
    public void playSoundBulletImpact(){playSound("../sound/bulletImpact.wav");}
    public void playSoundCoin(){playSound("../sound/coin.wav");}
    public void playSoundgameOver(){playSound("../sound/gameOver.wav");}
    public void playSoundgameClear(){playSound("../sound/gameClear.wav");}
}
