
public class Person {
	private String name,gender,address;
	private int age,id;
	//Shortcut keys to generate setter,getter : shift+alt+s
	public String getName() {
//		System.out.println(name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
//		System.out.println(gender);
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
//		System.out.println(address);
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
//		System.out.println(age);
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
//		System.out.println(id);
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//Constructor
	public Person(String name, String gender, String address, int age, int id) {	
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.age = age;
		this.id = id;
	}
	//Empty Constructor
	public Person() {
		
	}
	//to generate this open source and click generate toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", address=" + address + ", age=" + age + ", id=" + id
				+ "]";
	}
}
