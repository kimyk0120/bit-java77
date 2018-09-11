package kr.co.mlec.day12;

public class LottoUI {
	
	private LottoService service;
	
	public LottoUI(){
		service = new LottoService();
	}
	
	public void execute(){
		System.out.println("�ζ� ���񽺸� �����մϴ�");
		System.out.println("��ȣ�� �̽��ϴ�");

		// ������ ���� 6���� �迭�� ��Ƽ� �Ѱ��ش�
		int [] numbers = service.getNumbers();
		// ������ ���ڸ� ��ȿ���� üũ�ϴ� ��� ȣ��
		boolean flag = false;
		try {
			flag = service.checkNumbers(numbers);
			if(flag){
				for(int num : numbers){
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO �ڵ� ������ catch ���
						e.printStackTrace();
					}
					System.out.println(num);
				}
			}
		} catch (LottoZeroNumberException | LottoDupNumberException e1) {
			// TODO �ڵ� ������ catch ���
			e1.printStackTrace();
		}
		
	}
}
