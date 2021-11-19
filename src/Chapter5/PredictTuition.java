package Chapter5;
import java.util.Scanner;
public class PredictTuition {
    public static void main(String[] args) {
        double tuition=10000;
        double addedTuition=10000;
        int years=0;

        while (addedTuition<2*tuition){
            addedTuition=addedTuition+addedTuition*(0.07);
            years++;
        }
        System.out.print("IN"+years+"years the tuition will become double.");
    }
}
