package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

 class QueueTest {

	public static void main(String[] args) {

		Queue<String> mq = new LinkedList<String>();
		mq.add("a");
		mq.add("b");
		mq.add("c");
		mq.add("d");
		mq.add("e");

		while(mq.peek() !=null){

			System.out.println(mq.poll());

		}
		System.out.println("Again...");
		while(mq.peek() !=null){

			System.out.println(mq.poll());

		}

	}
}

