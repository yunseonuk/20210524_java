package ex10_interface;

//클래스 다중상속 불가
//인터페이스 : 구현부가 없다(추상메소드만 가능), 다중상속가능, 객체생성불가
interface Attack{
	String name = "포켓몬 공격"; //public static final 생략가능
	void attack(); //public, abstract 생략가능
//	default : 일반메소드
	default void gameTime() {
		System.out.println("24시간 공격 가능");
	}
}

interface Sound{
	String name = "포켓몬 소리";
	 void sound();
}


//피카
class Pikachu implements Attack, Sound{

	@Override
	public void sound() {
		System.out.println("전기공격");
	}

	@Override
	public void attack() {
		System.out.println("피카피카");
	}

	
}

class Squirtle implements Attack, Sound{

	@Override
	public void sound() {
		System.out.println("물대포");
	}

	@Override
	public void attack() {
		System.out.println("꼬북꼬북");
	}
	
}


class GamePlay {
	void attack (Attack attack) {
		attack.attack();
	}
	
	void sound(Sound sound) {
		sound.sound();
	}
}


public class J20210504_03_interface {

	public static void main(String[] args) {
		System.out.println(Attack.name);
//		다형성을 이용해서 객체 생성
		Pikachu pika = new Pikachu();
		Attack attack = new Pikachu();
		Sound sound = new Pikachu();
//		attack.attack();
//		sound.sound();
//		pika.attack();
//		pika.sound();
		
		pika.gameTime();
		GamePlay gp = new GamePlay();
		gp.attack(pika);
		gp.sound(pika);

	}

}
