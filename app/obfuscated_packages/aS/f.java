package aS;

import G.cu;
import L.y;
import ac.f;
import ac.h;
import java.io.File;

public class f implements f {
  int a = 0;
  
  int b = 0;
  
  long c = 0L;
  
  public f() {
    cu.a().d("dataLoggingActive");
    cu.a().d("dataLogTime");
    d();
    cu.a().d("dataLogRecordCount");
    cu.a().a("dataLogRecordCount", 0.0D);
  }
  
  public void a(File paramFile) {
    cu.a().a("dataLoggingActive", 1.0D);
    cu.a().a("dataLogTime", 0.0D);
    this.a = 0;
  }
  
  public void c() {
    cu.a().a("dataLogRecordCount", this.a++);
    if (h.s() == null || h.s().a() == 0.0D)
      cu.a().a("dataLogTime", y.c()); 
  }
  
  public void d() {
    cu.a().a("dataLoggingActive", 0.0D);
    this.c = 0L;
  }
  
  public void b(String paramString) {
    cu.a().a("dataLogMarkCount", this.b++);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aS/f.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */