package fuli;

import static org.junit.Assert.*;

import org.hamcrest.Matcher;
import org.junit.Test;

public class fulitest {
	@Test
	public void testZhongzhiDoubleDoubleDoubleDouble() {
		MyFrame cutor = new MyFrame();
		double str = cutor.zhongzhi(1000000, 3, 30);
		assertThat(str, is(242726.2471189662));
	}

	private void assertThat(double str1, Object object) {
		// TODO 自动生成的方法存根

	}

	private Object is(double d) {
		// TODO 自动生成的方法存根
		return null;
	}
}
