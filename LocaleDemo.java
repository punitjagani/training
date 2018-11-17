import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {
	public static void main(String[] args) {
		// Creating custom locale for Hindi language
		Locale hi = new Locale("hi", "in"); //This is used for Locale which are not built in and here country i.e. 'in' is optional
		
		// It loads respective properties file based on specified/system locale
		ResourceBundle bundle = ResourceBundle.getBundle("msgs", hi);
		System.out.println("Greeting: " + bundle.getString("greeting"));
		System.out.println("Message: " + bundle.getString("message"));
	}
}
 //this properties file is useful in websites like google where we can change language and then only the labels are changed in the 
 //website.