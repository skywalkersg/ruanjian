import static org.junit.Assert.*;

import org.junit.Test;


public class TestTime {
//   利率这么低，复利计算收益都这么厉害了，如果拿100万元去买年报酬率10%的股票，若一切顺利，过多长时间，100万元就变成200万元呢？
	@Test
	public void testTime() {
		HanShu hs = new HanShu("1000000", "0.1", null, "1", "2000000");
		int Year=(int)hs.Time();
//		System.out.println(Year);
		boolean flag = 8==Year;
		assertEquals(true, flag);
	}

}
