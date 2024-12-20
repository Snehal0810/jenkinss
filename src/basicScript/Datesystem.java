package basicScript;

import java.util.Date;

public class Datesystem {

	public static void main(String[] args)
	{
		Date d=new Date();
		System.out.println(d);
      //replace : to -
		String d1=d.toString();
		String d2=d1.replaceAll(":", "-");
		System.out.println(d2);
	}

}
