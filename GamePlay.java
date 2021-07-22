package tset;

import java.util.Scanner;

public class GamePlay {
	
	public char[] createBoard() {   // creates an empty board 
		char[] board = new char[10];
		board[0]='*'; // 0th index
		for(int i = 1; i < 10; i++) { // fills up with empty space
			board[i]=' ';
		}
		System.out.println(board);
		System.out.println("Empty Board Created..!");
		return board;
	}
	public char choose(Scanner sc) {  // make user to choose x or o
		System.out.println("Select your side: \n Press : \n   0 for O\n   1 for X");
		int choice=sc.nextInt();
		if (choice==0)	return 'O';
		else if (choice==1)	return 'X';
		else {
			System.out.println("Invalid Input..!\n Selecting Default as O");
			return 'O';
		}
	}
	public char compChoice(char choice) {
		char compChoice='X';
		if(choice=='X') compChoice='O';
		return compChoice;
	}
	public void showBoard(char [] board) {  // displaying board
		System.out.print(board[1]+" | "+board[2]+" | "+board[3]);
		System.out.println("\n---------");
		System.out.print(board[4]+" | "+board[5]+" | "+board[4]);
		System.out.println("\n---------");
		System.out.print(board[7]+" | "+board[8]+" | "+board[9]);
	}
	public char[] makeMove(char[] board, char choice, Scanner sc) {  // making move
		System.out.println("\nSelect the position to make the move.\nThe available positions are: ");
		for(int i=1; i<10; i++) {
			if(board[i]==' ') System.out.print(i+"  ");
		}
		System.out.println("\nEnter your choice :");
		int index=sc.nextInt();
		if(board[index]==' ') board[index]= choice;
		else System.out.println("Incorrect choice!");
		return board;
	}
	public char[] compMove(char[] board) {
		
		return board;
		
	}

}
