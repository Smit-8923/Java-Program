package hierarch_EX;

public class Demo {

	public static void main(String[] args) 
	{
		Student st = new Student();
		st.setName("Viral");
		st.setCity("Ahmedabad");
		st.setDiv("B");
		
		System.out.println(st);
		
		Student su2 = new Student("Smit","USA","B");
		System.out.println(su2);
		
		//Person pr = new Person();
		//pr = new Emp();
		//System.out.println(pr);
		
		Emp e = new Emp("Parth","Can","Business");
		System.out.println(e);
	}

}
