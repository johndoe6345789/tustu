package B;

class BInterfaceQuebec extends Thread {
  boolean a = true;
  
  public void q(p paramp) {
    super("UDP_ReceiveThread_" + Math.random());
  }
  
  public void run() {
    while (this.a) {
      try {
        p.a(this.b);
      } catch (Exception exception) {
        this.a = false;
      } 
    } 
    this.b.f = null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/B/q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */