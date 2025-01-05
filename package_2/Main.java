/*Consider a scenario where an interface named ‘Animal’ is in package named ‘animalpackage ’ and it declares two methods ‘get_cries’ and ‘get_eating_type’ that are place holders for printing cry and eating type of animals. The subpackages of ‘animalpackage ’ are ‘herbivorous’and ‘carnivorous’. The ‘herbivorous’ package contain two classes ‘cow’ and ‘elephant’ that implements the ‘Animal’ interface.Similarly the ‘carnivorous’ package contain ‘lion’ and ‘bear’ that too implements the interface. Design a main class that import these classes and invokes the corresponding methods.*/

import animalpackage.herbivorous.Cow;
import animalpackage.herbivorous.Elephant;
import animalpackage.carnivorous.Lion;
import animalpackage.carnivorous.Bear;

public class Main
{
	public static void main(String[] args)
	{
		Cow cow = new Cow();
		Elephant elephant = new Elephant();
		Lion lion = new Lion();
		Bear bear = new Bear();

		System.out.println("Herbivorous Animals:");
		cow.get_cries();
		cow.get_eating_type();
		elephant.get_cries();
		elephant.get_eating_type();

		System.out.println("\nCarnivorous Animals:");
		lion.get_cries();
		lion.get_eating_type();
		bear.get_cries();
		bear.get_eating_type();
	}
}
