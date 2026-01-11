package aA;

class ThreadedInAaPackage extends Thread {
  String a;
  
  String b;
  
  k(h paramh, String paramString1, String paramString2) {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public void run() {
    this.c.b(this.a, this.b);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aA/k.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */