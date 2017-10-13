
public class TestAnimal {

	public static void main(String[] args) {
		
		AnimalMgr a = new AnimalMgr();
		
		a.initial();
		
		
		
		do{
			a.showAnimals();
			if(a.choose ==0){
				try {
					a.xg();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}while(a.choose==0);
		System.out.println("谢谢使用，结束程序！！");
	}
}
