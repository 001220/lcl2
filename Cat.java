
public class Cat extends Animal implements Terrestrial {

	//�ȵ�����
	private int legNum;
	
	
	public Cat(){}
	
	public Cat(String name,int legNum){
		super(name);
		this.legNum = legNum;
	}
	
	//��ȡè����
	public int getLegNum() {
		return legNum;
	}

	
	public String shout() {
		return "������";
	}
	
	

}
