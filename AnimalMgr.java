import java.util.Scanner;

public class AnimalMgr {

	//ҵ����
	
	
	//���ö���
	Animal [] animals = new Animal[3];
	Scanner input = new Scanner(System.in);
	int choose;
	
	//��ʼ��������Ϣ
	public void initial(){
		Cat cat = new Cat("�ӷ�è",4);
		Duck duck = new Duck("����Ѽ",2);
		Delph delph = new Delph("������");
		
		animals[0] = cat;
		animals[1] = duck;
		animals[2] = delph;
		
	}
	
	//��ʾ������Ϣ����������	�ȵ�����	���������
	public void showAnimals(){
		System.out.println("��������\t�ȵ�����\t�������\t");
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
		System.out.println("�޸ĳ�����Ϣ������0�������˳�����");
		choose = input.nextInt();
		
		
	}
	
	
	//�޸ĳ�����Ϣ
	public void xg() throws Exception{
	String[] names = new String[3];
	int[] nums = new int[2];
	
	System.out.println("������è�������ƣ�");
	names[0] = input.next();
	System.out.println("������è��������");
	nums[0] = input.nextInt();
	if(nums[0] !=4){
		throw new Exception("è������������������");
	}

	System.out.println("������Ѽ�ӵ������ƣ�");
	names[1] = input.next();
	System.out.println("�������Ѽ�ӵ�����");
	nums[1] = input.nextInt();
	if(nums[1] != 2){
		throw new Exception("Ѽ��ֻ����������");
	}
	
	System.out.println("�����뺣��������ƣ�");
	names[2] = input.next();
		
	animals[0] = new Cat(names[0],nums[0]);
	animals[1] = new Duck(names[1],nums[1]);
	animals[2] = new Delph(names[2]);
	}
}
