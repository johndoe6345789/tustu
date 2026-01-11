package com.efiAnalytics.ui;

import V.ExceptionInVPackage;
import bH.X;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Calendar;
import java.util.StringTokenizer;

public class VexFileParser {
  public s ExceptionInVPackage(s params, String paramString) {
    FileReader fileReader;
    s s1 = new s();
    File file = new File(paramString);
    try {
      fileReader = new FileReader(file);
    } catch (FileNotFoundException fileNotFoundException) {
      throw new ExceptionInVPackage("File not found:\n" + paramString);
    } 
    double d1 = 1.0D;
    double d2 = 0.0D;
    try {
      for (String str = ExceptionInVPackage(fileReader); str != null; str = ExceptionInVPackage(fileReader)) {
        if (str.startsWith("Scale")) {
          str = X.b(str, "Scale", "").trim();
          d1 = Double.parseDouble(str);
        } else if (str.startsWith("Translate")) {
          str = X.b(str, "Translate", "").trim();
          d2 = Double.parseDouble(str);
        } else if (str.startsWith("VE Table RPM")) {
          String str1 = str.substring(str.indexOf("[") + 1, str.indexOf("]"));
          String[] arrayOfString = new String[Integer.parseInt(str1.trim())];
          for (byte b = 0; b < arrayOfString.length; b++) {
            str = ExceptionInVPackage(fileReader);
            int i = Integer.parseInt(str.substring(str.indexOf("=") + 1).trim());
            arrayOfString[b] = (i * 100) + "";
            if (b > 0 && i * 100 < Integer.parseInt(arrayOfString[b - 1]))
              throw new ExceptionInVPackage("Invalid RPM: \n" + (i * 100) + " less than " + arrayOfString[b - 1] + "\nRecheck your Vex file."); 
          } 
          s1.e("");
          s1.c(arrayOfString);
        } else if (str.startsWith("VE Table Load Range")) {
          String str1 = str.substring(str.indexOf("[") + 1, str.indexOf("]"));
          s1.d(str.substring(str.indexOf("(") + 1, str.indexOf(")")));
          String[] arrayOfString = new String[Integer.parseInt(str1.trim())];
          for (byte b = 0; b < arrayOfString.length; b++) {
            str = ExceptionInVPackage(fileReader);
            int i = Integer.parseInt(str.substring(str.indexOf("=") + 1).trim());
            arrayOfString[b] = i + "";
            if (b > 0 && i < Integer.parseInt(arrayOfString[b - 1]))
              throw new ExceptionInVPackage("Invalid Y Axis value. \n" + i + " less than " + arrayOfString[b + 1] + "\nRecheck your Vex file."); 
          } 
          s1.d(arrayOfString);
        } else if (str.startsWith("VE Table")) {
          int i = Integer.parseInt(str.substring(str.indexOf("[") + 1, str.indexOf("]")).trim());
          int j = Integer.parseInt(str.substring(str.lastIndexOf("[") + 1, str.lastIndexOf("]")).trim());
          s1.ExceptionInVPackage(j, i);
          str = ExceptionInVPackage(fileReader);
          for (byte b = 0; b < j; b++) {
            str = ExceptionInVPackage(fileReader);
            str = str.substring(str.indexOf("=") + 1);
            StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
            for (byte b1 = 0; b1 < i; b1++) {
              int k = Integer.parseInt(stringTokenizer.nextToken().trim());
              double d = (k + d2) * d1;
              s1.ExceptionInVPackage(Double.valueOf(d), b, b1);
            } 
          } 
        } 
      } 
    } catch (ExceptionInVPackage ExceptionInVPackage) {
      throw ExceptionInVPackage;
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ExceptionInVPackage("Corrupt Vex!\nUnable to read file:" + paramString);
    } 
    return fh.ExceptionInVPackage(s1, params);
  }
  
  private String ExceptionInVPackage(FileReader paramFileReader) {
    StringBuffer stringBuffer = new StringBuffer();
    for (int i = paramFileReader.read(); i != 10; i = paramFileReader.read()) {
      if (i == -1)
        return null; 
      char c = (char)i;
      if (c == '\n')
        return stringBuffer.toString(); 
      stringBuffer.append(c);
    } 
    return stringBuffer.toString();
  }
  
