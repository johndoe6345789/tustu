package ak;

import java.util.ArrayList;
import java.util.List;

class ComparableImpl extends ak implements Comparable {
  int a;
  
  int b;
  
  int c;
  
  int d;
  
  int e;
  
  int f;
  
  int g;
  
  List h;
  
  am i;
  
  int j;
  
  int k = 0;
  
  double l = 0.0D;
  
  public ComparableImpl(ad paramad, int paramInt) {
    super(paramad.f.o, paramInt);
    if (this.b != 0 && this.e > 0) {
      this.h = new ArrayList(this.e);
      int i = this.b;
      for (byte b = 0; b < this.e; b++) {
        af af = new af(this, i);
        af.p = b;
        if (b == 0 && this.g > 0) {
          af.q = af.a(0);
          af.r = af.a(this.g - 1);
        } 
        this.h.add(af);
        i = af.a;
      } 
    } 
    if (this.c != 0)
      this.i = new am(paramad.f.o, this.c); 
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    af af = b();
    stringBuilder.append("ChannelGroupBlock{").append(",\n\t recordId=").append(this.d).append(",\n\t commentBlock=").append(this.i).append(",\n\t nChannels=").append(this.e).append(",\n\t nRecords=").append(this.g).append(",\n\t sizeOfRecord=").append(this.f).append(",\n\t samplingRate=").append(af.i).append(",\n\t firstTimeValue=").append(af.q).append(",\n\t lastTimeValue=").append(af.r).append(",\n\t logRecordIdx=").append(this.j).append(",\n\t channelBlocks=");
    for (byte b = 0; b < this.h.size(); b++) {
      af af1 = this.h.get(b);
      stringBuilder.append("\n\t  [").append(b).append("]=").append(af1);
    } 
    stringBuilder.append("\n}");
    return stringBuilder.toString();
  }
  
  public int a(ae paramae) {
    return (((af)this.h.get(0)).i < ((af)paramae.h.get(0)).i) ? -1 : 1;
  }
  
  public void a() {
    if (this.k == this.g)
      return; 
    boolean bool = true;
    for (byte b = 0;; b++) {
      if (b < this.h.size()) {
        af af = this.h.get(b);
        double d = af.a(this.k);
        if (b == 0) {
          this.l = d;
          if (this.m.f.o.p + 0.5D * this.m.f.o.r > this.l) {
            bool = false;
          } else {
            this.m.f.o.l[af.k()] = (float)this.m.f.o.p;
            b++;
          } 
        } 
        this.m.f.o.l[af.k()] = (this.m.f.o.p > af.r || this.k == this.g) ? Float.NaN : (float)d;
      } else {
        break;
      } 
    } 
    if (!bool)
      this.k++; 
  }
  
  af b() {
    af af = this.h.get(0);
    return af.d ? af : null;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ak/ae.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */