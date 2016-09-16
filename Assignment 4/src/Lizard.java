
public class Lizard extends Animal {

	public Lizard(String breed, String name, int age) {
		super(breed, name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeNoise() {
		// TODO Auto-generated method stub
		return "Ssssssss";
	}

	@Override
	public String groupBehavior() {
		// TODO Auto-generated method stub
		return "Lizards lay around";
	}

	@Override
	public String toString() {
		return "Lizard [getBreed()=" + getBreed() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

}
