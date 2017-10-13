
public class Cat extends Animal implements Terrestrial {

	//腿的条数
	private int legNum;
	
	
	public Cat(){}
	
	public Cat(String name,int legNum){
		super(name);
		this.legNum = legNum;
	}
	
	//获取猫的腿
	public int getLegNum() {
		return legNum;
	}

	
	public String shout() {
		return "喵喵喵";
	}
	
	

}
