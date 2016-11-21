package stringtointeger;

public class StringToInt {

	public static void main(String[] args) {
		String str = "2566";
		int num1 = 229;

		int sum = Integer.parseInt(str) + num1;
		int sum2 = Integer.valueOf(str) + num1;

		System.out.println(sum2);
	}

}
