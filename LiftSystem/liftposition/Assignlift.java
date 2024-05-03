package com.manikandan.LiftSystem.liftposition;

import java.util.Scanner;

public class Assignlift {

	static final int LIFTS = Displaylift.LIFTS;
	static final int FLOORS = Displaylift.FLOORS;
	static int[] liftPositions = Displaylift.liftPositions;

	public static void assignLiftToUser(int curFloor, int desFloor) {
		int assignedLift = assignNearestLift(curFloor, desFloor);

		if (assignedLift != -1) {
			System.out.println("L" + (assignedLift + 1) + " is assigned");
			liftPositions[assignedLift] = desFloor;
			Displaylift.displayLiftPositions();
		} else {
			System.out.println("No lift available. Please try again later.");
		}
	}

	private static int assignNearestLift(int currentFloor, int destinationFloor) {
		int minDistance = 10;
		int nearestLift = -1;

		for (int i = 0; i < LIFTS; i++) {
			int distance = Math.abs(currentFloor - liftPositions[i]);
	
			if (distance < minDistance && (liftPositions[i] <= destinationFloor)
					|| liftPositions[i] >= destinationFloor) {
				minDistance = distance;
				nearestLift = i;
			}
		}

		return nearestLift;
	}

	public static void assign() {
		Scanner s = new Scanner(System.in);

		System.out.print("Current Floor: ");
		int currentFloor = s.nextInt();

		System.out.print("Destination Floor: ");
		int destinationFloor = s.nextInt();

		if (destinationFloor <= FLOORS) {
			assignLiftToUser(currentFloor, destinationFloor);
		} else {
			System.out.println("Invalid Floor! Please enter a correct floor number.");
		}
	}
}
