package collection1;

import java.util.*;

public class CollectionTest {
	
	public void hashsetexample()
	{
		//HashSet declaration
		HashSet<String> hset = new HashSet<String>();
		
		hset.add("Apple");
		hset.add("Mango");
		hset.add("Grapes");
		hset.add("Orange");
		hset.add("Fig");
		//adding duplicate elements
		hset.add("Apple");
		hset.add("Mango");
		//adding null values
		hset.add(null);
		hset.add(null);
		
		//displaying HashSet elements
		System.out.println(hset);
		
	}
	
	public void treesetexample()
	{
		TreeSet<String> al = new TreeSet<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		//traversing elements
		Iterator<String> itr=al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	public void listexample()
	{
		List<String> al = new ArrayList<String>();
		al.add("Amit");
		al.add("Vijay");
		al.add("Kumar");
		al.add("Sachin");
		System.out.println("An element at 2nd position: "+al.get(2));
		for(String s:al) {
			System.out.println(s);
		}
	}
		
	public void queueexample() {
		Queue<String> queue=new PriorityQueue<String>();
		queue.add("Amit");
		queue.add("Vijay");
		queue.add("Karan");
		queue.add("Upasana");
		queue.add("Rahul");
		System.out.println("head: "+queue.element());
		System.out.println("head: "+queue.peek());
		System.out.println("itirating the queue elements:");
		Iterator itr=queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			queue.remove();
			queue.poll();
			System.out.println("after removing two elements:");
			Iterator<String> itr2=queue.iterator();
			while(itr2.hasNext()) {
				System.out.println(itr2.next());
			}
		}
		}
		
		public void linkedlistexample()
		{
			LinkedList<String> al=new LinkedList<String>();
			al.add("Ravi");
			al.add("Vijay");
			al.add("Ravi");
			al.add("Ajay");
			Iterator<String> itr=al.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
		}
			
	}
		
		public void vectorexample()
		{
			Vector<String> v=new Vector<String>();
			v.add("Ayush");
			v.add("Amit");
			v.add("Ashish");
			v.add("Garima");
			Iterator<String> itr=v.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
		}
		}
		
		public void stackexample()
		{
			Stack<String> stack = new Stack<String>();
			stack.push("Ayush");
			stack.push("Garvit");
			stack.push("Amit");
			stack.push("Ashish");
			stack.push("Garima");
			stack.pop();
			Iterator<String> itr=stack.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			
		}
		public void mapexample()
		{
			Map<Integer,String> map = new HashMap<Integer,String>();
			map.put(100, "Amit");
			map.put(101, "Vijay");
			map.put(102, "Rahul");
			
			
			for(Map.Entry m:map.entrySet()) {
				System.out.println(m.getKey()+" "+m.getValue());
				
			}
		}
		
		public static void main(String[] args) {
			CollectionTest hashsetTest=new CollectionTest();
			//hashsetTest.hashsetexample();
			
			CollectionTest treesetTest=new CollectionTest();
			//treesetTest.treesetexample();
			
			CollectionTest listTest=new CollectionTest();
			listTest.listexample();
			
			CollectionTest queueTest=new CollectionTest();
			//queueTest.queueexample();
			
			CollectionTest linkedlistTest=new CollectionTest();
			//linkedlistTest.linkedlistexample();
			
			CollectionTest stackTest=new CollectionTest();
			//stackTest.stackexample();
			
			CollectionTest mapTest=new CollectionTest();
			mapTest.mapexample();
		}
		
		}
	
	


