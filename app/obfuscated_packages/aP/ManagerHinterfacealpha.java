package aP;

import G.R;
import G.SerializableImplUsingArrayList;
import G.ArrayListExceptionprintstacktraceInGPackage;
import H.HInterfaceAlpha;
import K.HInterfaceAlpha;
import K.KInterfaceIndia;
import V.ExceptionPrintstacktrace;
import W.J;
import W.ManagerUsingFile;
import bi.HInterfaceAlpha;
import bi.ExceptionPrintstacktrace;
import bj.HInterfaceAlpha;
import bk.HInterfaceAlpha;
import bk.ManagerPaint;
import bp.HInterfaceAlpha;
import bt.ManagerPaint;
import com.efiAnalytics.tunerStudio.panels.H;
import com.efiAnalytics.tuningwidgets.panels.aF;
import com.efiAnalytics.tuningwidgets.panels.az;
import com.efiAnalytics.ui.aO;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.dF;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Window;
import java.io.File;
import javax.swing.JDialog;
import javax.swing.JPanel;
import n.JPanelExtensionInNPackage;
import r.HInterfaceAlpha;
import r.KInterfaceIndia;
import r.ThreadedFile;
import s.ExceptionPrintstacktrace;

public class ManagerHinterfacealpha {
  private static iL HInterfaceAlpha = null;
  
  public static iL HInterfaceAlpha() {
    if (HInterfaceAlpha == null)
      HInterfaceAlpha = new iL(); 
    return HInterfaceAlpha;
  }
  
