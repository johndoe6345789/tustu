package aP;

import A.i;
import B.b;
import G.F;
import W.aa;
import W.t;
import aD.a;
import aE.a;
import aV.w;
import bB.b;
import bH.W;
import bh.y;
import com.efiAnalytics.apps.ts.dashboard.Gauge;
import com.efiAnalytics.apps.ts.dashboard.aa;
import com.efiAnalytics.tunerStudio.panels.TriggerLoggerPanel;
import g.b;
import h.g;
import h.i;
import java.awt.Color;
import r.a;
import r.i;
import z.c;

public class bz {
  public void a(String[] paramArrayOfString, String paramString) {
    a.i = paramString;
    String[] arrayOfString = null;
    if (paramArrayOfString.length > 0 && paramArrayOfString[0].equals("encryptFile")) {
      arrayOfString = new String[paramArrayOfString.length];
      System.arraycopy(paramArrayOfString, 0, arrayOfString, 0, paramArrayOfString.length);
    } 
    (new bA(this)).start();
    if ((paramArrayOfString.length > 0 && paramArrayOfString[0].equals("QJ")) || paramString.equals("TunerStudioQJ.jar")) {
      a.a();
      a.c = "QJ";
      if (paramArrayOfString.length > 0 && paramArrayOfString[0].equals("QJ"))
        paramArrayOfString[0] = ""; 
    } else if ((paramArrayOfString.length > 0 && paramArrayOfString[0].equals("TuneMonster")) || paramString.equals("TuneMonsterEFI.jar")) {
      a.b = a.av;
      a.a();
      a.c = "EFI";
      a.h = "https://www.efianalytics.com/register/register.jsp?appName=TuneMonster";
      if (paramArrayOfString.length > 0 && paramArrayOfString[0].equals("TuneMonster"))
        paramArrayOfString[0] = ""; 
      hb.p = "Auto Tune";
      String[] arrayOfString1 = { i.m };
      a.do = arrayOfString1;
      a.cP = true;
      a.ba = c.e;
      a.be = false;
    } else if ((paramArrayOfString.length > 0 && paramArrayOfString[0].equals("FuelMonster")) || paramString.equals("FuelMonsterTuner.jar")) {
      a.b = a.aw;
      a.a();
      a.c = "Tuner";
      a.h = "https://www.efianalytics.com/register/register.jsp?appName=FuelMonster";
      if (paramArrayOfString.length > 0 && paramArrayOfString[0].equals("FuelMonster"))
        paramArrayOfString[0] = ""; 
      hb.p = "Auto Tune";
      String[] arrayOfString1 = { i.n };
      a.cP = true;
      a.do = arrayOfString1;
      a.ba = c.e;
      a.be = false;
    } else if ((paramArrayOfString.length > 0 && paramArrayOfString[0].equals("GrassRoots")) || paramString.equals("GrassRootsTuner.jar")) {
      a.b = a.au;
      a.a();
      a.c = "Tuner";
      a.h = "https://www.efianalytics.com/register/register.jsp?appName=GrassRootsTuner";
      a.v = "registerGr.html";
      a.w = "registerAppNotConnectedGr.html";
      if (paramArrayOfString.length > 0 && paramArrayOfString[0].equals("GrassRoots"))
        paramArrayOfString[0] = ""; 
      hb.p = "Auto Tune";
    } else if ((paramArrayOfString.length > 0 && paramArrayOfString[0].equals("BigComm")) || paramString.equals("BigCommPro.jar")) {
      a.b = a.as;
      a.a();
      if (a.c.contains("Beta")) {
        a.a();
        a.c = "Pro(Beta)";
      } else {
        a.a();
        a.c = "Pro";
      } 
      a.h = "https://www.efianalytics.com/register/browseProducts.jsp?ecuFamily=BigStuff&productCategory=Software";
      a.v = "registerBC.html";
      a.w = "registerAppNotConnectedBC.html";
      aa.b = "http://www.efianalytics.com/:bsq";
      aa.c = "bsq";
      a.t = "bsproj";
      a.C = "big";
      a.cs = "csv";
      a.cB = a.cr;
      aa.b = "BigStuff-Template.dash";
      aa.a = 7;
      a.M = "https://www.efianalytics.com/register/browseProducts.jsp?ecuFamily=BigStuff&productCategory=Upgrades";
      i.A = "./config/dashSplashBigComm.png";
      if (paramArrayOfString.length > 0 && paramArrayOfString[0].equals("BigComm"))
        paramArrayOfString[0] = ""; 
      hb.p = "Auto-Tune";
      aa.d = Color.BLACK;
      i.T = "withLabels";
      a.c = "9600";
      Gauge.s = new Color(8, 8, 8);
      Gauge.u = new Color(241, 255, 255);
      Gauge.t = new Color(37, 37, 46);
      Gauge.v = new Color(255, 44, 20);
      i.j = "LogViewerBC.properties";
      i.i = "mlvEmBC.properties";
      hp.b = new String[3];
      hp.b[0] = "C:\\Program Files (x86)\\EFIAnalytics\\BigStuffLog\\BigStuffLog.exe";
      hp.b[1] = "C:\\Program Files(x86)\\EFIAnalytics\\BigStuffLog\\BigStuffLog.exe";
      hp.b[2] = "C:\\Program Files\\EFIAnalytics\\BigStuffLog\\BigStuffLog.exe";
      a.D = "http://www.bigcommpro.com/software/megalog";
      g.a = "FieldMaps/BigStuffReplay.properties";
      i.x = false;
      i.t = 5;
      i.u = 20;
      dl.b = true;
      t.a = "./config/ecuDef/BigStuff3-097.ecu";
      a.ce = a.bX;
      a.f = "BigStuff3";
      a.g = "BigStuff3";
      a.p = "BigStuff3 Serial Number";
      a.cf = a.bX;
      a.cb = true;
      a.a().a("Pro Single");
      aa.c = "/com/efiAnalytics/apps/ts/dashboard/default_BC.gauge";
      String[] arrayOfString1 = { i.r, i.u, i.t };
      a.do = arrayOfString1;
      a.ba = c.e;
      TriggerLoggerPanel.Q = true;
    } else if ((paramArrayOfString.length > 0 && paramArrayOfString[0].equals("BigCommGen4")) || paramString.equals("BigCommGen4.jar")) {
      a.b = a.at;
      a.a();
      if (a.c.contains("Beta")) {
        a.a();
        a.c = i.r + "(Beta)";
      } else {
        a.a();
        a.c = i.r;
      } 
      a.h = "https://www.efianalytics.com/register/browseProducts.jsp?ecuFamily=BigStuff&productCategory=Software";
      a.v = "registerBC.html";
      a.w = "registerAppNotConnectedBC.html";
      aa.b = "http://www.efianalytics.com/:bsq";
      aa.c = "bsq";
      a.t = "bsproj";
      a.C = "big";
      a.cs = "csv";
      a.cB = a.cr;
      a.by = true;
      aa.b = "BigStuff_Gen4-Template.dash";
      aa.a = 7;
      a.M = "https://www.efianalytics.com/register/browseProducts.jsp?ecuFamily=BigStuff&productCategory=Upgrades";
      i.A = "./config/dashSplashBigCommGen4.png";
      i.t = 5;
      i.u = 20;
      i.aI = true;
      if (paramArrayOfString.length > 0 && paramArrayOfString[0].equals("BigComm"))
        paramArrayOfString[0] = ""; 
      hb.p = "Auto-Tune";
      aa.d = Color.BLACK;
      i.T = "withLabels";
      Gauge.s = new Color(8, 8, 8);
      Gauge.u = new Color(241, 255, 255);
      Gauge.t = new Color(37, 37, 46);
      Gauge.v = new Color(255, 44, 20);
      i.j = "LogViewerBC.properties";
      i.i = "mlvEmBC.properties";
      hp.b = new String[3];
      hp.b[0] = "C:\\Program Files (x86)\\EFIAnalytics\\BigStuffLog\\BigStuffLog.exe";
      hp.b[1] = "C:\\Program Files(x86)\\EFIAnalytics\\BigStuffLog\\BigStuffLog.exe";
      hp.b[2] = "C:\\Program Files\\EFIAnalytics\\BigStuffLog\\BigStuffLog.exe";
      a.D = "http://www.bigcommpro.com/software/megalog";
      g.a = "FieldMaps/BigStuffReplay.properties";
      i.x = false;
      dl.b = true;
      t.a = "./config/ecuDef/BigStuff3-097.ecu";
      a.ce = a.bX;
      a.f = "BigStuff Gen4";
      a.g = "BigStuff Gen4";
      a.p = "BigStuff Serial Number";
      a.cf = a.bX;
      a.cb = true;
      aa.c = "/com/efiAnalytics/apps/ts/dashboard/default_BC.gauge";
      String[] arrayOfString1 = { i.r };
      a.do = arrayOfString1;
      a.ap = "bcGen4.reg";
      a.aq = "bcGen4User.properties";
      a.ba = c.f;
      w.a((i)b.c());
      W.b = 3500;
      a.e = true;
      a.g = true;
      F.a = 100;
      a.b = "100";
      TriggerLoggerPanel.Q = true;
    } else if ((paramArrayOfString.length > 0 && paramArrayOfString[0].equals("rusEFI")) || paramString.equals("TunerStudioRE.jar")) {
      a.a();
      if (a.c.contains("Beta")) {
        a.a();
        a.c = i.j + "(Beta)";
      } else {
        a.a();
        a.c = i.r;
      } 
      String[] arrayOfString1 = { i.j, i.k, i.l };
      a.do = arrayOfString1;
      a.ap = "tsRE.reg";
      a.aq = "tsReUser.properties";
      a.f = "rusEFI";
      a.g = "rusefi";
      i.j = "LogViewer.properties";
      i.i = "mlvReEm.properties";
      i.A = "./config/dashSplashRE.png";
      a.ba = c.e;
    } else {
      a.f = "MegaSquirt";
      a.g = "megasquirt";
      i.j = "LogViewer.properties";
      i.i = "mlvEm.properties";
      i.A = "./config/dashSplash.png";
      a.ba = c.e;
    } 
    b.a((b)new y());
    if (arrayOfString != null && arrayOfString.length > 1)
      f.a().a(arrayOfString); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/bz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */