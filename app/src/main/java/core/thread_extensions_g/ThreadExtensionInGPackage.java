package AkGolfImpl;

import G.GComponentCb;
import L.n;
import V.VInterfaceHotel;
import VInterfaceHotel.AkGolfImpl;
import VInterfaceHotel.KInterfaceAlpha;
import VInterfaceHotel.i;
import W.T;
import W.V;
import W.W;
import W.Z;
import W.j;
import W.m;
import W.n;
import Z.ZInterfaceDelta;
import Z.ZInterfaceFoxtrot;
import ak.AkGolfImpl;
import ax.AxInterfaceUniform;
import bB.BbInterfaceCharlie;
import bB.BbInterfaceRomeo;
import bH.D;
import com.efiAnalytics.ui.bV;
import java.awt.Component;
import java.awt.Frame;
import java.io.File;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k.KInterfaceAlpha;
import k.ZInterfaceDelta;

public class ThreadExtensionInGPackage extends Thread {
  int KInterfaceAlpha = 0;

  private static int k = Integer.MAX_VALUE;

  HashMap b = new HashMap<>();

  HashMap BbInterfaceCharlie = new HashMap<>();

  boolean ZInterfaceDelta = false;

  private boolean l = false;

  boolean e = false;

  Component ZInterfaceFoxtrot = null;

  private boolean m = true;

  String[] AkGolfImpl = null;

  ArrayList VInterfaceHotel = new ArrayList();

  ArrayList i = new ArrayList();

  private static bB.b n = (bB.b) new BbInterfaceCharlie();

  private n o = null;

  NumberFormat j = new DecimalFormat("######.#####");

  public static bB.b KInterfaceAlpha() {
    return n;
  }

  public static void KInterfaceAlpha(bB.b paramb) {
    n = paramb;
  }

  public ThreadExtensionInGPackage(Component paramComponent) {
    this(paramComponent, false);
  }

  public ThreadExtensionInGPackage(Component paramComponent, boolean paramBoolean) {
    super("DataLoader_" + Math.random());
    this.ZInterfaceDelta = paramBoolean;
    this.ZInterfaceFoxtrot = paramComponent;
  }

  public void KInterfaceAlpha(KInterfaceAlpha parama) {
    this.i.add(parama);
  }

  private void KInterfaceAlpha(ArrayList paramArrayList) {
    Iterator<KInterfaceAlpha> iterator = this.i.iterator();
    while (iterator.hasNext()) ((KInterfaceAlpha) iterator.next()).KInterfaceAlpha(paramArrayList);
  }

  public void b() {
    String str1 = i.KInterfaceAlpha("DEFAULT_fieldMapping", "FieldMaps/MegaSquirt.properties");
    String str2 = i.KInterfaceAlpha("fieldMapping", str1);
    if (!str2.equals("Auto")) {
      AkGolfImpl.b(str2);
      System.out.println("Using " + str2 + " for Field Mappings");
    }
  }

  public void KInterfaceAlpha(boolean paramBoolean) {
    this.l = paramBoolean;
  }

  public void KInterfaceAlpha(String paramString) {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = paramString;
    KInterfaceAlpha(arrayOfString);
  }

  public void KInterfaceAlpha(String[] paramArrayOfString) {
    this.AkGolfImpl = paramArrayOfString;
  }

  public void start() {
    super.start();
    D.ZInterfaceDelta("Started Data Loader Thread");
  }

  public void run() {
    Thread.currentThread().setPriority(1);
    if (this.AkGolfImpl != null)
      try {
        b(this.AkGolfImpl);
      } catch (Exception exception) {
        String str = "Entire log file not loaded:\n" + exception.getMessage();
        KInterfaceAlpha(1.0D);
        KInterfaceAlpha(exception, str);
      } finally {
        System.gc();
      }
  }

  public void BbInterfaceCharlie() {
    this.e = true;
  }

  private boolean BbInterfaceCharlie(ArrayList paramArrayList, String paramString) {
    try {
      Iterator<j> iterator = paramArrayList.iterator();
      while (iterator.hasNext()) {
        if (((j) iterator.next()).KInterfaceAlpha().equals(paramString)) return true;
      }
    } catch (Exception exception) {
      D.KInterfaceAlpha("Exception checking for existance of appended field.");
    }
    return false;
  }

