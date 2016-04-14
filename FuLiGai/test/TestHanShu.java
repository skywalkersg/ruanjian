import static org.junit.Assert.*;

import org.junit.Test;


public class TestHanShu {
//  本金为1万元，利率为2%，存3年，复利次数为2，最终能获得多少复利终值？
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
