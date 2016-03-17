package six;

import java.util.Scanner;


public class six{

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入你每年的投资金额（元）：");
		double touzi=scanner.nextFloat();
		System.out.println("请输入你的年限（年）：");
		double year=scanner.nextInt();
		System.out.println("请输入每年的利率（%）：");
		double rate=scanner.nextFloat();
		
		double	shouyi=touzi*( ( (Math.pow(1+(rate/100), year))-1 )/rate );
		System.out.println("如果每年都将积蓄的3万元进行投资，每年都能获得3%的回报，然后将这些本利之和连同年金再投入新一轮的投资，那么，30年后资产总值将变为多少？");
        System.out.println(shouyi);
        System.out.println("如果每年投资3000元时，请输入你每年的投资金额（元）：");
		double touzi1=scanner.nextFloat();
        double shouyi1=touzi1*( ( (Math.pow(1+(rate/100), year))-1 )/rate );
        System.out.println(shouyi1);
	}
	}