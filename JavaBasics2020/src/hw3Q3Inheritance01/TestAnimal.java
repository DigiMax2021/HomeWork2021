package hw3Q3Inheritance01;

public class TestAnimal {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.animalInfo();
		
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		
		Birds birds = new Birds();
		birds.birdsInfo();
		
		Dog dog = new Dog();
		dog.dogInfo();
		
		Snake snake = new Snake();
		snake.snakeInfo();
		
		Robin robin = new Robin();
		robin.robinInfo();

	}

}