  public boolean HInterfaceAlpha(Frame paramFrame, R paramR, String paramString1, String paramString2) {
    if (paramString1.equals("std_constants")) {
      int KInterfaceIndia = Integer.parseInt(paramString2);
      az az = new az(paramR, KInterfaceIndia);
      HInterfaceAlpha((ManagerPaint)az, paramR, paramFrame, "Standard Constants - Page " + paramString2, (aO)az);
      return true;
    } 
    if (paramString1.equals("std_injection")) {
      int KInterfaceIndia = Integer.parseInt(paramString2);
      aF aF = new aF(paramR);
      HInterfaceAlpha((ManagerPaint)aF, paramR, paramFrame, "Standard Injection", (aO)aF);
      return true;
    } 
    if (paramString1.equals("std_realtime")) {
      H h = new H(paramR);
      h.HInterfaceAlpha(paramFrame, "Real-Time Display", (bc)h);
      return true;
    } 
    if (paramString1.equals("std_warmup")) {
      int KInterfaceIndia = Integer.parseInt(paramString2);
      KInterfaceIndia i1 = new KInterfaceIndia(paramR, KInterfaceIndia);
      f.HInterfaceAlpha().HInterfaceAlpha(paramR, (ArrayListExceptionprintstacktraceInGPackage)i1, paramFrame);
      return true;
    } 
    if (paramString1.equals("std_accel")) {
      int KInterfaceIndia = Integer.parseInt(paramString2);
      boolean bool = KInterfaceIndia.HInterfaceAlpha().HInterfaceAlpha("0532fewkjfewpoijrew98");
      HInterfaceAlpha HInterfaceAlpha = new HInterfaceAlpha(paramR, KInterfaceIndia, bool);
      f.HInterfaceAlpha().HInterfaceAlpha(paramR, (ArrayListExceptionprintstacktraceInGPackage)HInterfaceAlpha, paramFrame);
      return true;
    } 
    if (paramString1.equals("std_ms2gentherm")) {
      HInterfaceAlpha(paramR, paramFrame);
      ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage = paramR.e().c("std_ms2gentherm");
      f.HInterfaceAlpha().HInterfaceAlpha(paramR, (SerializableImplUsingArrayList)ArrayListExceptionprintstacktraceInGPackage, paramFrame);
      return true;
    } 
    if (paramString1.equals("std_ms2geno2")) {
      HInterfaceAlpha(paramR, paramFrame);
      ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage = paramR.e().c("std_ms2geno2");
      f.HInterfaceAlpha().HInterfaceAlpha(paramR, (SerializableImplUsingArrayList)ArrayListExceptionprintstacktraceInGPackage, paramFrame);
      return true;
    } 
    if (paramString1.equals("std_port_edit")) {
      JPanelExtensionInNPackage(paramR, paramFrame);
      ArrayListExceptionprintstacktraceInGPackage ArrayListExceptionprintstacktraceInGPackage = paramR.e().c("std_port_edit");
      ArrayListExceptionprintstacktraceInGPackage.ExceptionPrintstacktrace(true);
      f.HInterfaceAlpha().HInterfaceAlpha(paramR, ArrayListExceptionprintstacktraceInGPackage, paramFrame);
      return true;
    } 
    if (paramString1.equals("std_trigwiz")) {
      HInterfaceAlpha HInterfaceAlpha = new HInterfaceAlpha(paramR);
      HInterfaceAlpha((ManagerPaint)HInterfaceAlpha, paramR, paramFrame, "Trigger Wizard", (aO)HInterfaceAlpha);
      return true;
    } 
    if (paramString1.equals("std_ms3Rtc")) {
      HInterfaceAlpha HInterfaceAlpha = new HInterfaceAlpha(paramR);
      bV.HInterfaceAlpha((Component)HInterfaceAlpha, paramFrame, "MS3 Real-Time Clock", (bc)HInterfaceAlpha);
      return true;
    } 
    if (paramString1.equals("std_ms3SdConsole")) {
      ManagerPaint ManagerPaint = new ManagerPaint(paramR);
      JDialog jDialog = bV.JPanelExtensionInNPackage((Component)ManagerPaint, paramFrame, "MS3 SD Console", (bc)ManagerPaint);
      jDialog.pack();
      bV.HInterfaceAlpha(bV.HInterfaceAlpha(paramFrame), jDialog);
      jDialog.addWindowListener(new iM(this, ManagerPaint));
      jDialog.setModal(true);
      jDialog.setVisible(true);
      return true;
    } 
    if (paramString1.equals("std_ftpSdBrowser")) {
      HInterfaceAlpha HInterfaceAlpha = new HInterfaceAlpha(paramR, null);
      JDialog jDialog = bV.JPanelExtensionInNPackage((Component)HInterfaceAlpha, paramFrame, "SD Log Browser", (bc)HInterfaceAlpha);
      jDialog.pack();
      bV.HInterfaceAlpha(bV.HInterfaceAlpha(paramFrame), jDialog);
      jDialog.addWindowListener(new iN(this, HInterfaceAlpha));
      jDialog.setVisible(true);
      return true;
    } 
    if (paramString1.equals("std_replay_upload")) {
      if (paramR.R()) {
        HInterfaceAlpha HInterfaceAlpha = new HInterfaceAlpha(paramR);
        HInterfaceAlpha.HInterfaceAlpha(paramFrame, "Replay Upload");
      } else if (System.currentTimeMillis() - HInterfaceAlpha.HInterfaceAlpha() < 5000L) {
        String str = ExceptionPrintstacktrace.JPanelExtensionInNPackage("BigComm Pro must be online!");
        str = str + "\n";
        str = str + ExceptionPrintstacktrace.JPanelExtensionInNPackage("Please turn the Key to the on position and make sure BigComm Pro is online.");
        bV.ManagerPaint(str, paramFrame);
      } else {
        String str = ExceptionPrintstacktrace.JPanelExtensionInNPackage("BigComm Pro must be online!");
        str = str + "\n";
        str = str + ExceptionPrintstacktrace.JPanelExtensionInNPackage("Please connect to your BigStuff 3 with the Key On.");
        bV.ManagerPaint(str, paramFrame);
      } 
      return true;
    } 
    if (paramString1.equals("std_bootstrap")) {
      ExceptionPrintstacktrace ExceptionPrintstacktrace = new ExceptionPrintstacktrace(paramR);
      bV.HInterfaceAlpha((Component)ExceptionPrintstacktrace, paramFrame, "Bootstrap", null);
      return true;
    } 
    if (paramString1.equals("std_tpscal")) {
      aG aG = new aG();
      aG.HInterfaceAlpha(paramR);
      aG.HInterfaceAlpha(paramFrame);
      return true;
    } 
    return false;
  }
  
