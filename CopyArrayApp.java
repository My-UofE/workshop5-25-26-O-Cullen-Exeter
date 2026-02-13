// 1.1
// import java.util.Arrays;

// public class CopyArrayApp{
//   public static void main(String[] args) {
//     int nVals = args.length;

//     // to create a new array of ints
//     int[] myVals = new int[nVals];

//     for (int i = 0; i < nVals; i++) {
//         int item = Integer.parseInt(args[i]);
//     //   System.out.println(item);
//         myVals[i] = item;
//     }
//     System.out.println("original values: " + Arrays.toString(myVals));
//   }
// }

// 1.2
import java.util.ArrayList;
public class CopyArrayApp{
  public static void main(String[] args) {
    ArrayList<Integer> every_num = new ArrayList<>();
    ArrayList<Integer> unique_nums = new ArrayList<>();
    for (int i =0; i < args.length; i++){
        int num = Integer.parseInt(args[i]);
        if (unique_nums.contains(num) == false){
            unique_nums.add(num);
        }
        every_num.add(num);
    }
    System.out.println("original values: " + every_num);
    System.out.println("unique values: " + unique_nums);
  }
}
