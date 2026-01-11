package aP;

import G.T;
import G.l;
import W.B;
import W.C;
import bH.D;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import r.IOPropertiesUsingFile;
import r.ThreadedFile;
import s.SComponentGolf;

public class ManagerScomponentgolf implements B {
  private static dg SComponentGolf = null;
  
  private static String h = IOPropertiesUsingFile.b + ".pipe";
  
  private static String i = "restore.pipe";
  
  File IOPropertiesUsingFile = new File(ThreadedFile.A(), h);
  
  File b = new File(ThreadedFile.A(), i);
  
  boolean c = false;
  
  static String d = "DIE";
  
  static String e = "OFFLINE";
  
  static String f = "ONLINE";
  
  public static dg IOPropertiesUsingFile() {
    if (SComponentGolf == null)
      SComponentGolf = new dg(); 
    return SComponentGolf;
  }
  
  public boolean b() {
    return IOPropertiesUsingFile(false);
  }
  
  public boolean IOPropertiesUsingFile(boolean paramBoolean) {
    this.IOPropertiesUsingFile = new File(ThreadedFile.A(), h);
    if (this.IOPropertiesUsingFile.exists()) {
      this.IOPropertiesUsingFile.delete();
      try {
        Thread.sleep(2000L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(dg.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
      this.IOPropertiesUsingFile = new File(ThreadedFile.A(), h);
      if (this.IOPropertiesUsingFile.exists()) {
        if (!paramBoolean) {
          String str = SComponentGolf.b("There appears to already be another instance of " + IOPropertiesUsingFile.b + " running.") + "\n" + SComponentGolf.b("Would you like to use the one that is already running?") + "\n\n";
          String[] arrayOfString = { SComponentGolf.b("Bring to foreground"), SComponentGolf.b("Start another") + " " + IOPropertiesUsingFile.b };
          int i = JOptionPane.showOptionDialog(dd.IOPropertiesUsingFile().c(), str, SComponentGolf.b("Already Running"), 0, 3, null, (Object[])arrayOfString, arrayOfString[1]);
          boolean bool = (i == 0) ? true : false;
          if (bool) {
            SComponentGolf();
            return false;
          } 
          return true;
        } 
        e();
      } 
    } 
    d();
    C.IOPropertiesUsingFile().IOPropertiesUsingFile(this.IOPropertiesUsingFile, this);
    C.IOPropertiesUsingFile().IOPropertiesUsingFile(this.b, this);
    return true;
  }
  
  public void IOPropertiesUsingFile(File paramFile) {
    if (this.c)
      if (paramFile.equals(this.IOPropertiesUsingFile) && !paramFile.exists()) {
        d();
      } else if (paramFile.equals(this.IOPropertiesUsingFile) && paramFile.exists() && paramFile.length() > 0L) {
        b(paramFile);
      } else if (paramFile.equals(this.b) && paramFile.exists()) {
        ((dl)dd.IOPropertiesUsingFile().c()).p();
        paramFile.delete();
      }  
  }
  
  private void c() {
    this.IOPropertiesUsingFile.delete();
  }
  
  private void d() {
    try {
      this.IOPropertiesUsingFile.createNewFile();
      this.IOPropertiesUsingFile.deleteOnExit();
      this.c = true;
    } catch (Exception exception) {
      D.c("Failed to create Pipe File, instance monitoring disabled.");
      this.c = false;
    } 
  }
  
  private boolean e() {
    File file = new File(ThreadedFile.A(), h);
    byte b1 = 2;
    byte b2 = 0;
    while (file.exists() && b1 > b2++) {
      file.delete();
      f();
      try {
        Thread.sleep(2000L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(dg.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
      c();
      try {
        Thread.sleep(2000L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(dg.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
      file = new File(ThreadedFile.A(), h);
    } 
    this.IOPropertiesUsingFile.delete();
    return (b2 < b1);
  }
  
  private void f() {
    try {
      c();
      this.IOPropertiesUsingFile.createNewFile();
      FileOutputStream fileOutputStream = new FileOutputStream(this.IOPropertiesUsingFile);
      fileOutputStream.write(d.getBytes());
      fileOutputStream.close();
      this.IOPropertiesUsingFile.deleteOnExit();
      this.c = true;
      D.c("Created Die file.");
    } catch (IOException iOException) {
      D.c("Failed to create Pipe File, instance monitoring disabled.");
      this.c = false;
      Logger.getLogger(dg.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } 
  }
  
  private void SComponentGolf() {
    try {
      this.b.createNewFile();
    } catch (IOException iOException) {
      D.c("Failed to create restore File, Other instance will not be notified.");
      Logger.getLogger(dg.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } 
  }
  
  private void b(File paramFile) {
    try {
      FileReader fileReader = new FileReader(paramFile);
      char[] arrayOfChar = new char[50];
      int i = fileReader.read(arrayOfChar);
      try {
        fileReader.close();
      } catch (IOException iOException) {}
      D.c("actOnFileContents: read=" + i);
      if (i > 0) {
        String str = (new String(arrayOfChar)).trim();
        D.c("fileContent: " + str);
        if (str.equals(d)) {
          try {
            D.c("Received message DIE, cutting my throat.");
            D.b();
            Thread.sleep(1000L);
          } catch (InterruptedException interruptedException) {
            Logger.getLogger(dg.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
          } 
          paramFile.delete();
          Runtime.getRuntime().halt(0);
        } else if (str.equals(e)) {
          D.c("Received message GO_OFFLINE.");
          if (T.IOPropertiesUsingFile().c() != null)
            T.IOPropertiesUsingFile().c().C().c(); 
        } else if (str.equals(f)) {
          D.c("Received message GO_ONLINE.");
          if (T.IOPropertiesUsingFile().c() != null)
            try {
              T.IOPropertiesUsingFile().c().C().d();
            } catch (l l) {
              Logger.getLogger(dg.class.getName()).log(Level.SEVERE, (String)null, (Throwable)l);
            }  
        } 
      } 
    } catch (FileNotFoundException fileNotFoundException) {
      Logger.getLogger(dg.class.getName()).log(Level.SEVERE, (String)null, fileNotFoundException);
    } catch (IOException iOException) {
      Logger.getLogger(dg.class.getName()).log(Level.SEVERE, (String)null, iOException);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/dg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */