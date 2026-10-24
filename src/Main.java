import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

import child.Cat;
import parent.Animal;
import child.Dog;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int x = 3;
        int y = ++x + x++;
        y++;

        System.out.println(y);
        int num = 10%7;
        short z = 10;

        short num1 = 8 + 5;
        System.out.println(num);
        Animal animal = new Animal();
        
        walk(2,3,5,7,8,7);
        walk();
        int[] a = {1,2,3,233,5,88};
        int[] b = {1,2,3,4,29};
        System.out.println("Comparing Arrays : " + Arrays.compare(a,b));
        System.out.println("Comparing Arrays : " + Arrays.mismatch(a,b));
        System.out.println(Math.ceil(1.2));
        System.out.println(Math.floor(10.9));
        System.out.println(Math.round(11.453));

        System.out.println(Math.pow(3, 4));
        System.out.println(Math.sqrt(25));
        // Formula: (int)(Math.random() * max) + min;
        int randomNum = (int)(Math.random() * 10) + 1;
        System.out.println(randomNum); // Outputs a random number from 1 to 10
        System.out.println("..............................................................................");

        Instant now = Instant.now();
        System.out.println("Now : " + now);
        now = now.plus(Duration.ofHours(2));
        System.out.println("Now : " + now);
        
       // System.out.println("Later : " + later);
       // System.out.println(now == later);
       System.out.println("..........................................................................................");

       Animal animal1 = new Animal();
       animal1 = new Cat();

       eatingMachanism(animal1);

       /*eatingMachanism(animal2);
       eatingMachanism(animal3);*/


       Dog dog = new Dog();
       dog.makeNoise();

       System.out.println();


    }
    public static void walk(int... steps){
        int[][] nums = {{1,2,3},{4,5,6}};

        System.out.println(nums[1][2]);
        System.out.println(Arrays.deepToString(nums));
        System.out.println(steps.length);
    }
    public static void eatingMachanism(Animal a1){

        a1.eat();

    }
}