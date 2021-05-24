package ex09_abstract;

//부모클래스
//포켓몬 : 추상 클래스
abstract class Pokemon{
//	일반 메소드
	void gameName() {
		System.out.println("포켓몬 게임");
	}
	abstract void attack();
	abstract void sound();
}

//피카츄
class Pikachu extends Pokemon {

	@Override
	void attack() {
		System.out.println("전기공격");
	}

	@Override
	void sound() {
		System.out.println("피카피카");
	}
	
	
}

//꼬부기
class Squirtle extends Pokemon {

	@Override
	void attack() {
		System.out.println("물대포공격");
	}

	@Override
	void sound() {
		System.out.println("꼬북꼬북");
	}

}


//게임
class GamePlay{
	void attackPlay(Pokemon pokemon) {
//		pokemon.gameName();
		pokemon.attack();
	}
	
	void sountPlay(Pokemon pokemon) {
		pokemon.sound();
	}
}

public class J20210504_02_Pokemon {

	public static void main(String[] args) {
		GamePlay play = new GamePlay();
		Pikachu pika = new Pikachu();
		pika.gameName();
		play.attackPlay(pika);
		System.out.println("");
		play.attackPlay(new Squirtle());
		play.sountPlay(pika);
		play.sountPlay(new Squirtle());
	}

}
