package aR;

import bH.D;
import d.c;
import d.e;
import d.i;
import d.k;
import java.io.File;
import java.io.IOException;
import java.util.Properties;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class l implements c {
  public static String a = "Sound_File_Path";
  
  public static String b = "playSoundFile";
  
  k c = null;
  
  public String a() {
    return b;
  }
  
  public String b() {
    return "Play Sound File";
  }
  
  public String c() {
    return "Other Actions";
  }
  
  public boolean d() {
    return true;
  }
  
  public void a(Properties paramProperties) {
    String str = paramProperties.getProperty(a, null);
    if (str == null)
      throw new e(a + " is required"); 
    File file = new File(str);
    if (!file.exists())
      throw new e("Sound File not found."); 
    if (str.toLowerCase().endsWith("mp3")) {
      try {
        Media media = new Media(file.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
      } catch (Error error) {
        D.b("No JavaFX, Can't play mp3.");
        throw new e("JavaFX Libraries not found, JavaFX is required for mp3 playback.");
      } 
    } else {
      try {
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
      } catch (UnsupportedAudioFileException unsupportedAudioFileException) {
        throw new e("Unsupported audio format:\n" + unsupportedAudioFileException.getLocalizedMessage());
      } catch (IOException iOException) {
        D.a("Unable to read sound file: " + file.getAbsolutePath());
      } catch (LineUnavailableException lineUnavailableException) {
        D.a("Unable to open player line.");
      } 
    } 
  }
  
  public void b(Properties paramProperties) {
    String str = paramProperties.getProperty(a, null);
    if (str == null)
      throw new e(a + " is required"); 
    File file = new File(str);
    if (!file.exists())
      throw new e("Sound File not found."); 
    if (str.toLowerCase().endsWith("mp3"))
      try {
        Media media = new Media(file.toURI().toString());
      } catch (Error error) {
        D.b("No JavaFX, Can't play mp3.");
        throw new e("JavaFX Libraries not found, JavaFX is required for mp3 playback.");
      }  
  }
  
  public k e() {
    if (this.c == null) {
      this.c = new k();
      i i = new i(a, "");
      i.a(7);
      i.c("Set the full Path to the file you would like play when this action is triggered. Supportde formats are: wav, aiff, au and mp3. For MP3, you must have JavaFX libraries. Windows and OS X installers always include these.");
      this.c.a(i);
    } 
    return this.c;
  }
  
  public boolean f() {
    return true;
  }
  
  public boolean g() {
    return false;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aR/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */