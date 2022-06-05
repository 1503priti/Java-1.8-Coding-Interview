package IQ;

import java.util.Arrays;
import java.util.List;

public class IQAnswer_2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4, 5, 6, 8, 23, 35, 36, 77, 87, 99);
		// to print till 36
		// list.stream().limit(7).forEach(x->System.out.println(x));
		// to skip before 36
		list.stream().skip(7).forEach(x -> System.out.println(x));
	}

}
