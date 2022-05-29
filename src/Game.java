import java.util.Scanner;

public class Game {
	private Player p1 = new Player();
	private Player p2 = new Player();
	private Board board = new Board();
	private int count = 0;
	
	public void readPlayerData() {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome To XO Game ...\n Please Enter Player 1 Name : ");
		//player 1
		String player1Name = input.next();
		p1.setName(player1Name);
		System.out.println("Please Enter Player 1 operator : ");
		String player1Opt = input.next();
		p1.setOpt(player1Opt.charAt(0));
		
		
		//player 2
		System.out.println("Please Enter Player 2 name : ");
		String player2Name = input.next();
		p2.setName(player2Name);
		
		if(p1.getOpt() == 'X' || p1.getOpt() == 'x') {
			p2.setOpt('o');
		}else {
			p2.setOpt('x');
		}

		
	}
	
	public void paly() {
		Scanner input = new Scanner(System.in);
		readPlayerData();
		board.draw();
		while(!board.isFull()) {
			Player currentPlayer = p1;
			if(count % 2 == 1) currentPlayer = p2;
			
			while(true) {
				int pos;
				System.out.println("Please Enter Empty Position from 1 to 9 : ");
				pos = input.nextInt();
				if(board.replaceChar(currentPlayer, pos)) {
					break;
				}
			}
				
				board.draw();
				
				if(board.isWin(currentPlayer)) {
					System.out.println("The winner is " + currentPlayer.getName());
					break;
				}
				
			
			
			
			count++;
			
		}
		
		if(board.isFull()) {
			
			System.out.println("Game is Draw...");
		}
		
	}
	
	
}
