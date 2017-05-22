package a.b;

import org.junit.Test;
public class TestSdcard {
	@Test
	public void testGetVender(){
		Sdcard sdcard = new Sdcard();
		String verder = sdcard.getVender();
		System.out.println("生产商:"+verder);		
	}
}
