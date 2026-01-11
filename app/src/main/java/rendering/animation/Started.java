package aM;

import W.q;

class Started implements q {
  long a = -1L;
  
  String b = "";
  
  Started(a parama) {}
  
  public void started(long paramLong) {
    this.a = paramLong;
    this.b = (paramLong / 1024L) + " KB";
  }
  
  public void updateProgress(long paramLong, double paramDouble) {
    String str = (paramLong / 1024L) + " KB";
    this.c.c.a(str + " of " + this.b + ", " + Math.round(paramDouble * 100.0D) + "%");
  }
  
  public void completed() {}
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aM/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */