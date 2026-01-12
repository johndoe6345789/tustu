package v;

import G.GInterfaceDj;
import V.ExceptionInVPackage;
import bH.D;
import java.awt.Color;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class IOHashMapInVPackage {
  private HashMap ExceptionInVPackage = new HashMap<>();

  public void ExceptionInVPackage(String paramString, Document paramDocument) {
    File file = new File(paramString);
    if (!file.exists()) {
      if (!file.getParentFile().exists()) file.getParentFile().mkdirs();
      try {
        file.createNewFile();
      } catch (IOException iOException) {
        Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String) null, iOException);
        throw new ExceptionInVPackage("Error writing to file. \n" + paramString);
      }
    }
    ExceptionInVPackage(file, paramDocument);
  }

  public void ExceptionInVPackage(File paramFile, Document paramDocument) {
    FileOutputStream fileOutputStream = null;
    try {
      fileOutputStream = new FileOutputStream(paramFile);
      DOMSource dOMSource = new DOMSource(paramDocument);
      StreamResult streamResult = new StreamResult(fileOutputStream);
      TransformerFactory transformerFactory = TransformerFactory.newInstance();
      Transformer transformer = transformerFactory.newTransformer();
      transformer.setOutputProperty("indent", "yes");
      transformer.transform(dOMSource, streamResult);
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ExceptionInVPackage("Error Saving Document. Check Log file for details.");
    } finally {
      if (fileOutputStream != null)
        try {
          fileOutputStream.close();
        } catch (Exception exception) {
          Logger.getLogger(e.class.getName())
              .log(Level.WARNING, "Failed to close stream after saving Document", exception);
        }
    }
  }

  public Document c(String paramString) {
    Document document = null;
    FileInputStream fileInputStream = null;
    File file = new File(paramString);
    try {
      DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
      fileInputStream = new FileInputStream(file);
      document = documentBuilder.parse(fileInputStream);
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ExceptionInVPackage(
          "Problem loading "
              + paramString
              + ", error message:\n"
              + exception.getMessage()
              + "\nCheck log file for more details.");
    } finally {
      if (fileInputStream != null)
        try {
          fileInputStream.close();
        } catch (Exception exception) {
          Logger.getLogger(e.class.getName())
              .log(Level.WARNING, "Failed to close stream after reading Document", exception);
        }
    }
    return document;
  }

  public Element ExceptionInVPackage(
      Document paramDocument, Element paramElement, Object paramObject) {
    Class<?> clazz = paramObject.getClass();
    paramElement.setAttribute("type", ExceptionInVPackage.ExceptionInVPackage(paramObject));
    while (clazz.getPackage().getName().contains("efiAnalytics")) {
      Method[] arrayOfMethod = clazz.getDeclaredMethods();
      AccessibleObject.setAccessible((AccessibleObject[]) arrayOfMethod, true);
      for (byte b = 0; b < arrayOfMethod.length; b++) {
        Method method = arrayOfMethod[b];
        Class[] arrayOfClass = method.getParameterTypes();
        if (Modifier.isPublic(method.getModifiers())
            && arrayOfClass.length == 0
            && (method.getName().startsWith("get") || method.getName().startsWith("is"))) {
          String str = null;
          if (method.getName().startsWith("is")) {
            str = method.getName().substring(2);
          } else {
            str = method.getName().substring(3);
          }
          try {
            Element element = paramDocument.createElement(str);
            synchronized (element) {
              String str1 = method.getReturnType().getName();
              if (str1.equals("java.awt.Color")) {
                str1 = "Color";
                Color color = (Color) method.invoke(paramObject, new Object[0]);
                if (color != null) {
                  element.setAttribute("red", "" + color.getRed());
                  element.setAttribute("green", "" + color.getGreen());
                  element.setAttribute("blue", "" + color.getBlue());
                  element.setAttribute("alpha", "" + color.getAlpha());
                  element.setTextContent("" + color.getRGB());
                } else {
                  element.setTextContent("Transparent");
                }
              } else if (str1.equals("com.efiAnalytics.apps.ts.dashboard.renderers.GaugePainter")
                  || str1.equals("GaugePainter")) {
                str1 = "GaugePainter";
                element.setTextContent(
                    com.efiAnalytics.apps.ts.dashboard.renderers.e.ExceptionInVPackage(
                        method.invoke(paramObject, new Object[0])));
              } else if (str1.equals(
                      "com.efiAnalytics.apps.ts.dashboard.renderers.IndicatorPainter")
                  || str1.equals("IndicatorPainter")) {
                str1 = "IndicatorPainter";
                element.setTextContent(
                    com.efiAnalytics.apps.ts.dashboard.renderers.e.ExceptionInVPackage(
                        method.invoke(paramObject, new Object[0])));
              } else if (method.getReturnType().equals(GInterfaceDj.class)) {
                str1 = ExceptionInVPackage.g;
                Object object = method.invoke(paramObject, new Object[0]);
                if (object == null) object = "";
                element.setTextContent(object.toString());
              } else if (method.getReturnType().equals(Properties.class)) {
                str1 = "Properties";
                String str2 =
                    ExceptionInVPackage((Properties) method.invoke(paramObject, new Object[0]));
                element.setTextContent(str2);
              } else {
                element.setTextContent(method.invoke(paramObject, new Object[0]) + "");
              }
              if (str1.equals("java.lang.String")) str1 = "String";
              element.setAttribute("type", str1);
              if (element.getTextContent() != null) paramElement.appendChild(element);
            }
          } catch (Exception exception) {
            D.ExceptionInVPackage("Error writing Object to XML\n" + paramObject);
            exception.printStackTrace();
            throw new ExceptionInVPackage("Error writing Object to XML");
          }
        }
      }
      clazz = clazz.getSuperclass();
    }
    return paramElement;
  }

  public String ExceptionInVPackage(Node paramNode, String paramString) {
    NamedNodeMap namedNodeMap = paramNode.getAttributes();
    if (namedNodeMap == null) return null;
    for (byte b = 0; b < namedNodeMap.getLength(); b++) {
      Node node = namedNodeMap.item(b);
      if (node.getNodeName() != null && node.getNodeName().equals(paramString))
        return node.getNodeValue();
    }
    D.b("Attribute not found: " + paramString);
    return null;
  }

  public Object ExceptionInVPackage(Node paramNode) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: ldc 'type'
    //   4: invokevirtual ExceptionInVPackage :
    // (Lorg/w3c/dom/Node;Ljava/lang/String;)Ljava/lang/String;
    //   7: astore_2
    //   8: aconst_null
    //   9: astore_3
    //   10: aload_0
    //   11: invokespecial ExceptionInVPackage : ()V
    //   14: aload_2
    //   15: invokestatic ExceptionInVPackage : (Ljava/lang/String;)Ljava/lang/Class;
    //   18: astore #4
    //   20: aload #4
    //   22: invokevirtual newInstance : ()Ljava/lang/Object;
    //   25: astore #5
    //   27: aload #5
    //   29: invokevirtual getClass : ()Ljava/lang/Class;
    //   32: invokevirtual getDeclaredMethods : ()[Ljava/lang/reflect/Method;
    //   35: astore #6
    //   37: aload #6
    //   39: iconst_1
    //   40: invokestatic setAccessible : ([Ljava/lang/reflect/AccessibleObject;Z)V
    //   43: aload_1
    //   44: invokeinterface getChildNodes : ()Lorg/w3c/dom/NodeList;
    //   49: astore #7
    //   51: iconst_0
    //   52: istore #8
    //   54: iload #8
    //   56: aload #7
    //   58: invokeinterface getLength : ()I
    //   63: if_icmpge -> 862
    //   66: aload #7
    //   68: iload #8
    //   70: invokeinterface item : (I)Lorg/w3c/dom/Node;
    //   75: astore #9
    //   77: aload #9
    //   79: invokeinterface getNodeName : ()Ljava/lang/String;
    //   84: astore #10
    //   86: aload_0
    //   87: aload #9
    //   89: ldc 'type'
    //   91: invokevirtual ExceptionInVPackage :
    // (Lorg/w3c/dom/Node;Ljava/lang/String;)Ljava/lang/String;
    //   94: astore #11
    //   96: aload #11
    //   98: ifnull -> 856
    //   101: new java/lang/StringBuilder
    //   104: dup
    //   105: invokespecial <init> : ()V
    //   108: ldc 'set'
    //   110: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: aload #10
    //   115: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   118: invokevirtual toString : ()Ljava/lang/String;
    //   121: astore #12
    //   123: aload_0
    //   124: aload #6
    //   126: aload #12
    //   128: invokespecial ExceptionInVPackage :
    // ([Ljava/lang/reflect/Method;Ljava/lang/String;)Ljava/lang/reflect/Method;
    //   131: astore_3
    //   132: aload_3
    //   133: ifnull -> 856
    //   136: aload #9
    //   138: invokeinterface getTextContent : ()Ljava/lang/String;
    //   143: ifnull -> 856
    //   146: aload #9
    //   148: invokeinterface getTextContent : ()Ljava/lang/String;
    //   153: astore #13
    //   155: aload #11
    //   157: ldc 'int'
    //   159: invokevirtual equals : (Ljava/lang/Object;)Z
    //   162: ifeq -> 191
    //   165: iconst_1
    //   166: anewarray java/lang/Object
    //   169: dup
    //   170: iconst_0
    //   171: aload #13
    //   173: invokestatic valueOf : (Ljava/lang/String;)Ljava/lang/Integer;
    //   176: aastore
    //   177: astore #14
    //   179: aload_3
    //   180: aload #5
    //   182: aload #14
    //   184: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   187: pop
    //   188: goto -> 856
    //   191: aload #11
    //   193: ldc 'double'
    //   195: invokevirtual equals : (Ljava/lang/Object;)Z
    //   198: ifeq -> 227
    //   201: iconst_1
    //   202: anewarray java/lang/Object
    //   205: dup
    //   206: iconst_0
    //   207: aload #13
    //   209: invokestatic valueOf : (Ljava/lang/String;)Ljava/lang/Double;
    //   212: aastore
    //   213: astore #14
    //   215: aload_3
    //   216: aload #5
    //   218: aload #14
    //   220: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   223: pop
    //   224: goto -> 856
    //   227: aload #11
    //   229: getstatic v/ExceptionInVPackage.g : Ljava/lang/String;
    //   232: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   235: ifeq -> 261
    //   238: iconst_1
    //   239: anewarray java/lang/Object
    //   242: dup
    //   243: iconst_0
    //   244: aload #13
    //   246: aastore
    //   247: astore #14
    //   249: aload_3
    //   250: aload #5
    //   252: aload #14
    //   254: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   257: pop
    //   258: goto -> 856
    //   261: aload #11
    //   263: ldc 'float'
    //   265: invokevirtual equals : (Ljava/lang/Object;)Z
    //   268: ifeq -> 379
    //   271: aload_3
    //   272: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
    //   275: astore #14
    //   277: aload #14
    //   279: ifnull -> 376
    //   282: aload #14
    //   284: arraylength
    //   285: ifle -> 376
    //   288: iconst_1
    //   289: anewarray java/lang/Object
    //   292: astore #15
    //   294: aload #14
    //   296: iconst_0
    //   297: aaload
    //   298: invokevirtual getName : ()Ljava/lang/String;
    //   301: ldc 'int'
    //   303: invokevirtual equals : (Ljava/lang/Object;)Z
    //   306: ifeq -> 331
    //   309: aload #13
    //   311: invokestatic parseFloat : (Ljava/lang/String;)F
    //   314: fstore #16
    //   316: aload #15
    //   318: iconst_0
    //   319: fload #16
    //   321: invokestatic round : (F)I
    //   324: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   327: aastore
    //   328: goto -> 367
    //   331: aload #14
    //   333: iconst_0
    //   334: aaload
    //   335: invokevirtual getName : ()Ljava/lang/String;
    //   338: ldc 'float'
    //   340: invokevirtual equals : (Ljava/lang/Object;)Z
    //   343: ifeq -> 358
    //   346: aload #15
    //   348: iconst_0
    //   349: aload #13
    //   351: invokestatic valueOf : (Ljava/lang/String;)Ljava/lang/Float;
    //   354: aastore
    //   355: goto -> 367
    //   358: aload #15
    //   360: iconst_0
    //   361: aload #13
    //   363: invokestatic valueOf : (Ljava/lang/String;)Ljava/lang/Double;
    //   366: aastore
    //   367: aload_3
    //   368: aload #5
    //   370: aload #15
    //   372: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   375: pop
    //   376: goto -> 856
    //   379: aload #11
    //   381: ldc 'java.awt.Color'
    //   383: invokevirtual equals : (Ljava/lang/Object;)Z
    //   386: ifne -> 399
    //   389: aload #11
    //   391: ldc 'Color'
    //   393: invokevirtual equals : (Ljava/lang/Object;)Z
    //   396: ifeq -> 604
    //   399: aload #13
    //   401: ldc 'Transparent'
    //   403: invokevirtual equals : (Ljava/lang/Object;)Z
    //   406: ifne -> 582
    //   409: aload #13
    //   411: invokestatic parseInt : (Ljava/lang/String;)I
    //   414: istore #14
    //   416: aconst_null
    //   417: astore #15
    //   419: aload #9
    //   421: invokeinterface getAttributes : ()Lorg/w3c/dom/NamedNodeMap;
    //   426: astore #16
    //   428: aload #16
    //   430: ldc 'alpha'
    //   432: invokeinterface getNamedItem : (Ljava/lang/String;)Lorg/w3c/dom/Node;
    //   437: ifnull -> 552
    //   440: aload #16
    //   442: ldc 'alpha'
    //   444: invokeinterface getNamedItem : (Ljava/lang/String;)Lorg/w3c/dom/Node;
    //   449: invokeinterface getNodeValue : ()Ljava/lang/String;
    //   454: invokestatic parseInt : (Ljava/lang/String;)I
    //   457: istore #17
    //   459: aload #16
    //   461: ldc 'red'
    //   463: invokeinterface getNamedItem : (Ljava/lang/String;)Lorg/w3c/dom/Node;
    //   468: invokeinterface getNodeValue : ()Ljava/lang/String;
    //   473: invokestatic parseInt : (Ljava/lang/String;)I
    //   476: istore #18
    //   478: aload #16
    //   480: ldc 'green'
    //   482: invokeinterface getNamedItem : (Ljava/lang/String;)Lorg/w3c/dom/Node;
    //   487: invokeinterface getNodeValue : ()Ljava/lang/String;
    //   492: invokestatic parseInt : (Ljava/lang/String;)I
    //   495: istore #19
    //   497: aload #16
    //   499: ldc 'blue'
    //   501: invokeinterface getNamedItem : (Ljava/lang/String;)Lorg/w3c/dom/Node;
    //   506: invokeinterface getNodeValue : ()Ljava/lang/String;
    //   511: invokestatic parseInt : (Ljava/lang/String;)I
    //   514: istore #20
    //   516: iconst_1
    //   517: anewarray java/lang/Object
    //   520: dup
    //   521: iconst_0
    //   522: new java/awt/Color
    //   525: dup
    //   526: iload #18
    //   528: iload #19
    //   530: iload #20
    //   532: iload #17
    //   534: invokespecial <init> : (IIII)V
    //   537: aastore
    //   538: astore #21
    //   540: aload_3
    //   541: aload #5
    //   543: aload #21
    //   545: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   548: pop
    //   549: goto -> 579
    //   552: iconst_1
    //   553: anewarray java/lang/Object
    //   556: dup
    //   557: iconst_0
    //   558: new java/awt/Color
    //   561: dup
    //   562: iload #14
    //   564: invokespecial <init> : (I)V
    //   567: aastore
    //   568: astore #17
    //   570: aload_3
    //   571: aload #5
    //   573: aload #17
    //   575: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   578: pop
    //   579: goto -> 856
    //   582: iconst_1
    //   583: anewarray java/lang/Object
    //   586: dup
    //   587: iconst_0
    //   588: aconst_null
    //   589: aastore
    //   590: astore #14
    //   592: aload_3
    //   593: aload #5
    //   595: aload #14
    //   597: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   600: pop
    //   601: goto -> 856
    //   604: aload #11
    //   606: ldc 'java.lang.String'
    //   608: invokevirtual equals : (Ljava/lang/Object;)Z
    //   611: ifne -> 624
    //   614: aload #11
    //   616: ldc 'String'
    //   618: invokevirtual equals : (Ljava/lang/Object;)Z
    //   621: ifeq -> 660
    //   624: aload #13
    //   626: ldc 'null'
    //   628: invokevirtual equals : (Ljava/lang/Object;)Z
    //   631: ifeq -> 637
    //   634: aconst_null
    //   635: astore #13
    //   637: iconst_1
    //   638: anewarray java/lang/Object
    //   641: dup
    //   642: iconst_0
    //   643: aload #13
    //   645: aastore
    //   646: astore #14
    //   648: aload_3
    //   649: aload #5
    //   651: aload #14
    //   653: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   656: pop
    //   657: goto -> 856
    //   660: aload #11
    //   662: ldc 'com.efiAnalytics.tunerStudio.renderers.GaugePainter'
    //   664: invokevirtual equals : (Ljava/lang/Object;)Z
    //   667: ifne -> 680
    //   670: aload #11
    //   672: ldc 'GaugePainter'
    //   674: invokevirtual equals : (Ljava/lang/Object;)Z
    //   677: ifeq -> 710
    //   680: aload #13
    //   682: invokestatic ExceptionInVPackage :
    // (Ljava/lang/String;)Lcom/efiAnalytics/apps/ts/dashboard/renderers/GaugePainter;
    //   685: astore #14
    //   687: iconst_1
    //   688: anewarray java/lang/Object
    //   691: dup
    //   692: iconst_0
    //   693: aload #14
    //   695: aastore
    //   696: astore #15
    //   698: aload_3
    //   699: aload #5
    //   701: aload #15
    //   703: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   706: pop
    //   707: goto -> 856
    //   710: aload #11
    //   712: ldc 'com.efiAnalytics.tunerStudio.renderers.IndicatorPainter'
    //   714: invokevirtual equals : (Ljava/lang/Object;)Z
    //   717: ifne -> 730
    //   720: aload #11
    //   722: ldc 'IndicatorPainter'
    //   724: invokevirtual equals : (Ljava/lang/Object;)Z
    //   727: ifeq -> 760
    //   730: aload #13
    //   732: invokestatic b :
    // (Ljava/lang/String;)Lcom/efiAnalytics/apps/ts/dashboard/renderers/IndicatorPainter;
    //   735: astore #14
    //   737: iconst_1
    //   738: anewarray java/lang/Object
    //   741: dup
    //   742: iconst_0
    //   743: aload #14
    //   745: aastore
    //   746: astore #15
    //   748: aload_3
    //   749: aload #5
    //   751: aload #15
    //   753: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   756: pop
    //   757: goto -> 856
    //   760: aload #11
    //   762: ldc 'boolean'
    //   764: invokevirtual equals : (Ljava/lang/Object;)Z
    //   767: ifeq -> 796
    //   770: iconst_1
    //   771: anewarray java/lang/Object
    //   774: dup
    //   775: iconst_0
    //   776: aload #13
    //   778: invokestatic valueOf : (Ljava/lang/String;)Ljava/lang/Boolean;
    //   781: aastore
    //   782: astore #14
    //   784: aload_3
    //   785: aload #5
    //   787: aload #14
    //   789: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   792: pop
    //   793: goto -> 856
    //   796: aload #11
    //   798: ldc 'Properties'
    //   800: invokevirtual equals : (Ljava/lang/Object;)Z
    //   803: ifeq -> 856
    //   806: aload #13
    //   808: ldc 'null'
    //   810: invokevirtual equals : (Ljava/lang/Object;)Z
    //   813: ifne -> 827
    //   816: aload_0
    //   817: aload #13
    //   819: invokespecial ExceptionInVPackage : (Ljava/lang/String;)Ljava/util/Properties;
    //   822: astore #14
    //   824: goto -> 836
    //   827: new java/util/Properties
    //   830: dup
    //   831: invokespecial <init> : ()V
    //   834: astore #14
    //   836: iconst_1
    //   837: anewarray java/lang/Object
    //   840: dup
    //   841: iconst_0
    //   842: aload #14
    //   844: aastore
    //   845: astore #15
    //   847: aload_3
    //   848: aload #5
    //   850: aload #15
    //   852: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   855: pop
    //   856: iinc #8, 1
    //   859: goto -> 54
    //   862: aload #5
    //   864: astore #8
    //   866: aload_0
    //   867: invokespecial ExceptionInVPackage : ()V
    //   870: aload #8
    //   872: areturn
    //   873: astore #4
    //   875: new java/lang/StringBuilder
    //   878: dup
    //   879: invokespecial <init> : ()V
    //   882: ldc 'Failure on method: '
    //   884: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   887: aload_3
    //   888: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   891: invokevirtual toString : ()Ljava/lang/String;
    //   894: invokestatic c : (Ljava/lang/String;)V
    //   897: aload #4
    //   899: invokevirtual printStackTrace : ()V
    //   902: new V/ExceptionInVPackage
    //   905: dup
    //   906: new java/lang/StringBuilder
    //   909: dup
    //   910: invokespecial <init> : ()V
    //   913: ldc 'Could not Load Object: '
    //   915: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   918: aload_2
    //   919: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   922: ldc ', \\nerror message:'
    //   924: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   927: aload #4
    //   929: invokevirtual getMessage : ()Ljava/lang/String;
    //   932: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   935: invokevirtual toString : ()Ljava/lang/String;
    //   938: invokespecial <init> : (Ljava/lang/String;)V
    //   941: athrow
    //   942: astore #22
    //   944: aload_0
    //   945: invokespecial ExceptionInVPackage : ()V
    //   948: aload #22
    //   950: athrow
    // Exception table:
    //   from	to	target	type
    //   10	866	873	java/lang/Exception
    //   10	866	942	finally
    //   873	944	942	finally
  }

  private void ExceptionInVPackage() {
    this.ExceptionInVPackage.clear();
  }

  private void ExceptionInVPackage(Method[] paramArrayOfMethod) {
    Class<?> clazz = paramArrayOfMethod[0].getDeclaringClass();
    while (paramArrayOfMethod != null
        && paramArrayOfMethod[0] != null
        && clazz.getPackage().getName().indexOf("efiAnalytics") != -1) {
      for (byte b = 0; b < paramArrayOfMethod.length; b++)
        this.ExceptionInVPackage.put(paramArrayOfMethod[b].getName(), paramArrayOfMethod[b]);
      clazz = clazz.getSuperclass();
      paramArrayOfMethod = clazz.getMethods();
    }
  }

  private Method ExceptionInVPackage(Method[] paramArrayOfMethod, String paramString) {
    if (this.ExceptionInVPackage.isEmpty()) ExceptionInVPackage(paramArrayOfMethod);
    return (Method) this.ExceptionInVPackage.get(paramString);
  }

  private String ExceptionInVPackage(Properties paramProperties) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    try {
      paramProperties.store(byteArrayOutputStream, "");
      return byteArrayOutputStream.toString("UTF-8");
    } catch (IOException iOException) {
      D.ExceptionInVPackage("Failed to Save ExceptionInVPackage properties to XML");
      Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String) null, iOException);
      return "";
    } finally {
      try {
        byteArrayOutputStream.close();
      } catch (Exception exception) {
      }
    }
  }

  private Properties ExceptionInVPackage(String paramString) {
    ByteArrayInputStream byteArrayInputStream =
        new ByteArrayInputStream(paramString.getBytes(StandardCharsets.UTF_8));
    Properties properties = new Properties();
    try {
      properties.load(byteArrayInputStream);
    } catch (IOException iOException) {
      D.ExceptionInVPackage("Failed to load Properties from String: " + paramString);
      Logger.getLogger(e.class.getName()).log(Level.SEVERE, (String) null, iOException);
    } finally {
      try {
        byteArrayInputStream.close();
      } catch (Exception exception) {
      }
    }
    return properties;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/v/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
