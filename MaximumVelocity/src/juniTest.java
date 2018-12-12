import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class juniTest {

MaxVel ans=new MaxVel();
	
	@Test
	void test1()
	{
		assertEquals(ans.UnitTest(7.5),1,"");
		
	}
	
	@Test
	void test2()
	{
		assertEquals(ans.UnitTest(12.5),1,"");
	}
	@Test
	void test3()
	{
		assertEquals(ans.UnitTest(2.6),1,"");
	}

}