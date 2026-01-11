package aL;

import javax.sound.sampled.Line;
import javax.sound.sampled.Mixer;

class TostringInAlPackage {
  Mixer.Info a;
  
  Mixer b;
  
  Line.Info c;
  
  TostringInAlPackage(a parama, Mixer.Info paramInfo, Mixer paramMixer, Line.Info paramInfo1) {
    this.a = paramInfo;
    this.b = paramMixer;
    this.c = paramInfo1;
  }
  
  public String toString() {
    return this.a.getName();
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aL/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */