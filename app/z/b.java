package z;

import G.F;
import G.l;
import V.d;
import bH.D;
import gnu.io.PortInUseException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class b extends Thread {
  private boolean b = false;
  
  b(a parama) {}
  
  public void run() {
    b();
  }
  
  private void b() {
    try {
      F f = this.a.b.e();
      this.a.c = this.a.b.e().r() + "";
      this.a.d = this.a.b.e().aw();
      f.j(this.a.d());
      f.E(1000);
      this.a.b.h();
      this.a.b.a("BurstLogger", this.a.e());
      a(true);
      byte b1 = 10;
      byte b2 = this.a.f() ? 40 : 100;
      while (this.b) {
        byte[] arrayOfByte = new byte[1];
        try {
          if (this.a.f()) {
            byte[] arrayOfByte1 = new byte[1];
            arrayOfByte1[0] = 65;
            arrayOfByte = this.a.b.a(arrayOfByte1, b1, b2, f.n(), null);
          } else {
            arrayOfByte = this.a.b.a(f.w().d(), b1, b2, f.n(), null);
          } 
          if (arrayOfByte.length == f.n()) {
            a.a(this.a, arrayOfByte);
            continue;
          } 
          if (arrayOfByte.length % f.n() == 0) {
            byte[] arrayOfByte1 = new byte[f.n()];
            D.c("Doing a loop: Expected:" + f.n() + ", recieved:" + arrayOfByte.length);
            for (byte b3 = 0; b3 * arrayOfByte1.length < arrayOfByte.length; b3++) {
              System.arraycopy(arrayOfByte, b3 * arrayOfByte1.length, arrayOfByte1, 0, arrayOfByte1.length);
              a.a(this.a, arrayOfByte1);
            } 
            continue;
          } 
          D.b("Unexpected data packet length. Expected:" + f.n() + ", recieved:" + arrayOfByte.length);
        } catch (IOException iOException) {
          Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, iOException);
          D.b("IOException during Burst logging.");
        } catch (V.b b3) {
          b1++;
          a.a(this.a, null);
        } catch (d d) {
          b1++;
          a.a(this.a, null);
        } 
      } 
    } catch (l l) {
      D.a("COMM Error occurred during burst logging.", (Exception)l, null);
    } catch (PortInUseException portInUseException) {
      D.a("COMM Port in use by " + portInUseException.currentOwner, (Exception)portInUseException, null);
    } finally {
      this.a.b.e().j(this.a.c);
      this.a.b.e().E(this.a.d);
      a(false);
      this.a.b.h();
    } 
  }
  
  public boolean a() {
    return this.b;
  }
  
  public void a(boolean paramBoolean) {
    this.b = paramBoolean;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/z/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */