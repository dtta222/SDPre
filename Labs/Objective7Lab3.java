public class Objective7Lab3 {
  public static void main(String[] args) {
    int counter = 1;

    while(counter <= 20) {
      if(counter % 2 == 0){
        //would determine if a number is even
        System.out.println(counter + " is even");
      }
      else{
        System.out.println(counter + " is odd");
      }
      counter++;
    }
  }
}