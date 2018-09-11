package kr.co.mlec.day11.exam;

import java.util.Scanner;

interface Game{
	int startGame(int you);
	final static int SCISSOR = 1;
	final static int ROCK = 2;
	final static int PAPER = 3;
}

class ScissorsRockPaper implements Game{
	
	@Override
	public int startGame(int you) {
		int me = (int)(Math.random()*3+1);
		
		if(me==Game.SCISSOR&you==2){
			System.out.println("You win");
			return 1;
		}
		else if(me==Game.ROCK&you==3){
			System.out.println("You win");
			return 1;
		}
		else if(me==Game.PAPER&you==1){
			System.out.println("You win");
			return 1;
		}
		else if(me==you){
			System.out.println("�����ϴ�");
			return 0;
		}
		else{
			System.out.println("You lose");
			return 0;
		}
	}
}
class Dice implements Game{

	@Override
	public int startGame(int you) {
		int me = (int)(Math.random()*6+1);
		if(me==you){
			System.out.println("You win");
			return 1;
		}
		else{
			System.out.println("You lose");
			return 0;
			}
	}
	
}

public class GameTest {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		Game g1 = new ScissorsRockPaper();
		Game g2 = new Dice();

		int score = 0;
		while(true){
			System.out.println("������ �����ϼ���.");
			System.out.println("A. ����������");
			System.out.println("B. �ֻ��� �� ���߱�");
			System.out.println("C. ����");
			String s = sc.next();
			if(s.equals("A")){
				System.out.println("A. ���������� : ");
				while(true){
					int you = sc.nextInt();
					if(you!=1&&you!=2&&you!=3){
						System.out.println("�Է°��� �߸��Ǿ����ϴ�");
						System.out.println("�ٽ� �Է��ϼ���(1-3)");
					}
					else{score+= g1.startGame(you);
					break;}
				}
			}
			else if(s.equals("B")){
				System.out.println("B. �ֻ��� �� ���߱� : ");
				while(true){
					int you = sc.nextInt();
					if(you!=1&&you!=2&&you!=3&&you!=4&&you!=5&&you!=6){
						System.out.println("�Է°��� �߸��Ǿ����ϴ�");
						System.out.println("�ٽ� �Է��ϼ���(1-6)");
					}
				else{
					score+= g2.startGame(you);
					break;
				}
			}
			}
			else if(s.equals("C")){
				System.out.println("������ �����մϴ�");
				System.out.println("����� total score�� "+score+"�Դϴ�.");
				System.exit(0);
			}
			else {
				System.out.println("�ٽ� �Է��ϼ���");
			}
		}
	}

}
