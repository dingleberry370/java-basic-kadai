package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {
	
	public void setGivenName (String name) {
		super.givenName = name;
	}

	@Override
	void eachIntroduce() {
		System.out.println("趣味は読書です");
	}
}
