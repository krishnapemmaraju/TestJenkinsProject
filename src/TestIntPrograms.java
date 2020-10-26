import java.util.Stack;

public class TestIntPrograms {
	int rev = 0;

	public void swap(int x, int y) {
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("The swapped numbers are " + x + " and " + y);
	}

	public void reverse(int x) {
		int y;
		while (x != 0) {
			y = x % 10;
			rev = rev * 10 + y;
			x = x / 10;
		}
		System.out.println(rev);
	}

	public void byexamp(int x) {
		x = x % 10;
		System.out.println(x);
	}

	public void factorial(int x) {
		int fact = 1;

		if (x <= 0) {
			System.out.println("Negative Numbers cant have Factorial");
		}

		for (int i = x; i <= x; i--) {
			if (i == 0) {
				break;
			}
			fact = fact * i;// 6
		}
		System.out.println("The Factorial Of the Given Number is " + fact);
	}

	public void StringBalan(String data) {
		if (stringBalPara(data)) {
			System.out.println("The String is Balanced");
		} else {
			System.out.println("The String is not balanced");
		}
	}

	public boolean stringBalPara(String data) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < data.length(); i++) {
			if (data.contains("{") || data.contains("[") || data.contains("(")) {
				stack.push(data.charAt(i));
			}

			if (data.contains("]")) {
				if (stack.empty() || !stack.pop().equals('[')) {
					return false;
				} else {
					break;
				}
			}
			if (data.contains("}")) {
				if (stack.empty() || !stack.pop().equals('{')) {
					return false;
				} else {
					break;
				}
			}
			if (data.contains(")")) {
				if (stack.empty() || !stack.pop().equals('(')) {
					return false;
				} else {
					break;
				}

			}

		}
		return stack.empty();
	}

	public boolean checkPlanagram(String sentence) {
		boolean[] mark = new boolean[26];
		int index = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if ('A' <= sentence.charAt(i) && sentence.charAt(i) <= 'Z')
				index = sentence.charAt(i) - 'A';
			else if ('a' <= sentence.charAt(i) && sentence.charAt(i) <= 'z')
				index = sentence.charAt(i) - 'a';
			mark[index] = true;
		}
		for (int i = 0; i <= 25; i++) {
			if (!mark[i])
				return (false);
			return (true);
		}
		return false;
	}

	public void fibonacciSeries(int count) {

		// 1 1 2 3 5
		int prevNum = 0;
		int NextNum = 1;
		int fib;
		int i = 1;
		while (i <= 10) {
			fib = prevNum + NextNum;
			prevNum = NextNum;
			NextNum = fib;
			System.out.println(prevNum);
			i++;
		}
	}

	public void myReverse(int number) {
		int x;
		int rev = 0;
		while (number != 0) {
			x = number % 10; // 2
			rev = rev * 10 + x; // 32
			number = number / 10;
		} // 0

		System.out.println(rev);
	}

	public void checkPalinDromeString(String str) {

		char[] strData = str.toCharArray();
		String tempStr = "";
		for (int i = strData.length; i > 0; i--) {
			tempStr = tempStr + strData[i - 1];
		}
		if (tempStr.equals(str)) {
			System.out.println("The Given string " + str.toUpperCase() + " is a Plaindrome");
		} else {
			System.out.println("The Given string " + str.toUpperCase() + " is not a Plaindrome");
		}
	}

	public void checkPalindromeInteger(int number) {

		// 33
		int temp = number;
		int x = 0;
		int pal = 0;
		while (number != 0) {
			x = number % 10;//32
			pal = pal * 10 + x; // 352
			number = number / 10;
		}

		if (pal == temp) {
			System.out.println("The Given number " + temp + " is a Plaindrome");
		} else {
			System.out.println("The Given string " + temp + " is not a Plaindrome");
		}

	}
	
	public void checkForArmStrongNum(int num) {
		int noOfDigits = (int) Math.floor(Math.log10(num) + 1);
		System.out.println("The Number of Digits are " + noOfDigits);
		
		int temp = num;
		int digit = 0;
		int powerSum =0;
		while ( temp != 0) {
			digit= temp %10;// 2
			powerSum = powerSum + (int) Math.pow(digit, noOfDigits);
			temp = temp/10;	
		}	
		
		if (powerSum == num) {
			System.out.println("The Given number " + powerSum + " is a Armstrong");
		} else {
			System.out.println("The Given string " + powerSum + " is not a Armstrong");
		}
	}

	public static void main(String ar[]) {
		TestIntPrograms intProg = new TestIntPrograms();
		// intProg.swap(-23,42);
		// intProg.reverse(-235);
		// intProg.byexamp(42);
		// intProg.factorial(1);
		// intProg.StringBalan("{[]}");
		// System.out.println(intProg.checkPlanagram("Pac my box with five dozen liquor
		// jugs"));
		// intProg.fibonacciSeries(10);
		// intProg.myReverse(1223);
		//intProg.checkPalinDromeString("SaaS");
		//intProg.checkPalindromeInteger(223);
		intProg.checkForArmStrongNum(153);
	}
}
