package kr.co.mlec.day18.exam;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class WordsGenerator extends Thread{
	private ArrayList<String> words;
	private String [] dic = {"���ð�","�Ѱ���","���缮","�̳�","�ʾ�",
			"������","�ڼ���","����","���ؿ�","������","�嵿��","����","�ϴ�",
			"�����","����â","������","������","������","������","����","�����","����",
			"������������","�귡����Ʈ","�̺�������ġ"
			};
	
	
	public WordsGenerator(ArrayList<String> words){
		this.words = words;
	}
	
	// 2�ʸ��� �����͸� �Է�
	public void run(
			){
		Random r = new Random();
		for(int i = 1;i<=100;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO �ڵ� ������ catch ���
				e.printStackTrace();
			}
			words.add(dic[r.nextInt(dic.length)]);
		}
	}
}


class TajaGame{
	ArrayList<String> words = new ArrayList<>();
	
	public void execute(){
		// �ʱ� ������ �Է�
		words.add("������");
		
		WordsGenerator wg = new WordsGenerator(words);
		wg.start();
		Scanner sc = new Scanner(System.in);
		while(true){
			// words.toString() : [����Ʈ ������, ...]
			System.out.println(words);
			System.out.print(">>");
			// �� �Ǵ� �����̽��ٸ� �̿��� �Է��� ó���ϱ� ����
			
			String input = sc.nextLine().trim();
			int index = words.indexOf(input);
			if(index==-1) continue;
			//�ܾ� ����
			words.remove(index);
		}
	}
}


public class Exam06 {
	public static void main(String[] args) {

		TajaGame tg = new TajaGame();
		tg.execute();
		
	}
}
