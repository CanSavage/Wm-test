package fight;

public class fight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person a=new Person("����", "ׯ��");
		Person b=new Person("����", "��1");
		Person c=new Person("����", "��2");
		Person d=new Person("����", "��3");
		
		for(int i=0;i<5;i++){
			System.out.println("****************************"+"��"+(i+1)+"�ѣ�"+"****************************");
			System.out.println("���ƣ�");
			System.out.println(a.getType()+"\t"+a.getName()+":\t"+a.getCards().toString()+"\t"+a.getNiu());
			System.out.println(b.getType()+"\t"+b.getName()+":\t"+b.getCards().toString()+"\t"+b.getNiu());
			System.out.println(c.getType()+"\t"+c.getName()+":\t"+c.getCards().toString()+"\t"+c.getNiu());
			System.out.println(d.getType()+"\t"+d.getName()+":\t"+d.getCards().toString()+"\t"+d.getNiu());
			System.out.println("���㣺");
			Rule.Room(a,b,c,d);
		}
		
	}

}
