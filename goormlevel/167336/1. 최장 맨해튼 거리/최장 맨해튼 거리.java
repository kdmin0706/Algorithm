import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] input = br.readLine().split(" ");

			int[] array = Arrays.stream(input)
							.mapToInt(Integer::parseInt)
							.toArray();

			int max = Arrays.stream(array)
							.max().getAsInt();

			int min = Arrays.stream(array)
							.min().getAsInt();

			int[] ints = Arrays.stream(array)
							.filter(i -> i != max && i != min)
							.sorted()
							.toArray();

			int x = max - min;
			int y = ints[0] - ints[1];

			int result = Math.abs(x) + Math.abs(y);
			System.out.println(result);
	}
}