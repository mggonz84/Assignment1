
public class Dog extends Animal {

	public Dog(String breed, String name, int age) {
		super(breed, name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeNoise() {
		// TODO Auto-generated method stub
		return "Woof Woof";
	}

	@Override
	public String groupBehavior() {
		// TODO Auto-generated method stub
		return "Dogs play around";
	}

	@Override
	public String toString() {
		return "Dog [getBreed()=" + getBreed() + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
