package com.zl.lennon.string.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.*;

public class RegextTest {

	@Test
	public void test() {
		String regex ="('|')(.*?)(\1)";
		Pattern p=Pattern.compile(regex); 
		String str ="'Hello', 'World'";
		Matcher re=p.matcher(str);
		 while(re.find()){
			 System.out.println(re.group());
		 }

	}

}
