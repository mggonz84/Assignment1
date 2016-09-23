
public class Dog extends Animal {

	public Dog(String name, String breed, int age) {
		super(name, breed, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeNoise() {
		return "Woof, woof";
	}

	@Override
	public String nameSkill() {
		return "Sense of smell and hearing";
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}
	

}
