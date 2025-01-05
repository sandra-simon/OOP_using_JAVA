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
