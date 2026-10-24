package child;
import parent.Animal;

public class Dog extends Animal{

    public final void makeNoise(){

        System.out.println("From the parent class : " + bodyPart + " Wide");

        Dog dog = new Dog();
        dog.eat();
        Animal animal = new Animal();

        System.out.println("Woof! Woof!");
    }

    public int makeNoise(int num){

        return 0;

    }

    //@Override
    public String walk(String num) {
        return "jj";
    }

    @Override
    public void eat() {

        System.out.println("Dog Eating");

    }
}





