package E;

import bW.c;
import java.net.InetAddress;
import java.util.ArrayList;

public class a {
  private ArrayList a = new ArrayList();
  
  public void a(byte paramByte, InetAddress paramInetAddress) {
    this.a.add(c.a(paramByte, paramInetAddress));
  }
  
  public void a(byte paramByte, int paramInt) {
    this.a.add(c.a(paramByte, paramInt));
  }
  
  public c[] a() {
    c[] arrayOfC = new c[this.a.size()];
    return (c[])this.a.toArray((Object[])arrayOfC);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/E/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */