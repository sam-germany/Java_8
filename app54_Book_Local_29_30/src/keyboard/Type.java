package keyboard;

import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.ResourceBundle;

public class Type  extends ListResourceBundle{
	@Override
	protected Object[][] getContents() {

		return new Object[][] {{ "keys", new ArrayList<String>()  }};
	}

   
	public static void main(String[] args) {

		ResourceBundle rb = ResourceBundle.getBundle("keyboard.Type");
		
		List<String> keys = (List) rb.getObject("keys");
		keys.add("q");
		keys.add("a");
		keys.add("w");
		keys.add("w");
		keys.add("e");
		System.out.println(((List)rb.getObject("keys")).size());
		
	}

	

}
