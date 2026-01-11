package W;

import G.R;
import aa.b;
import aa.d;
import aa.e;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class P {
  private OutputStreamWriter c = null;
  
  private BufferedWriter d = null;
  
  public static int a = 28;
  
  public static int b = 10;
  
  private boolean e = true;
  
  private final Map f = new HashMap<>();
  
  private final String[] g = new String[] { 
      "FILE_HEADER", "MegaTune", "TunerStudio", "SettingGroups", "Constants", "ConstantsExtensions", "ReferenceTables", "PcVariables", "SettingContextHelp", "Menu", 
      "KeyActions", "VerbiageOverride", "ControllerCommands", "UserDefined", "UiDialogs", "PortEditor", "FTPBrowser", "CurveEditor", "TableEditor", "GaugeConfigurations", 
      "FrontPage", "RunTime", "Tuning", "LoggerDefinition", "AccelerationWizard", "TurboBaud", "BurstMode", "OutputChannels", "Replay", "ExtendedReplay", 
      "Datalog", "VeAnalyze", "DatalogViews", "TuningViews", "EncodedData" };
  
  public void a(File paramFile, R paramR, r paramr) {
    J j = null;
    if (paramFile.exists()) {
      j = new J();
      j.a(paramFile, true);
      j.b();
    } 
    String str = "Open Writer";
    try {
      this.c = new OutputStreamWriter(new FileOutputStream(paramFile), "UTF-8");
      this.d = new BufferedWriter(this.c);
      this.d.append("encoding=UTF-8\n");
      ArrayList<String> arrayList = new ArrayList();
      for (String str1 : this.g) {
        N n = (j != null && j.a(str1)) ? j.b(str1) : null;
        if (this.f.containsKey(str1)) {
          O o = (O)this.f.get(str1);
          arrayList.add(str1);
          this.d.write("\n");
          if (!str1.equals("FILE_HEADER"))
            this.d.append("[").append(str1).append("]").append("\n"); 
          if (this.e) {
            this.d.append(o.b());
            this.d.append("\n");
          } 
          o.a(paramR, this.d, n, paramr);
          this.d.write("\n");
          this.d.flush();
        } else if (n != null) {
          if (n.a().equals("UserDefined"))
            n.a("UiDialogs"); 
          a(n);
          arrayList.add(str1);
        } 
      } 
      if (j != null) {
        Iterator<String> iterator = j.b();
        while (iterator.hasNext()) {
          String str1 = iterator.next();
          if (!arrayList.contains(str1)) {
            N n = j.b(str1);
            a(n);
            arrayList.add(str1);
          } 
        } 
      } 
    } catch (IOException iOException) {
      throw iOException;
    } catch (Exception exception) {
      exception.printStackTrace();
      String str1 = "Error writing ini file!\nProblem: " + ((exception.getMessage() != null) ? exception.getMessage() : "Check Log") + "\nfailure during: " + str;
      IOException iOException = new IOException(str1);
      throw iOException;
    } finally {
      try {
        if (this.d != null)
          this.d.close(); 
        if (this.c != null)
          this.c.close(); 
      } catch (Exception exception) {}
    } 
  }
  
  public void a(O paramO) {
    this.f.put(paramO.a(), paramO);
  }
  
  public void a(boolean paramBoolean) {
    this.e = paramBoolean;
  }
  
  public static P a() {
    P p = new P();
    p.a((O)new e());
    p.a((O)new d());
    p.a((O)new b());
    return p;
  }
  
  private void a(N paramN) {
    boolean bool = false;
    if (!paramN.a().equals("FILE_HEADER")) {
      this.d.append("[").append(paramN.a()).append("]").append("\n");
    } else {
      bool = true;
    } 
    byte b = 0;
    for (M m : paramN) {
      String str = m.a();
      if (str.trim().isEmpty()) {
        b++;
      } else {
        b = 0;
      } 
      if (b < 5 && (!bool || !str.contains("encoding=UTF-8")))
        this.d.append(str).append("\n"); 
    } 
    this.d.flush();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/P.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */