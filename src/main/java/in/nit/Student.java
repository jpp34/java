package in.nit;

import java.util.function.Function;

public class Student {
	public static void main(String[] args) {
		Function<Integer,Integer> f=i->i*i;
		{
			System.out.println(f.apply(4));
		}
	}

}
