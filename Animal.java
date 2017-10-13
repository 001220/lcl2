
public abstract class Animal {

	private String name;

	
	public Animal(){}
	
	public Animal(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	//动物叫:抽象类，方法返还值为String
	public abstract String shout();
	
}
