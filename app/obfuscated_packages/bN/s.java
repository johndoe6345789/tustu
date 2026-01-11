package bN;

import java.io.IOException;

class s extends Thread {
  boolean a = true;
  
  s(r paramr) {
    if (r.a(paramr)) {
      setName("XCP Writer_Master" + Math.random());
    } else {
      setName("XCP Writer_Slave" + Math.random());
    } 
  }
  
  public void run() {
    while (this.a) {
      try {
        r.b(this.b);
        r.a(this.b, 5000);
      } catch (IOException iOException) {
        r.a(this.b, iOException);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bN/s.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */