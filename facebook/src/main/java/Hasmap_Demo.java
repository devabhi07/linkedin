import java.util.HashMap;
import java.util.Map;

public class Hasmap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> m=new HashMap<String,String>();
		

		m.put("plist", "abc");
		m.put("clist", "xvxvx");
		m.put("slist", "abcbncvc");
		
		System.out.println(m.get("slist"));

	}

}
