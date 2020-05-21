import com.phone.Android;
import com.phone.IOS;
import com.phone.OS;
import com.phone.OperatingSystemFactory;
import com.phone.Windows;

public class FactoryMain 
{
  public static void main(String a[])
  {
	  OperatingSystemFactory osf = new OperatingSystemFactory();
	  //OS obj = new Windows();
	  OS obj = osf.getInstance("Open");
	  obj.spec();
  }
}
