package TestScenario;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
	
	public static void main (String aa[])
	{
		String url = "https://ap6.salesforce.com/0030K00001LVCL8";
		Pattern p = Pattern.compile("[0-9A-Za-z]{15}");
		Matcher m = p.matcher(url);
		System.out.println(url);
		if(m.find())
		{
			String id = m.group(0);
			System.out.println(id);
		}
	}
	
}
