package zoo;

public class Ground {
	public static void main(String[] args) {
		//���� ������(��ü 3��) ���� ����ϱ�
		//Animal Ŭ����
		//�̸�, ����, ����, ��
		//�Ա�, �ڱ�, �����̱�, ���
		Animal gazel = new Animal("������", "����", 10, "����");
		Animal inmyeonjo = new Animal("�̱���", "����", 36, "�θ���");
		Animal cloakdragon = new Animal("����", "����", 25, "����巡��");
		
		gazel.makeSomeNoise();
		inmyeonjo.makeSomeNoise();
		cloakdragon.makeSomeNoise();
	}
}
