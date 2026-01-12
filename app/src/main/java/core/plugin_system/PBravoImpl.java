package p;

import G.R;
import G.T;
import S.SInterfaceNovember;
import bH.J;
import d.DInterfaceMike;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PBravoImpl {
  public static List a() {
    R r = T.a().c();
    ArrayList<DInterfaceMike> arrayList = new ArrayList();
    DInterfaceMike DInterfaceMike = new DInterfaceMike();
    DInterfaceMike.d("highTempWarning");
    DInterfaceMike.c("Display High CLT Warning");
    d.b b1 = new d.b();
    b1.setProperty("Warning_Message", "Coolant Temperature High!");
    DInterfaceMike.a(b1);
    DInterfaceMike.a("globalWarning");
    DInterfaceMike.b("Shows a warning message the CLT temperatures are too high");
    arrayList.add(DInterfaceMike);
    String str = System.getProperty("javafx.runtime.version");
    if (str != null && str.length() > 0) {
      DInterfaceMike = new DInterfaceMike();
      DInterfaceMike.d("playBurnout");
      DInterfaceMike.c("Play burnout WAV");
      b1 = new d.b();
      File file = new File("./help/sound/burnoutHotRod.wav");
      b1.setProperty("Sound_File_Path", file.getAbsolutePath());
      DInterfaceMike.a(b1);
      DInterfaceMike.a("playSoundFile");
      DInterfaceMike.b("Plays a WAV file of a Car doing a burnout");
      if (file.exists()) arrayList.add(DInterfaceMike);
      DInterfaceMike = new DInterfaceMike();
      DInterfaceMike.d("playRacecar");
      DInterfaceMike.c("Play Race Car MP3");
      b1 = new d.b();
      file = new File("./help/sound/racing01.mp3");
      b1.setProperty("Sound_File_Path", file.getAbsolutePath());
      DInterfaceMike.a(b1);
      DInterfaceMike.a("playSoundFile");
      DInterfaceMike.b("Plays an MP3 file of a race car passing");
      if (file.exists()) arrayList.add(DInterfaceMike);
    }
    DInterfaceMike = new DInterfaceMike();
    DInterfaceMike.d("killEngine");
    DInterfaceMike.c("Stop Engine From Running");
    b1 = new d.b();
    b1.setProperty("commandName", "cmdengineshutdown");
    DInterfaceMike.a(b1);
    DInterfaceMike.a("sendControllerCommand");
    DInterfaceMike.b("Sends a Controller Command for MS3 to kill the engine.");
    if (r != null && r.O().b("cmdengineshutdown") != null) arrayList.add(DInterfaceMike);
    DInterfaceMike = new DInterfaceMike();
    DInterfaceMike.d("showVeTable");
    DInterfaceMike.c("Show VE Table");
    b1 = new d.b();
    b1.setProperty("settingsPanelName", "veTable1Tbl");
    DInterfaceMike.a(b1);
    DInterfaceMike.a("showSettingsDialog");
    DInterfaceMike.b("Open VE Table 1");
    if (r != null && r.e().c("veTable1Tbl") != null) arrayList.add(DInterfaceMike);
    DInterfaceMike = new DInterfaceMike();
    DInterfaceMike.d("startExplorer");
    DInterfaceMike.c("Open File Browser");
    b1 = new d.b();
    b1.setProperty("Shell_Command", "explorer");
    DInterfaceMike.a(b1);
    DInterfaceMike.a("shellCommand");
    DInterfaceMike.b("Shell a command to the OS to open a File Browser");
    if (J.a()) arrayList.add(DInterfaceMike);
    DInterfaceMike = new DInterfaceMike();
    DInterfaceMike.d("displayEngineStarted");
    DInterfaceMike.c("Display Engine Started");
    b1 = new d.b();
    b1.setProperty("Message", "Engine Started");
    DInterfaceMike.a(b1);
    DInterfaceMike.a("passiveMessage");
    DInterfaceMike.b("Displays the Message Engine Started in the lower left message area.");
    arrayList.add(DInterfaceMike);
    DInterfaceMike = new DInterfaceMike();
    DInterfaceMike.d("syncLossMark");
    DInterfaceMike.c("Sync Loss Mark");
    b1 = new d.b();
    b1.setProperty("MARK_Comment", "Lost Sync Increments");
    DInterfaceMike.a(b1);
    DInterfaceMike.a("markDataLogComment");
    DInterfaceMike.b("Places a Sync Loss MARK in any active data log.");
    arrayList.add(DInterfaceMike);
    return arrayList;
  }

  public static List b() {
    R r = T.a().c();
    ArrayList<SInterfaceNovember> arrayList = new ArrayList();
    SInterfaceNovember SInterfaceNovember = new SInterfaceNovember();
    SInterfaceNovember.g("cltTempWarning");
    SInterfaceNovember.a(true);
    SInterfaceNovember.e("coolant > 230");
    SInterfaceNovember.f("coolant < 200");
    SInterfaceNovember.a(-1);
    SInterfaceNovember.j("highTempWarning");
    if (r != null && r.g("coolant") != null) arrayList.add(SInterfaceNovember);
    String str = System.getProperty("javafx.runtime.version");
    if (str != null && str.length() > 0) {
      SInterfaceNovember = new SInterfaceNovember();
      SInterfaceNovember.g("playRacecarWOT");
      SInterfaceNovember.a(true);
      SInterfaceNovember.e("tps > 92");
      SInterfaceNovember.f("tps < 5");
      SInterfaceNovember.a(-1);
      SInterfaceNovember.j("playRacecar");
      if (r != null && r.g("tps") != null) arrayList.add(SInterfaceNovember);
    }
    SInterfaceNovember = new SInterfaceNovember();
    SInterfaceNovember.g("syncLossDetect");
    SInterfaceNovember.a(true);
    SInterfaceNovember.e("synccnt > lastValue(synccnt)");
    SInterfaceNovember.f("TimedResetSeconds:1");
    SInterfaceNovember.a(1000);
    SInterfaceNovember.j("syncLossMark");
    if (r != null && r.g("synccnt") != null) arrayList.add(SInterfaceNovember);
    return arrayList;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/p/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
