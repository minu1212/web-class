package zoo;

public class Ground {
	public static void main(String[] args) {
		// ���� ������ ���� ����ϱ�
		// �̸� ���� ���� ��
		// �Ա� �ڱ� �����̱� ���
		// �����Ҹ��� ���� �ٸ��� �ϱ�
		// ū�θ��޵��� ���α��ڰ��õδ��� Ű����
		BigDoyo bigdoyo = new BigDoyo("����Ÿ", "����", 84);
		WesternLongMole mole = new WesternLongMole("��״ٱ�", "����", 20);
		KiwiBird kiwi = new KiwiBird("���Ű��", "����", 10);
		while (true) {
			bigdoyo.makeSomeNoise();
			mole.makeSomeNoise();
			kiwi.makeSomeNoise();
			//���� �� Alt + Shift + Z > ��+enter
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}







