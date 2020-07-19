package hw4Q3Inheritance02;

public class TestAnimal {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.animalInfo();
		System.out.println("\n===========================");
		
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();
		System.out.println("\n===========================");
		
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();
		System.out.println("\n===========================");
		
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();
		System.out.println("\n===========================");
		
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.reptileInfo();
		cobra.snakeInfo();
		cobra.animalInfo();
		System.out.println("\n===========================");
		
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();
		System.out.println("\n===========================");
		
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();
		System.out.println("\n===========================");
		
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();
		System.out.println("\n===========================");
		
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo(); //single inheritance
		bullDog.mammalInfo();
		bullDog.animalInfo(); //heirarchical inheritance
		System.out.println("\n===========================");
		
	}

}

//Multilevel Inheritance

/* Bulldog - dog - mammal - animals
 * Cobra - snake - reptile - animals
 * Robin - bird - animal
 
Hierarchical Inheritance

Mammal - animal, birds - animal, reptile - animal

Single Inheritance

Bulldog - Dog
Cobra - Snake
Robin - Birds 
*/
