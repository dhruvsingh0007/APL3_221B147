class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
class Cow extends Animal {
    void makeSound() {
        System.out.println("Cow says: Moo!");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog says: Woof!");
    }
}

class Pig extends Animal {
    void makeSound() {
        System.out.println("Pig says: Oink!");
    }
}

class Goat extends Animal {
    void makeSound() {
        System.out.println("Goat says: Baa!");
    }
}

class Lion extends Animal {
    @Override
    void makeSound() {
        System.out.println("Lion says: Roar!");
    }
}


public class Voice {

    private Animal[] animals;
    public void prepareVoice() {
        animals = new Animal[5]; 
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    }
    public void hear() {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
