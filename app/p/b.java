package p;

import G.R;
import G.T;
import S.n;
import bH.J;
import d.m;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class b {
  public static List a() {
    R r = T.a().c();
    ArrayList<m> arrayList = new ArrayList();
    m m = new m();
    m.d("highTempWarning");
    m.c("Display High CLT Warning");
    d.b b1 = new d.b();
    b1.setProperty("Warning_Message", "Coolant Temperature High!");
    m.a(b1);
    m.a("globalWarning");
    m.b("Shows a warning message the CLT temperatures are too high");
    arrayList.add(m);
    String str = System.getProperty("javafx.runtime.version");
    if (str != null && str.length() > 0) {
      m = new m();
      m.d("playBurnout");
      m.c("Play burnout WAV");
      b1 = new d.b();
      File file = new File("./help/sound/burnoutHotRod.wav");
      b1.setProperty("Sound_File_Path", file.getAbsolutePath());
      m.a(b1);
      m.a("playSoundFile");
      m.b("Plays a WAV file of a Car doing a burnout");
      if (file.exists())
        arrayList.add(m); 
      m = new m();
      m.d("playRacecar");
      m.c("Play Race Car MP3");
      b1 = new d.b();
      file = new File("./help/sound/racing01.mp3");
      b1.setProperty("Sound_File_Path", file.getAbsolutePath());
      m.a(b1);
      m.a("playSoundFile");
      m.b("Plays an MP3 file of a race car passing");
      if (file.exists())
        arrayList.add(m); 
    } 
    m = new m();
    m.d("killEngine");
    m.c("Stop Engine From Running");
    b1 = new d.b();
    b1.setProperty("commandName", "cmdengineshutdown");
    m.a(b1);
    m.a("sendControllerCommand");
    m.b("Sends a Controller Command for MS3 to kill the engine.");
    if (r != null && r.O().b("cmdengineshutdown") != null)
      arrayList.add(m); 
    m = new m();
    m.d("showVeTable");
    m.c("Show VE Table");
    b1 = new d.b();
    b1.setProperty("settingsPanelName", "veTable1Tbl");
    m.a(b1);
    m.a("showSettingsDialog");
    m.b("Open VE Table 1");
    if (r != null && r.e().c("veTable1Tbl") != null)
      arrayList.add(m); 
    m = new m();
    m.d("startExplorer");
    m.c("Open File Browser");
    b1 = new d.b();
    b1.setProperty("Shell_Command", "explorer");
    m.a(b1);
    m.a("shellCommand");
    m.b("Shell a command to the OS to open a File Browser");
    if (J.a())
      arrayList.add(m); 
    m = new m();
    m.d("displayEngineStarted");
    m.c("Display Engine Started");
    b1 = new d.b();
    b1.setProperty("Message", "Engine Started");
    m.a(b1);
    m.a("passiveMessage");
    m.b("Displays the Message Engine Started in the lower left message area.");
    arrayList.add(m);
    m = new m();
    m.d("syncLossMark");
    m.c("Sync Loss Mark");
    b1 = new d.b();
    b1.setProperty("MARK_Comment", "Lost Sync Increments");
    m.a(b1);
    m.a("markDataLogComment");
    m.b("Places a Sync Loss MARK in any active data log.");
    arrayList.add(m);
    return arrayList;
  }
  
  public static List b() {
    R r = T.a().c();
    ArrayList<n> arrayList = new ArrayList();
    n n = new n();
    n.g("cltTempWarning");
    n.a(true);
    n.e("coolant > 230");
    n.f("coolant < 200");
    n.a(-1);
    n.j("highTempWarning");
    if (r != null && r.g("coolant") != null)
      arrayList.add(n); 
    String str = System.getProperty("javafx.runtime.version");
    if (str != null && str.length() > 0) {
      n = new n();
      n.g("playRacecarWOT");
      n.a(true);
      n.e("tps > 92");
      n.f("tps < 5");
      n.a(-1);
      n.j("playRacecar");
      if (r != null && r.g("tps") != null)
        arrayList.add(n); 
    } 
    n = new n();
    n.g("syncLossDetect");
    n.a(true);
    n.e("synccnt > lastValue(synccnt)");
    n.f("TimedResetSeconds:1");
    n.a(1000);
    n.j("syncLossMark");
    if (r != null && r.g("synccnt") != null)
      arrayList.add(n); 
    return arrayList;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/p/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */