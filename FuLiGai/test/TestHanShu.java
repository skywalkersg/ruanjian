import static org.junit.Assert.*;

import org.junit.Test;


public class TestHanShu {
//  ����Ϊ1��Ԫ������Ϊ2%����3�꣬��������Ϊ2�������ܻ�ö��ٸ�����ֵ��
	@Test
	public void testSuanFa01() {
		HanShu hs = new HanShu("10000", "0.02", "3", "2", null);
		double Future=hs.SuanFa01();
		System.out.println(Future);
		boolean flag = 10615.201506009998==Future;
		System.out.println(flag);
		assertEquals(true, flag);
		
	}

}
