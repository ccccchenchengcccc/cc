package four;

import java.util.Scanner;


public class four{

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("���������Ͷ�ʽ�Ԫ����");
		double touzi=scanner.nextInt();//����
		System.out.println("��������������ʣ�%����");//����
		double rate=scanner.nextFloat();
		System.out.println("�����������Ԫ����");
		double shouyi=scanner.nextInt();
        
		double	year=(Math.log(shouyi/touzi))/(Math.log(1+(rate/100)));
		System.out.println("������ô�ͣ������������涼��ô�����ˣ������100��Ԫȥ���걨����10%�Ĺ�Ʊ����һ��˳�������೤ʱ�䣬100��Ԫ�ͱ��200��Ԫ�أ� ");
		System.out.println(year);
	}
	}