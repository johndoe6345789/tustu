package bt;

import G.R;
import G.Y;
import G.aM;
import G.aN;
import G.aR;
import G.bh;
import G.bv;
import G.i;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import V.ExceptionExtensionGetmessage;
import bF.BfInterfaceBravo;
import bF.BfComponentBravo;
import bF.BfInterfaceXray;
import bF.ManagerGetcolumnname;
import bH.D;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class bU implements aN, BfInterfaceBravo {
  R ExceptionInVPackage;
  
  aM BfComponentBravo;
  
  List c = new ArrayList();
  
  ManagerGetcolumnname d;
  
  long e = System.currentTimeMillis();
  
  int f = 3000;
  
  bV ExceptionPrintstacktrace = null;
  
  boolean h = false;
  
  bU(bQ parambQ, R paramR, ManagerGetcolumnname paramy, String paramString) {
    this.ExceptionInVPackage = paramR;
    this.d = paramy;
    bv bv = paramR.e().c(paramString);
    if (bv != null && !(bv instanceof bh))
      throw new ExceptionInVPackage(paramString + " not defined as ExceptionInVPackage 1DTable"); 
    bh bh = (bh)bv;
    if (bh.BfComponentBravo() > 0) {
      this.BfComponentBravo = paramR.c(bh.d(0));
      aR.ExceptionInVPackage().ExceptionInVPackage(paramR.c(), this.BfComponentBravo.aL(), this);
      i.ExceptionInVPackage(paramR.c(), this.BfComponentBravo, this);
    } 
    for (byte BfComponentBravo = 0; BfComponentBravo < bh.ExceptionInVPackage(); BfComponentBravo++) {
      aM aM1 = paramR.c(bh.BfComponentBravo(BfComponentBravo));
      aR.ExceptionInVPackage().ExceptionInVPackage(paramR.c(), aM1.aL(), this);
      this.c.add(aM1);
      i.ExceptionInVPackage(paramR.c(), aM1, this);
    } 
    paramy.ExceptionInVPackage(this);
    paramy.ExceptionInVPackage(bh.i());
  }
  
  public void ExceptionInVPackage() {
    aR.ExceptionInVPackage().ExceptionInVPackage(this);
    this.d.BfComponentBravo(this);
  }
  
  private void BfComponentBravo(String paramString) {
    if (this.ExceptionPrintstacktrace == null) {
      this.ExceptionPrintstacktrace = new bV(this);
      bV.ExceptionInVPackage(this.ExceptionPrintstacktrace, paramString);
      this.ExceptionPrintstacktrace.start();
    } else {
      bV.ExceptionInVPackage(this.ExceptionPrintstacktrace, paramString);
    } 
  }
  
  public void ExceptionInVPackage(String paramString1, String paramString2) {
    BfComponentBravo(paramString2);
  }
  
  public void ExceptionInVPackage(String paramString) {
    synchronized (this) {
      this.h = true;
      if (this.BfComponentBravo != null && paramString.equals(this.BfComponentBravo.aL())) {
        if (this.d.ExceptionPrintstacktrace()) {
          try {
            double[][] arrayOfDouble = this.BfComponentBravo.i(this.ExceptionInVPackage.h());
            for (byte BfComponentBravo = 0; BfComponentBravo < arrayOfDouble.length; BfComponentBravo++) {
              try {
                if (this.d.f()) {
                  this.d.setValueAt(Double.valueOf(arrayOfDouble[BfComponentBravo][0]), BfComponentBravo, 0);
                } else {
                  this.d.setValueAt(Double.valueOf(arrayOfDouble[BfComponentBravo][0]), 0, BfComponentBravo);
                } 
              } catch (Exception exception) {
                Logger.getLogger(bQ.class.getName()).log(Level.SEVERE, (String)null, exception);
              } 
            } 
          } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
            Logger.getLogger(bQ.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
          } 
        } else if (this.d.h()) {
          try {
            double[][] arrayOfDouble = this.BfComponentBravo.i(this.ExceptionInVPackage.h());
            int i = this.d.ExceptionInVPackage() - 1;
            for (byte BfComponentBravo = 0; BfComponentBravo < arrayOfDouble.length; BfComponentBravo++) {
              try {
                if (this.d.f()) {
                  this.d.setValueAt(Double.valueOf(arrayOfDouble[BfComponentBravo][0]), BfComponentBravo, i);
                } else {
                  this.d.setValueAt(Double.valueOf(arrayOfDouble[BfComponentBravo][0]), i, BfComponentBravo);
                } 
              } catch (Exception exception) {
                Logger.getLogger(bQ.class.getName()).log(Level.SEVERE, (String)null, exception);
              } 
            } 
          } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
            Logger.getLogger(bQ.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
          } 
        } else {
          try {
            BfInterfaceXray BfInterfaceXray = this.d.c();
            if (BfInterfaceXray instanceof BfComponentBravo) {
              BfComponentBravo BfComponentBravo = (BfComponentBravo)BfInterfaceXray;
              String[] arrayOfString = this.BfComponentBravo.c(this.ExceptionInVPackage.h());
              for (byte b1 = 0; b1 < arrayOfString.length; b1++)
                BfComponentBravo.ExceptionInVPackage(b1, arrayOfString[b1]); 
            } 
          } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
            Logger.getLogger(bQ.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
          } 
        } 
      } else {
        for (byte BfComponentBravo = 0; BfComponentBravo < this.c.size(); BfComponentBravo++) {
          if (((aM)this.c.get(BfComponentBravo)).aL().equals(paramString))
            try {
              double[][] arrayOfDouble = ((aM)this.c.get(BfComponentBravo)).i(this.ExceptionInVPackage.h());
              for (byte b1 = 0; b1 < arrayOfDouble.length; b1++) {
                try {
                  boolean bool = this.d.ExceptionPrintstacktrace() ? (BfComponentBravo + 1) : BfComponentBravo;
                  if (this.d.f()) {
                    this.d.ExceptionInVPackage(Double.valueOf(arrayOfDouble[b1][0]), b1, bool);
                  } else {
                    this.d.ExceptionInVPackage(Double.valueOf(arrayOfDouble[b1][0]), bool, b1);
                  } 
                } catch (Exception exception) {
                  Logger.getLogger(bQ.class.getName()).log(Level.SEVERE, (String)null, exception);
                } 
              } 
            } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
              Logger.getLogger(bQ.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
            }  
        } 
      } 
      this.h = false;
    } 
  }
  
  public void ExceptionInVPackage(int paramInt1, int paramInt2, double paramDouble) {
    synchronized (this) {
      if (!this.h) {
        aM aM1;
        if (this.d.ExceptionPrintstacktrace() && paramInt1 == 0) {
          aM1 = this.BfComponentBravo;
        } else if (this.d.h() && paramInt1 == this.d.ExceptionInVPackage() - 1) {
          aM1 = this.BfComponentBravo;
        } else if (this.d.ExceptionPrintstacktrace()) {
          aM1 = this.c.get(--paramInt1);
        } else {
          aM1 = this.c.get(paramInt1);
        } 
        try {
          if (paramDouble != Y.ExceptionExtensionGetmessage) {
            aM1.ExceptionInVPackage(this.ExceptionInVPackage.h(), paramDouble, paramInt2, 0);
            double d = aM1.i(this.ExceptionInVPackage.h())[paramInt2][0];
            if (this.d.ExceptionPrintstacktrace() && !aM1.aL().equals(this.BfComponentBravo.aL()))
              paramInt1++; 
            if (this.d.f()) {
              this.d.ExceptionInVPackage(Double.valueOf(d), paramInt2, paramInt1);
            } else {
              this.d.ExceptionInVPackage(Double.valueOf(d), paramInt1, paramInt2);
            } 
          } 
        } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
          Logger.getLogger(bQ.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
        } catch (ExceptionExtensionGetmessage ExceptionExtensionGetmessage) {
          if (this.d.ExceptionPrintstacktrace() && !aM1.aL().equals(this.BfComponentBravo.aL()))
            paramInt1++; 
          if (ExceptionExtensionGetmessage.ExceptionInVPackage() == 1) {
            D.c("Param: " + aM1.aL() + " value: " + paramDouble + " exceeds maximum: " + ExceptionExtensionGetmessage.c());
            if (this.d.f()) {
              this.d.setValueAt(Double.valueOf(ExceptionExtensionGetmessage.c()), paramInt2, paramInt1);
            } else {
              this.d.setValueAt(Double.valueOf(ExceptionExtensionGetmessage.c()), paramInt1, paramInt2);
            } 
          } else if (ExceptionExtensionGetmessage.ExceptionInVPackage() == 2) {
            D.c("Param: " + aM1.aL() + " value: " + paramDouble + " below minimum: " + ExceptionExtensionGetmessage.c());
            if (this.d.f()) {
              this.d.setValueAt(Double.valueOf(ExceptionExtensionGetmessage.c()), paramInt2, paramInt1);
            } else {
              this.d.setValueAt(Double.valueOf(ExceptionExtensionGetmessage.c()), paramInt1, paramInt2);
            } 
          } 
        } 
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/bU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */