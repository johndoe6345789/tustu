package R;

public abstract class AbstractInRPackage {
  public static String a = "basicUserReview";

  public static String b = "submitTranslationUpdate";

  public static String c = "submitProposedTranslation";

  private long d = System.currentTimeMillis();

  public abstract String a();

  public final String k() {
    return a() + "_" + this.d;
  }

  public long l() {
    return this.d;
  }

  public void a(long paramLong) {
    this.d = paramLong;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/R/l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
