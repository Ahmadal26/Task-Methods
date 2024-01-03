import java.util.ArrayList;
import java.util.List;

public class SummationPractice {
    public static void main(String[] args) throws Exception {
     ArrayList<Integer> nums = new ArrayList<Integer>();
nums.add(10);
nums.add(40);
nums.add(14);
nums.add(54);
nums.add(22);
nums.add(19);

System.out.println( Sum(nums));

    }
  public static int Sum (ArrayList<Integer> n1){
  
    int total = 0 ; 
for (int num : n1){
    total+=num;
}
return total;
}
}