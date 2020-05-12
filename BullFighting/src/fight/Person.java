package fight;

import java.util.List;

public class Person {
	
	 private String Name;
	 private String Type;
	 private int Money=5000;
	 private List<String> cards=Cards.GetCard();
	 private String Niu;
	 private int Double=1;
	 
	 
	public int getDouble() {
		return Double;
	}
	public void setDouble(int d) {
		Double = d;
	}
	public String getNiu() {
		int[] nub=Rule.replace(cards);
		Niu=Rule.magic(nub);
		return Niu;
	}
	public void setNiu(String niu) {
		Niu = niu;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public int getMoney() {
		return Money;
	}
	public void setMoney(int money) {
		Money = money;
		if(Money<0){
			System.out.println("ÉÞÒ»°ÑÕË£¡¸çÃÇ£¡");
		}
	}
	public List<String> getCards() {
		return cards;
	}
	public void setCards(List<String> cards) {
		this.cards = cards;
	}
	public Person(String name,String type){
		 super();
		 this.Name=name;
		 this.Type=type;
	}
}
