package child;

import parent.Animal;

public class Cat extends Animal {

    @Override
    public void eat() {

        System.out.println("Cat eating");
    }
}
