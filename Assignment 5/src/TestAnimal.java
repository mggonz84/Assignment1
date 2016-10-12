public class TestAnimal {

	public static void main(String[] args) {
		
		
		//name, breed, age
		Animal d = new Dog("Rex","pitbull",5);
		Animal b = new Bird("Pery","cardinal",3);
		
		//call makeNoise and nameSkill
		System.out.println("*******Dog*******");
		System.out.println(d.toString());
		System.out.println("Noise: " + d.makeNoise());
		System.out.println("Skill: " + d.nameSkill());
		
		System.out.println("******Bird*******");
		System.out.println(b.toString());
		System.out.println("Noise: " + b.makeNoise());
		System.out.println("Skill: " + b.nameSkill());

		
	}

}
