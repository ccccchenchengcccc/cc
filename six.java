package six;

import java.util.Scanner;


public class six{

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("��������ÿ���Ͷ�ʽ�Ԫ����");
		double touzi=scanner.nextFloat();
		System.out.println("������������ޣ��꣩��");
		double year=scanner.nextInt();
		System.out.println("������ÿ������ʣ�%����");
		double rate=scanner.nextFloat();
		
		double	shouyi=touzi*( ( (Math.pow(1+(rate/100), year))-1 )/rate );
		System.out.println("���ÿ�궼�������3��Ԫ����Ͷ�ʣ�ÿ�궼�ܻ��3%�Ļر���Ȼ����Щ����֮����ͬ�����Ͷ����һ�ֵ�Ͷ�ʣ���ô��30����ʲ���ֵ����Ϊ���٣�");
        System.out.println(shouyi);
        System.out.println("���ÿ��Ͷ��3000Ԫʱ����������ÿ���Ͷ�ʽ�Ԫ����");
		double touzi1=scanner.nextFloat();
        double shouyi1=touzi1*( ( (Math.pow(1+(rate/100), year))-1 )/rate );
        System.out.println(shouyi1);
	}
	}