package Dice;

import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Dice1;
		int Dice2;
		int Dice3;
		int sameValue;
		int largestValue;
		int Reward;
		
		Scanner sc = new Scanner(System.in);
		
		Dice1 = sc.nextInt();
		Dice2 = sc.nextInt();
		Dice3 = sc.nextInt();
		
		if(Dice1 == Dice2 && Dice2 == Dice3 && Dice3 == Dice1) {
			sameValue = Dice1;
			Reward = 10000 + (sameValue) * 1000;
		} else if (Dice1 == Dice2 && Dice2 != Dice3 && Dice3 != Dice1) {	// Dice1과 Dice2가 같은 경우
			sameValue = Dice1;
			Reward = 1000 + (sameValue) * 100;
		} else if (Dice1 != Dice2 && Dice2 == Dice3 && Dice3 != Dice1) {	// Dice2와 Dice3이 같은 경우
			sameValue = Dice2;
			Reward = 1000 + (sameValue) * 100;
		} else if (Dice1 != Dice2 && Dice2 != Dice3 && Dice3 == Dice1) {	// Dice1과 Dice3이 같은 경우
			sameValue = Dice3;
			Reward = 1000 + (sameValue) * 100;
		} else {															// 세 값이 전부 다른 경우
			largestValue = (Dice1 > Dice2) && (Dice1 > Dice3) ? Dice1 : (Dice2 > Dice3)? Dice2 : Dice3;													
			Reward = largestValue * 100;
		}
		
		System.out.println(Reward);
		
	}

}
