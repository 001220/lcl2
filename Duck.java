
public class Duck extends Animal implements Terrestrial {

	//
	private int legNum;
	
	public Duck(){}
	
	public Duck(String name,int legNum){
		super(name);
		this.legNum = legNum;
		
	}
	
	public int getLegNum() {
		return legNum;
	}

	
	public String shout() {
		return "¸Â¸Â¸Â";
	}

}
