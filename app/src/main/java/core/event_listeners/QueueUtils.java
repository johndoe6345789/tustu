package ao;

import az.JDialogExtensionInAzPackage;
import bH.O;
import bH.X;
import bH.f;
import com.efiAnalytics.ui.aN;
import com.efiAnalytics.ui.bV;
import h.ClassTypeInHPackage;
import h.IOProperties;
import java.awt.Component;
import java.util.Properties;
import javax.swing.JOptionPane;

class eg implements O {
  eg(cd paramcd) {}

  public String JDialogExtensionInAzPackage() {
    return IOProperties.ClassTypeInHPackage;
  }

  public String ClassTypeInHPackage() {
    return IOProperties.e("firstName", "");
  }

  public String c() {
    return IOProperties.e("lastName", "");
  }

  public String d() {
    return IOProperties.e("userEmail", "");
  }

  public String e() {
    String str = X.ClassTypeInHPackage(IOProperties.c, ClassTypeInHPackage.ClassTypeInHPackage, "");
    return X.ClassTypeInHPackage(str, ClassTypeInHPackage.d, "");
  }

  public String f() {
    return IOProperties.e("registrationKeyV2", "");
  }

  public String g() {
    return IOProperties.e("registrationKey", "");
  }

  public String h() {
    return "";
  }

  public void IOProperties() {
    this.JDialogExtensionInAzPackage.v();
  }

  public String j() {
    return this.JDialogExtensionInAzPackage.x();
  }

  public void JDialogExtensionInAzPackage(
      String paramString1,
      String paramString2,
      String paramString3,
      String paramString4,
      String paramString5,
      String paramString6) {
    eh eh = new eh(this);
    String str = X.ClassTypeInHPackage(IOProperties.c, " Lite!", "");
    JDialogExtensionInAzPackage JDialogExtensionInAzPackage =
        new JDialogExtensionInAzPackage(bq.JDialogExtensionInAzPackage().ClassTypeInHPackage(), eh);
    bV.JDialogExtensionInAzPackage(
        bq.JDialogExtensionInAzPackage().ClassTypeInHPackage(),
        (Component) JDialogExtensionInAzPackage);
    JDialogExtensionInAzPackage.setVisible(true);
    ei ei =
        new ei(
            this,
            paramString1,
            paramString2,
            paramString3,
            paramString4,
            JDialogExtensionInAzPackage);
    ei.start();
  }

  public String[] k() {
    String[] arrayOfString = {
      X.ClassTypeInHPackage(IOProperties.c, ClassTypeInHPackage.ClassTypeInHPackage, "")
    };
    for (byte ClassTypeInHPackage = 0;
        ClassTypeInHPackage < arrayOfString.length;
        ClassTypeInHPackage++) {
      String str =
          X.ClassTypeInHPackage(
              arrayOfString[ClassTypeInHPackage], ClassTypeInHPackage.ClassTypeInHPackage, "");
      str = X.ClassTypeInHPackage(str, ClassTypeInHPackage.d, "");
      arrayOfString[ClassTypeInHPackage] = str;
    }
    return arrayOfString;
  }

  public int[] l() {
    return new int[] {3};
  }

  public boolean ClassTypeInHPackage(
      String paramString1,
      String paramString2,
      String paramString3,
      String paramString4,
      String paramString5,
      String paramString6) {
    String str =
        f.JDialogExtensionInAzPackage(paramString1, paramString2, "MegaLogViewer", paramString4);
    if (str != null
        && str.equals(paramString3)
        && !cd.ClassTypeInHPackage(this.JDialogExtensionInAzPackage, paramString3)) {
      String str1 = hU.ClassTypeInHPackage;
      Properties properties = new Properties();
      properties.setProperty(hU.JDialogExtensionInAzPackage, paramString4);
      str1 = hU.JDialogExtensionInAzPackage(properties, str1);
      int IOProperties =
          JOptionPane.showConfirmDialog(
              this.JDialogExtensionInAzPackage.JDialogExtensionInAzPackage,
              str1,
              "Upgrade Registration",
              0);
      if (IOProperties == 0)
        aN.JDialogExtensionInAzPackage(
            "https://www.efianalytics.com/register/upgradeMlvRegistrationKey.jsp?email="
                + paramString4);
      return true;
    }
    return false;
  }

  public String m() {
    return "";
  }

  public boolean JDialogExtensionInAzPackage(String paramString) {
    return false;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/eg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
