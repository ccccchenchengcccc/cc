package four;

import java.util.Scanner;


public class four{

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入你的投资金额（元）：");
		double touzi=scanner.nextInt();//本金
		System.out.println("请输入你的年利率（%）：");//利率
		double rate=scanner.nextFloat();
		System.out.println("请输入收益金额（元）：");
		double shouyi=scanner.nextInt();
        
		double	year=(Math.log(shouyi/touzi))/(Math.log(1+(rate/100)));
		System.out.println("利率这么低，复利计算收益都这么厉害了，如果拿100万元去买年报酬率10%的股票，若一切顺利，过多长时间，100万元就变成200万元呢？ ");
		System.out.println(year);
	}
	}