package h;

import g.GInterfaceAlpha;

class HInterfaceEcho implements GInterfaceAlpha {
  HInterfaceEcho(b paramb) {}
  
  public boolean GInterfaceAlpha(String paramString) {
    return (paramString != null && (paramString.equals("AFR") || paramString.equals("Lambda")));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/h/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */