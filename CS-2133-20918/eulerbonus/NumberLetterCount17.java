// Euler problem 17
// solution: 21124

public class NumberLetterCount17 {
	public static void main(String[] args) {
		String letters = "";
		for (int i=1;i<=1000;i++) {
			if (i<20||(i<100&&i%10==0)||(i<=1000&&i%100==0)) letters += switcher(""+i);
			else if (i<100) {
				String num = ""+i;
				letters += switcher(num.charAt(0)+"0");
				letters += switcher(num.charAt(1)+"");
			}
			else if (i>100) {
				String num = ""+i;
				letters += switcher(num.charAt(0)+"00");
				letters += "and";
				if (num.charAt(1)=='1') {
					letters += switcher("1"+num.charAt(2));
				}
				else {
					letters += switcher(num.charAt(1)+"0");
					letters += switcher(num.charAt(2)+"");
				}
			}
		}
		//System.out.println(switcher("1000"));
		//System.out.println(letters);
		System.out.println(letters.length());
	}
	public static String switcher(String n) {
		String ret = n;
		switch(ret) {
			case "0": ret = "";
				break;
			case "1": ret = "one";
				break;
			case "2": ret = "two";
				break;
			case "3": ret = "three";
				break;
			case "4": ret = "four";
				break;
			case "5": ret = "five";
				break;
			case "6": ret = "six";
				break;
			case "7": ret = "seven";
				break;
			case "8": ret = "eight";
				break;
			case "9": ret = "nine";
				break;
			case "10": ret = "ten";
				break;
			case "11": ret = "eleven";
				break;
			case "12": ret = "twelve";
				break;
			case "13": ret = "thirteen";
				break;
			case "14": ret = "fourteen";
				break;
			case "15": ret = "fifteen";
				break;
			case "16": ret = "sixteen";
				break;
			case "17": ret = "seventeen";
				break;
			case "18": ret = "eighteen";
				break;
			case "19": ret = "nineteen";
				break;
			case "20": ret = "twenty";
				break;
			case "30": ret = "thirty";
				break;
			case "40": ret = "forty";
				break;
			case "50": ret = "fifty";
				break;
			case "60": ret = "sixty";
				break;
			case "70": ret = "seventy";
				break;
			case "80": ret = "eighty";
				break;
			case "90": ret = "ninety";
				break;
			case "100": ret = "onehundred";
				break;
			case "200": ret = "twohundred";
				break;
			case "300": ret = "threehundred";
				break;
			case "400": ret = "fourhundred";
				break;
			case "500": ret = "fivehundred";
				break;
			case "600": ret = "sixhundred";
				break;
			case "700": ret = "sevenhundred";
				break;
			case "800": ret = "eighthundred";
				break;
			case "900": ret = "ninehundred";
				break;
			case "1000": ret = "onethousand";
				break;
			default: ret = "";
				break;
		}
		return ret;
	}
}