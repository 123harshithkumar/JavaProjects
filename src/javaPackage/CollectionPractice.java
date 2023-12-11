package javaPackage;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class CollectionPractice {



		public static void main(String[] args) {
			ArrayList al=new ArrayList();
			al.add(12);
			al.add("cena");
			System.out.println(al);
			al.addAll(al);
			al.remove(0);
			al.remove(1);
			System.out.println(al);
			
			ArrayList<Object> al2=new ArrayList<>();
			System.out.println(al2.contains(12));
			al2.add("cena");
			System.out.println(al2);
			
			CollectionPractice obj=new CollectionPractice();
			obj.arraylist();
			obj.linkedlist();
			obj.hashmap();

		}
		public void arraylist() {
			Scanner sc=new Scanner(System.in);
			ArrayList<String> al3=new ArrayList<>();
			System.out.println("Can you enter players name?");
			
			al3.add("Virat");
			al3.add("sss");
			
			Iterator<String> it=al3.iterator();
			while(it.hasNext()) {
				System.out.println("nameis :"+it.next());
			}
			
			
		}
		public void linkedlist() {
			LinkedList<String> ll=new LinkedList<String>();
			Scanner sc=new Scanner(System.in);
			String name;
			System.out.println("Can you enter 5 names?");
			for(int i=0;i<5;i++) {
				name= sc.next();
				ll.add(name);
			}
			System.out.println(ll);
				
				
			}
		public void hashmap() {
			HashMap<String, Integer> map=new HashMap<String, Integer>();
			map.put("Roll No", 123);
			map.put("age", 33);
			map.put("level", 3);
			System.out.println(map);
			Iterator<String> it= map.keySet().iterator();
			while(it.hasNext()){
				String s=it.next();
				System.out.println(map.get(s));
				
			}
		}

	}