  public n b(String[] paramArrayOfString) {
    long l = System.currentTimeMillis();
    n n1 = new n();
    ArrayList<j> arrayList = new ArrayList();
    for (byte b1 = 0; b1 < paramArrayOfString.length; b1++) {
      File file = new File(paramArrayOfString[b1]);
      if (b1 > 0) {
        String str = file.getName();
        n1.KInterfaceAlpha(
            n1.ZInterfaceDelta() - 1, "begining of " + str + ", Time will be inconsistent");
      } else {
        n1.KInterfaceAlpha(file);
      }
      System.out.println("Begin load of " + file.getName());
      b();
      float ZInterfaceFoxtrot = 0.0F;
      ZInterfaceFoxtrot();
      KInterfaceAlpha(0.01D);
      byte b2 = 0;
      V v = W.KInterfaceAlpha().KInterfaceAlpha(file);
      if (v == null) return null;
      i.BbInterfaceCharlie("lastFileFormat", v.i());
      i.o = v.j();
      byte b3 = 0;
      boolean bool = false;
      byte b4 = 0;
      int i = 200;
      try {
        while (!this.e) {
          long l1 = System.currentTimeMillis();
          if (Runtime.getRuntime().freeMemory() < 800L) {
            System.out.println("Low Memory freemem=" + Runtime.getRuntime().freeMemory());
            if (k.KInterfaceAlpha()) {
              bV.ZInterfaceDelta(
                  "Low Application Memory!\nYour available system memory is running low.",
                  new Frame());
              break;
            }
            bV.ZInterfaceDelta(
                "Low Application Memory!\n"
                    + "To load large files on KInterfaceAlpha capable computer, start application"
                    + " with memory parameters.\n"
                    + "Example Command line:\n"
                    + "java -Xms256m -Xmx1024m -jar "
                    + KInterfaceAlpha(i.b, " ", "")
                    + ".jar",
                new Frame());
            break;
          }
          boolean bool1 = false;
          while (!v.e() && this.l && !this.e && System.currentTimeMillis() - l1 <= 600000L) {
            bool1 = true;
            try {
              Thread.sleep(50L);
            } catch (Exception exception) {
              break;
            }
          }
          if (bool1 && v.e() && this.l && !this.e) AkGolfImpl();
          if (!v.e()) break;
          if (arrayList.isEmpty() || !b3) {
            if (b1 == 0) {
              n1.clear();
              arrayList.clear();
              byte b7 = 0;
              Iterator<T> iterator = v.b();
              while (iterator.hasNext()) {
                T t = iterator.next();
                String str1 = t.KInterfaceAlpha();
                String str2 = i.ZInterfaceDelta.getProperty(str1 + "_NAME");
                if (str2 != null && !str2.equals("")) str1 = str2;
                j j = new j(str1, (int) v.ZInterfaceDelta());
                j.e(t.e());
                j.j(t.e());
                j.e(t.b());
                j.ZInterfaceFoxtrot(t.ZInterfaceFoxtrot());
                j.KInterfaceAlpha(t.AkGolfImpl());
                j.AkGolfImpl(t.j());
                if (!v.ZInterfaceFoxtrot()) {
                  j.VInterfaceHotel(t.ZInterfaceDelta());
                  j.i(t.BbInterfaceCharlie());
                }
                if (!Float.isNaN(t.VInterfaceHotel())
                    && !Float.isNaN(t.i())
                    && t.VInterfaceHotel() < t.i()) {
                  j.ZInterfaceDelta(t.VInterfaceHotel());
                  j.e(t.i());
                }
                j.BbInterfaceCharlie(i.BbInterfaceCharlie(j.KInterfaceAlpha() + "_FORMULA"));
                j.ZInterfaceDelta(i.BbInterfaceCharlie(j.KInterfaceAlpha() + "_MAP_FILE"));
                arrayList.add(j);
                b7++;
              }
              D.ZInterfaceDelta(
                  "Opening Log, expected size: Field Count: "
                      + arrayList.size()
                      + ", Records: "
                      + v.ZInterfaceDelta());
              boolean bool2 =
                  (VInterfaceHotel.b.KInterfaceAlpha().KInterfaceAlpha("fieldNameNormalization")
                          && i.KInterfaceAlpha("fieldNameNormaization", true))
                      ? true
                      : false;
              for (j j : arrayList) {
                String str1 = j.KInterfaceAlpha();
                String str2 = Z.b.KInterfaceAlpha().KInterfaceAlpha(str1);
                if (bool2
                    && str2 != null
                    && !str2.isEmpty()
                    && !str2.equals(str1)
                    && !KInterfaceAlpha(str2, arrayList)) {
                  D.ZInterfaceDelta("Field Name Standardization: mapping " + str1 + " > " + str2);
                  j.ZInterfaceFoxtrot(str1);
                  j.KInterfaceAlpha(str2);
                }
                KInterfaceAlpha(j);
              }
              KInterfaceAlpha(arrayList);
              j[] arrayOfJ = b(arrayList);
              for (byte b8 = 0; b8 < arrayOfJ.length; b8++) {
                if (!BbInterfaceCharlie(arrayList, arrayOfJ[b8].KInterfaceAlpha())) {
                  arrayList.add(arrayOfJ[b8]);
                  KInterfaceAlpha(arrayOfJ[b8]);
                }
              }
              AkGolfImpl AkGolfImpl = AkGolfImpl.KInterfaceAlpha();
              for (j j : arrayList) {
                int k = 0;
                if (GComponentCb.KInterfaceAlpha().b(j.KInterfaceAlpha()))
                  k =
                      GComponentCb.KInterfaceAlpha()
                          .KInterfaceAlpha(j.KInterfaceAlpha())
                          .intValue();
                int m = i.b("fieldSmoothingFactor_" + j.KInterfaceAlpha(), k);
                if (m > 0) {
                  j.AkGolfImpl(m);
                  j.b(true);
                }
                if (n1.KInterfaceAlpha(j.KInterfaceAlpha()) == null) {
                  n1.KInterfaceAlpha(j);
                  if (j.j() != null
                      && j.j().indexOf(AkGolfImpl.KInterfaceAlpha(AkGolfImpl.b)) != -1) {
                    if (j.KInterfaceAlpha().equals("AFR")
                        && n1.KInterfaceAlpha(AkGolfImpl.KInterfaceAlpha(AkGolfImpl.b)) == null)
                      if (n1.KInterfaceAlpha("afr") != null) {
                        D.b("Bad AFR(WBO2) formula \"" + j.j() + "\", corrected to:[afr]");
                        j.BbInterfaceCharlie("[afr]");
                      } else if (n1.KInterfaceAlpha("AFR") != null) {
                        D.b("Bad AFR(WBO2) formula \"" + j.j() + "\", corrected to:[AFR]");
                        j.BbInterfaceCharlie("[AFR]");
                      } else if (n1.KInterfaceAlpha("AFR1") != null) {
                        D.b("Bad AFR(WBO2) formula \"" + j.j() + "\", corrected to:[AFR1]");
                        j.BbInterfaceCharlie("[AFR1]");
                      } else if (n1.KInterfaceAlpha("Lambda") != null) {
                        D.b("Bad AFR(WBO2) formula \"" + j.j() + "\", corrected to:[Lambda]*14.7");
                        j.BbInterfaceCharlie("[Lambda]*14.7");
                      } else if (n1.KInterfaceAlpha("Lambda1") != null) {
                        D.b("Bad AFR(WBO2) formula \"" + j.j() + "\", corrected to:[Lambda1]*14.7");
                        j.BbInterfaceCharlie("[Lambda1]*14.7");
                      }
                    if (j.KInterfaceAlpha().equalsIgnoreCase(AkGolfImpl.KInterfaceAlpha("Lambda"))
                        && n1.KInterfaceAlpha(AkGolfImpl.KInterfaceAlpha(AkGolfImpl.b)) == null) {
                      if (n1.KInterfaceAlpha("afr") != null) {
                        D.b("Bad Lambda formula \"" + j.j() + "\", corrected to:[afr]/14.7");
                        j.BbInterfaceCharlie("[afr]/14.7");
                        continue;
                      }
                      if (n1.KInterfaceAlpha("AFR") != null) {
                        D.b("Bad Lambda formula \"" + j.j() + "\", corrected to:[AFR]/14.7");
                        j.BbInterfaceCharlie("[AFR]/14.7");
                        continue;
                      }
                      if (n1.KInterfaceAlpha("AFR1") != null) {
                        D.b("Bad Lambda formula \"" + j.j() + "\", corrected to:[AFR1]/14.7");
                        j.BbInterfaceCharlie("[AFR1]/14.7");
                        continue;
                      }
                      if (n1.KInterfaceAlpha("Lambda1") != null) {
                        D.b("Bad Lambda formula \"" + j.j() + "\", corrected to:[Lambda1]");
                        j.BbInterfaceCharlie("[Lambda1]");
                      }
                    }
                  }
                }
              }
              if (n1.KInterfaceAlpha(AkGolfImpl.KInterfaceAlpha("Lambda")) != null
                  && n1.KInterfaceAlpha(AkGolfImpl.KInterfaceAlpha(AkGolfImpl.VInterfaceHotel))
                      == null) {
                j j = new j(AkGolfImpl.KInterfaceAlpha(AkGolfImpl.VInterfaceHotel));
                j.BbInterfaceCharlie("[" + AkGolfImpl.KInterfaceAlpha("Lambda") + "]*14.7");
                KInterfaceAlpha(j);
                arrayList.add(j);
                n1.KInterfaceAlpha(j);
              }
              if (v instanceof AkGolfImpl) {
                n1.AkGolfImpl(((AkGolfImpl) v).o());
              } else {
                n1.AkGolfImpl(null);
              }
            } else {
              byte b7 = 0;
              Iterator<T> iterator = v.b();
              while (iterator.hasNext()) {
                T t = iterator.next();
                String str1 = t.KInterfaceAlpha();
                String str2 = i.ZInterfaceDelta.getProperty(str1 + "_NAME");
                if (str2 != null && !str2.equals("")) str1 = str2;
                j j = arrayList.get(b7++);
                try {
                  if (!j.KInterfaceAlpha().equals(str1)
                      && j.AxInterfaceUniform() != null
                      && !j.AxInterfaceUniform().equals(str1)) {
                    bV.ZInterfaceDelta(
                        "File Headers DO NOT Match!!!\n"
                            + "To load multiple fies they Must have identical field headers.\n"
                            + file.getAbsolutePath()
                            + "\nskipped.",
                        bV.BbInterfaceCharlie());
                    break;
                  }
                } catch (Exception exception) {
                  bV.ZInterfaceDelta(
                      "File Headers DO NOT Match!!!\n"
                          + "To load multiple fies they Must have identical field headers.\n"
                          + file.getAbsolutePath()
                          + "\nskipped.",
                      bV.BbInterfaceCharlie());
                  break;
                }
              }
            }
          } else {
            String str = AkGolfImpl.KInterfaceAlpha().KInterfaceAlpha("Time");
            j j1 = null;
            j j2 = null;
            if (str != null) {
              j1 = n1.KInterfaceAlpha(str);
              if (this.o != null) j2 = this.o.KInterfaceAlpha(str);
            }
            try {
              float[] arrayOfFloat = v.BbInterfaceCharlie();
              b4 = 0;
              for (byte b7 = 0; b7 < arrayList.size(); b7++) {
                j j = arrayList.get(b7);
                String str1 = "";
                String str2 = j.k();
                float f1 = 0.0F;
                if (j.l()) {
                  String str3 = j.j();
                  if (str3.indexOf("|") != -1) str3 = b(arrayList, str3);
                  str1 = str3;
                  try {
                    KInterfaceAlpha KInterfaceAlpha =
                        ZInterfaceDelta.KInterfaceAlpha().KInterfaceAlpha(str1);
                    f1 = (float) KInterfaceAlpha.KInterfaceAlpha(n1, n1.ZInterfaceDelta() - 1);
                  } catch (AxInterfaceUniform AxInterfaceUniform) {
                    f1 = Float.NaN;
                  } catch (Exception exception) {
                    boolean bool2;
                    String str4 =
                        "Error calculating field "
                            + j.KInterfaceAlpha()
                            + "\nFormula: ("
                            + j.j()
                            + ") produced an error.\n"
                            + "This is typically cause by fields required for calculated fields and"
                            + " are not\n"
                            + "available in the current open log. \n"
                            + "To stop this error, turn off the Calculated Field: "
                            + j.KInterfaceAlpha();
                    if (b3 > 1) {
                      bool2 = KInterfaceAlpha(exception, str4);
                    } else {
                      bool2 = false;
                      arrayList.remove(b7);
                      n1.b(j);
                      D.ZInterfaceDelta(
                          "unable to calculate field "
                              + j.KInterfaceAlpha()
                              + ", all required variables not present: "
                              + exception.getMessage());
                      b7--;
                    }
                    f1 = 0.0F;
                    KInterfaceAlpha KInterfaceAlpha =
                        ZInterfaceDelta.KInterfaceAlpha().KInterfaceAlpha(str1);
                    if (bool2 && KInterfaceAlpha != null)
                      D.KInterfaceAlpha(
                          "Failed to evaluate the following formula:\n"
                              + KInterfaceAlpha.BbInterfaceCharlie());
                  }
                } else if (b7 >= arrayOfFloat.length) {
                  if (ZInterfaceDelta() && b3 > 0) {
                    f1 = j.ZInterfaceDelta(j.i() - 1);
                  } else {
                    f1 = Float.NaN;
                  }
                } else if (ZInterfaceDelta() && Float.isNaN(arrayOfFloat[b7]) && b3 > 0) {
                  f1 = j.ZInterfaceDelta(j.i() - 1);
                } else {
                  f1 = arrayOfFloat[b7];
                }
                if (j.j() != null && j.j().indexOf("logVal") != -1)
                  if (j.KInterfaceAlpha().equals("RPM")) {
                    if (i.KInterfaceAlpha(j.KInterfaceAlpha() + "_USE_FORMULA", false))
                      f1 = KInterfaceAlpha(j.j(), arrayOfFloat[b7] + "").floatValue();
                  } else {
                    f1 = KInterfaceAlpha(j.j(), arrayOfFloat[b7] + "").floatValue();
                  }
                if (str2 != null && !str2.equals("")) {
                  ZInterfaceDelta ZInterfaceDelta = b(str2);
                  f1 = (float) ZInterfaceDelta.KInterfaceAlpha(arrayOfFloat[b7]);
                }
                if (j.KInterfaceAlpha().equals("Time") && j.x() && !Float.isNaN(f1)) j.i(-f1);
                j.KInterfaceAlpha(f1);
              }
              if (i.KInterfaceAlpha("timeGapsOn", false)
                  && n1.ZInterfaceDelta() > 3
                  && b3 > 5
                  && j1 != null) {
                float f1 = j1.BbInterfaceCharlie(j1.i() - 1) - j1.BbInterfaceCharlie(j1.i() - 2);
                if (f1 > 0.0F)
                  ZInterfaceFoxtrot =
                      (ZInterfaceFoxtrot > 0.0D)
                          ? ((n1.ZInterfaceDelta() * ZInterfaceFoxtrot + f1)
                              / (n1.ZInterfaceDelta() + 1.0F))
                          : f1;
                if (f1 > 0.05F && f1 > 2.5D * ZInterfaceFoxtrot) {
                  int j = n1.ZInterfaceDelta() - 2;
                  if (f1 > 5.0F * ZInterfaceFoxtrot)
                    n1.BbInterfaceCharlie(
                        j,
                        "Time gap: no log entries for " + k.KInterfaceAlpha(f1, 2) + " seconds.");
                  for (byte b8 = 1; b8 * ZInterfaceFoxtrot < f1 && b8 < 50; b8++) {
                    for (j j3 : arrayList) {
                      if (j3.KInterfaceAlpha().equals("Engine")) {
                        j3.KInterfaceAlpha(j3.i() - 1, j3.BbInterfaceCharlie(j));
                        continue;
                      }
                      float f2 = j3.BbInterfaceCharlie(j);
                      float f3 = j3.BbInterfaceCharlie(j3.i() - 1);
                      float f4 = f2 + b8 * ZInterfaceFoxtrot / f1 * (f3 - f2);
                      j3.KInterfaceAlpha(j3.i() - 1, f4);
                      n1.b(j3.i() - 2, "Time Gap: Calculated Record");
                    }
                  }
                }
              }
              if (b3 == 1) {
                KInterfaceAlpha(n1);
                bool = true;
                KInterfaceAlpha(b3 / v.ZInterfaceDelta());
                System.gc();
              } else if (b3 % i == 0) {
                KInterfaceAlpha(b3 / v.ZInterfaceDelta());
                i = (int) (v.ZInterfaceDelta() / 200L);
                if (i < 200) {
                  i = 200;
                } else if (i % 2 != 0) {
                  i++;
                }
                Thread.yield();
              }
              if (b3 > k)
                throw new VInterfaceHotel(
                    "The Lite! edition is limited to " + k + " Records. Please Register!");
              if (j1 != null)
                n.KInterfaceAlpha().KInterfaceAlpha((long) (j1.ZInterfaceDelta(b3) * 1000.0F));
              n.KInterfaceAlpha().KInterfaceAlpha(b3);
            } catch (m m) {
              if (b4 && n1.ZInterfaceDelta() > 0)
                for (j j : arrayList) j.b(j.BbInterfaceCharlie(j.i() - 1));
              n1.KInterfaceAlpha(n1.ZInterfaceDelta() - 1, m.getMessage());
              b4++;
            } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
              if (b2++ > 10 && v.e())
                throw new VInterfaceHotel(
                    "Error parsing file, too many bad rows found " + b2 + ", discontinuing.");
            }
          }
          b3++;
        }
        byte b5;
        for (b5 = 0; b5 < n1.size(); b5++) {
          Z z = v.KInterfaceAlpha(b5);
          if (z != null) {
            j j = (j) n1.get(b5);
            j.b(false);
            j.KInterfaceAlpha(z.KInterfaceAlpha());
          }
        }
        if (v.AkGolfImpl() != null && !n1.VInterfaceHotel()) n1.BbInterfaceCharlie(v.AkGolfImpl());
        if (v.VInterfaceHotel() != null) n1.BbInterfaceCharlie(v.VInterfaceHotel());
      } catch (OutOfMemoryError outOfMemoryError) {
        outOfMemoryError.printStackTrace();
        bV.ZInterfaceDelta(
            "Using all allocated Memory, can not load remainder of file.", bV.BbInterfaceCharlie());
        return n1;
      } finally {
        if (n1.ZInterfaceDelta() <= 0) {
          if (i.j()) {
            bV.ZInterfaceDelta(
                "Log File contains no data or is not recognized.\n"
                    + "If this is an ASCII type log file, \n"
                    + "Check the selected File Delimiter under the Options Menu.",
                new Frame());
          } else {
            String str =
                "No Data Was found in this log file.\n"
                    + "Delimiter Auto Detect is currently disabled under the options menu.\n\n"
                    + "Would you like to try loading this file again with Auto Detect Delimiter"
                    + " enabled?";
            boolean bool2 = bV.KInterfaceAlpha(str, bV.BbInterfaceCharlie(), true);
            if (bool2) {
              i.BbInterfaceCharlie("delimiter", "Auto");
              return b(paramArrayOfString);
            }
          }
        } else if (!bool) {
          KInterfaceAlpha(n1);
          bool = true;
        }
        boolean bool1 = false;
        for (byte b5 = 0; b5 < n1.size(); b5++) {
          j j = (j) n1.get(b5);
          if (!j.q()) {
            n1.b(j);
            bool1 = true;
            b5--;
          } else if (j.BbInterfaceRomeo()) {
            j.t();
          }
          int k = i.b("fieldIndexOffset_" + j.KInterfaceAlpha(), 0);
          if (k != 0) j.i(k);
        }
        if (bool1) KInterfaceAlpha(n1);
        KInterfaceAlpha(1.0D);
        v.KInterfaceAlpha();
      }
    }
    System.out.println(
        "File load time ="
            + ((System.currentTimeMillis() - l) / 1000.0D)
            + " sec.  "
            + n1.ZInterfaceDelta()
            + " rows, Field Count: "
            + n1.size());
    return n1;
  }

  private boolean KInterfaceAlpha(String paramString, List paramList) {
    for (j j : paramList) {
      if (j.KInterfaceAlpha().equals(paramString)) return true;
    }
    return false;
  }

  public String KInterfaceAlpha(ArrayList paramArrayList, String paramString) {
    int i = 1;
    int j = paramString.indexOf("-");
    if (j > 0) {
      String str = paramString.substring(j + 1);
      paramString = paramString.substring(0, j);
      i += Integer.parseInt(str);
    }
    for (j j1 : paramArrayList) {
      if (j1.KInterfaceAlpha().equals(paramString)) {
        int k = j1.i();
        return (k - i >= 0) ? KInterfaceAlpha(j1.BbInterfaceCharlie(k - i)) : "0";
      }
    }
    return "0";
  }

  private String KInterfaceAlpha(float paramFloat) {
    return this.j.format(paramFloat);
  }

  public ZInterfaceDelta b(String paramString) {
    ZInterfaceDelta ZInterfaceDelta = (ZInterfaceDelta) this.b.get(paramString);
    if (ZInterfaceDelta != null) return ZInterfaceDelta;
    ZInterfaceDelta = new ZInterfaceDelta();
    ZInterfaceDelta.KInterfaceAlpha(".", paramString);
    this.b.put(paramString, ZInterfaceDelta);
    return ZInterfaceDelta;
  }

  private int BbInterfaceCharlie(String paramString) {
    boolean bool = false;
    for (byte b1 = 0; b1 < paramString.length(); b1++) {
      if (paramString.charAt(b1) == '[') {
        bool = true;
      } else if (paramString.charAt(b1) == ']') {
        bool = false;
      }
      if (bool && paramString.charAt(b1) == '|') return b1;
    }
    return -1;
  }

  protected String b(ArrayList paramArrayList, String paramString) {
    int i = BbInterfaceCharlie(paramString);
    if (i == -1) return paramString;
    boolean bool = (i < paramString.indexOf(".")) ? true : false;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    if (bool) {
      str1 = paramString.substring(i + 1, paramString.indexOf("]"));
      str1 = KInterfaceAlpha(str1, "]", "");
      str2 = paramString.substring(0, i);
      str2 = KInterfaceAlpha(str2, "[", "");
      str3 = paramString.substring(0, paramString.indexOf(str2) - 1);
      str4 =
          paramString.substring(
              paramString.indexOf(str1) + str1.length() + 1, paramString.length());
    } else {
      str1 = paramString.substring(0, i);
      str2 = paramString.substring(i + 1);
      str1 = KInterfaceAlpha(str1, "[", "");
      str2 = KInterfaceAlpha(str2, "]", "");
      str3 = paramString.substring(0, paramString.indexOf(str1) - 1);
      str4 =
          paramString.substring(
              paramString.indexOf(str2) + str2.length() + 1, paramString.length());
    }
    ZInterfaceDelta ZInterfaceDelta = b(str1);
    return str3 + ZInterfaceDelta.KInterfaceAlpha(KInterfaceAlpha(paramArrayList, str2)) + str4;
  }

  private boolean KInterfaceAlpha(Exception paramException, String paramString) {
    if (this.BbInterfaceCharlie.get(paramException.getMessage()) == null) {
      this.BbInterfaceCharlie.put(paramException.getMessage(), paramException);
      paramException.printStackTrace();
      if (this.ZInterfaceFoxtrot != null && this.KInterfaceAlpha < 3) {
        if (paramString == null || paramString.equals(""))
          paramString = paramException.getMessage();
        paramString = paramString + "\nFurther occurances of this error will be supressed.";
        k.KInterfaceAlpha(paramString, this.ZInterfaceFoxtrot);
        this.KInterfaceAlpha++;
        return true;
      }
    }
    return false;
  }

  private Float KInterfaceAlpha(String paramString1, String paramString2) {
    double ZInterfaceDelta = 0.0D;
    if (paramString2 != null && !paramString2.equals(""))
      try {
        ZInterfaceDelta = Double.parseDouble(paramString2);
      } catch (Exception exception) {
      }
    paramString1 = KInterfaceAlpha(paramString1, "logVal", paramString2);
    String str = "";
    str = str + e.KInterfaceAlpha(paramString1);
    int i = str.indexOf('.');
    if (i != -1 && str.length() - i > 3) str = str.substring(0, i + 4);
    return Float.valueOf(Float.parseFloat(str));
  }

  private j[] b(ArrayList paramArrayList) {
    String[] arrayOfString = i.ZInterfaceFoxtrot("APPEND_FIELD_");
    ArrayList<j> arrayList1 = new ArrayList();
    ArrayList<j> arrayList2 = new ArrayList();
    int i;
    for (i = 0; i < arrayOfString.length; i++) {
      String str = arrayOfString[i];
      if (str.length() > "APPEND_FIELD_".length()) {
        j j = new j(str.substring("APPEND_FIELD_".length(), str.length()));
        String str1 = i.b(str);
        try {
          str1 = AkGolfImpl.KInterfaceAlpha().BbInterfaceCharlie(str1);
          j.BbInterfaceCharlie(str1);
          if (VInterfaceHotel.b.KInterfaceAlpha().b(j.KInterfaceAlpha())) arrayList2.add(j);
        } catch (Exception exception) {
          D.KInterfaceAlpha("Unable to map fields for formula: " + str1);
        }
      }
    }
    for (ZInterfaceDelta ZInterfaceDelta : ZInterfaceFoxtrot.KInterfaceAlpha().b()) {
      List<? extends j> list = ZInterfaceDelta.KInterfaceAlpha(paramArrayList);
      arrayList2.addAll(list);
    }
    i = arrayList2.size();
    for (byte b1 = 0; b1 < i && arrayList2.size() > 0; b1++) {
      for (byte b2 = 0; b2 < arrayList2.size(); b2++) {
        j j = arrayList2.get(b2);
        if (KInterfaceAlpha(paramArrayList, arrayList1, j)) {
          arrayList1.add(j);
          arrayList2.remove(b2);
          b2--;
        }
      }
    }
    for (j j : arrayList2)
      D.ZInterfaceDelta(
          "not loading field '"
              + j.KInterfaceAlpha()
              + "', not all the dependent fields are available.");
    return arrayList1.<j>toArray(new j[arrayList1.size()]);
  }

  private boolean KInterfaceAlpha(ArrayList paramArrayList1, ArrayList paramArrayList2, j paramj) {
    try {
      if (paramj.KInterfaceAlpha().equals("AFR") || paramj.KInterfaceAlpha().equals("Lambda"))
        return true;
      String str = paramj.j();
      KInterfaceAlpha KInterfaceAlpha = ZInterfaceDelta.KInterfaceAlpha().KInterfaceAlpha(str);
      String[] arrayOfString = KInterfaceAlpha.b();
      for (byte b1 = 0; b1 < arrayOfString.length; b1++) {
        if (!arrayOfString[b1].equals(paramj.KInterfaceAlpha())
            && !ZInterfaceDelta(paramArrayList1, arrayOfString[b1])
            && e(paramArrayList2, arrayOfString[b1]) == null) return false;
      }
      return true;
    } catch (Exception exception) {
      return false;
    }
  }

  private boolean ZInterfaceDelta(ArrayList<j> paramArrayList, String paramString) {
    for (byte b1 = 0; b1 < paramArrayList.size(); b1++) {
      if (((j) paramArrayList.get(b1)).KInterfaceAlpha().equals(paramString)) return true;
    }
    return false;
  }

  private j e(ArrayList<j> paramArrayList, String paramString) {
    for (byte b1 = 0; b1 < paramArrayList.size(); b1++) {
      if (((j) paramArrayList.get(b1)).KInterfaceAlpha().equals(paramString))
        return paramArrayList.get(b1);
    }
    return null;
  }

  private String KInterfaceAlpha(String paramString1, String paramString2, String paramString3) {
    int i;
    for (i = paramString1.indexOf(paramString2); i >= 0; i = paramString1.indexOf(paramString2))
      paramString1 =
          paramString1.substring(0, i)
              + paramString3
              + paramString1.substring(i + paramString2.length());
    return paramString1;
  }

  private void ZInterfaceFoxtrot() {
    for (i.b b1 : this.VInterfaceHotel) b1.KInterfaceAlpha();
  }

  private void KInterfaceAlpha(n paramn) {
    for (i.b b1 : this.VInterfaceHotel) {
      try {
        if (this.ZInterfaceDelta) {
          b1.b(paramn);
          continue;
        }
        b1.KInterfaceAlpha(paramn);
      } catch (Exception exception) {
        D.KInterfaceAlpha("Exception caught notifying KInterfaceAlpha listener. Stack:");
        exception.printStackTrace();
      }
    }
  }

  private void KInterfaceAlpha(double paramDouble) {
    for (i.b b1 : this.VInterfaceHotel) {
      try {
        b1.KInterfaceAlpha(paramDouble);
      } catch (Exception exception) {
        exception.printStackTrace();
      }
    }
  }

  private void AkGolfImpl() {
    for (i.b b1 : this.VInterfaceHotel) b1.b();
  }

  public void KInterfaceAlpha(i.b paramb) {
    if (!this.VInterfaceHotel.contains(paramb)) this.VInterfaceHotel.add(paramb);
  }

  private j KInterfaceAlpha(j paramj) {
    BbInterfaceRomeo BbInterfaceRomeo = n.KInterfaceAlpha(paramj.KInterfaceAlpha());
    if (BbInterfaceRomeo != null) {
      paramj.AkGolfImpl((float) BbInterfaceRomeo.KInterfaceAlpha());
      paramj.ZInterfaceFoxtrot((float) BbInterfaceRomeo.b());
      if (BbInterfaceRomeo.ZInterfaceFoxtrot() != -1)
        paramj.e(BbInterfaceRomeo.ZInterfaceFoxtrot());
    }
    return paramj;
  }

  public static void KInterfaceAlpha(int paramInt) {
    k = paramInt;
  }

  boolean ZInterfaceDelta() {
    return this.m;
  }

  public void b(boolean paramBoolean) {
    this.m = paramBoolean;
  }

  public boolean e() {
    return this.l;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/AkGolfImpl/b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
