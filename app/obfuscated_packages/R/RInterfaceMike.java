package R;

import bH.D;
import com.efianalytics.serviceclient.ReviewActions;
import com.efianalytics.serviceclient.TranslationActions;
import com.efianalytics.translation.MutationResult;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RInterfaceMike {
  public boolean a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt, String paramString7) {
    try {
      b(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramInt, paramString7);
      return true;
    } catch (k k) {
      Logger.getLogger(m.class.getName()).log(Level.SEVERE, (String)null, k);
      a a = new a(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramInt, paramString7);
      try {
        g.a().a(a);
        return false;
      } catch (i i) {
        Logger.getLogger(m.class.getName()).log(Level.SEVERE, (String)null, i);
        throw new k("Failed to submit service call or store for later.");
      } 
    } 
  }
  
  public boolean a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9) {
    try {
      b(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, paramString8, paramString9);
      return true;
    } catch (k k) {
      Logger.getLogger(m.class.getName()).log(Level.SEVERE, (String)null, k);
      j j = new j(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, paramString8, paramString9);
      try {
        g.a().a(j);
        return false;
      } catch (i i) {
        Logger.getLogger(m.class.getName()).log(Level.SEVERE, (String)null, i);
        throw new k("Failed to submit service call, store for later failed as well.");
      } 
    } 
  }
  
  protected void b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt, String paramString7) {
    try {
      ReviewActions.submitUserReview(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramInt, paramString7);
    } catch (Exception exception) {
      throw new k("BasicUserReview Service un available." + exception.getMessage());
    } 
  }
  
  protected void b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9) {
    try {
      MutationResult mutationResult = TranslationActions.addUpdateProposedStaticTranslation(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, paramString8, paramString9);
      if (mutationResult.getReturnCode() != 0) {
        D.b("Proposed Translation call failed. Message: " + mutationResult.getLongMessage());
        throw new k("Proposed Translation call failed. Short Message: " + mutationResult.getShortMessage() + "\nLong Message:" + mutationResult.getLongMessage());
      } 
    } catch (Exception exception) {
      throw new k("Translation Service unavailable." + exception.getMessage());
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/R/m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */