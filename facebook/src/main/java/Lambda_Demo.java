import java.util.ArrayList;
import java.util.List;

public class Lambda_Demo {

	public static void main(String[] args) {
		List<String> ll=new ArrayList<String>();
		ll.add("Abhinav");
		ll.add("Mohan");
		ll.add("sohan");
		
		
		ll.stream().filter(a->a.equals("sohan")).forEach(b->System.out.println(b));
		
		
//		for(String a:ll) {
//			System.out.println(a);
//		}
//		
//		ll.forEach(s->System.out.println(s));

	}

}
