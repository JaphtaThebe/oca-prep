package parent;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Arrays;


public class Animal {

    protected String bodyPart = "Eyes";

    public Number walk(int num){

        System.out.println("Animal Walking");
        return 0;
    }
    public void eat(){


        final int num;

        /*String a = " ";
       // a=a.trim();
        String b = "Java";
        System.out.println(a.isBlank());

        int[] numbers = {30,20,7,10,};
        Arrays.sort(numbers);
        
        int target = Arrays.binarySearch(numbers,15);
        //int result = linearSearch(numbers, target);
        System.out.println(Arrays.toString(numbers));
        System.out.println(target);*/
        
        LocalDate today =
                LocalDate.of(2026, 6, 27);

        today = today.plusDays(5);

        System.out.println("Today's Date : " +today + " Animal Eating Foood!!!!!!");

    }

  /*  public static int linearSearch(int[] array, int key) {
        // Loop through every single element one by one
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i; // Instantly return the index if found
            }
        }
        return -1; // Return -1 if the loop finishes and nothing matches
    }
    public int calculate(int speed) throws Exception { return 0; }
    private void calculate(String time) { }
    public void checkPath(boolean flag) {
        int target; // Declared but not initialized
        if (true) {
            target = 100;
        }
        // If flag is false, target has no value!
        System.out.println(target); // DOES NOT COMPILE (Variable target might not have been initialized)
    }*/


}
