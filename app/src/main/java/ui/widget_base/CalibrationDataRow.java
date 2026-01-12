package W;

public class CalibrationDataRow {
  private String b = "";

  private String c = "";

  private String d = "";

  public CalibrationDataRow(
      ThrottleCalibrationGenerator paramE,
      String paramString1,
      String paramString2,
      String paramString3) {
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
  }

  public CalibrationDataRow(ThrottleCalibrationGenerator paramE) {}

  public String a() {
    return this.b;
  }

  public String b() {
    return this.c;
  }

  public String c() {
    return this.d;
  }

  public void a(String paramString) {
    this.d = paramString;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/G.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
