package fivefoursix;

import java.util.Scanner;
public class fivefoursix {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("利率这么低，复利计算收益都这么厉害了，如果拿100万元去买年报酬率10%的股票，若一切顺利，过多长时间，100万元就变成200万元呢？ ");
		System.out.println("请输入你的投资金额（元）：");
		double touzi4=scanner.nextInt();//本金
		System.out.println("请输入你的年利率（%）：");//利率
		double rate4=scanner.nextFloat();
		System.out.println("请输入收益金额（元）：");
		double shouyi4=scanner.nextInt();
        double	year4=(Math.log(shouyi4/touzi4))/(Math.log(1+(rate4/100)));
		System.out.println("利率这么低，复利计算收益都这么厉害了，如果拿100万元去买年报酬率10%的股票，若一切顺利，过多长时间，100万元就变成200万元呢？ ");
		System.out.println(year4);
		System.out.print("\r\n");
		
		System.out.println("如果我希望在十年内将100万元变成200万元，应该找到报酬率在多少的投资工具来帮助我达成目标？如果想在5年后本金翻倍，报酬率就应至少为多少才行呢？");
		System.out.println("请输入你的投资金额（元）：");
		double touzi5=scanner.nextInt();
		System.out.println("请输入你的年限（年）：");
		double year5=scanner.nextFloat();
		System.out.println("请输入收益金额（元）：");
		int shouyi5=scanner.nextInt();
		double	rate5=(Math.pow((shouyi5/touzi5),(1/year5))-1);
		System.out.println("如果我希望在十年内将100万元变成200万元，应该找到报酬率在多少的投资工具来帮助我达成目标？");
		System.out.println(rate5);
		System.out.print("\r\n");
		System.out.println("如果想在5年后本金翻倍，报酬率就应至少为多少才行呢？,请输入年限：");
		double year51=scanner.nextFloat();
		double	rate51=(Math.pow((shouyi5/touzi5),(1/year51))-1);
		System.out.println("如果想在5年后本金翻倍，报酬率就应至少为多少才行呢？");
		System.out.println(rate51);
		System.out.print("\r\n");
		
		System.out.println("如果每年都将积蓄的3万元进行投资，每年都能获得3%的回报，然后将这些本利之和连同年金再投入新一轮的投资，那么，30年后资产总值将变为多少？");
		System.out.println("请输入你每年的投资金额（元）：");
		double touzi6=scanner.nextFloat();
		System.out.println("请输入你的年限（年）：");
		double year6=scanner.nextInt();
		System.out.println("请输入每年的利率（%）：");
		double rate6=scanner.nextFloat();
		double	shouyi6=touzi6*( ( (Math.pow(1+(rate6/100), year6))-1 )/rate6 );
		System.out.println("如果每年都将积蓄的3万元进行投资，每年都能获得3%的回报，然后将这些本利之和连同年金再投入新一轮的投资，那么，30年后资产总值将变为多少？");
        System.out.println(shouyi6);
        System.out.print("\r\n");
        System.out.println("如果每年投资3000元时，请输入你每年的投资金额（元）：");
		double touzi61=scanner.nextFloat();
        double shouyi61=touzi61*( ( (Math.pow(1+(rate6/100), year6))-1 )/rate6 );
        System.out.println("如果每年投资3000元时，每年应投资金额：");
        System.out.println(shouyi61);
        System.out.print("\r\n");
		
		
		
		
		
		
		
	}	
}
