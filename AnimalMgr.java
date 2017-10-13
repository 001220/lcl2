import java.util.Scanner;

public class AnimalMgr {

	//业务类
	
	
	//所用动物
	Animal [] animals = new Animal[3];
	Scanner input = new Scanner(System.in);
	int choose;
	
	//初始化动物信息
	public void initial(){
		Cat cat = new Cat("加菲猫",4);
		Duck duck = new Duck("唐老鸭",2);
		Delph delph = new Delph("琪琪豚");
		
		animals[0] = cat;
		animals[1] = duck;
		animals[2] = delph;
		
	}
	
	//显示动物信息（动物名称	腿的条数	动物叫声）
	public void showAnimals(){
		System.out.println("动物名字\t腿的条数\t动物叫声\t");
		for(Animal animal:animals){
			String name = animal.getName();
			String shout = animal.shout();
			int legNum = 0;
			if(animal instanceof Terrestrial){
				legNum = ((Terrestrial) animal).getLegNum();
			}
			String leg = (legNum == 0)?"":legNum+"";
			
			System.out.println(name+"\t"+leg+"\t"+shout);
		}
		System.out.println("修改宠物信息请输入0，否则退出程序！");
		choose = input.nextInt();
		
		
	}
	
	
	//修改宠物信息
	public void xg() throws Exception{
	String[] names = new String[3];
	int[] nums = new int[2];
	
	System.out.println("请输入猫的新名称：");
	names[0] = input.next();
	System.out.println("请输入猫的腿数：");
	nums[0] = input.nextInt();
	if(nums[0] !=4){
		throw new Exception("猫的腿数必须是四条！");
	}

	System.out.println("请输入鸭子的新名称：");
	names[1] = input.next();
	System.out.println("请输入该鸭子的腿数");
	nums[1] = input.nextInt();
	if(nums[1] != 2){
		throw new Exception("鸭子只能是两条腿");
	}
	
	System.out.println("请输入海豚的新名称：");
	names[2] = input.next();
		
	animals[0] = new Cat(names[0],nums[0]);
	animals[1] = new Duck(names[1],nums[1]);
	animals[2] = new Delph(names[2]);
	}
}
