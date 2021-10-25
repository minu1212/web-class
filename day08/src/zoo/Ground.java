package zoo;

public class Ground {
	public static void main(String[] args) {
		//동물 세마리(객체 3개) 만들어서 울게하기
		//Animal 클래스
		//이름, 나이, 성별, 종
		//먹기, 자기, 움직이기, 울기
		Animal gazel = new Animal("가젤맨", "수컷", 10, "가젤");
		Animal inmyeonjo = new Animal("이광수", "남성", 36, "인면조");
		Animal cloakdragon = new Animal("투드", "수컷", 25, "투명드래곤");
		
		gazel.makeSomeNoise();
		inmyeonjo.makeSomeNoise();
		cloakdragon.makeSomeNoise();
	}
}
