package aP;

import G.R;
import V.a;
import aZ.a;
import aZ.f;
import aZ.j;
import bH.D;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.eB;
import java.awt.Window;
import java.io.File;
import java.util.ArrayList;
import s.g;

public class bR extends Thread {
  eB a = null;
  
  Window b = null;
  
  a c = null;
  
  R[] d = null;
  
  long e = 0L;
  
  public static String f = "FRD";
  
  public static String g = "SD";
  
  ArrayList h = new ArrayList();
  
  String i = "";
  
  int j = 0;
  
  boolean k = true;
  
  public bR(Window paramWindow, R[] paramArrayOfR) {
    super("FRD Processor");
    setDaemon(true);
    this.b = paramWindow;
    this.d = paramArrayOfR;
  }
  
  public void a(File paramFile1, File paramFile2) {
    bU bU = new bU(this);
    bU.a(paramFile1);
    bU.b(paramFile2);
    String str = g;
    if (paramFile1.getName().toLowerCase().endsWith(".frd"))
      str = f; 
    bU.a(str);
    this.h.add(bU);
  }
  
  public void start() {
    this.e = System.currentTimeMillis();
    super.start();
  }
  
  public void run() {
    this.a = new eB(this.b, "Transform Raw Log files to MSL File", "Converting all selected log files, please wait...", true, false);
    this.a.a(new bS(this));
    this.a.setVisible(true);
    ArrayList<File> arrayList = new ArrayList();
    File file = null;
    for (byte b = 0; b < this.h.size(); b++) {
      this.j = b;
      bU bU = this.h.get(b);
      File file1 = bU.a();
      file = bU.b();
      arrayList.add(file);
      String str = bU.c();
      this.a.a("Converting log " + file1.getName() + ", please wait...");
      if (str.equals(f)) {
        this.c = (a)new f();
      } else {
        this.c = (a)new j();
      } 
      this.c.a(new bT(this));
      boolean bool = false;
      try {
        bool = this.c.a(this.d, file1);
      } catch (a a1) {
        String str1 = a1.getMessage() + "\n\nWould you like attempt processing this file anyway?";
        bool = bV.a(str1, this.b, true);
      } 
      if (bool) {
        try {
          this.c.a(this.d, file1, file, false);
        } catch (a a1) {
          a1.printStackTrace();
          String str1 = "Did not complete log conversion for " + file1.getName();
          if (b < this.h.size())
            str1 = str1 + "\nWill continue to try remaining files."; 
          D.a(str1, (Exception)a1, this.b);
        } 
      } else {
        this.a.dispose();
        return;
      } 
      if (!this.k)
        break; 
    } 
    this.a.dispose();
    if (file != null && this.h.size() == 1) {
      if (bV.a(g.b("File ready for viewing, would you like to open it now?"), this.b, true))
        f.a().a(file); 
    } else if (this.i != null && this.i.trim().length() > 0) {
      K k = new K(this.i);
      k.a(this.b, "Data Transformation Results Log");
      if (arrayList.size() > 0 && bV.a(g.b("File ready for viewing, would you like to open it now?"), k, true)) {
        File[] arrayOfFile = arrayList.<File>toArray(new File[arrayList.size()]);
        f.a().a(arrayOfFile);
      } 
    } 
  }
  
  private void a() {
    this.k = false;
    this.c.w();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/bR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */