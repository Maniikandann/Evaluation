package com.manikandan.main;

import java.util.Scanner;

import com.manikandan.main.liftposition.Assignlift;
import com.manikandan.main.liftposition.Displaylift;

public class LiftSystem {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean exit = false;
		while (!exit) {
			System.out.println("\tLiftSystem\n");
			System.out.println("1.DisplayLift");
			System.out.println("2.UseLift");
			System.out.println("3.Exit");
			System.out.print("Please enter your option: ");
			int choose = s.nextInt();
			s.nextLine();
			switch (choose) {
			case 1:

				Displaylift.displayLiftPositions();
				break;

			case 2:

				Assignlift.assign();
				break;
			}
		}
		s.close();
		System.out.println();
	}
}
