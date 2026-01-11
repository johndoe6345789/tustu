package aP;

import A.AInterfaceIndia;
import B.BInterfaceBravo;
import G.F;
import W.aa;
import W.t;
import aD.IOInAdPackage;
import aE.IOInAdPackage;
import aV.AvInterfaceWhiskey;
import bB.BInterfaceBravo;
import bH.W;
import bh.BhInterfaceYankee;
import com.efiAnalytics.apps.ts.dashboard.Gauge;
import com.efiAnalytics.apps.ts.dashboard.aa;
import com.efiAnalytics.tunerStudio.panels.TriggerLoggerPanel;
import PropertiesExtensionInHPackage.BInterfaceBravo;
import h.PropertiesExtensionInHPackage;
import h.AInterfaceIndia;
import java.awt.Color;
import r.IOInAdPackage;
import r.AInterfaceIndia;
import z.ArrayListInZPackage;

public class bz {
  public void IOInAdPackage(String[] paramArrayOfString, String paramString) {
    IOInAdPackage.AInterfaceIndia = paramString;
    String[] arrayOfString = null;
    if (paramArrayOfString.length > 0 && paramArrayOfString[0].equals("encryptFile")) {
      arrayOfString = new String[paramArrayOfString.length];
      System.arraycopy(paramArrayOfString, 0, arrayOfString, 0, paramArrayOfString.length);
    } 
    (new bA(this)).start();
    if ((paramArrayOfString.length > 0 && paramArrayOfString[0].equals("QJ")) || paramString.equals("TunerStudioQJ.jar")) {
      IOInAdPackage.IOInAdPackage();
      IOInAdPackage.ArrayListInZPackage = "QJ";
      if (paramArrayOfString.length > 0 && paramArrayOfString[0].equals("QJ"))
        paramArrayOfString[0] = ""; 
    } else if ((paramArrayOfString.length > 0 && paramArrayOfString[0].equals("TuneMonster")) || paramString.equals("TuneMonsterEFI.jar")) {
      IOInAdPackage.BInterfaceBravo = IOInAdPackage.av;
      IOInAdPackage.IOInAdPackage();
      IOInAdPackage.ArrayListInZPackage = "EFI";
      IOInAdPackage.h = "https://www.efianalytics.com/register/register.jsp?appName=TuneMonster";
      if (paramArrayOfString.length > 0 && paramArrayOfString[0].equals("TuneMonster"))
        paramArrayOfString[0] = ""; 
      hb.p = "Auto Tune";
      String[] arrayOfString1 = { AInterfaceIndia.m };
      IOInAdPackage.do = arrayOfString1;
      IOInAdPackage.cP = true;
      IOInAdPackage.ba = ArrayListInZPackage.e;
      IOInAdPackage.be = false;
    } else if ((paramArrayOfString.length > 0 && paramArrayOfString[0].equals("FuelMonster")) || paramString.equals("FuelMonsterTuner.jar")) {
      IOInAdPackage.BInterfaceBravo = IOInAdPackage.aw;
      IOInAdPackage.IOInAdPackage();
      IOInAdPackage.ArrayListInZPackage = "Tuner";
      IOInAdPackage.h = "https://www.efianalytics.com/register/register.jsp?appName=FuelMonster";
      if (paramArrayOfString.length > 0 && paramArrayOfString[0].equals("FuelMonster"))
        paramArrayOfString[0] = ""; 
      hb.p = "Auto Tune";
      String[] arrayOfString1 = { AInterfaceIndia.n };
      IOInAdPackage.cP = true;
      IOInAdPackage.do = arrayOfString1;
      IOInAdPackage.ba = ArrayListInZPackage.e;
      IOInAdPackage.be = false;
    } else if ((paramArrayOfString.length > 0 && paramArrayOfString[0].equals("GrassRoots")) || paramString.equals("GrassRootsTuner.jar")) {
      IOInAdPackage.BInterfaceBravo = IOInAdPackage.au;
      IOInAdPackage.IOInAdPackage();
      IOInAdPackage.ArrayListInZPackage = "Tuner";
      IOInAdPackage.h = "https://www.efianalytics.com/register/register.jsp?appName=GrassRootsTuner";
      IOInAdPackage.v = "registerGr.html";
      IOInAdPackage.AvInterfaceWhiskey = "registerAppNotConnectedGr.html";
      if (paramArrayOfString.length > 0 && paramArrayOfString[0].equals("GrassRoots"))
        paramArrayOfString[0] = ""; 
      hb.p = "Auto Tune";
    } else if ((paramArrayOfString.length > 0 && paramArrayOfString[0].equals("BigComm")) || paramString.equals("BigCommPro.jar")) {
      IOInAdPackage.BInterfaceBravo = IOInAdPackage.as;
      IOInAdPackage.IOInAdPackage();
      if (IOInAdPackage.ArrayListInZPackage.contains("Beta")) {
        IOInAdPackage.IOInAdPackage();
        IOInAdPackage.ArrayListInZPackage = "Pro(Beta)";
      } else {
        IOInAdPackage.IOInAdPackage();
        IOInAdPackage.ArrayListInZPackage = "Pro";
      } 
      IOInAdPackage.h = "https://www.efianalytics.com/register/browseProducts.jsp?ecuFamily=BigStuff&productCategory=Software";
      IOInAdPackage.v = "registerBC.html";
      IOInAdPackage.AvInterfaceWhiskey = "registerAppNotConnectedBC.html";
      aa.BInterfaceBravo = "http://www.efianalytics.com/:bsq";
      aa.ArrayListInZPackage = "bsq";
      IOInAdPackage.t = "bsproj";
      IOInAdPackage.C = "big";
      IOInAdPackage.cs = "csv";
      IOInAdPackage.cB = IOInAdPackage.cr;
      aa.BInterfaceBravo = "BigStuff-Template.dash";
      aa.IOInAdPackage = 7;
      IOInAdPackage.M = "https://www.efianalytics.com/register/browseProducts.jsp?ecuFamily=BigStuff&productCategory=Upgrades";
      AInterfaceIndia.A = "./config/dashSplashBigComm.png";
      if (paramArrayOfString.length > 0 && paramArrayOfString[0].equals("BigComm"))
        paramArrayOfString[0] = ""; 
      hb.p = "Auto-Tune";
      aa.d = Color.BLACK;
      AInterfaceIndia.T = "withLabels";
      IOInAdPackage.ArrayListInZPackage = "9600";
      Gauge.s = new Color(8, 8, 8);
      Gauge.u = new Color(241, 255, 255);
      Gauge.t = new Color(37, 37, 46);
      Gauge.v = new Color(255, 44, 20);
      AInterfaceIndia.j = "LogViewerBC.properties";
      AInterfaceIndia.AInterfaceIndia = "mlvEmBC.properties";
      hp.BInterfaceBravo = new String[3];
      hp.BInterfaceBravo[0] = "C:\\Program Files (x86)\\EFIAnalytics\\BigStuffLog\\BigStuffLog.exe";
      hp.BInterfaceBravo[1] = "C:\\Program Files(x86)\\EFIAnalytics\\BigStuffLog\\BigStuffLog.exe";
      hp.BInterfaceBravo[2] = "C:\\Program Files\\EFIAnalytics\\BigStuffLog\\BigStuffLog.exe";
      IOInAdPackage.D = "http://www.bigcommpro.com/software/megalog";
      PropertiesExtensionInHPackage.IOInAdPackage = "FieldMaps/BigStuffReplay.properties";
      AInterfaceIndia.x = false;
      AInterfaceIndia.t = 5;
      AInterfaceIndia.u = 20;
      dl.BInterfaceBravo = true;
      t.IOInAdPackage = "./config/ecuDef/BigStuff3-097.ecu";
      IOInAdPackage.ce = IOInAdPackage.bX;
      IOInAdPackage.f = "BigStuff3";
      IOInAdPackage.PropertiesExtensionInHPackage = "BigStuff3";
      IOInAdPackage.p = "BigStuff3 Serial Number";
      IOInAdPackage.cf = IOInAdPackage.bX;
      IOInAdPackage.cb = true;
      IOInAdPackage.IOInAdPackage().IOInAdPackage("Pro Single");
      aa.ArrayListInZPackage = "/com/efiAnalytics/apps/ts/dashboard/default_BC.gauge";
      String[] arrayOfString1 = { AInterfaceIndia.r, AInterfaceIndia.u, AInterfaceIndia.t };
      IOInAdPackage.do = arrayOfString1;
      IOInAdPackage.ba = ArrayListInZPackage.e;
      TriggerLoggerPanel.Q = true;
    } else if ((paramArrayOfString.length > 0 && paramArrayOfString[0].equals("BigCommGen4")) || paramString.equals("BigCommGen4.jar")) {
      IOInAdPackage.BInterfaceBravo = IOInAdPackage.at;
      IOInAdPackage.IOInAdPackage();
      if (IOInAdPackage.ArrayListInZPackage.contains("Beta")) {
        IOInAdPackage.IOInAdPackage();
        IOInAdPackage.ArrayListInZPackage = AInterfaceIndia.r + "(Beta)";
      } else {
        IOInAdPackage.IOInAdPackage();
        IOInAdPackage.ArrayListInZPackage = AInterfaceIndia.r;
      } 
      IOInAdPackage.h = "https://www.efianalytics.com/register/browseProducts.jsp?ecuFamily=BigStuff&productCategory=Software";
      IOInAdPackage.v = "registerBC.html";
      IOInAdPackage.AvInterfaceWhiskey = "registerAppNotConnectedBC.html";
      aa.BInterfaceBravo = "http://www.efianalytics.com/:bsq";
      aa.ArrayListInZPackage = "bsq";
      IOInAdPackage.t = "bsproj";
      IOInAdPackage.C = "big";
      IOInAdPackage.cs = "csv";
      IOInAdPackage.cB = IOInAdPackage.cr;
      IOInAdPackage.by = true;
      aa.BInterfaceBravo = "BigStuff_Gen4-Template.dash";
      aa.IOInAdPackage = 7;
      IOInAdPackage.M = "https://www.efianalytics.com/register/browseProducts.jsp?ecuFamily=BigStuff&productCategory=Upgrades";
      AInterfaceIndia.A = "./config/dashSplashBigCommGen4.png";
      AInterfaceIndia.t = 5;
      AInterfaceIndia.u = 20;
      AInterfaceIndia.aI = true;
      if (paramArrayOfString.length > 0 && paramArrayOfString[0].equals("BigComm"))
        paramArrayOfString[0] = ""; 
      hb.p = "Auto-Tune";
      aa.d = Color.BLACK;
      AInterfaceIndia.T = "withLabels";
      Gauge.s = new Color(8, 8, 8);
      Gauge.u = new Color(241, 255, 255);
      Gauge.t = new Color(37, 37, 46);
      Gauge.v = new Color(255, 44, 20);
      AInterfaceIndia.j = "LogViewerBC.properties";
      AInterfaceIndia.AInterfaceIndia = "mlvEmBC.properties";
      hp.BInterfaceBravo = new String[3];
      hp.BInterfaceBravo[0] = "C:\\Program Files (x86)\\EFIAnalytics\\BigStuffLog\\BigStuffLog.exe";
      hp.BInterfaceBravo[1] = "C:\\Program Files(x86)\\EFIAnalytics\\BigStuffLog\\BigStuffLog.exe";
      hp.BInterfaceBravo[2] = "C:\\Program Files\\EFIAnalytics\\BigStuffLog\\BigStuffLog.exe";
      IOInAdPackage.D = "http://www.bigcommpro.com/software/megalog";
      PropertiesExtensionInHPackage.IOInAdPackage = "FieldMaps/BigStuffReplay.properties";
      AInterfaceIndia.x = false;
      dl.BInterfaceBravo = true;
      t.IOInAdPackage = "./config/ecuDef/BigStuff3-097.ecu";
      IOInAdPackage.ce = IOInAdPackage.bX;
      IOInAdPackage.f = "BigStuff Gen4";
      IOInAdPackage.PropertiesExtensionInHPackage = "BigStuff Gen4";
      IOInAdPackage.p = "BigStuff Serial Number";
      IOInAdPackage.cf = IOInAdPackage.bX;
      IOInAdPackage.cb = true;
      aa.ArrayListInZPackage = "/com/efiAnalytics/apps/ts/dashboard/default_BC.gauge";
      String[] arrayOfString1 = { AInterfaceIndia.r };
      IOInAdPackage.do = arrayOfString1;
      IOInAdPackage.ap = "bcGen4.reg";
      IOInAdPackage.aq = "bcGen4User.properties";
      IOInAdPackage.ba = ArrayListInZPackage.f;
      AvInterfaceWhiskey.IOInAdPackage((AInterfaceIndia)BInterfaceBravo.ArrayListInZPackage());
      W.BInterfaceBravo = 3500;
      IOInAdPackage.e = true;
      IOInAdPackage.PropertiesExtensionInHPackage = true;
      F.IOInAdPackage = 100;
      IOInAdPackage.BInterfaceBravo = "100";
      TriggerLoggerPanel.Q = true;
    } else if ((paramArrayOfString.length > 0 && paramArrayOfString[0].equals("rusEFI")) || paramString.equals("TunerStudioRE.jar")) {
      IOInAdPackage.IOInAdPackage();
      if (IOInAdPackage.ArrayListInZPackage.contains("Beta")) {
        IOInAdPackage.IOInAdPackage();
        IOInAdPackage.ArrayListInZPackage = AInterfaceIndia.j + "(Beta)";
      } else {
        IOInAdPackage.IOInAdPackage();
        IOInAdPackage.ArrayListInZPackage = AInterfaceIndia.r;
      } 
      String[] arrayOfString1 = { AInterfaceIndia.j, AInterfaceIndia.k, AInterfaceIndia.l };
      IOInAdPackage.do = arrayOfString1;
      IOInAdPackage.ap = "tsRE.reg";
      IOInAdPackage.aq = "tsReUser.properties";
      IOInAdPackage.f = "rusEFI";
      IOInAdPackage.PropertiesExtensionInHPackage = "rusefi";
      AInterfaceIndia.j = "LogViewer.properties";
      AInterfaceIndia.AInterfaceIndia = "mlvReEm.properties";
      AInterfaceIndia.A = "./config/dashSplashRE.png";
      IOInAdPackage.ba = ArrayListInZPackage.e;
    } else {
      IOInAdPackage.f = "MegaSquirt";
      IOInAdPackage.PropertiesExtensionInHPackage = "megasquirt";
      AInterfaceIndia.j = "LogViewer.properties";
      AInterfaceIndia.AInterfaceIndia = "mlvEm.properties";
      AInterfaceIndia.A = "./config/dashSplash.png";
      IOInAdPackage.ba = ArrayListInZPackage.e;
    } 
    BInterfaceBravo.IOInAdPackage((BInterfaceBravo)new BhInterfaceYankee());
    if (arrayOfString != null && arrayOfString.length > 1)
      f.IOInAdPackage().IOInAdPackage(arrayOfString); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/bz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */