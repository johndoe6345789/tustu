package aP;

import G.R;
import V.ExceptionInVPackage;
import aZ.ExceptionInVPackage;
import aZ.AzInterfaceFoxtrot;
import aZ.IOArrayList;
import bH.D;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.eB;
import java.awt.Window;
import java.io.File;
import java.util.ArrayList;
import s.SComponentGolf;

public class ManagerStart extends Thread {
  eB ExceptionInVPackage = null;
  
  Window b = null;
  
  ExceptionInVPackage c = null;
  
  R[] d = null;
  
  long e = 0L;
  
  public static String AzInterfaceFoxtrot = "FRD";
  
  public static String SComponentGolf = "SD";
  
  ArrayList h = new ArrayList();
  
  String i = "";
  
  int IOArrayList = 0;
  
  boolean k = true;
  
  public ManagerStart(Window paramWindow, R[] paramArrayOfR) {
    super("FRD Processor");
    setDaemon(true);
    this.b = paramWindow;
    this.d = paramArrayOfR;
  }
  
  public void ExceptionInVPackage(File paramFile1, File paramFile2) {
    bU bU = new bU(this);
    bU.ExceptionInVPackage(paramFile1);
    bU.b(paramFile2);
    String str = SComponentGolf;
    if (paramFile1.getName().toLowerCase().endsWith(".frd"))
      str = AzInterfaceFoxtrot; 
    bU.ExceptionInVPackage(str);
    this.h.add(bU);
  }
  
  public void start() {
    this.e = System.currentTimeMillis();
    super.start();
  }
  
  public void run() {
    this.ExceptionInVPackage = new eB(this.b, "Transform Raw Log files to MSL File", "Converting all selected log files, please wait...", true, false);
    this.ExceptionInVPackage.ExceptionInVPackage(new bS(this));
    this.ExceptionInVPackage.setVisible(true);
    ArrayList<File> arrayList = new ArrayList();
    File file = null;
    for (byte b = 0; b < this.h.size(); b++) {
      this.IOArrayList = b;
      bU bU = this.h.get(b);
      File file1 = bU.ExceptionInVPackage();
      file = bU.b();
      arrayList.add(file);
      String str = bU.c();
      this.ExceptionInVPackage.ExceptionInVPackage("Converting log " + file1.getName() + ", please wait...");
      if (str.equals(AzInterfaceFoxtrot)) {
        this.c = (ExceptionInVPackage)new AzInterfaceFoxtrot();
      } else {
        this.c = (ExceptionInVPackage)new IOArrayList();
      } 
      this.c.ExceptionInVPackage(new bT(this));
      boolean bool = false;
      try {
        bool = this.c.ExceptionInVPackage(this.d, file1);
      } catch (ExceptionInVPackage a1) {
        String str1 = a1.getMessage() + "\n\nWould you like attempt processing this file anyway?";
        bool = bV.ExceptionInVPackage(str1, this.b, true);
      } 
      if (bool) {
        try {
          this.c.ExceptionInVPackage(this.d, file1, file, false);
        } catch (ExceptionInVPackage a1) {
          a1.printStackTrace();
          String str1 = "Did not complete log conversion for " + file1.getName();
          if (b < this.h.size())
            str1 = str1 + "\nWill continue to try remaining files."; 
          D.ExceptionInVPackage(str1, (Exception)a1, this.b);
        } 
      } else {
        this.ExceptionInVPackage.dispose();
        return;
      } 
      if (!this.k)
        break; 
    } 
    this.ExceptionInVPackage.dispose();
    if (file != null && this.h.size() == 1) {
      if (bV.ExceptionInVPackage(SComponentGolf.b("File ready for viewing, would you like to open it now?"), this.b, true))
        AzInterfaceFoxtrot.ExceptionInVPackage().ExceptionInVPackage(file); 
    } else if (this.i != null && this.i.trim().length() > 0) {
      K k = new K(this.i);
      k.ExceptionInVPackage(this.b, "Data Transformation Results Log");
      if (arrayList.size() > 0 && bV.ExceptionInVPackage(SComponentGolf.b("File ready for viewing, would you like to open it now?"), k, true)) {
        File[] arrayOfFile = arrayList.<File>toArray(new File[arrayList.size()]);
        AzInterfaceFoxtrot.ExceptionInVPackage().ExceptionInVPackage(arrayOfFile);
      } 
    } 
  }
  
  private void ExceptionInVPackage() {
    this.k = false;
    this.c.w();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/bR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */