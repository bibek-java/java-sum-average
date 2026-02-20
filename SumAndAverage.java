public class SumAndAverage {
  public static void main(String[] args) {
    System.out.println("Welcome To Sum And Avrage");
        int[] numArray = ArrayUtility.getArrayFromUser();
        
        int sum = sum(numArray);
        double average = average(numArray);
        System.out.println("Your Sum Is: " + sum);
        System.out.printf("You Average Is %.2f", average);
  }
  public static int sum(int[] numArray){
    int sum = 0;
    int i = 0;
    while(i < numArray.length){
      sum += numArray[i];
      i++;
    }
    return sum;
  }
  public static double average(int[] numArray){
    double sum = sum(numArray);
    
    return  sum / numArray.length;
  }
}
