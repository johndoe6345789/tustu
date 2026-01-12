package aS;

import G.ManagerUsingArrayList;
import L.y;
import ac.AbstractUsingArrayList;
import ac.AcInterfaceFoxtrot;
import java.io.File;

public class AsInterfaceFoxtrot implements AcInterfaceFoxtrot {
  int a = 0;

  int b = 0;

  long c = 0L;

  public AsInterfaceFoxtrot() {
    ManagerUsingArrayList.a().d("dataLoggingActive");
    ManagerUsingArrayList.a().d("dataLogTime");
    d();
    ManagerUsingArrayList.a().d("dataLogRecordCount");
    ManagerUsingArrayList.a().a("dataLogRecordCount", 0.0D);
  }

  public void a(File paramFile) {
    ManagerUsingArrayList.a().a("dataLoggingActive", 1.0D);
    ManagerUsingArrayList.a().a("dataLogTime", 0.0D);
    this.a = 0;
  }

  public void c() {
    ManagerUsingArrayList.a().a("dataLogRecordCount", this.a++);
    if (AbstractUsingArrayList.s() == null || AbstractUsingArrayList.s().a() == 0.0D)
      ManagerUsingArrayList.a().a("dataLogTime", y.c());
  }

  public void d() {
    ManagerUsingArrayList.a().a("dataLoggingActive", 0.0D);
    this.c = 0L;
  }

  public void b(String paramString) {
    ManagerUsingArrayList.a().a("dataLogMarkCount", this.b++);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aS/AcInterfaceFoxtrot.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
