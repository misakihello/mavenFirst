package aa.bb;

import a.b.Sdcard;

public class Phone{
	  public String getSdcard(){
	      Sdcard sdcard =new Sdcard();
		  return "huawei 的 sdcard 生产商是:" +sdcard.getVender();
	  }
	}
