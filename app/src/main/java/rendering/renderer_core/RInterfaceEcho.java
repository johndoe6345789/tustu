package R;

import bH.D;
import com.efianalytics.serviceclient.ReviewActions;

class RInterfaceEcho implements c {
  RInterfaceEcho(d paramd) {}
  
  public boolean a(l paraml) {
    try {
      a a = (a)paraml;
      String str = ReviewActions.submitUserReview(a.b(), a.c(), a.d(), a.e(), a.f(), a.g(), a.h(), a.i());
      D.c("Submit Message result:" + str);
      return (str != null && str.equals("Thank you for your review"));
    } catch (Exception exception) {
      D.d("unable to process UserReview Message. Exception:" + exception.getMessage());
      return false;
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/R/e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */