package G;

import V.ExceptionPrintstacktrace;

public class ChannelSelectorConfig extends bA {
  private String a = null;

  private String b = null;

  private String c = null;

  private boolean d = false;

  public String b() {
    return this.c;
  }

  public String a() {
    return this.a;
  }

  public void a(String paramString) {
    this.a = paramString;
  }

  public String c() {
    return this.b;
  }

  public void b(String paramString) {
    this.b = paramString;
  }

  public String d() {
    return this.c;
  }

  public void c(String paramString) {
    this.c = paramString;
  }

  public void d(String paramString) {
    if (paramString.equals("filter32BitChannels")) {
      a(true);
    } else {
      throw new ExceptionPrintstacktrace(
          "Unknown channelSelector Option: "
              + paramString
              + ", Ignored. Known Options: filter32BitChannels");
    }
  }

  public boolean e() {
    return this.d;
  }

  public void a(boolean paramBoolean) {
    this.d = paramBoolean;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/G/E.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
