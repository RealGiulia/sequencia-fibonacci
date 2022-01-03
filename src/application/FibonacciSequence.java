package application;

import java.util.Arrays;
import java.util.stream.Stream;

public class FibonacciSequence {

	public static void main(String[] args) {
		Stream<Long> fibonacci = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(fibonacci.limit(20).toArray()));
	}

}
