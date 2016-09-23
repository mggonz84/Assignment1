
public class Bird extends Animal {

	public Bird(String name, String breed, int age) {
		super(name, breed, age);
	}

	@Override
	public String makeNoise() {
		return "Tweet, Tweet";
	}

	@Override
	public String nameSkill() {
		return "Wings to fly and beak to dig for food like worms or insects";
	}

	@Override
	public String toString() {
		return "Bird [name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}
	

}
