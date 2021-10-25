package zoo;

public class Ground {
	public static void main(String[] args) {
		// 동물 세마리 만들어서 울게하기
		// 이름 성별 나이 종
		// 먹기 자기 움직이기 울기
		// 울음소리는 전부 다르게 하기
		// 큰부리뒷도요 서부긴코가시두더지 키위새
		BigDoyo bigdoyo = new BigDoyo("도요타", "암컷", 84);
		WesternLongMole mole = new WesternLongMole("디그다그", "수컷", 20);
		KiwiBird kiwi = new KiwiBird("골드키위", "암컷", 10);
		while (true) {
			bigdoyo.makeSomeNoise();
			mole.makeSomeNoise();
			kiwi.makeSomeNoise();
			//선택 후 Alt + Shift + Z > ↓+enter
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}







