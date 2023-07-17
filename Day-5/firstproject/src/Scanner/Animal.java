package Scanner;

public class Animal {
	 public int Age;
	 public String Name;
	 public String Gender;
	 public String colour;
	 
	 public Animal() {
		 
	 }

	public Animal(int age, String name, String gender, String colour) {
		super();
		Age = age;
		Name = name;
		Gender = gender;
		this.colour = colour;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Animal [Age=" + Age + ", Name=" + Name + ", Gender=" + Gender + ", colour=" + colour + "]";
	}
	
	

	 
}
