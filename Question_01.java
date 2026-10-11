// Question 1: Animal and Cat (Overriding)
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark"); // As requested by the question prompt
    }
}

public class Question_01 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myCat = new Cat();
        
        System.out.print("Animal sound: ");
        myAnimal.makeSound();
        
        System.out.print("Cat sound: ");
        myCat.makeSound();
    }
}
