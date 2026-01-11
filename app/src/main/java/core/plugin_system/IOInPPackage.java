package p;

import G.R;
import G.T;
import G.q;
import S.SInterfaceAlpha;
import S.SInterfaceEcho;
import S.SInterfaceGolf;
import S.Timer;
import S.SInterfaceLima;
import S.SInterfaceNovember;
import W.WInterfaceAp;
import W.Properties;
import bH.D;
import bH.X;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.ThreadedFile;

public class IOInPPackage implements SInterfaceGolf, SInterfaceLima {
  public static String SInterfaceAlpha = ".trigger";
  
  ArrayList b = new ArrayList();
  
  List c = new ArrayList();
  
  boolean d = false;
  
  private static x SInterfaceEcho = null;
  
  public static x SInterfaceAlpha() {
    if (SInterfaceEcho == null)
      SInterfaceEcho = new x(); 
    return SInterfaceEcho;
  }
  
  public ArrayList b() {
    if (this.b.isEmpty())
      d(); 
    return this.b;
  }
  
  public SInterfaceNovember SInterfaceAlpha(String paramString) {
    for (byte b = 0; b < b().size(); b++) {
      SInterfaceNovember SInterfaceNovember = this.b.get(b);
      if (SInterfaceNovember.SInterfaceAlpha() != null && SInterfaceNovember.SInterfaceAlpha().equals(paramString))
        return SInterfaceNovember; 
    } 
    return null;
  }
  
  public boolean b(String paramString) {
    for (byte b = 0; b < b().size(); b++) {
      Timer Timer = this.b.get(b);
      if (Timer.SInterfaceAlpha().equals(paramString)) {
        this.b.remove(b);
        c(paramString);
        return true;
      } 
    } 
    return false;
  }
  
  public void SInterfaceAlpha(SInterfaceNovember paramn) {
    for (byte b = 0; b < b().size(); b++) {
      Timer Timer = this.b.get(b);
      if (Timer.SInterfaceAlpha().equals(paramn.SInterfaceAlpha())) {
        this.b.set(b, paramn);
        if (!b(paramn))
          D.b("Failed to save updated ExpressionEventTrigger: " + paramn.SInterfaceAlpha()); 
        R r1 = T.SInterfaceAlpha().c();
        boolean bool1 = Timer.c();
        SInterfaceEcho.SInterfaceAlpha().SInterfaceAlpha(r1.c(), paramn.SInterfaceAlpha());
        if (bool1)
          try {
            SInterfaceEcho.SInterfaceAlpha().SInterfaceAlpha(r1.c(), (SInterfaceAlpha)paramn);
          } catch (q q) {
            Logger.getLogger(x.class.getName()).log(Level.SEVERE, "", (Throwable)q);
          }  
        return;
      } 
    } 
    this.b.add(paramn);
    if (!b(paramn))
      D.b("Failed to save new ExpressionEventTrigger: " + paramn.SInterfaceAlpha()); 
    R r = T.SInterfaceAlpha().c();
    boolean bool = paramn.c();
    SInterfaceEcho.SInterfaceAlpha().SInterfaceAlpha(r.c(), paramn.SInterfaceAlpha());
    if (bool)
      try {
        SInterfaceEcho.SInterfaceAlpha().SInterfaceAlpha(r.c(), (SInterfaceAlpha)paramn);
      } catch (q q) {
        Logger.getLogger(x.class.getName()).log(Level.SEVERE, "", (Throwable)q);
      }  
  }
  
  private void d() {
    this.b.clear();
    boolean bool = (this.d != ((T.SInterfaceAlpha().c() != null))) ? true : false;
    File file = ThreadedFile.B();
    File[] arrayOfFile = file.listFiles(new y(this));
    for (File file1 : arrayOfFile) {
      SInterfaceNovember SInterfaceNovember = SInterfaceAlpha(file1);
      if (SInterfaceNovember != null && bool)
        this.b.add(SInterfaceNovember); 
    } 
    if (this.b.isEmpty())
      this.b.addAll(b.b()); 
    for (SInterfaceNovember SInterfaceNovember : this.b) {
      b(SInterfaceNovember);
      R r = T.SInterfaceAlpha().c();
      if (r != null && SInterfaceNovember.c())
        try {
          SInterfaceEcho.SInterfaceAlpha().SInterfaceAlpha(r.c(), (SInterfaceAlpha)SInterfaceNovember);
        } catch (q q) {
          D.SInterfaceAlpha("Failed to start monitoring on Triggered Event: " + SInterfaceNovember.SInterfaceAlpha() + ", err: " + q.getLocalizedMessage());
        }  
    } 
    this.d = (T.SInterfaceAlpha().c() != null);
  }
  
