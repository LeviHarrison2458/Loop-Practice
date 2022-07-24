import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<Integer>(2);
		
		// TODO Auto-generated method stub
		System.out.print("Please provide me 5 numbers:\n");
		while (nums.size() < 5) {
			nums.add(Integer.parseInt(input.nextLine()));
		}
		System.out.println(nums);
		
		Integer sum = 0;
		for(int i = 0; i < nums.size(); ++i) {
			sum += nums.get(i);
		}
		System.out.println(sum);
		
		Integer product = 1;
		for(int i = 0; i < nums.size(); ++i) {
			product *= nums.get(i);
		}
		System.out.println(product);
		
		int largestNum = Collections.max(nums);
		System.out.println(largestNum);
		
		int smallestNum = Collections.min(nums);
		System.out.println(smallestNum);

	}

}
