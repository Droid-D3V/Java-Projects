package wtf.droid;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        int max = 6;
        int min = 1;
        int rng = (int)(Math.random()*(max-min+1)+min);

        System.out.println("RNG");
        System.out.println(rng);
    }
}