  private SInterfaceNovember SInterfaceAlpha(File paramFile) {
    Properties properties = new Properties();
    FileInputStream fileInputStream = null;
    try {
      fileInputStream = new FileInputStream(paramFile);
      properties.load(fileInputStream);
      SInterfaceNovember SInterfaceNovember = new SInterfaceNovember();
      Properties Properties = new Properties(properties, "");
      SInterfaceNovember.SInterfaceAlpha((WInterfaceAp)Properties);
      String str = X.b(paramFile.getName(), SInterfaceAlpha, "");
      SInterfaceNovember.SInterfaceGolf(str);
      SInterfaceNovember.Timer("");
      if (SInterfaceNovember.SInterfaceAlpha() != null && !SInterfaceNovember.SInterfaceAlpha().isEmpty())
        return SInterfaceNovember; 
      D.b("Invalid trigger in trigger file, ignoring:\\SInterfaceNovember" + paramFile.getAbsolutePath());
      return null;
    } catch (IOException iOException) {
      D.SInterfaceAlpha("Unable to load UserEventTrigger file: " + iOException.getLocalizedMessage());
      return null;
    } finally {
      try {
        fileInputStream.close();
      } catch (Exception exception) {}
    } 
  }
  
  private boolean c(String paramString) {
    File file1 = ThreadedFile.B();
    File file2 = new File(file1, paramString + SInterfaceAlpha);
    return file2.delete();
  }
  
  public boolean b(SInterfaceNovember paramn) {
    Properties properties = new Properties();
    Properties Properties = new Properties(properties, "");
    paramn.SInterfaceAlpha((WInterfaceAp)Properties);
    paramn.i("");
    File file1 = ThreadedFile.B();
    File file2 = new File(file1, paramn.SInterfaceAlpha() + SInterfaceAlpha);
    if (file2.exists() && !file2.delete()) {
      D.b("Failed to delete existing ExpressionEventTrigger file: " + file2.getAbsolutePath());
      return false;
    } 
    file2 = new File(file1, paramn.SInterfaceAlpha() + SInterfaceAlpha);
    FileOutputStream fileOutputStream = null;
    try {
      fileOutputStream = new FileOutputStream(file2);
      WInterfaceAp WInterfaceAp = paramn.Timer();
      if (!(WInterfaceAp instanceof Properties)) {
        D.SInterfaceAlpha("EventTrigger Persistor not instanceof PropertiesPersistor!!");
        return false;
      } 
      Properties properties1 = ((Properties)WInterfaceAp).SInterfaceAlpha();
      properties1.store(fileOutputStream, "Attributes for ExpressionEventTrigger: " + paramn.SInterfaceAlpha());
      return true;
    } catch (IOException iOException) {
      D.SInterfaceAlpha("Failed to Save ExpressionEventTrigger! Error: " + iOException.getLocalizedMessage() + "\nFile:\\SInterfaceNovember" + file2.getAbsolutePath());
      return false;
    } finally {
      try {
        if (fileOutputStream != null)
          fileOutputStream.close(); 
      } catch (Exception exception) {}
    } 
  }
  
  public SInterfaceAlpha SInterfaceAlpha(String paramString1, String paramString2) {
    return (SInterfaceAlpha)SInterfaceAlpha(paramString2);
  }
  
  public List c() {
    ArrayList<String> arrayList = new ArrayList();
    ArrayList arrayList1 = b();
    for (SInterfaceNovember SInterfaceNovember : arrayList1)
      arrayList.add(SInterfaceNovember.SInterfaceAlpha()); 
    return arrayList;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/p/x.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */