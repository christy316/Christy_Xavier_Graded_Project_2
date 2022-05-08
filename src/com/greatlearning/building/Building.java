package com.greatlearning.building;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Building {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the total no of floors in the building : ");

		int totalFloor = scan.nextInt();

		Queue<Integer> floorsSize = new LinkedList<>();

		Stack<Integer> tempStack = new Stack<>();

		for (int i = 1; i <= totalFloor; i++) {

			System.out.println("Enter the floor size given on day :" + i);

			floorsSize.add(scan.nextInt());
		}

		int temp = totalFloor;
		for (int i = 1; i <= totalFloor; i++) {
			
			System.out.println("\nDay : " + i);

			if (floorsSize.peek().equals(temp)) {

				tempStack.push(floorsSize.poll());
				while (!tempStack.isEmpty() && tempStack.peek() == temp) {
					temp--;
					System.out.print(tempStack.pop() + " ");
				}

			} else {
				tempStack.push(floorsSize.poll());
			}
		}
	}

}
