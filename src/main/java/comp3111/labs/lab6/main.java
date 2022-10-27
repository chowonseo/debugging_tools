package comp3111.labs.lab6;

/*
 * note the bad coding style (deliberately written for debugging exercise) 
 */
public class main {
	public static void main(String[] args) {
		Animal animals[] = new Animal[10];
//		int test = 0;
//		for (Animal a : animals) {
////			test++;
//			a = new Animal();
//			test++;
//		}
		for (int i=0;i<10;i++) {
			animals[i] = new Animal();
		}
		/*
		 * The error is introduced at the point where animals[iii].isAlive() is called.
		 * This raises an error, as animals[iii] is a null.
		 * The previous code:
		 * for(Animal a: animals) a = new Animal;
		 * only creates Animal object on the local variable a inside the for loop
		 * and deleted after each iteration in the for loop.
		 * (Does not store the newly created Animal object to the animals[]
		 * resulting in animals[] with 10 null values.
		 * Therefore, I have instead modified the code to directly point to the
		 * blocks in animals[i] and instantiated Animal object. Hence, 10 animal
		 * objects are stored in animals[] which we are safe to call the member
		 * operations of animal objects
		 */
		
		for (int iii = 0; iii < 10; iii++) {
			int ii = 0;
			for (; ii < 100 && animals[iii].isAlive() ; ii++) {
				System.out.print(animals[iii].getWeight() + " ");
				animals[iii].eat();
				if (ii % 3 == 0)
				animals[iii].poo();
			}
		}	
	}
}
