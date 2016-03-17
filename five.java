package five;

import java.util.Scanner;


public class five{

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入你的投资金额（元）：");
		double touzi=scanner.nextInt();
		System.out.println("请输入你的年限（年）：");
		double year=scanner.nextFloat();
		System.out.println("请输入收益金额（元）：");
		int shouyi=scanner.nextInt();
		double	rate=(Math.pow((shouyi/touzi),(1/year))-1);
		System.out.println("如果我希望在十年内将100万元变成200万元，应该找到报酬率在多少的投资工具来帮助我达成目标？如果想在5年后本金翻倍，报酬率就应至少为多少才行呢？");
		System.out.println(rate);
}
	}