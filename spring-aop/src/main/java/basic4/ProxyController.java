package basic4;

public class ProxyController {

	// �����ų ��� Ŭ���� Ÿ���� ���
	private Controller ctrl;

	public ProxyController(Controller ctrl) {
		this.ctrl = ctrl;
	}

	public void execute() throws Exception {
		String clzName = ctrl.getClass().getSimpleName();
		
		long s= System.currentTimeMillis();
		ctrl.execute();
		double time = (System.currentTimeMillis()-s) /1000d;
		System.out.println(clzName + "����ð� " + time + "��");
	}

}
