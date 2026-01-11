package az;

import V.ExceptionInVPackage;
import bH.D;
import bH.X;
import bH.aa;
import bH.ab;
import bH.n;
import bH.q;
import com.efiAnalytics.ui.bV;
import f.ExceptionInVPackage;
import f.IOTostring;
import f.AbstractInFPackage;
import f.FInterfaceDelta;
import f.ExceptionInFPackage;
import f.ExceptionExtensionInFPackage;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadedInAzPackage extends AbstractInFPackage {
  private boolean FInterfaceDelta = false;
  
  private FInterfaceDelta e;
  
  private ab f;
  
  private static boolean ExceptionInFPackage = false;
  
  Map AbstractInFPackage = new HashMap<>();
  
  private static o ExceptionExtensionInFPackage = null;
  
  private ThreadedInAzPackage(FInterfaceDelta paramd, ab paramab) {
    this.e = paramd;
    this.f = paramab;
  }
  
  public static o ExceptionInVPackage(FInterfaceDelta paramd, ab paramab) {
    if (ExceptionExtensionInFPackage == null) {
      ExceptionExtensionInFPackage = new o(paramd, paramab);
    } else if (paramd != null) {
      D.FInterfaceDelta("Updating ai & t");
      ExceptionExtensionInFPackage.e = paramd;
      ExceptionExtensionInFPackage.f = paramab;
    } 
    return ExceptionExtensionInFPackage;
  }
  
  public static synchronized o FInterfaceDelta() {
    if (ExceptionExtensionInFPackage == null) {
      D.FInterfaceDelta("gupam");
      ExceptionExtensionInFPackage = new o(null, null);
    } 
    return ExceptionExtensionInFPackage;
  }
  
  public ExceptionInVPackage e() {
    if (!n.IOTostring())
      throw new e(AbstractInFPackage.ExceptionInVPackage(this.f)); 
    ExceptionInVPackage ExceptionInVPackage = null;
    try {
      IOTostring IOTostring = i();
      ExceptionInVPackage = ExceptionInVPackage("TunerStudioMS", IOTostring);
    } catch (IOException iOException) {
      Logger.getLogger(o.class.getName()).log(Level.INFO, "AF: IOE", iOException);
      throw new e(AbstractInFPackage.IOTostring(this.f));
    } catch (ExceptionExtensionInFPackage ExceptionExtensionInFPackage) {
      Logger.getLogger(o.class.getName()).log(Level.INFO, "AF: IEE", (Throwable)ExceptionExtensionInFPackage);
      throw new IOTostring(this.f.ExceptionInVPackage("Invalid activation data.") + " " + ExceptionExtensionInFPackage.getMessage());
    } 
    return ExceptionInVPackage;
  }
  
  public ExceptionInVPackage IOTostring() {
    String str = this.e.AbstractInFPackage();
    ExceptionInVPackage ExceptionInVPackage = (ExceptionInVPackage)this.AbstractInFPackage.get(this.e.f());
    if (str == null || str.trim().equals(""))
      return null; 
    if (ExceptionInVPackage != null && ExceptionInVPackage.f() == 0)
      return ExceptionInVPackage; 
    try {
      ExceptionInVPackage = new ExceptionInVPackage(str);
      ExceptionInVPackage.i(str);
      this.AbstractInFPackage.put(this.e.f(), ExceptionInVPackage);
      return ExceptionInVPackage;
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public void f() {
    this.AbstractInFPackage.clear();
  }
  
  public void AbstractInFPackage(ExceptionInVPackage parama) {
    try {
      String str = parama.i();
      this.e.ExceptionInVPackage(str);
    } catch (ExceptionInVPackage a1) {
      bV.FInterfaceDelta("Unable to save Activation Data:\n" + a1.getMessage(), this.e.i());
    } 
  }
  
  public synchronized IOTostring ExceptionInVPackage() {
    if (super.ExceptionInVPackage() == null)
      try {
        IOTostring IOTostring = new IOTostring();
        (new o(null, null)).IOTostring(IOTostring);
        FInterfaceDelta().ExceptionInVPackage(IOTostring);
        return super.ExceptionInVPackage();
      } catch (ExceptionInFPackage ExceptionInFPackage) {
        D.ExceptionInVPackage("Error ISID");
      }  
    return super.ExceptionInVPackage();
  }
  
  public synchronized IOTostring IOTostring(IOTostring paramb) {
    if (super.ExceptionInVPackage() != null) {
      if (this.FInterfaceDelta)
        D.AbstractInFPackage("Returning cached HW"); 
      return super.ExceptionInVPackage();
    } 
    if (this.FInterfaceDelta)
      D.AbstractInFPackage("Gathering HWID!!!!!"); 
    long l = System.currentTimeMillis();
    aa aa = new aa();
    aa.ExceptionInVPackage();
    byte b1 = 0;
    p p = new p(this, paramb);
    q q = new q(this, paramb);
    r r = new r(this, paramb);
    s s = new s(this, paramb);
    p.start();
    q.start();
    r.start();
    s.start();
    do {
      try {
        Thread.sleep(10L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(o.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } while (System.currentTimeMillis() - l < 4000L && (!q.ExceptionInVPackage() || !r.ExceptionInVPackage() || !s.ExceptionInVPackage()));
    if (this.FInterfaceDelta) {
      D.AbstractInFPackage("Time to get: " + aa.FInterfaceDelta());
      aa.e();
      aa.ExceptionInVPackage();
    } 
    String str1 = r.IOTostring();
    if (str1 != null && str1.length() > 0) {
      paramb.ExceptionInVPackage(str1);
      if (this.FInterfaceDelta)
        D.AbstractInFPackage("m:" + str1); 
      b1++;
    } 
    String str2 = s.IOTostring();
    if (str2 != null && !str2.isEmpty()) {
      if (this.FInterfaceDelta)
        D.AbstractInFPackage("mbId:" + str2); 
      paramb.AbstractInFPackage(str2);
      b1++;
    } 
    String str3 = q.IOTostring();
    if (str3 != null && str3.length() > 0) {
      if (this.FInterfaceDelta)
        D.AbstractInFPackage("hdId:" + str3); 
      paramb.IOTostring(str3);
      b1++;
    } 
    if (!p.ExceptionInVPackage() && (b1 < 2 || ExceptionInFPackage))
      do {
        try {
          Thread.sleep(10L);
        } catch (InterruptedException interruptedException) {
          Logger.getLogger(o.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
        } 
      } while (!p.ExceptionInVPackage()); 
    String str4 = p.IOTostring();
    if (str4 != null && str4.length() > 5) {
      if (this.FInterfaceDelta)
        D.AbstractInFPackage("cpuId:" + str4); 
      paramb.i(str4);
      b1++;
    } 
    if (b1 == 0)
      throw new ExceptionInFPackage("No Identifiers available."); 
    D.AbstractInFPackage("hid: " + aa.FInterfaceDelta());
    ExceptionInVPackage(paramb);
    return paramb;
  }
  
  public void ExceptionInFPackage() {
    ExceptionInVPackage ExceptionInVPackage = IOTostring();
    if (ExceptionInVPackage != null && ExceptionInVPackage.ExceptionExtensionInFPackage().before(new Date(System.currentTimeMillis() + 1209600000L)) && n.IOTostring()) {
      ExceptionInVPackage a1 = null;
      try {
        a1 = e();
        FInterfaceDelta d1 = ExceptionInVPackage(a1);
        if (d1.ExceptionInVPackage() == 0)
          AbstractInFPackage(a1); 
      } catch (ExceptionInFPackage ExceptionInFPackage) {
      
      } catch (IOTostring IOTostring) {
      
      } catch (e e) {}
    } 
  }
  
  public synchronized FInterfaceDelta ExceptionExtensionInFPackage() {
    return ExceptionInVPackage(this.e);
  }
  
  public synchronized FInterfaceDelta ExceptionInVPackage(FInterfaceDelta paramd) {
    FInterfaceDelta d1 = this.e;
    this.e = paramd;
    try {
      FInterfaceDelta d2 = AbstractInFPackage();
      if (ExceptionInFPackage && d2.ExceptionInVPackage() == 0)
        d2.ExceptionInVPackage(1); 
      if (d2.ExceptionInVPackage() == 0) {
        ExceptionInVPackage ExceptionInVPackage = IOTostring();
        if (ExceptionInVPackage != null && ExceptionInVPackage.ExceptionExtensionInFPackage().before(new Date(System.currentTimeMillis() + 604800000L)) && n.IOTostring()) {
          ExceptionInVPackage a1 = null;
          try {
            a1 = e();
            FInterfaceDelta d3 = ExceptionInVPackage(a1);
            if (d3.ExceptionInVPackage() == 0)
              AbstractInFPackage(a1); 
          } catch (ExceptionInFPackage ExceptionInFPackage) {
          
          } catch (IOTostring IOTostring) {
          
          } catch (e e) {}
        } 
        return d2;
      } 
      if (d2.ExceptionInVPackage() == 1) {
        if (n.IOTostring()) {
          ExceptionInVPackage ExceptionInVPackage = null;
          try {
            ExceptionInVPackage = e();
            d2 = ExceptionInVPackage(ExceptionInVPackage);
            if (d2.ExceptionInVPackage() == 0) {
              AbstractInFPackage(ExceptionInVPackage);
              return d2;
            } 
            return d2;
          } catch (ExceptionInFPackage ExceptionInFPackage) {
            ExceptionInVPackage("MISSING_IDENTIFIERS, Expired");
            if (q.ExceptionInVPackage()) {
              d2.ExceptionInVPackage(this.f.ExceptionInVPackage(AbstractInFPackage.f));
              d2.ExceptionInVPackage(4);
            } else {
              d2.ExceptionInVPackage(this.f.ExceptionInVPackage(AbstractInFPackage.f));
              d2.ExceptionInVPackage(4);
            } 
            return d2;
          } catch (IOTostring IOTostring) {
            d2.ExceptionInVPackage(2);
            d2.ExceptionInVPackage(IOTostring.getMessage());
            return d2;
          } catch (e e) {
            D.FInterfaceDelta("Network Error");
          } 
        } 
        return d2;
      } 
      if (n.IOTostring()) {
        ExceptionInVPackage("Connected to Internet");
        ExceptionInVPackage ExceptionInVPackage = null;
        try {
          ExceptionInVPackage = e();
          d2 = ExceptionInVPackage(ExceptionInVPackage);
          if (d2.ExceptionInVPackage() == 0) {
            AbstractInFPackage(ExceptionInVPackage);
            return d2;
          } 
          return d2;
        } catch (ExceptionInFPackage ExceptionInFPackage) {
          ExceptionInVPackage("MISSING_IDENTIFIERS");
          if (q.ExceptionInVPackage()) {
            d2.ExceptionInVPackage(this.f.ExceptionInVPackage(AbstractInFPackage.f));
            d2.ExceptionInVPackage(4);
          } else {
            d2.ExceptionInVPackage(this.f.ExceptionInVPackage(AbstractInFPackage.ExceptionInFPackage));
            d2.ExceptionInVPackage(4);
          } 
          return d2;
        } catch (IOTostring IOTostring) {
          ExceptionInVPackage("MISSING_IDENTIFIERS " + IOTostring.getLocalizedMessage());
          d2.ExceptionInVPackage(2);
          d2.ExceptionInVPackage(IOTostring.getMessage());
          return d2;
        } catch (e e) {
          D.AbstractInFPackage("key: kjsdaiie");
          e.printStackTrace();
          if (this.e.j())
            return ExceptionInVPackage(this.e, ""); 
          d2.ExceptionInVPackage(2);
          d2.ExceptionInVPackage("Unable to connect to Activativon Server");
          return d2;
        } 
      } 
      if (this.e.j())
        return ExceptionInVPackage(this.e, (String)null); 
      d2.ExceptionInVPackage(2);
      d2.ExceptionInVPackage("Unable to connecto Activativon Server");
      return d2;
    } finally {
      this.e = d1;
    } 
  }
  
  public FInterfaceDelta ExceptionInVPackage(FInterfaceDelta paramd, String paramString) {
    String str = (paramString != null && !paramString.equals("")) ? (paramString + "\n" + AbstractInFPackage.FInterfaceDelta(this.f)) : AbstractInFPackage.FInterfaceDelta(this.f);
    if (bV.ExceptionInVPackage(str, paramd.i(), true)) {
      ExceptionInVPackage(paramd);
    } else {
      try {
        IOTostring IOTostring = i();
        f f = new f(paramd.i(), paramd, this.f, IOTostring);
        f.pack();
        bV.IOTostring(f);
        f.setResizable(false);
        f.setVisible(true);
        ExceptionInVPackage ExceptionInVPackage = f.IOTostring();
        if (ExceptionInVPackage != null) {
          FInterfaceDelta d1 = ExceptionInVPackage(ExceptionInVPackage);
          if (d1.ExceptionInVPackage() == 0) {
            AbstractInFPackage(ExceptionInVPackage);
            bV.FInterfaceDelta(this.f.ExceptionInVPackage(AbstractInFPackage.ExceptionInVPackage), f);
          } 
          return d1;
        } 
      } catch (ExceptionInFPackage ExceptionInFPackage) {
        FInterfaceDelta d1 = new FInterfaceDelta();
        if (q.ExceptionInVPackage()) {
          d1.ExceptionInVPackage(this.f.ExceptionInVPackage(AbstractInFPackage.f));
          d1.ExceptionInVPackage(4);
        } else {
          d1.ExceptionInVPackage(this.f.ExceptionInVPackage(AbstractInFPackage.f));
          d1.ExceptionInVPackage(4);
        } 
        return d1;
      } catch (IOTostring IOTostring) {
        FInterfaceDelta d1 = new FInterfaceDelta();
        d1.ExceptionInVPackage(2);
        d1.ExceptionInVPackage(IOTostring.getMessage());
        return d1;
      } 
    } 
    return null;
  }
  
  public FInterfaceDelta AbstractInFPackage() {
    ExceptionInVPackage ExceptionInVPackage = IOTostring();
    if (ExceptionInVPackage == null || !ExceptionInVPackage.FInterfaceDelta().equals(this.e.FInterfaceDelta())) {
      FInterfaceDelta d1 = new FInterfaceDelta();
      d1.ExceptionInVPackage(2);
      d1.ExceptionInVPackage(FInterfaceDelta.ExceptionInVPackage);
      ExceptionInVPackage("MISSING_IDENTIFIERS: " + ExceptionInVPackage);
      return d1;
    } 
    return ExceptionInVPackage(ExceptionInVPackage);
  }
  
  public synchronized IOTostring i() {
    IOTostring IOTostring = ExceptionInVPackage();
    IOTostring.FInterfaceDelta(this.e.FInterfaceDelta());
    IOTostring.f(this.e.e());
    IOTostring.e(this.e.ExceptionExtensionInFPackage());
    IOTostring.ExceptionInFPackage(this.e.f());
    String str = X.IOTostring(this.e.ExceptionInFPackage(), "(Beta)", "");
    IOTostring.ExceptionExtensionInFPackage(str);
    IOTostring = IOTostring(IOTostring);
    boolean bool = false;
    if (bool)
      IOTostring.FInterfaceDelta("RZ7R7P6F7WPA2IM36A6M"); 
    return IOTostring;
  }
  
  public static void ExceptionInVPackage(boolean paramBoolean) {
    ExceptionInFPackage = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/az/o.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */