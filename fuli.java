package fuli;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class fuli {
	public static void main(String args[]) {
		MyFrame frame = new MyFrame();
	}
}

class MyFrame extends JFrame {
	private static double benjin, lilv, nianxian, zhongzhi;
	JLabel l1 = new JLabel("��������:");
	JLabel l2 = new JLabel("����Ԫ��:");
	JLabel l3 = new JLabel("�����ʣ�%��:");
	JLabel l4 = new JLabel("���ޣ��꣩:");
	JLabel l6 = new JLabel("��������:");
	JTextField t1 = new JTextField(10);
	JTextField t2 = new JTextField(10);
	JTextField t3 = new JTextField(10);
	JTextField t5 = new JTextField("��ֵ", 25);
	JButton b1 = new JButton("����");
	String[] selectedText = { "��������", "��������", "�������", "���ʼ���", "���޼���" };
	JComboBox c1 = new JComboBox(selectedText);
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();

	MyFrame() {
		this.setSize(300, 400);
		this.setTitle("����������");
		Container c = this.getContentPane();
		GridLayout f1 = new GridLayout(5, 2, 10, 10);
		GridLayout f2 = new GridLayout(3, 1, 5, 5);
		FlowLayout f3 = new FlowLayout(FlowLayout.CENTER, 10, 10);
		c.setLayout(f3);
		p1.setLayout(f1);
		p2.setLayout(f2);
		p1.add(l1);
		p1.add(c1);
		p1.add(l2);
		p1.add(t1);
		p1.add(l3);
		p1.add(t2);
		p1.add(l4);
		p1.add(t3);
		p2.add(b1);
		p2.add(l6);
		p2.add(t5);
		c.add(p1);
		c.add(p2);
		t5.setEnabled(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);// ���ɸ��Ĵ����С

		b1.setBackground(Color.red);
		l1.setForeground(Color.yellow);
		l2.setForeground(Color.yellow);
		l3.setForeground(Color.yellow);
		l4.setForeground(Color.yellow);
		l6.setForeground(Color.yellow);
		b1.setBorder(BorderFactory.createLineBorder(Color.white, 5));// ����b1�߿���ɫ&��ϸ
		Font b11 = new Font("��������:", Font.BOLD, 20);// ����b1,b2���� ����
		b1.setFont(b11);
		b1.setForeground(Color.white);
		c.setBackground(Color.black);
		p1.setBackground(Color.black);
		p2.setBackground(Color.black);
		t1.setForeground(Color.RED);
		t2.setForeground(Color.RED);
		t3.setForeground(Color.RED);
		t5.setForeground(Color.RED);
		

		b1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				zhongzhi = fulicalcutor();
				t5.setText(Double.toString(zhongzhi));
				t5.setEnabled(true);
			}
		});

		c1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				t5.setText("��������");
				t5.setEnabled(false);
			}
		});

	}

	private double fulicalcutor() {
		try {
			benjin = Double.parseDouble(t1.getText());
			lilv = Double.parseDouble(t2.getText());
			nianxian = Double.parseDouble(t3.getText());
		} catch (Exception e) {
			Component c = null;
			JOptionPane.showMessageDialog(c, "��������ȷ������");
		}

		return zhongzhi(benjin, lilv, nianxian);
	}

	// �����ļ��㹫ʽ
	public double zhongzhi(double zhongzhi, double lilv, double nianxian) {
		for (int i = 0; i < nianxian; i++) {
			zhongzhi = zhongzhi * (1 + (lilv / 100));

		}
		return zhongzhi;
	}

}
