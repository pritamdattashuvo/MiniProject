
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person personobj = new Person("pritam","Male","Dhaka",24,101);
//		personobj.setName("Pritam Datta");
//		personobj.setAge(24); 
//		personobj.setGender("Male"); 
//		personobj.setAddress("Dhaka"); 
//		personobj.setId(101);
		
//		personobj.getName();
//		personobj.getAge();
//		personobj.getGender();
//		personobj.getAddress();
//		personobj.getId();	
		System.out.println(personobj.toString());	
		Human humanobj = new Human("pritam","male","dhaka",24,101,"Feelings","Thoughts","Humanity");
		System.out.println(humanobj.toString());
		System.out.println(humanobj.study());
		
		Employee_Details empdetailsobj =new Employee_Details();
		System.out.println(empdetailsobj.attendence());
		System.out.println(empdetailsobj.salary());
	}

}
