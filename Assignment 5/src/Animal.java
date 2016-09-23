
public abstract class Animal {
	
	String name;
	String breed;
	int age;
	
	public Animal(){
		name = "";
		breed = "";
		age = 0;
	}
	
	public Animal(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract String makeNoise();
	public abstract String nameSkill();

}
