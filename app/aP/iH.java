package aP;

import G.R;
import G.T;
import G.bT;
import G.cW;
import V.a;
import W.R;
import W.w;
import W.z;
import aE.a;
import bH.D;
import bH.X;
import bH.n;
import bH.t;
import c.a;
import com.efiAnalytics.ui.bV;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import n.k;
import r.a;
import r.j;
import s.g;

public class iH implements cW {
  public static boolean a = false;
  
  public boolean a(String paramString1, String paramString2, bT parambT) {
    a a = a.A();
    R r = T.a().c(paramString1);
    if (r != null)
      r.O().m(""); 
    if (parambT.d()) {
      String str = g.b("Successfully connected to your " + a.a(paramString2, a.f) + ", but no firmware is loaded or the bootload jumper is on.") + "\n\n" + g.b("This must be corrected before connecting.");
      bV.d(str, dd.a().c());
      return false;
    } 
    if (a) {
      a(a, paramString1, paramString2, parambT);
      hq.a().d("Updating config file for " + paramString1);
      return false;
    } 
    JFrame jFrame = dd.a().c();
    iA iA = new iA(jFrame, a, paramString1, parambT, paramString2);
    bV.a(jFrame, iA);
    iA.setVisible(true);
    return iA.b();
  }
  
  public static File a(bT parambT) {
    if (!n.b()) {
      String str = a(a.b + " does not currently have access to the Internet.") + "\n" + a("To download the ECU Definition file required for this firmware, " + a.b + " requires Internet access.") + "\n\n" + a("Please enable Internet access with " + a.b + " open.") + "\n" + a("You do not need to be connected to your controller, " + a.b + " knows what file it needs.") + "\n" + a("After closing this dialog the file will automatically download it once Internet is detected.") + "\n" + a("You will be notified when download is complete");
      String[] arrayOfString = { a("Download when Internet available"), a("Browse for file") };
      int i = hq.a().a(str, arrayOfString);
      if (i == 0) {
        k.a().a(parambT);
        return null;
      } 
      throw new FileNotFoundException("The correct ECU Definition not available.");
    } 
    R r = w.a(parambT.b());
    if (r.a()) {
      boolean bool;
      if (!a && !a.a().c(a.ad, Boolean.FALSE.booleanValue())) {
        String str = "Your installation of " + a.b + " does not have a Ecu Definition file to support the firmware found.\n\n\nRequired Serial Signature:\n" + parambT + "\n\nHowever this file is available on EFI Analytics servers.\nWould you like " + a.b + " to download the file for you?\nFile Size: " + X.a(r.b()) + "\n";
        String[] arrayOfString = { g.b("Yes"), g.b("No"), g.b("Always Yes") };
        bool = JOptionPane.showOptionDialog(dd.a().c(), str, "Internet Download", -1, 3, null, (Object[])arrayOfString, arrayOfString[0]);
        if (bool == 2) {
          a.a().b(a.ad, Boolean.toString(true));
          bool = false;
        } 
      } else {
        bool = false;
      } 
      if (!bool) {
        JDialog jDialog = bV.a(dd.a().c(), "Downloading Ecu Definition file for " + parambT.c());
        try {
          R r1 = w.a(parambT.b(), j.c());
          if (r1.a())
            return r1.c(); 
          bV.d(r1.d(), dd.a().c());
          return null;
        } catch (a a) {
          bV.d(a.getMessage(), dd.a().c());
        } finally {
          jDialog.dispose();
        } 
      } 
    } else {
      throw new FileNotFoundException("The correct ECU Definition not available.");
    } 
    return null;
  }
  
  private static String a(String paramString) {
    return g.b(paramString);
  }
  
