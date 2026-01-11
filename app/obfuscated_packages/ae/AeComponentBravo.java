package ae;

import java.io.File;

public class AeComponentBravo implements e {
  public String a(File paramFile) {
    return paramFile.getName().equals("microsquirt.s19") ? "MicroSquirt (Cased)" : (paramFile.getName().equals("microsquirt-module.s19") ? "MicroSquirt Module" : (paramFile.getName().equals("mspnp2.s19") ? "DIY - Plug-N-Play" : (paramFile.getName().equals("megasquirt2.s19") ? "MegaSquirt 2" : (paramFile.getName().equals("msns-extra.s19") ? "MegaSquirt 1 - MS1Extra" : (paramFile.getName().equals("megasquirt.s19") ? "MegaSquirt 1 - B&G" : (paramFile.getName().startsWith("Monitor_") ? "MegaSquirt II - B&G" : (paramFile.getName().equalsIgnoreCase("ms3pro.s19") ? o.l : (paramFile.getName().equalsIgnoreCase("ms3pro-ult.s19") ? o.n : (paramFile.getName().equalsIgnoreCase("ms3pro-evo.s19") ? o.m : (paramFile.getName().equalsIgnoreCase("ms3.s19") ? o.k : ""))))))))));
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ae/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */