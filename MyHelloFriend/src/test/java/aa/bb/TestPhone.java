package aa.bb;

import org.junit.Test;


public class TestPhone {
	@Test
	public void testGetSdcard(){
		Phone phone = new Phone();
		String sdcard = phone.getSdcard();
		System.out.println(sdcard);		
	}
}