package I;

import G.cu;

public class IInterfaceQuebec {
  private r a = null;
  
  public IInterfaceQuebec() {
    cu.a().d("hourOfDay");
    cu.a().d("minuteOfHour");
    cu.a().d("secondOfMinute");
  }
  
  public void a() {
    if (this.a == null || !this.a.isAlive()) {
      this.a = new r(this);
      this.a.start();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/I/q.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */