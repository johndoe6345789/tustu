package W;

import G.R;
import aa.AaInterfaceBravo;
import aa.AaInterfaceDelta;
import aa.AaInterfaceEcho;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IniFileWriter {
  private OutputStreamWriter c = null;

  private BufferedWriter AaInterfaceDelta = null;

  public static int a = 28;

  public static int AaInterfaceBravo = 10;

  private boolean AaInterfaceEcho = true;

  private final Map f = new HashMap<>();

  private final String[] g =
      new String[] {
        "FILE_HEADER", "MegaTune", "TunerStudio", "SettingGroups", "Constants",
            "ConstantsExtensions", "ReferenceTables", "PcVariables", "SettingContextHelp", "Menu",
        "KeyActions", "VerbiageOverride", "ControllerCommands", "UserDefined", "UiDialogs",
            "PortEditor", "FTPBrowser", "CurveEditor", "TableEditor", "GaugeConfigurations",
        "FrontPage", "RunTime", "Tuning", "LoggerDefinition", "AccelerationWizard", "TurboBaud",
            "BurstMode", "OutputChannels", "Replay", "ExtendedReplay",
        "Datalog", "VeAnalyze", "DatalogViews", "TuningViews", "EncodedData"
      };

  public void a(File paramFile, R paramR, r paramr) {
    J j = null;
    if (paramFile.exists()) {
      j = new J();
      j.a(paramFile, true);
      j.AaInterfaceBravo();
    }
    String str = "Open Writer";
    try {
      this.c = new OutputStreamWriter(new FileOutputStream(paramFile), "UTF-8");
      this.AaInterfaceDelta = new BufferedWriter(this.c);
      this.AaInterfaceDelta.append("encoding=UTF-8\n");
      ArrayList<String> arrayList = new ArrayList();
      for (String str1 : this.g) {
        N n = (j != null && j.a(str1)) ? j.AaInterfaceBravo(str1) : null;
        if (this.f.containsKey(str1)) {
          O o = (O) this.f.get(str1);
          arrayList.add(str1);
          this.AaInterfaceDelta.write("\n");
          if (!str1.equals("FILE_HEADER"))
            this.AaInterfaceDelta.append("[").append(str1).append("]").append("\n");
          if (this.AaInterfaceEcho) {
            this.AaInterfaceDelta.append(o.AaInterfaceBravo());
            this.AaInterfaceDelta.append("\n");
          }
          o.a(paramR, this.AaInterfaceDelta, n, paramr);
          this.AaInterfaceDelta.write("\n");
          this.AaInterfaceDelta.flush();
        } else if (n != null) {
          if (n.a().equals("UserDefined")) n.a("UiDialogs");
          a(n);
          arrayList.add(str1);
        }
      }
      if (j != null) {
        Iterator<String> iterator = j.AaInterfaceBravo();
        while (iterator.hasNext()) {
          String str1 = iterator.next();
          if (!arrayList.contains(str1)) {
            N n = j.AaInterfaceBravo(str1);
            a(n);
            arrayList.add(str1);
          }
        }
      }
    } catch (IOException iOException) {
      throw iOException;
    } catch (Exception exception) {
      exception.printStackTrace();
      String str1 =
          "Error writing ini file!\nProblem: "
              + ((exception.getMessage() != null) ? exception.getMessage() : "Check Log")
              + "\nfailure during: "
              + str;
      IOException iOException = new IOException(str1);
      throw iOException;
    } finally {
      try {
        if (this.AaInterfaceDelta != null) this.AaInterfaceDelta.close();
        if (this.c != null) this.c.close();
      } catch (Exception exception) {
      }
    }
  }

  public void a(O paramO) {
    this.f.put(paramO.a(), paramO);
  }

  public void a(boolean paramBoolean) {
    this.AaInterfaceEcho = paramBoolean;
  }

  public static P a() {
    P p = new P();
    p.a((O) new AaInterfaceEcho());
    p.a((O) new AaInterfaceDelta());
    p.a((O) new AaInterfaceBravo());
    return p;
  }

  private void a(N paramN) {
    boolean bool = false;
    if (!paramN.a().equals("FILE_HEADER")) {
      this.AaInterfaceDelta.append("[").append(paramN.a()).append("]").append("\n");
    } else {
      bool = true;
    }
    byte AaInterfaceBravo = 0;
    for (M m : paramN) {
      String str = m.a();
      if (str.trim().isEmpty()) {
        AaInterfaceBravo++;
      } else {
        AaInterfaceBravo = 0;
      }
      if (AaInterfaceBravo < 5 && (!bool || !str.contains("encoding=UTF-8")))
        this.AaInterfaceDelta.append(str).append("\n");
    }
    this.AaInterfaceDelta.flush();
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/P.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
