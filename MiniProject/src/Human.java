//this class will not be accessed by everyone
public class Human extends Person implements Student {
	protected String feelings,thoughts,humanity;
	//Constructor after declaring extends(means inherit)
	public Human(String name, String gender, String address, int age, int id, String feelings, String thoughts,
			String humanity) {
		super(name, gender, address, age, id);//super method is used when u inherit class
		this.feelings = feelings;
		this.thoughts = thoughts;
		this.humanity = humanity;
	}
	//create toString by clicking inherited methods as well
	@Override
	public String toString() {
		return "Human [feelings=" + feelings + ", thoughts=" + thoughts + ", humanity=" + humanity + ", getName()="
				+ getName() + ", getGender()=" + getGender() + ", getAddress()=" + getAddress() + ", getAge()="
				+ getAge() + ", getId()=" + getId() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	@Override
	public String study() {
		return "Name: "+getName()+", Gender: "+getGender();
	}
	@Override
	public String exam() {
		return "";
	}
}
