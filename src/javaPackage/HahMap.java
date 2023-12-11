package javaPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HahMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//dassault qtn
		List<String> li=new ArrayList();
		li.add("idli");
		li.add("dosa");
		li.add("idli");
		li.add("palav");
		li.add("idli");
		li.add("palav");
		li.add("dosa");
		li.add("sambar");
		
		Map<String,Integer> map=new HashMap();
		
		for(String s:li) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}else {
				map.put(s, 1);
			}
		}
		map.forEach((key,value) -> System.out.println(key +"-"+value+" time(s)"));
	}

}
