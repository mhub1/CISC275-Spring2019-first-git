public class Dog extends Animal{
	public Dog(String n, int num) {
		name = n;
		numLegs = num;
	}
	public String toString() {
		return name + ": " + numLegs;
	}
}