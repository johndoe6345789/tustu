package aP;

import G.R;
import G.aX;
import G.bv;
import H.a;
import K.a;
import K.i;
import V.g;
import W.J;
import W.ab;
import bi.a;
import bi.g;
import bj.a;
import bk.a;
import bk.d;
import bp.a;
import bt.d;
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
import n.b;
import r.a;
import r.i;
import r.j;
import s.g;

public class iL {
  private static iL a = null;
  
  public static iL a() {
    if (a == null)
      a = new iL(); 
    return a;
  }
  
  public boolean a(Frame paramFrame, R paramR, String paramString1, String paramString2) {
    if (paramString1.equals("std_constants")) {
      int i = Integer.parseInt(paramString2);
      az az = new az(paramR, i);
      a((d)az, paramR, paramFrame, "Standard Constants - Page " + paramString2, (aO)az);
      return true;
    } 
    if (paramString1.equals("std_injection")) {
      int i = Integer.parseInt(paramString2);
      aF aF = new aF(paramR);
      a((d)aF, paramR, paramFrame, "Standard Injection", (aO)aF);
      return true;
    } 
    if (paramString1.equals("std_realtime")) {
      H h = new H(paramR);
      h.a(paramFrame, "Real-Time Display", (bc)h);
      return true;
    } 
    if (paramString1.equals("std_warmup")) {
      int i = Integer.parseInt(paramString2);
      i i1 = new i(paramR, i);
      f.a().a(paramR, (bv)i1, paramFrame);
      return true;
    } 
    if (paramString1.equals("std_accel")) {
      int i = Integer.parseInt(paramString2);
      boolean bool = i.a().a("0532fewkjfewpoijrew98");
      a a = new a(paramR, i, bool);
      f.a().a(paramR, (bv)a, paramFrame);
      return true;
    } 
    if (paramString1.equals("std_ms2gentherm")) {
      a(paramR, paramFrame);
      bv bv = paramR.e().c("std_ms2gentherm");
      f.a().a(paramR, (aX)bv, paramFrame);
      return true;
    } 
    if (paramString1.equals("std_ms2geno2")) {
      a(paramR, paramFrame);
      bv bv = paramR.e().c("std_ms2geno2");
      f.a().a(paramR, (aX)bv, paramFrame);
      return true;
    } 
    if (paramString1.equals("std_port_edit")) {
      b(paramR, paramFrame);
      bv bv = paramR.e().c("std_port_edit");
      bv.g(true);
      f.a().a(paramR, bv, paramFrame);
      return true;
    } 
    if (paramString1.equals("std_trigwiz")) {
      a a = new a(paramR);
      a((d)a, paramR, paramFrame, "Trigger Wizard", (aO)a);
      return true;
    } 
    if (paramString1.equals("std_ms3Rtc")) {
      a a = new a(paramR);
      bV.a((Component)a, paramFrame, "MS3 Real-Time Clock", (bc)a);
      return true;
    } 
    if (paramString1.equals("std_ms3SdConsole")) {
      d d = new d(paramR);
      JDialog jDialog = bV.b((Component)d, paramFrame, "MS3 SD Console", (bc)d);
      jDialog.pack();
      bV.a(bV.a(paramFrame), jDialog);
      jDialog.addWindowListener(new iM(this, d));
      jDialog.setModal(true);
      jDialog.setVisible(true);
      return true;
    } 
    if (paramString1.equals("std_ftpSdBrowser")) {
      a a = new a(paramR, null);
      JDialog jDialog = bV.b((Component)a, paramFrame, "SD Log Browser", (bc)a);
      jDialog.pack();
      bV.a(bV.a(paramFrame), jDialog);
      jDialog.addWindowListener(new iN(this, a));
      jDialog.setVisible(true);
      return true;
    } 
    if (paramString1.equals("std_replay_upload")) {
      if (paramR.R()) {
        a a = new a(paramR);
        a.a(paramFrame, "Replay Upload");
      } else if (System.currentTimeMillis() - a.a() < 5000L) {
        String str = g.b("BigComm Pro must be online!");
        str = str + "\n";
        str = str + g.b("Please turn the Key to the on position and make sure BigComm Pro is online.");
        bV.d(str, paramFrame);
      } else {
        String str = g.b("BigComm Pro must be online!");
        str = str + "\n";
        str = str + g.b("Please connect to your BigStuff 3 with the Key On.");
        bV.d(str, paramFrame);
      } 
      return true;
    } 
    if (paramString1.equals("std_bootstrap")) {
      g g = new g(paramR);
      bV.a((Component)g, paramFrame, "Bootstrap", null);
      return true;
    } 
    if (paramString1.equals("std_tpscal")) {
      aG aG = new aG();
      aG.a(paramR);
      aG.a(paramFrame);
      return true;
    } 
    return false;
  }
  
  public void a(d paramd, R paramR, Window paramWindow, String paramString, aO paramaO) {
    dF dF = new dF(paramWindow, g.b(paramString), paramaO);
    dF.add("Center", (Component)paramd);
    b b = new b();
    b.a(paramaO);
    JPanel jPanel = new JPanel();
    FlowLayout flowLayout = new FlowLayout();
    flowLayout.setAlignment(2);
    jPanel.setLayout(flowLayout);
    jPanel.add((Component)b);
    dF.add("South", jPanel);
    paramR.p().a(new iO(this, b));
    paramd.a((bc)dF);
    dF.pack();
    dF.setResizable(false);
    bV.a(paramWindow, (Component)dF);
    dF.setVisible(true);
  }
  
  public void a(R paramR, Frame paramFrame) {
    String str = j.I() + File.separator + "ms2ReferenceTables.ini";
    File file = new File(str);
    if (!file.exists()) {
      str = j.k;
      file = new File(str);
    } 
    J j = new J();
    try {
      j.a(file);
    } catch (Exception exception) {
      bV.d("Error reading  " + str + "\n" + exception.getMessage(), paramFrame);
    } 
    try {
      boolean bool = (a.a().c(a.bq, a.br) && a.a().c(a.bs, a.bt)) ? true : false;
      if (!bool) {
        ab ab = new ab();
        ab.a(paramR, paramR.e(), j);
      } 
    } catch (g g) {
      bV.d(g.getMessage(), paramFrame);
    } 
  }
  
  public void b(R paramR, Frame paramFrame) {
    String str = j.l;
    J j = new J();
    try {
      j.a(new File(str));
    } catch (Exception exception) {
      bV.d("Error reading  " + str + "\n" + exception.getMessage(), paramFrame);
    } 
    try {
      boolean bool = (a.a().c(a.bq, a.br) && a.a().c(a.bs, a.bt)) ? true : false;
      if (!bool) {
        ab ab = new ab();
        ab.b(paramR, paramR.e(), j);
      } 
    } catch (g g) {
      bV.d(g.getMessage(), paramFrame);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/iL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */