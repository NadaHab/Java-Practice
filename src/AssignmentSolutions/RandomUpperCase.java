package AssignmentSolutions;

public class RandomUpperCase {
  public static void main(String args[]) {

     System.out.println("A random uppercase letter is " );
     for( int i=1;i<11;i++){
      char ch = (char)(Math.random() * 26 + 'A');
      System.out.print(" " + ch);
    }

  }
}