  public void a(String paramString, a parama, File paramFile) {
    if (paramString.equals(parama.u())) {
      String str1 = paramFile.getName().toLowerCase().endsWith(".ecu") ? "mainController.ecu" : "mainController.ini";
      parama.l(str1);
      parama.remove("firmwareDescription");
    } 
    File file = parama.f(paramString);
    if (file == null)
      bV.d("No target file name for device:" + paramString, dd.a().c()); 
    if (paramFile == null || !paramFile.exists()) {
      bV.d("The " + a.f + " Configuration file can not be found:\n" + paramString, dd.a().c());
      return;
    } 
    try {
      D.d("Copying " + paramFile.getName() + " to " + parama.u() + "'s projectCfg");
      t.a(paramFile, file);
    } catch (a a1) {
      hq.a().b("Can not copy \n" + paramFile.getAbsolutePath() + "\nTo:\n" + file.getAbsolutePath());
    } 
    try {
      if (!paramFile.getParentFile().equals(j.c())) {
        D.d("Copying " + paramFile.getName() + " to ecuDef dir for future use.");
        t.a(paramFile, new File(j.c(), z.b(z.a(paramFile))));
      } 
    } catch (a a1) {
      D.a("Can not copy \n" + paramFile.getAbsolutePath() + "\nTo:\n" + file.getAbsolutePath());
    } 
    try {
      parama.b();
    } catch (a a1) {
      hq.a().b("Error saving project.");
    } 
    String str = z.a(paramFile);
    if (paramString.equals(parama.u()))
      if (dd.a().h() != null) {
        dd.a().h().c(str);
      } else if (dd.a().b() != null) {
        dd.a().b().c(str);
      }  
    f.a().z();
  }
  
  public boolean a(a parama, String paramString1, String paramString2, bT parambT) {
    File file = null;
    String str1 = a.a(paramString2, a.f);
    try {
      file = j.d(parambT.b());
    } catch (a a1) {
      D.a("Signature Mismatch - Error retrieving a file that matches the controller signature:" + parambT);
    } 
    if (file != null) {
      String str = g.b(a.b + " has an ECU Definition (ini) file to support your Controllers firmware.") + "\n\n   " + g.b("Firmware on " + str1) + ": " + parambT.c() + "\n   " + g.b("Required Serial Signature") + ": " + parambT.b() + "\n\n" + g.b("Would you like to update your project with " + a.b + "'s correct ECU Definition?") + "\n\n" + g.b("Click Yes to use " + a.b + "'s ECU Definition File.") + "\n" + g.b("Click No to browse to your own ECU Definition File.");
      if (a || hq.a().c(str)) {
        (new iI(this, paramString1, parama, file)).start();
        return true;
      } 
    } else {
      try {
        file = a(parambT);
        if (file != null) {
          (new iI(this, paramString1, parama, file)).start();
          return true;
        } 
      } catch (FileNotFoundException fileNotFoundException) {
        D.d("Could not get ECU Definition for signature: " + parambT + ", Error: " + fileNotFoundException.getLocalizedMessage());
      } 
    } 
    if (file == null) {
      String str = a.b + " does not have an ECU Definition (ini) file that is \ncompatible with the firmware installed on this Controller.\n\n    Firmware on " + str1 + ": " + parambT.c() + "\n    Required Serial Signature: " + parambT.b() + "\n\nTo correct this please browse to the ECU Definition (ini) file\nthat was provided with your firmware.\n";
      hq.a().b(str);
    } 
    String[] arrayOfString = { "ini", "ecu" };
    String str2 = bV.b(dd.a().c(), "Find ecu definition file", arrayOfString, "", "");
    if (str2 != null && !str2.equals("")) {
      file = new File(str2);
      if (!file.exists())
        return false; 
      String str = z.a(str2);
      if (str == null || !str.equals(parambT.b())) {
        String str3 = "The file:\n" + str2 + "\n does not appear correct for the firmware on your " + str1 + "!\n\nThe correct ECU Definition (ini) file is required for proper operation\nand to prevent corruption to the settings on your " + str1 + "!!!\n\nAre you sure you wish to use this ECU Definition?";
        if (!hq.a().c(str3))
          return false; 
      } 
      try {
        t.a(str2, j.m() + parambT.b() + ".ini");
      } catch (a a1) {
        D.b("Unable to copy ini file to app ecu dir");
      } 
      (new iI(this, paramString1, parama, file)).start();
      return true;
    } 
    return false;
  }
  
  public File a() {
    String[] arrayOfString = { "ini", "ecu" };
    File file = null;
    do {
      String str = bV.b(dd.a().c(), "Find ecu definition file", arrayOfString, "", "");
      file = new File(str);
      if (str == null || str.equals(""))
        continue; 
      if (file.exists() && file.length() > 0L) {
        String str1 = z.a(str);
        try {
          t.a(str, z.b(str1));
        } catch (a a) {
          D.b("Unable to copy ini file to app ecu dir");
        } 
        return file;
      } 
      bV.d(file + "\nIs not a valid Firmware Definition File.", dd.a().c());
    } while (file != null && !file.exists());
    return null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/iH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */