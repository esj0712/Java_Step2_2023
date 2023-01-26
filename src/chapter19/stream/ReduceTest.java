package chapter19.stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

// BinaryOperator : FunctionalInterface
class CompareString implements BinaryOperator<String> {

	@Override
	public String apply(String s1, String s2) {
		if (s1.getBytes().length >= s2.getBytes().length)
			return s1;
		else
			return s2;
	}

}

public class ReduceTest {

	public static void main(String[] args) {
		String[] greeting = { "안녕하세요", "hello", "good morning", "점심시간입니다" };

		// BinaryOperator의 apply
		String str = Arrays.stream(greeting).reduce(new CompareString()).get();
		System.out.println(str);

		// 람다식
		System.out.println(Arrays.stream(greeting).reduce("", (s1, s2) -> {
			if (s1.getBytes().length >= s2.getBytes().length)
				return s1;
			else
				return s2;
		}));

	}

}
