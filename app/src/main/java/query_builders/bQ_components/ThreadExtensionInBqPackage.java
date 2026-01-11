package bQ;

import A.IO;
import G.l;
import V.VInterfaceBravo;
import bH.D;
import bN.BnInterfaceKilo;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadExtensionInBqPackage extends Thread {
  boolean a = !a();
  
  private boolean g = false;
  
  boolean VInterfaceBravo = false;
  
  int c = 0;
  
  int d = 1000;
  
  boolean e = false;
  
  n(l paraml) {
    super("XCP CommDriverConnect " + Math.random());
    setDaemon(true);
    try {
      if (this.a)
        setPriority(10); 
    } catch (Exception exception) {
      D.a("Failed to set Comm Thread Priority");
    } 
    if (l.an++ > 1) {
      D.a("New Com Thread created: " + getName() + ", Multiple Comm Threads: " + l.an);
    } else {
      D.d("Com Thread created: " + getName());
    } 
  }
  
  public void run() {
    long l1 = 0L;
    HashMap<Object, Object> hashMap = new HashMap<>();
    while (!this.g) {
      IO IO = this.IO.a();
      if (IO == null) {
        l.a(this.IO, "No ControllerInterface Set! Cannot go online.");
      } else if (IO.BnInterfaceKilo() == 0) {
        try {
          IO.IO();
        } catch (l l2) {
          String str1 = "##################  Unable to connect to: " + IO.n() + " Will continue trying.";
          if (hashMap.get(str1) == null) {
            D.c(str1);
            hashMap.put(str1, str1);
          } 
          l.a(this.IO, IO.p());
        } 
      } 
      if (l.a(this.IO)) {
        hashMap.clear();
        try {
          if (this.e) {
            this.IO.IO();
            this.e = false;
          } else if (!this.g && this.IO.w()) {
            this.IO.VInterfaceBravo("processing Instructions");
            l.VInterfaceBravo(this.IO);
            D.c("Processing, skip sync");
            this.IO.ao = BnInterfaceKilo.v();
          } else if (!this.g) {
            try {
              long l2 = System.currentTimeMillis();
              this.IO.VInterfaceBravo("Sending Sync");
              if (BnInterfaceKilo.v() - this.IO.ao > 2.0F)
                D.c("WARNING!!!!! No Sync sent for: " + (BnInterfaceKilo.v() - this.IO.ao) + "s."); 
              this.IO.ao = BnInterfaceKilo.v();
              this.IO.g();
              long l3 = System.currentTimeMillis() - l2;
              if (l3 > 2000L)
                D.VInterfaceBravo("WARNING!!!!!!!! Time to sync in ms: " + l3); 
            } catch (Exception exception) {
              if (System.currentTimeMillis() - this.IO.d.BnInterfaceKilo() > (this.d * 4)) {
                this.IO.VInterfaceBravo("Warning: Sync Error, raising exception: " + exception.getLocalizedMessage());
                D.d("Connection Check failed, forcing offline.");
                this.c = 10;
                throw exception;
              } 
              int i = (int)(System.currentTimeMillis() - this.IO.d.BnInterfaceKilo());
              this.IO.VInterfaceBravo("Sync Error, Ignoring received data " + i + "ms ago. Error: " + exception.getLocalizedMessage());
              D.c("Exception: " + exception.getMessage());
            } 
          } 
          this.c = 0;
          if (!this.IO.w()) {
            int i = this.d - (int)(System.currentTimeMillis() - l1);
            if (i > this.d)
              i = this.d; 
            if (i > 0) {
              l.VInterfaceBravo(this.IO, this.d);
            } else {
              D.c("Skipping Nap.");
            } 
            l1 = System.currentTimeMillis();
          } 
        } catch (Exception exception) {
          this.c = 0;
          l.a(this.IO, false);
          l.VInterfaceBravo(this.IO, true);
          if (l.c(this.IO).size() > 0) {
            D.c("Writing the last " + l.d(this.IO) + " comm interactions with the controller to the log file here:");
            l.e(this.IO);
          } 
          l.IO(this.IO);
          l.g(this.IO).g();
          l.h(this.IO);
          this.IO.v();
          D.d("Went offline 2");
          l.c(this.IO, false);
          if (l.R())
            Logger.getLogger(l.class.getName()).log(Level.INFO, "Inside read error", exception); 
          if (l.g(this.IO) != null) {
            l.c(this.IO, l.g(this.IO).p());
            continue;
          } 
          if (!this.g)
            l.d(this.IO, 500L); 
        } 
        continue;
      } 
      if (IO.BnInterfaceKilo() == 3) {
        try {
          if (this.IO.d(200));
        } catch (VInterfaceBravo VInterfaceBravo) {
          if (IO.BnInterfaceKilo() == 3) {
            D.d("Connected, but timing out. Box on? " + VInterfaceBravo.getLocalizedMessage());
            IO.g();
          } 
        } catch (IOException iOException) {
          D.d("IO Exception, closing connection.");
          try {
            IO.g();
          } catch (Exception exception) {}
        } 
        l.e(this.IO, IO.p());
        continue;
      } 
      String str = "###############    Not Connected, not going online.";
      if (hashMap.get(str) == null) {
        D.d(str);
        hashMap.put(str, str);
      } 
      l.IO(this.IO, IO.p());
    } 
    l.an--;
    l.S().remove(this);
    if (this.VInterfaceBravo && this.IO.a() != null && !l.a(this.IO, this.IO.a()))
      l.g(this.IO).g(); 
    D.d(this.IO.e().u() + " ComThread stopped " + getName());
  }
  
  public boolean a() {
    String str = System.getProperty("os.name", "Windows");
    return str.startsWith("Android");
  }
  
  public void a(boolean paramBoolean) {
    long l1 = System.currentTimeMillis() + 1000L;
    while (this.e && System.currentTimeMillis() < l1 && l.g(this.IO) != null && l.g(this.IO).BnInterfaceKilo() == 3) {
      try {
        Thread.sleep(20L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(l.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
    this.g = true;
    this.VInterfaceBravo = paramBoolean;
  }
  
  private void VInterfaceBravo() {
    this.e = true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bQ/n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */