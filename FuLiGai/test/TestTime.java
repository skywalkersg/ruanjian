import static org.junit.Assert.*;

import org.junit.Test;


public class TestTime {
//   ������ô�ͣ������������涼��ô�����ˣ������100��Ԫȥ���걨����10%�Ĺ�Ʊ����һ��˳�������೤ʱ�䣬100��Ԫ�ͱ��200��Ԫ�أ�
	@Test
	public void testTime() {
		HanShu hs = new HanShu("1000000", "0.1", null, "1", "2000000");
		int Year=(int)hs.Time();
//		System.out.println(Year);
		boolean flag = 8==Year;
		assertEquals(true, flag);
	}

}
