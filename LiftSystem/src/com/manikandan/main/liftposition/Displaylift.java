package com.manikandan.main.liftposition;

public class Displaylift {

	static final int LIFTS = 5;
	static final int FLOORS = 10;
	static int[] liftPositions = new int[LIFTS];

	public static void displayLiftPositions() {
		System.out.print("Lift: ");
		for (int i = 0; i < LIFTS; i++) {
			System.out.print("L" + (i + 1) + " ");
		}
		System.out.println();

		System.out.print("Floor: ");
		for (int i = 0; i < LIFTS; i++) {
			System.out.print(liftPositions[i] + " ");
		}
		System.out.println();
	}
}
