package javaPackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class setInheritance {

	public static void main(String[] args) {
		Set<String> set=new HashSet();
		Scanner sc=new Scanner(System.in);
		set.add("Virat");
		set.add("Rohit");
		set.add("Rahul");
		set.add("Pandya");
		set.add("Virat");
		set.add("Jadeja");
		
		int size=set.size();
		String[] ar= new String[size];
		System.out.println(set);
		int i=0;
		for(String s: set) {
			ar[i++]=s;
		}
		for(int j=0;j<size;j++) {
			System.out.println(ar[j]+" ");
		}
			c obj=new c();
			obj.scores(ar,size);

		}}


class a{
	int data(String name) {
		int sc=0;
		if(name.equalsIgnoreCase("virat")) {
			sc=99;
		}else if(name.equalsIgnoreCase("rohit")) {
			sc=76;
		}else if(name.equalsIgnoreCase("rahul")) {
			sc=80;
		}else if(name.equalsIgnoreCase("pandya")) {
			sc=90;
		}else if(name.equalsIgnoreCase("jadeja")) {
			sc=100;
		}
		return sc;

	}}
class b extends a{
	
	String highest(HashMap<String, Integer> map) {
		Iterator it=map.keySet().iterator();
		int highest=0;
		String topScorer=null;
		while(it.hasNext()){
			String player=(String) it.next();
			int score=map.get(player);
			if(score>highest) {
				highest=score;
				topScorer=player;
			}
			
			
		}
		return topScorer;
	
	}}
class c extends b{
	HashMap<String, Integer> map=new HashMap<String, Integer>();
	void scores(String[] ar,int size) {
		String[] arr=ar;
		for(int i=0;i<size;i++) {
			if(ar[i].equalsIgnoreCase("virat")) {
				String name=ar[i].toString().toUpperCase();
				map.put(name,data(name));
			}else if(ar[i].equalsIgnoreCase("rahul")) {
				String name=ar[i].toString().toUpperCase();
				map.put(name,data(name));
			}else if(ar[i].equalsIgnoreCase("pandya")) {
				String name=ar[i].toString().toUpperCase();
				map.put(name,data(name));
			}else if(ar[i].equalsIgnoreCase("jadeja")) {
				String name=ar[i].toString().toUpperCase();
				map.put(name,data(name));
			}
			else if(ar[i].equalsIgnoreCase("rohit")) {
				String name=ar[i].toString().toUpperCase();
				map.put(name,data(name));
			}
		}		
		c ob=new c();
		String topScorer=ob.highest(map);
		System.out.println("-------------------------");
		System.out.println("Top Scorer is "+topScorer);


	}}



