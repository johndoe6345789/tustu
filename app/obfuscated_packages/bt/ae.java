package bt;

import aH.a;
import s.g;

class ae {
  private a b = null;
  
  private int c;
  
  ae(ac paramac, int paramInt) {
    this.c = paramInt;
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof ae) ? ((((ae)paramObject).a() == this.c)) : ((paramObject instanceof Integer) ? ((((Integer)paramObject).intValue() == this.c)) : super.equals(paramObject));
  }
  
  public String toString() {
    if (this.b == null)
      return this.a.c.R() ? ("<html>" + g.b("Scanning for Devices") + "<br>CAN ID: " + this.c) : ("<html>" + g.b("Connect for device list") + "<br>CAN ID: " + this.c); 
    if (!this.b.c())
      return "<html><font color=gray>" + g.b("No Device Found") + "<br>CAN ID: " + this.c; 
    String str = this.b.a();
    if (str == null || str.isEmpty())
      str = this.b.d(); 
    if (str == null || str.isEmpty())
      str = "Unknown"; 
    if (str.length() > 22)
      str = str.substring(0, 22); 
    return "<html><font color=blue>" + str + "<br>CAN ID: " + this.c + " Online";
  }
  
  public int a() {
    return this.c;
  }
  
  public void a(a parama) {
    this.b = parama;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/ae.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */