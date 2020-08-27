package misc.array;

import java.util.Map;
import java.util.HashMap;

public class CountNumbersInArray {

	public static void main(String [] args) {

		int [] numbers = {355,655,677};

		CountNumbersInArray arrayNumbers = new CountNumbersInArray();
		long start = System.nanoTime();
		arrayNumbers.countNumbersInArray(numbers);
		long end = System.nanoTime();
		System.out.println("Execution time : "+(end-start)/1000000);

	}

	public void countNumbersInArray(int [] numbers) {

		Map<Integer,Integer> map = new HashMap();

		for(int i = 0; i < numbers.length; i++) {

			int number = numbers[i];
			while(number > 0) {
				map.put((number%10), map.getOrDefault((number%10),0)+1);
				number = number/10;
			}
		}

		System.out.println(map);

	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
