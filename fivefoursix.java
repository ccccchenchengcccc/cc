package fivefoursix;

import java.util.Scanner;
public class fivefoursix {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("������ô�ͣ������������涼��ô�����ˣ������100��Ԫȥ���걨����10%�Ĺ�Ʊ����һ��˳�������೤ʱ�䣬100��Ԫ�ͱ��200��Ԫ�أ� ");
		System.out.println("���������Ͷ�ʽ�Ԫ����");
		double touzi4=scanner.nextInt();//����
		System.out.println("��������������ʣ�%����");//����
		double rate4=scanner.nextFloat();
		System.out.println("�����������Ԫ����");
		double shouyi4=scanner.nextInt();
        double	year4=(Math.log(shouyi4/touzi4))/(Math.log(1+(rate4/100)));
		System.out.println("������ô�ͣ������������涼��ô�����ˣ������100��Ԫȥ���걨����10%�Ĺ�Ʊ����һ��˳�������೤ʱ�䣬100��Ԫ�ͱ��200��Ԫ�أ� ");
		System.out.println(year4);
		System.out.print("\r\n");
		
		System.out.println("�����ϣ����ʮ���ڽ�100��Ԫ���200��Ԫ��Ӧ���ҵ��������ڶ��ٵ�Ͷ�ʹ����������Ҵ��Ŀ�ꣿ�������5��󱾽𷭱��������ʾ�Ӧ����Ϊ���ٲ����أ�");
		System.out.println("���������Ͷ�ʽ�Ԫ����");
		double touzi5=scanner.nextInt();
		System.out.println("������������ޣ��꣩��");
		double year5=scanner.nextFloat();
		System.out.println("�����������Ԫ����");
		int shouyi5=scanner.nextInt();
		double	rate5=(Math.pow((shouyi5/touzi5),(1/year5))-1);
		System.out.println("�����ϣ����ʮ���ڽ�100��Ԫ���200��Ԫ��Ӧ���ҵ��������ڶ��ٵ�Ͷ�ʹ����������Ҵ��Ŀ�ꣿ");
		System.out.println(rate5);
		System.out.print("\r\n");
		System.out.println("�������5��󱾽𷭱��������ʾ�Ӧ����Ϊ���ٲ����أ�,���������ޣ�");
		double year51=scanner.nextFloat();
		double	rate51=(Math.pow((shouyi5/touzi5),(1/year51))-1);
		System.out.println("�������5��󱾽𷭱��������ʾ�Ӧ����Ϊ���ٲ����أ�");
		System.out.println(rate51);
		System.out.print("\r\n");
		
		System.out.println("���ÿ�궼�������3��Ԫ����Ͷ�ʣ�ÿ�궼�ܻ��3%�Ļر���Ȼ����Щ����֮����ͬ�����Ͷ����һ�ֵ�Ͷ�ʣ���ô��30����ʲ���ֵ����Ϊ���٣�");
		System.out.println("��������ÿ���Ͷ�ʽ�Ԫ����");
		double touzi6=scanner.nextFloat();
		System.out.println("������������ޣ��꣩��");
		double year6=scanner.nextInt();
		System.out.println("������ÿ������ʣ�%����");
		double rate6=scanner.nextFloat();
		double	shouyi6=touzi6*( ( (Math.pow(1+(rate6/100), year6))-1 )/rate6 );
		System.out.println("���ÿ�궼�������3��Ԫ����Ͷ�ʣ�ÿ�궼�ܻ��3%�Ļر���Ȼ����Щ����֮����ͬ�����Ͷ����һ�ֵ�Ͷ�ʣ���ô��30����ʲ���ֵ����Ϊ���٣�");
        System.out.println(shouyi6);
        System.out.print("\r\n");
        System.out.println("���ÿ��Ͷ��3000Ԫʱ����������ÿ���Ͷ�ʽ�Ԫ����");
		double touzi61=scanner.nextFloat();
        double shouyi61=touzi61*( ( (Math.pow(1+(rate6/100), year6))-1 )/rate6 );
        System.out.println("���ÿ��Ͷ��3000Ԫʱ��ÿ��ӦͶ�ʽ�");
        System.out.println(shouyi61);
        System.out.print("\r\n");
		
		
		
		
		
		
		
	}	
}
