// Question 9: Abstract Animal with Lion, Tiger, and Deer
abstract class Animal {
    public abstract void eat();
    public abstract void sleep();
}

class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("Lion eats meat.");
    }
    @Override
    public void sleep() {
        System.out.println("Lion sleeps in a den.");
    }
}

class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("Tiger hunts and eats meat.");
    }
    @Override
    public void sleep() {
        System.out.println("Tiger sleeps in deep cover.");
    }
}

class Deer extends Animal {
    @Override
    public void eat() {
        System.out.println("Deer eats grass and leaves.");
    }
    @Override
    public void sleep() {
        System.out.println("Deer sleeps under the trees.");
    }
}

public class Question_09 {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        Animal deer = new Deer();

        lion.eat(); lion.sleep();
        tiger.eat(); tiger.sleep();
        deer.eat(); deer.sleep();
    }
}
