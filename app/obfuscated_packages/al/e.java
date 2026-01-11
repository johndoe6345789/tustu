package al;

import am.a;
import am.h;
import am.k;
import bH.D;
import java.io.IOException;
import java.io.StringReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class e {
  private final XMLInputFactory a = XMLInputFactory.newInstance();
  
  private final DateFormat b = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
  
  public Properties a(h paramh) {
    Properties properties = new Properties();
    a a = paramh.f();
    if (a instanceof k) {
      k k = (k)a;
      a(properties, k.e());
    } 
    return properties;
  }
  
  public void a(Properties paramProperties, String paramString) {
    XMLStreamReader xMLStreamReader = null;
    try {
      xMLStreamReader = this.a.createXMLStreamReader(new StringReader(paramString));
      while (xMLStreamReader.hasNext()) {
        xMLStreamReader.next();
        if (xMLStreamReader.isStartElement() && xMLStreamReader.getLocalName().equals("TX")) {
          paramProperties.setProperty("desc", xMLStreamReader.getElementText());
          continue;
        } 
        if (xMLStreamReader.isStartElement() && xMLStreamReader.getLocalName().equals("time_source")) {
          paramProperties.setProperty("time_source", xMLStreamReader.getElementText());
          continue;
        } 
        if (xMLStreamReader.isStartElement() && xMLStreamReader.getLocalName().equals("constants")) {
          D.b("'constants' in XML content 'HDcomment' is not yet supported!");
          continue;
        } 
        if (xMLStreamReader.isStartElement() && xMLStreamReader.getLocalName().equals("UNITSPEC")) {
          D.b("UNITSPEC in XML content 'HDcomment' is not yet supported!");
          continue;
        } 
        if (xMLStreamReader.isStartElement() && xMLStreamReader.getLocalName().equals("common_properties"))
          a(paramProperties, xMLStreamReader); 
      } 
    } catch (XMLStreamException xMLStreamException) {
      D.a(xMLStreamException.getMessage(), xMLStreamException);
      throw new IOException(xMLStreamException.getMessage(), xMLStreamException);
    } finally {
      if (xMLStreamReader != null)
        try {
          xMLStreamReader.close();
        } catch (XMLStreamException xMLStreamException) {
          D.a(xMLStreamException.getMessage(), xMLStreamException);
          throw new IOException(xMLStreamException.getMessage(), xMLStreamException);
        }  
    } 
  }
  
  private void a(Properties paramProperties, XMLStreamReader paramXMLStreamReader) {
    paramXMLStreamReader.nextTag();
    while (!paramXMLStreamReader.isEndElement() || !paramXMLStreamReader.getLocalName().equals("common_properties")) {
      if (paramXMLStreamReader.isStartElement() && paramXMLStreamReader.getLocalName().equals("e")) {
        String str1 = paramXMLStreamReader.getAttributeValue(null, "name");
        String str2 = paramXMLStreamReader.getAttributeValue(null, "type");
        String str3 = paramXMLStreamReader.getElementText();
        if (str2 == null || str2.length() < 1 || str2.equalsIgnoreCase("string")) {
          paramProperties.setProperty(str1, str3);
        } else if (str2.equalsIgnoreCase("decimal")) {
          paramProperties.setProperty(str1, str3);
        } else if (str2.equalsIgnoreCase("integer")) {
          paramProperties.setProperty(str1, str3);
        } else if (str2.equalsIgnoreCase("float")) {
          paramProperties.setProperty(str1, str3);
        } else if (str2.equalsIgnoreCase("boolean")) {
          paramProperties.setProperty(str1, str3);
        } else if (str2.equalsIgnoreCase("datetime")) {
          try {
            Date date = this.b.parse(str3);
            paramProperties.setProperty(str1, date.toString());
          } catch (ParseException parseException) {
            D.b(parseException.getMessage());
            paramProperties.setProperty(str1, str3);
          } 
        } else {
          paramProperties.setProperty(str1, str3);
        } 
      } else if (paramXMLStreamReader.isStartElement() && paramXMLStreamReader.getLocalName().equals("tree")) {
        D.b("'tree' in XML content 'common_properties' is not yet supported!");
      } else if (paramXMLStreamReader.isStartElement() && paramXMLStreamReader.getLocalName().equals("list")) {
        D.b("'list' in XML content 'common_properties' is not yet supported!");
      } else if (paramXMLStreamReader.isStartElement() && paramXMLStreamReader.getLocalName().equals("elist")) {
        D.b("'elist' in XML content 'common_properties' is not yet supported!");
      } 
      paramXMLStreamReader.next();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/al/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */