package IQ;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Count the no of occurrence of words in a given string using Java 8?
public class IQAnswer_3 {

	public static void main(String[] args) {

		String str = "welcome to code decode and code decode welcome you";
		List<String> list = Arrays.asList(str.split(" "));
		Map<String, Long> map = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);

	}

}
