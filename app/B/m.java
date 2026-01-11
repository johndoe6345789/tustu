package B;

import A.r;
import A.s;
import G.R;
import bH.D;
import bS.r;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class m extends l implements r {
  ServerSocket l = null;
  
  c m;
  
  R n;
  
  private int o = -1;
  
  public m(R paramR) {
    this.n = paramR;
    this.m = new c(paramR);
    this.d = 21845;
  }
  
  public r v() {
    m m1 = null;
    int i = u();
    this.m.b(i);
    if (this.o > 0) {
      this.m.a(this.o);
    } else {
      this.m.a(i);
    } 
    this.m.b();
    try {
      if (this.l == null || !this.l.isBound()) {
        this.l = new ServerSocket(i);
        try {
          byte[] arrayOfByte = this.l.getInetAddress().getAddress();
          String str = arrayOfByte[0] + ":" + arrayOfByte[1] + ":" + arrayOfByte[2] + ":" + arrayOfByte[3];
          this.c = str;
        } catch (Exception exception) {
          D.a("Server failed to get bound IP address");
        } 
      } 
      b(2);
      D.d("TCP/IP Server Connection " + this.n.c() + " listening on port: " + i);
      Socket socket = this.l.accept();
      D.d("TCP/IP Server Connection opened on: " + i + ", socket info: " + socket.toString());
      m1 = new m(this.n);
      for (r r1 : l()) {
        try {
          m1.a(r1.c(), a(r1.c()));
        } catch (s s) {
          Logger.getLogger(m.class.getName()).log(Level.WARNING, "Failed to set Setting", (Throwable)s);
        } 
      } 
      m1.a(socket);
      m1.a(new BufferedInputStream(socket.getInputStream()));
      m1.a(socket.getOutputStream());
      m1.b(3);
      m1.a();
    } catch (IOException iOException) {
      g();
      D.a(iOException);
    } finally {
      this.m.a();
    } 
    return m1;
  }
  
  public void w() {
    this.m.a();
    if (this.l != null) {
      try {
        this.l.close();
      } catch (IOException iOException) {
        Logger.getLogger(m.class.getName()).log(Level.SEVERE, "Error trying to stop TCP Slave Server", iOException);
      } 
      this.l = null;
    } 
  }
  
  public int s() {
    return 2;
  }
  
  public int x() {
    return 10;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/B/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */