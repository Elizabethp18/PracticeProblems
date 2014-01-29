package main.java;

import java.util.HashMap;
import java.util.Map;

import main.java.model.Node;

public class RemoveDuplicatesInLinkedList {
	public static void removeDuplicates(Node head)  {
		Map<Integer, Node> hashMap = new HashMap<Integer, Node>();
		Node prev = null;
		Node current = head;
		
		while(current.getNext() != null)  {
			if(hashMap.containsKey(current.getData()))  {
				prev.setNext(current.getNext());
			}
			else  {
				hashMap.put(current.getData(), current);
				prev = current;
			}
			
			current = current.getNext();
		}
	}
}