  public void HInterfaceAlpha(ManagerPaint paramd, R paramR, Window paramWindow, String paramString, aO paramaO) {
    dF dF = new dF(paramWindow, ExceptionPrintstacktrace.JPanelExtensionInNPackage(paramString), paramaO);
    dF.add("Center", (Component)paramd);
    JPanelExtensionInNPackage JPanelExtensionInNPackage = new JPanelExtensionInNPackage();
    JPanelExtensionInNPackage.HInterfaceAlpha(paramaO);
    JPanel jPanel = new JPanel();
    FlowLayout flowLayout = new FlowLayout();
    flowLayout.setAlignment(2);
    jPanel.setLayout(flowLayout);
    jPanel.add((Component)JPanelExtensionInNPackage);
    dF.add("South", jPanel);
    paramR.p().HInterfaceAlpha(new iO(this, JPanelExtensionInNPackage));
    paramd.HInterfaceAlpha((bc)dF);
    dF.pack();
    dF.setResizable(false);
    bV.HInterfaceAlpha(paramWindow, (Component)dF);
    dF.setVisible(true);
  }
  
  public void HInterfaceAlpha(R paramR, Frame paramFrame) {
    String str = ThreadedFile.I() + File.separator + "ms2ReferenceTables.ini";
    File file = new File(str);
    if (!file.exists()) {
      str = ThreadedFile.k;
      file = new File(str);
    } 
    J ThreadedFile = new J();
    try {
      ThreadedFile.HInterfaceAlpha(file);
    } catch (Exception exception) {
      bV.ManagerPaint("Error reading  " + str + "\n" + exception.getMessage(), paramFrame);
    } 
    try {
      boolean bool = (HInterfaceAlpha.HInterfaceAlpha().c(HInterfaceAlpha.bq, HInterfaceAlpha.br) && HInterfaceAlpha.HInterfaceAlpha().c(HInterfaceAlpha.bs, HInterfaceAlpha.bt)) ? true : false;
      if (!bool) {
        ManagerUsingFile ManagerUsingFile = new ManagerUsingFile();
        ManagerUsingFile.HInterfaceAlpha(paramR, paramR.e(), ThreadedFile);
      } 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      bV.ManagerPaint(ExceptionPrintstacktrace.getMessage(), paramFrame);
    } 
  }
  
  public void JPanelExtensionInNPackage(R paramR, Frame paramFrame) {
    String str = ThreadedFile.l;
    J ThreadedFile = new J();
    try {
      ThreadedFile.HInterfaceAlpha(new File(str));
    } catch (Exception exception) {
      bV.ManagerPaint("Error reading  " + str + "\n" + exception.getMessage(), paramFrame);
    } 
    try {
      boolean bool = (HInterfaceAlpha.HInterfaceAlpha().c(HInterfaceAlpha.bq, HInterfaceAlpha.br) && HInterfaceAlpha.HInterfaceAlpha().c(HInterfaceAlpha.bs, HInterfaceAlpha.bt)) ? true : false;
      if (!bool) {
        ManagerUsingFile ManagerUsingFile = new ManagerUsingFile();
        ManagerUsingFile.JPanelExtensionInNPackage(paramR, paramR.e(), ThreadedFile);
      } 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      bV.ManagerPaint(ExceptionPrintstacktrace.getMessage(), paramFrame);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/iL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */