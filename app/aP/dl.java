package aP;

import C.f;
import G.R;
import G.S;
import G.T;
import G.aG;
import G.bM;
import G.bT;
import V.a;
import W.ab;
import aE.a;
import aQ.a;
import az.c;
import az.d;
import az.o;
import az.t;
import bH.A;
import bH.C;
import bH.D;
import bH.J;
import bH.P;
import bH.U;
import bH.X;
import bH.ae;
import bH.b;
import bH.n;
import bH.t;
import bI.f;
import bI.h;
import bV.a;
import bV.d;
import bV.e;
import com.efiAnalytics.ui.aN;
import com.efiAnalytics.ui.bU;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cS;
import com.efiAnalytics.ui.dI;
import com.efiAnalytics.ui.dS;
import f.d;
import h.i;
import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.KeyboardFocusManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.ToolTipManager;
import r.a;
import r.i;
import r.j;
import s.g;

public class dl extends JFrame implements S, aG, aX, b, WindowListener {
  long a = 604800000L;
  
  private dB d = null;
  
  private cb e = cb.a();
  
  public static boolean b = false;
  
  private static String f = i.c;
  
  private static String g = i.b;
  
  private boolean h = false;
  
  private boolean i = false;
  
  boolean c = false;
  
  public dl() {
    this(true);
  }
  
  public dl(boolean paramBoolean) {
    cS cS = cS.a((C)new dy(this));
    cS.c = 800;
    bV.a((bU)a.a());
    cS.c += 700;
    t t = new t();
    h.a().a((f)t);
    dd.a().a(this);
    cS.c += 466;
    y();
    (A.i()).c = cS.c;
    A.i().a(true);
    String str1 = a.a().c(a.cF, "");
    hO hO = new hO(this);
    boolean bool1 = a.a().c(a.J, false);
    String str2 = X.b(a.c, g, "");
    boolean bool2 = x();
    if (bool2)
      o.a(true); 
    if (!bool1 && cS.a(str1)) {
      this.h = u();
      if (!this.h) {
        a.a().d(a.j, "");
        try {
          a.a().i();
        } catch (a a) {
          Logger.getLogger(dl.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
        } 
      } 
      str2 = a.a().c(a.n, a.c);
      boolean bool = i.a().a(a.b, str2);
      if (bool) {
        a.a().c(bool);
        str2 = a.a().c(a.cn, str2);
      } 
      if (this.h && a.c.contains(i.b) && !str2.contains(i.b)) {
        a.c = str2 + i.b;
      } else {
        a.c = str2;
      } 
    } else {
      this.h = false;
    } 
    if (!this.h) {
      a.c += f;
      bF.a().a(a.b, a.c);
    } else {
      bF.a().a(a.b, str2);
    } 
    c();
    jN.a();
    if (a.a().c(a.y, false)) {
      dg.a().a(true);
    } else if (!a.a().c(a.bP, a.bQ) && !dg.a().b()) {
      System.exit(0);
    } 
    if (paramBoolean)
      g(); 
    if (a.b.equals(a.av) || a.b.equals(a.aw)) {
      Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/MTicon.png"));
      setIconImage(image);
    } else if (a.b.equals(a.au)) {
      Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/GRicon32.png"));
      setIconImage(image);
    } else if (a.b.equals(a.as)) {
      Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/BigCommIcon.png"));
      setIconImage(image);
    } else if (a.b.equals(a.at)) {
      Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/BigCommGen4Icon.png"));
      setIconImage(image);
    } else {
      Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/TSicon.gif"));
      setIconImage(image);
    } 
    jN.a();
    int i = a.a().a(a.aT, 1000);
    if (i == 1000 || Math.random() < 0.1D) {
      dm dm = new dm(this);
      dm.start();
    } 
    if (bV.d()) {
      a.class.getClass();
      Window window = a.a();
    } 
    if (bool2) {
      hq.a().a("Finishing Upgrade....");
      Thread.yield();
      A();
      z();
      f();
      a.a().b(a.aR, "" + (System.currentTimeMillis() - this.a - 1000L));
      a.a().b(a.aS, "" + (System.currentTimeMillis() - 1000L));
      try {
        a.a().e();
      } catch (a a) {
        D.a("Error saving preference file.", (Exception)a, this);
      } 
      if (J.f()) {
        File file1 = new File(".", "environment.txt");
        File file2 = new File(".", "runtime");
        if (!file2.isDirectory()) {
          D.d("Running on XP, but cannot switch JRE as there is no runtime dir.");
        } else {
          D.d("Running on XP, switching JRE");
          if (!file1.exists()) {
            D.d("environment.txt missing, creating");
          } else if (!file1.delete()) {
            D.b("Failed to delete environment.txt");
          } else {
            try {
              file1.createNewFile();
              BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));
              bufferedWriter.append("-Xms128m -Xmx512m -cp .;./plugins/;./runtime/lib/*;./lib/*.jar -Djava.home=./runtime -Djava.library.path=./lib -jar ");
              bufferedWriter.append(a.i);
              bufferedWriter.newLine();
              bufferedWriter.append("runtime");
              bufferedWriter.newLine();
              bufferedWriter.append(a.i);
              bufferedWriter.newLine();
              bufferedWriter.flush();
              bufferedWriter.close();
            } catch (IOException iOException) {
              D.a(iOException);
            } 
          } 
        } 
      } 
    } 
    d();
    hO.b();
    hO.start();
    setTitle("");
    addWindowListener(this);
    hq.a().a("Initializing User Interface");
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    int j = a.a().c("x", 100);
    if (j > dimension.width && !bV.h())
      j = 100; 
    int k = a.a().c("y", 50);
    int m = a.a().c("width", dimension.width - 200);
    int n = a.a().c("height", dimension.height - 100);
    ToolTipManager.sharedInstance().setEnabled(true);
    hb hb = new hb();
    T.a().a(hb);
    add("Center", hb);
    boolean bool3 = (!this.h && !i.a().a("surpressAds")) ? true : false;
    iW iW = new iW(bool3);
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout(5, 5));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(1, 1));
    jPanel1.add("North", jPanel2);
    dd.a().a(jPanel2);
    jPanel1.add("South", iW);
    add("South", jPanel1);
    this.d = new dB(this, f.a());
    dd.a().a(this.d);
    f.a().a(this.d);
    T t1 = T.a();
    t1.a(this);
    t1.a(this.d);
    t1.a(iW);
    Rectangle rectangle = new Rectangle(j, k, m, n);
    rectangle = bV.a(rectangle);
    setBounds(rectangle);
    if (a.a().c("mainWindowMaximized", false))
      setExtendedState(6); 
    doLayout();
    enableEvents(1L);
    enableEvents(262144L);
    bV.a(this);
    f.a().a(this);
    KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this.e);
    T.a().a(this.e);
    h();
    boolean bool4 = false;
    if (bool4) {
      char c = 'ߩ';
      Calendar calendar1 = Calendar.getInstance();
      if (calendar1.get(1) > 2500 && !Locale.getDefault().equals(Locale.US)) {
        calendar1.set(c + 543, 6, 28);
      } else {
        calendar1.set(c, 6, 28);
      } 
      long l = a.a().a(a.aS, 0L);
      Properties properties = new Properties();
      properties.setProperty(f.b, a.b);
      properties.setProperty(f.c, a.c);
      if (!this.h && (calendar1.getTime().getTime() < System.currentTimeMillis() || l > calendar1.getTimeInMillis())) {
        boolean bool = false;
        try {
          bool = !l() ? true : false;
        } catch (a a) {
          D.a("Unable to get upgrade, please try a manual install.", (Exception)a, this);
          bool = true;
        } 
        if (bool) {
          cS.a().a(this);
          bV.d(f.a(properties, f.f), this);
        } 
        aN.a(a.h);
        System.exit(0);
      } 
      a.a().b(a.aS, "" + System.currentTimeMillis());
      Calendar calendar2 = Calendar.getInstance();
      calendar2.set(1979, 5, 1);
      if (!this.h && calendar2.getTime().getTime() > System.currentTimeMillis()) {
        bV.d(f.a(properties, f.g), this);
        aN.a(a.h);
        System.exit(0);
      } 
      if (!this.h && calendar1.getTime().getTime() < System.currentTimeMillis() + 2592000000L) {
        long l1 = (long)((calendar1.getTime().getTime() - System.currentTimeMillis()) / 8.64E7D);
        properties.setProperty(f.d, l1 + "");
        String str = f.a(properties, f.j);
        bV.d(str, this);
      } 
      if (this.h && a.a().c(a.cM, false)) {
        String str = f.a(properties, f.h);
        a.a().e(a.cM);
        try {
          v();
        } catch (a a) {}
        bV.d(str, this);
        aN.a(a.h);
        System.exit(0);
      } 
    } 
    setVisible(true);
    boolean bool5 = (a.a().a(a.aR, 0L) + this.a < System.currentTimeMillis() && (a.a().c(a.aQ, true) || !A.i().a(a.a().c(a.cF, "")))) ? true : false;
    if (a.a().c(a.y, false) && j.a(".")) {
      a.a().b(a.aR, "0");
      f.a().e(g.b("Updating Application Files"));
      this.i = true;
      (new dA(this, true, this)).start();
    } else if (bool5) {
      (new dA(this, false, this)).start();
    } 
    setTransferHandler(new dx(this));
  }
  
  public void c() {
    a.a = new dn(this);
    g.a();
    String str = a.a().a("viewLanguageCode", "en");
    try {
      hq.a().a("Loading Language Content.");
      g.a(str);
      g.b(" dummyToLoad");
      bM.a(g.d());
    } catch (a a) {
      bV.d("Unable to set language code.\n" + a.getMessage(), this);
    } 
  }
  
  public void d() {
    try {
      double d = Double.parseDouble(System.getProperty("java.specification.version"));
      if (d < 1.8D)
        if (J.a()) {
          String str = "https://www.efianalytics.com/TunerStudio/download/";
          if (bV.a(a.b + " is currently running on JRE version " + d + ".\nThis application requires JRE 1.8 or higher.\nIf you continue, you will experience problems.\n\nThe easiest way to correct this is to download and run the installer.\n\nWould you like to go to the download page now?", this, true))
            aN.a(str); 
        } else {
          String str = "https://adoptopenjdk.net/";
          if (bV.a(a.b + " is currently running on JRE version " + d + ".\nThis application requires JRE 1.8 or higher.\nIf you continue, you will experience problems.\n\nWould you like to get the latest JRE now?", this, true))
            aN.a(str); 
        }  
    } catch (Exception exception) {
      bV.d("Unable to determine the JRE version.\nJRE version 1.8 is required for this application", this);
    } 
  }
  
  public void e() {
    (new dA(this, false, this)).start();
  }
  
  public void f() {
    File file1 = new File(j.D(), "firmwareLoader");
    File file2 = new File(j.C(), "firmwareLoader");
    try {
      if (file1.exists())
        t.a(file1, file2); 
    } catch (a a) {
      Logger.getLogger(dl.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
    } 
  }
  
  public void repaint(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.repaint(paramLong, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void g() {
    if (dd.a().e() == null) {
      String str = a.a().c(a.aX);
      if (str == null) {
        D.b("No splash Image found, not showing splash screen.");
        return;
      } 
      boolean bool = false;
      iJ iJ = new iJ(null, str, bool);
      dd.a().a(iJ);
    } 
  }
  
  private boolean u() {
    if (!i.a().a(";'GD;'GD[PHGD-0HL")) {
      o o = o.a((d)new a(), g.d());
      d d = o.h();
      if (d != null) {
        if (d.a() == 0) {
          this.h = true;
          do do = new do(this, o);
          do.start();
        } else if (d.a() == 4) {
          bV.d(g.b(c.h) + "\n" + g.b(c.f), this);
          this.h = false;
        } else if (d.a() == 1) {
          D.c("renewal over due");
          String str = a.a().c(a.n, a.c);
          if (str.contains(i.d)) {
            bV.d(g.b("Trial Activation has expired.") + "\n" + g.b("Please connect to the internet to see if trial period is still valid and reactivate."), this);
            a.a().d(a.j, "");
            try {
              a.a().i();
            } catch (a a) {
              Logger.getLogger(dl.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
            } 
            this.h = false;
          } else {
            this.h = true;
          } 
        } else if (d.a() == 2) {
          bV.d(g.b(c.h) + "\n" + g.b(d.b()), this);
          this.h = false;
        } else if (d.a() == 7) {
          bV.d(g.b(c.j) + "\n" + g.b(d.b()), this);
          this.h = false;
        } else if (d.a() == 5) {
          bV.d(c.c(g.d()) + "\n" + g.b(d.b()), this);
          this.h = false;
        } else if (d.a() == 6) {
          String str1 = X.b(a.c, i.c, "");
          str1 = X.b(str1, i.b, "");
          String str2 = a.a().c(a.n, "");
          if (str2 != null && str2.contains(i.d)) {
            String str3 = a.a().c(a.cF, "");
            String str4 = a.a().c(a.cI, "");
            if (str4 != null && !str4.isEmpty() && !str4.equals(str3)) {
              a.a().d(a.cF, str4);
              a.a().d(a.cI, "");
              a.a().d(a.n, str1);
              if (A.i().a(str4)) {
                try {
                  a.a().i();
                } catch (a a) {
                  Logger.getLogger(dl.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
                } 
                String str = i.a().b();
                if (str != null && !str.isEmpty()) {
                  String str5 = a.b + " Registration Notice!\n\n" + g.b("We apologize, but your trial registration has expired.") + "\n" + g.b("Your previous registration has be restored.") + "\n\n" + g.b("Would you like to check for current Upgrades?");
                  String[] arrayOfString = { g.b("Check for Upgrades"), g.b("Use previous registration") };
                  boolean bool = bV.a(str5, "Trial Ended", this, arrayOfString);
                  if (bool)
                    aN.a(str); 
                } 
                return u();
              } 
            } else {
              a.a().d(a.cF, "");
              a.a().d(a.n, "");
              String str = a.b + " Registration Notice!\n\n" + g.b("We apologize, but your trial registration has expired.") + "\n\n" + g.b("Unfortunately, there is no previous registration information on this computer.") + "\n" + g.b("You will need your previous registration if you have one.") + "\n\n" + g.b("Would you like to check for current Upgrades?");
              String[] arrayOfString = { g.b("Check for Upgrades"), g.b("Enter previous registration"), g.b("Use Lite! Edition") };
              int i = JOptionPane.showOptionDialog(this, str, "Trial Ended", 1, 3, null, (Object[])arrayOfString, arrayOfString[0]);
              if (i == 0) {
                String str5 = a.M;
                aN.a(str5);
              } else if (i == 1) {
                aN.a(a.N);
                dp dp = new dp(this);
                dp.start();
              } 
              try {
                a.a().i();
              } catch (a a) {
                Logger.getLogger(dl.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
              } 
              this.h = false;
              return this.h;
            } 
          } else {
            bV.d("The registration information provided is no longer valid for " + a.a().l() + ".\n\nPlease contact EFI Analytics if you believe this registration is valid.", dd.a().c());
            aN.a("https://www.efianalytics.com/register/register.jsp?appName=" + a.b + str1);
          } 
          try {
            v();
          } catch (a a) {
            Logger.getLogger(dl.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
          } 
          this.h = false;
        } 
      } else {
        a.c += f;
        this.h = false;
      } 
    } 
    return this.h;
  }
  
  private void v() {
    a.a().d(a.cF, "");
    a.a().d(a.cE, "");
    a.a().d(a.cC, "");
    a.a().d(a.cD, "");
    a.a().d(a.n, "");
    a.a().i();
    a.a().e();
  }
  
  private void b(String paramString) {
    try {
      String str = a.a().c(a.cN, "");
      String[] arrayOfString = str.split(";");
      for (byte b1 = 0; b1 < arrayOfString.length; b1++) {
        if (!arrayOfString[b1].equals(paramString))
          str = str + arrayOfString[b1] + ";"; 
      } 
      a.a().b(a.cN, str);
      a.a().e();
    } catch (a a) {}
  }
  
  public void h() {
    iJ iJ = dd.a().e();
    if (iJ != null) {
      boolean bool = (!this.h && !i.a().a("surpressAds")) ? true : false;
      if (bool) {
        dq dq = new dq(this);
        dq.start();
      } else {
        iJ.dispose();
        dd.a().a((iJ)null);
      } 
    } 
  }
  
  public void i() {
    if (this.i)
      return; 
    boolean bool = a.a().c(a.bf, a.cP);
    if (bool) {
      String str = a.a().c("lastProjectPath", "");
      if (str.equals("") || a.u(str)) {
        String str1 = j.s();
        if ((new File(str1)).exists()) {
          hq.a().a("Opening default Project....");
          f.a().a(this, str1);
        } 
        return;
      } 
      hq.a().a("Opening Last Project....");
      jN.a();
      f.a().k(this);
      boolean bool1 = a.a().c(a.bg, false);
      if (bool1) {
        jN.a();
        dr dr = new dr(this);
        f.a().a(dr);
      } 
    } else {
      f.a().G();
    } 
  }
  
  public int j() {
    int i = a.a().c(a.aT, 0);
    D.c("Running speed test");
    U u = new U();
    u.a();
    int j = u.a();
    a.a().b(a.aT, "" + j);
    D.c("Processor Score:" + j);
    return j;
  }
  
  public void k() {
    a.a().b(a.aR, "0");
    a.a().b(a.aR + P.b, "0");
    a.a().b(a.aR + P.b, "0");
    (new dA(this, true, this)).start();
    P p = new P(ab.b, P.b);
    p.a();
    try {
      P p1 = new P(j.c(), P.a);
      p1.a();
    } catch (a a) {
      D.a(a.getLocalizedMessage());
    } 
  }
  
  public boolean a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {
    a a = new a();
    d d = null;
    try {
      d = a.a(a.a().c(a.aN, ""), a.b, a.a, a.a().c(a.aO, ""), a.a().c(a.aT, ""), a.a().c(a.cF, ""), paramString5, a.a().c(a.cO, ""));
    } catch (IOException iOException) {
      System.out.println("Unable to read from update server, connection to server unavailable");
      throw new a("Update server is currently unavailable");
    } 
    if (d == null)
      throw new a("Update server is currently unavailable"); 
    if (d.a() == 4 || d.a() == 8)
      return true; 
    b(paramString3);
    a.a().b(a.cM, "false");
    a.a().b(a.cL, "false");
    return false;
  }
  
  public boolean l() {
    Date date1 = new Date();
    date1.setTime(a.a().a(a.aR, (new Date()).getTime() - this.a - 1L));
    Date date2 = new Date();
    date2.setTime(System.currentTimeMillis() - this.a);
    boolean bool = false;
    if (date1.before(date2)) {
      a a = new a();
      d d = null;
      if (n.a()) {
        try {
          String str = X.b(a.c, f, "").trim();
          str = X.b(str, i.d, "").trim();
          e e = new e();
          e.a(a.a().c(a.aN, ""));
          e.b(a.b);
          e.c(a.a);
          e.d(a.a().c(a.aO, ""));
          e.e(a.a().c(a.aT, ""));
          e.f(a.a().c(a.cF, ""));
          e.g(str);
          e.h(a.a().c(a.cO, ""));
          e.i(g.c().getLanguage());
          d = a.a(e);
        } catch (IOException iOException) {
          System.out.println("Unable to read from update server, connection to server unavailable");
          throw new a("Update server is currently unavailable");
        } 
      } else {
        throw new a("Unable to connect to Internet");
      } 
      if (d == null)
        return false; 
      if (d.a() == 0) {
        this.c = false;
        w();
        a.a().b(a.aR, "" + (new Date()).getTime());
        a.a().e();
        return false;
      } 
      if (d.a() == 2) {
        w();
        String[] arrayOfString = { g.b("Complete Update"), g.b("Update Later") };
        boolean bool1 = (this.i || bV.a(d.b(), g.b("Update Available"), this, arrayOfString)) ? true : false;
        if (bool1) {
          if (!j.a(".") && bV.d()) {
            String str = "Elevate.exe";
            if ((new File(str)).exists()) {
              boolean bool2 = true;
              if (bool2) {
                a.a().b(a.y, "true");
                a.a().e();
                try {
                  if (T.a().c() != null && T.a().c().R())
                    T.a().c().C().c(); 
                } catch (Exception exception) {}
                try {
                  Runtime.getRuntime().exec("Elevate.exe " + X.b(a.b, " ", "") + ".exe");
                  Runtime.getRuntime().halt(0);
                } catch (IOException iOException) {
                  Logger.getLogger(f.class.getName()).log(Level.SEVERE, (String)null, iOException);
                } 
              } else {
                return false;
              } 
            } else {
              String str1 = a.a().b() + " does not currently have write access to the installation folder.\n\nUsing Auto Update with all Windows after XP requires \nAdministrator rights. Please start " + a.a().b() + "\nUsing Run As Administrator to complete Auto Update. \nWith Windows 7 the \"Run As Administrator\" Option can be found by \nPressing the Shift Key and right clicking on the icon you used to start " + a.a().b() + "\n\nAlternatively you can download the latest installer from:\nhttps://www.efiAnalytics.com/" + X.b(a.b, " ", "") + "/\n\nWould you like to go to the download site now?";
              if (bV.a(str1, this, true))
                aN.a("https://www.efiAnalytics.com/" + a.b + "/"); 
            } 
            return true;
          } 
          try {
            f.a().e(g.b("Initializing downloads") + "........");
            dt dt = new dt(this);
            a.a(dt);
            a.a(d);
            bool = true;
          } catch (IOException iOException) {
            String str = "Auto update is unable to upgrade " + a.a().b() + "\nThis is usually due to a lost connection to the internet or insufficient access \nto write to the installation directory.\n\nInternal Error:\n" + iOException.getMessage();
            bV.d(str, this);
            iOException.printStackTrace();
          } 
        } else {
          return true;
        } 
      } else if (d.a() == 1) {
        bV.d(d.b(), this);
      } else if (d.a() == 8) {
        a.a().b(a.cM, "true");
      } else if (d.a() == 4) {
        a a1 = new a();
        a1.a("");
        o o = o.a((d)a1, g.d());
        o.f();
        u();
      } 
      a.a().b(a.aR, "" + (new Date()).getTime());
      a.a().e();
    } else {
      System.out.println("No check, last update check=" + date1.toString());
    } 
    this.c = false;
    if (bool) {
      a.a().b(a.y, "false");
      a.a().e();
      i.g();
      f.a().d(this);
      Runtime.getRuntime().halt(0);
    } 
    return true;
  }
  
  private void w() {
    if (A.i().a(a.a().c(a.cF, "")))
      a.a().b(a.cK, "true"); 
  }
  
  private boolean x() {
    String str = a.a().c(a.aP, "");
    if (!a.a.equals(str)) {
      a.a().b(a.aP, a.a);
      try {
        i.c("version", a.a);
      } catch (Exception exception) {}
      return true;
    } 
    return false;
  }
  
  private void y() {
    try {
      String str1 = a.a().h().getProperty(a.aN, "");
      if (c(str1))
        return; 
      a.a().d(a.aN, "" + (long)(9.223372036854776E18D * Math.random()));
      String str2 = a.a().c(a.aO, "");
      if (str2.equals("")) {
        Date date = new Date();
        str2 = "" + date.getTime();
      } 
      a.a().d(a.aO, str2);
      a.a().i();
      a.a().e(a.aN);
      a.a().e(a.aO);
    } catch (Exception exception) {
      System.out.println("Failed to set uid");
      exception.printStackTrace();
    } 
  }
  
  private boolean c(String paramString) {
    try {
      long l = Long.parseLong(paramString);
      if (l == 0L)
        return false; 
    } catch (Exception exception) {
      return false;
    } 
    ArrayList<Character> arrayList = new ArrayList();
    Character character = null;
    byte b1 = 0;
    char[] arrayOfChar = paramString.toCharArray();
    int i = arrayOfChar.length;
    for (byte b2 = 0; b2 < i; b2++) {
      Character character1 = Character.valueOf(arrayOfChar[b2]);
      if (!arrayList.contains(character1))
        arrayList.add(character1); 
      if (character != null && character1.equals(character))
        b1++; 
      character = character1;
    } 
    return (!paramString.contains("234") && !paramString.contains("678") && arrayList.size() >= 4 && b1 < 4);
  }
  
  public void m() {
    bV.d("No Updates Available, " + a.a + " is the latest version.", this);
  }
  
  private void z() {
    a.a().e(a.aS);
    a.a().e(a.cL);
    try {
      iP.a().b();
    } catch (Exception exception) {
      D.b("Failed to clear start screen dir.");
      Logger.getLogger(dl.class.getName()).log(Level.SEVERE, (String)null, exception);
    } 
    if (a.a.equals("2.7.09")) {
      for (byte b1 = 0; b1 < 4; b1++) {
        String[] arrayOfString = a.a().f("graph" + b1);
        for (byte b2 = 0; b2 < arrayOfString.length; b2++)
          a.a().e(arrayOfString[b2]); 
      } 
      a.a().b("selectionTable2Multiview_Fuel_Table1_checked3D", "true");
    } 
    File file = new File("OSX_fixperm-217-leo.sh");
    if (file.exists())
      file.delete(); 
  }
  
  private void A() {
    String[] arrayOfString = (new File(".")).list();
    for (byte b1 = 0; b1 < arrayOfString.length; b1++) {
      if (arrayOfString[b1].toLowerCase().endsWith(".zip")) {
        File file = new File(arrayOfString[b1]);
        try {
          hq.a().a("Updating Files in " + X.b(arrayOfString[b1], ".zip", ""));
          if (ae.a(arrayOfString[b1], X.b(arrayOfString[b1], ".zip", ""), null).equals(ae.a))
            (new File(arrayOfString[b1])).delete(); 
        } catch (ZipException zipException) {
          zipException.printStackTrace();
        } catch (IOException iOException) {
          iOException.printStackTrace();
        } 
      } 
    } 
  }
  
  public boolean n() {
    D.d("closeApp Called");
    long l = System.currentTimeMillis() + 30000L;
    if (this.c) {
      setVisible(false);
      System.out.println("Update In Progress, delaying app shut down.");
      while (this.c && System.currentTimeMillis() < l) {
        try {
          Thread.currentThread();
          Thread.sleep(200L);
        } catch (Exception exception) {}
      } 
      D.d("Delay Close released.");
    } 
    return !!f.a().g();
  }
  
  public void o() {
    if (getExtendedState() == 6)
      return; 
    Insets insets = getInsets();
    a.a().b("x", "" + getX());
    a.a().b("y", "" + getY());
    a.a().b("width", "" + getWidth());
    a.a().b("height", "" + getHeight());
  }
  
  public void windowActivated(WindowEvent paramWindowEvent) {
    boolean bool = a.a().c(a.aa, a.ab);
    if (bool && !dI.a().d())
      dI.a().b(); 
  }
  
  public void windowClosed(WindowEvent paramWindowEvent) {}
  
  public void windowClosing(WindowEvent paramWindowEvent) {
    du du = new du(this);
    du.start();
    f.a().y();
    a.a().a(true);
    System.exit(0);
  }
  
  public void windowDeactivated(WindowEvent paramWindowEvent) {
    boolean bool = a.a().c(a.aa, a.ab);
    if (!bool && dI.a().d())
      dI.a().c(); 
  }
  
  public void windowDeiconified(WindowEvent paramWindowEvent) {}
  
  public void windowIconified(WindowEvent paramWindowEvent) {}
  
  public void windowOpened(WindowEvent paramWindowEvent) {}
  
  public void processEvent(AWTEvent paramAWTEvent) {
    if ((paramAWTEvent.getID() == 101 || paramAWTEvent.getID() == 100) && !J.b()) {
      o();
      if (isAlwaysOnTop())
        setAlwaysOnTop(false); 
    } 
    if (paramAWTEvent.getID() == 201 && J.b()) {
      o();
      if (isAlwaysOnTop())
        setAlwaysOnTop(false); 
    } else if (paramAWTEvent.getID() == 209) {
      if (getExtendedState() == 6) {
        a.a().b("mainWindowMaximized", "true");
        a();
      } else {
        a.a().b("mainWindowMaximized", "false");
        a();
      } 
    } else if (paramAWTEvent.getID() == 200 && isAlwaysOnTop()) {
      setAlwaysOnTop(false);
    } 
    super.processEvent(paramAWTEvent);
  }
  
  public void a() {
    (new dw(this)).start();
  }
  
  public void p() {
    EventQueue.invokeLater(new dv(this));
  }
  
  private void B() {
    if (!isVisible())
      setVisible(true); 
    int i = getExtendedState();
    i &= 0xFFFFFFFE;
    if (bV.d()) {
      setExtendedState(i);
      setAlwaysOnTop(true);
      toFront();
      requestFocus();
      setAlwaysOnTop(false);
    } else {
      setVisible(false);
      setVisible(true);
      setExtendedState(i);
    } 
  }
  
  public void setTitle(String paramString) {
    String str1 = a.c;
    if (!this.h && b)
      if (str1.contains(i.b)) {
        str1 = i.b;
      } else {
        str1 = X.b(str1, i.c, "");
      }  
    String str2 = a.b + " " + str1 + " v" + a.a + " - ";
    if (paramString != null) {
      paramString = X.b(paramString, str2, "");
      paramString = paramString.trim();
    } else {
      paramString = "";
    } 
    if (!this.h) {
      paramString = paramString + " EFI Simplified ";
    } else {
      String str3 = a.a().c(a.cC, "Invalid");
      String str4 = a.a().c(a.cD, "Registration");
      paramString = paramString + " " + g.b("Registered to:") + " " + str3 + " " + str4;
    } 
    super.setTitle(str2 + paramString);
  }
  
  public void a(R paramR) {
    String str = "";
    if (str != null && !str.equals("")) {
      setTitle(paramR.c() + " (" + str + ")");
    } else if (b) {
      setTitle(paramR.c() + " (offline)");
    } else {
      String str1 = paramR.Z();
      if (str1 == null || str1.isEmpty()) {
        setTitle(paramR.c() + " ( " + g.b("Go Online for Firmware Version") + " )");
      } else {
        setTitle(paramR.c() + " ( " + str1 + " )");
      } 
    } 
  }
  
  public void b(R paramR) {
    paramR.C().b(this);
  }
  
  public void c(R paramR) {
    paramR.C().a(this);
  }
  
  public boolean a(String paramString, bT parambT) {
    if (a.b.equals(a.as)) {
      setTitle(paramString + " ( Firmware Version: " + parambT.b() + ", Serial #" + parambT.c() + " )");
    } else if (parambT.b().equals(a.A().E().i())) {
      setTitle(paramString + " (" + parambT.c() + ")");
      if (parambT.c() != null) {
        a.A().setProperty("firmwareDescription", parambT.c());
      } else {
        a.A().setProperty("firmwareDescription", "");
      } 
      a.a().b(a.cO, parambT.b());
    } 
    return true;
  }
  
  public void a(String paramString) {}
  
  public boolean b() {
    return n();
  }
  
  public String q() {
    String str = "";
    if (str == null || str.equals(""))
      try {
        str = "file://" + (new File(".")).getCanonicalPath() + "/help/learnMore.html";
      } catch (Exception exception) {
        bV.d("While online go to\n" + a.h, this);
      }  
    return str;
  }
  
  public void r() {
    dS dS = new dS(this, new dy(this));
    bV.a(this, (Component)dS);
    dS.setVisible(true);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/dl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */