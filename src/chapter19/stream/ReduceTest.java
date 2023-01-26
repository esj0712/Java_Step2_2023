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
		String[] greeting = { "�ȳ��ϼ���", "hello", "good morning", "���ɽð��Դϴ�" };

		// BinaryOperator�� apply
		String str = Arrays.stream(greeting).reduce(new CompareString()).get();
		System.out.println(str);

		// ���ٽ�
		System.out.println(Arrays.stream(greeting).reduce("", (s1, s2) -> {
			if (s1.getBytes().length >= s2.getBytes().length)
				return s1;
			else
				return s2;
		}));

	}

}