  public void ExceptionInVPackage(s params, String paramString, int paramInt) {
    double d = Math.pow(10.0D, -paramInt);
    ExceptionInVPackage(params, paramString, d, 0.0D);
  }
  
  public void ExceptionInVPackage(s params, String paramString, double paramDouble1, double paramDouble2) {
    File file = new File(paramString);
    try {
      FileWriter fileWriter = new FileWriter(file);
      fileWriter.write("EVEME 1.0\n");
      fileWriter.write("UserRev: 1.00\n");
      fileWriter.write("UserComment: Exported by EFI Analytics\n");
      Calendar calendar = Calendar.getInstance();
      fileWriter.write("Date: " + calendar.get(2) + "-" + calendar.get(5) + "-" + calendar.get(1) + "\n");
      fileWriter.write("Time: " + calendar.get(11) + ":" + calendar.get(12) + "\n");
      fileWriter.write("Page 0\n");
      if (paramDouble1 > 0.0D)
        fileWriter.write("Scale " + paramDouble1 + "\n"); 
      ExceptionInVPackage(fileWriter, "VE Table RPM Range", "", params.b(), true);
      ExceptionInVPackage(fileWriter, "VE Table Load Range", params.v(), params.ExceptionInVPackage(), false);
      ExceptionInVPackage(fileWriter, params, paramDouble1);
      fileWriter.flush();
      fileWriter.close();
    } catch (Exception exception) {
      throw new ExceptionInVPackage("Unable to write " + paramString + "\n" + exception.getMessage());
    } 
  }
  
  private void ExceptionInVPackage(FileWriter paramFileWriter, String paramString1, String paramString2, String[] paramArrayOfString, boolean paramBoolean) {
    if (paramString2 != null && !paramString2.equals(""))
      paramString1 = paramString1 + " (" + paramString2 + ")"; 
    paramString1 = ExceptionInVPackage(paramString1, 32, true) + "[" + paramArrayOfString.length + "]";
    paramFileWriter.write(paramString1 + "\n");
    for (byte b = 0; b < paramArrayOfString.length; b++) {
      if (paramBoolean) {
        int i = (int)Math.round(Double.parseDouble(paramArrayOfString[b]) / 100.0D);
        paramFileWriter.write("   [" + ExceptionInVPackage(b + "", 3, false) + "] =" + ExceptionInVPackage(i + "", 4, false) + "\n");
      } else {
        int i = (int)Double.parseDouble(paramArrayOfString[paramArrayOfString.length - b - 1]);
        paramFileWriter.write("   [" + ExceptionInVPackage(b + "", 3, false) + "] =" + ExceptionInVPackage(i + "", 4, false) + "\n");
      } 
    } 
  }
  
  private void ExceptionInVPackage(FileWriter paramFileWriter, s params, double paramDouble) {
    int i = (params.ExceptionInVPackage()).length;
    int j = (params.b()).length;
    String str = ExceptionInVPackage("VE Table", 32, true) + "[" + ExceptionInVPackage(i + "", 3, false) + "][" + ExceptionInVPackage(j + "", 3, false) + "]";
    paramFileWriter.write(str + "\n");
    paramFileWriter.write("          ");
    byte b;
    for (b = 0; b < i; b++)
      paramFileWriter.write(" [" + ExceptionInVPackage(b + "", 3, false) + "]"); 
    paramFileWriter.write("\n");
    for (b = 0; b < j; b++) {
      paramFileWriter.write("   [" + ExceptionInVPackage(b + "", 3, false) + "] =");
      for (byte b1 = 0; b1 < i; b1++) {
        double d = params.d(j - b - 1, b1).doubleValue();
        d /= paramDouble;
        int k = (int)d;
        paramFileWriter.write(ExceptionInVPackage(k + "", 5, false) + " ");
      } 
      paramFileWriter.write("\n");
    } 
  }
  
  private String ExceptionInVPackage(String paramString, int paramInt, boolean paramBoolean) {
    while (paramString.length() < paramInt) {
      if (paramBoolean) {
        paramString = paramString + " ";
        continue;
      } 
      paramString = " " + paramString;
    } 
    return paramString;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/ui/fG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */