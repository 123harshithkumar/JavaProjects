package javaPackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class randomstringclass {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String alpha="ABCDEFGHIJKLMNOPQ";
//		StringBuilder sb=new StringBuilder();
//		Random random=new Random();
//		for(int i=0;i<4;i++) {
//			int index=random.nextInt(alpha.length());
//			char randomchar=alpha.charAt(index);
//			sb.append(randomchar);
//		}
//		System.out.println(sb.toString());
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d");
		LocalDateTime now = LocalDateTime.now();
		String todayDate=dtf.format(now);
		System.out.println(todayDate.toUpperCase());
		//return todayDate;	

	}

}
