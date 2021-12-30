@FunctionalInterface
interface MyFunctionalInterface{
	public void execute();
	

	
}


public class FunctionalInterfaceDemo {
	void add(){
		System.out.println("i am add");
	}
	void sub() {
		System.out.println("i am sub");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInterface i=new FunctionalInterfaceDemo()::add;
		i.execute();
		MyFunctionalInterface i1=new FunctionalInterfaceDemo()::sub;
		i1.execute();

	}

}
