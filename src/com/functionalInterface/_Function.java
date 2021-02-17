package com.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

	public static void main(String[] args) {
		System.out.println(increment(1));
		System.out.println("---------Function-----------");
		int inc = incrementByOneFunction.apply(1);
		System.out.println(inc);
		System.out.println("---------Function and then Apply another Function-----------");
		int incMul = incrementByOneFunction.andThen(multiplyByTwoFunction).apply(5);
		System.out.println(incMul);
		System.out.println("---------Function Chaining-----------");
		int funcChain = incrementByOneAndMultiplyByTwoFunction.apply(10);
		System.out.println(funcChain);
		System.out.println("-------------BiFunction --------------");
		int result = incrementAndMultiplyBiFunction.apply(10, 100);
		System.out.println(result);

	}

	static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
	static Function<Integer, Integer> multiplyByTwoFunction = number -> number * 2;
	static Function<Integer, Integer> incrementByOneAndMultiplyByTwoFunction = incrementByOneFunction
			.andThen(multiplyByTwoFunction);

	static int increment(int num) {
		return num + 1;
	}

	static BiFunction<Integer, Integer, Integer> incrementAndMultiplyBiFunction = (numberToIncrement,
			numberToMultiply) -> (numberToIncrement + 1) * numberToMultiply;

}
