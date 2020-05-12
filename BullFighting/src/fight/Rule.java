package fight;

import java.util.List;

public class Rule {
	public static int P1_Money;
	public static int P2_Money;
	public static int P3_Money;
	public static int P4_Money;
	
	static String magic(int[] a){
		if(a[0]+a[1]+a[2]==10||a[0]+a[1]+a[2]==20||a[0]+a[1]+a[2]==30){
			if(a[3]+a[4]<10){
				int n=a[3]+a[4];
				return "Å£"+n;
			}if(a[3]+a[4]==10||a[3]+a[4]==20){
				return "Å£Å£";
			}if(a[3]+a[4]>10&&a[3]+a[4]!=20){
				int n=a[3]+a[4]-10;
				return "Å£"+n;
			}
		}if(a[0]+a[1]+a[3]==10||a[0]+a[1]+a[3]==20||a[0]+a[1]+a[3]==30){
			if(a[2]+a[4]<10){
				int n=a[2]+a[4];
				return "Å£"+n;
			}if(a[2]+a[4]==10||a[2]+a[4]==20){
				return "Å£Å£";
			}if(a[2]+a[4]>10&&a[2]+a[4]!=20){
				int n=a[4]+a[2]-10;
				return "Å£"+n;
			}
		}if(a[0]+a[1]+a[4]==10||a[0]+a[1]+a[4]==20||a[0]+a[1]+a[4]==30){
			if(a[2]+a[3]<10){
				int n=a[2]+a[3];
				return "Å£"+n;
			}if(a[2]+a[3]==10||a[2]+a[3]==20){
				return "Å£Å£";
			}if(a[2]+a[3]>10&&a[2]+a[3]!=20){
				int n=a[2]+a[3]-10;
				return "Å£"+n;
			}
		}if(a[0]+a[2]+a[3]==10||a[0]+a[2]+a[3]==20||a[0]+a[2]+a[3]==30){
			if(a[1]+a[4]<10){
				int n=a[1]+a[4];
				return "Å£"+n;
			}if(a[1]+a[4]==10||a[1]+a[4]==20){
				return "Å£Å£";
			}if(a[1]+a[4]>10&&a[1]+a[4]!=20){
				int n=a[1]+a[4]-10;
				return "Å£"+n;
			}
		}if(a[0]+a[2]+a[4]==10||a[0]+a[2]+a[4]==20||a[0]+a[2]+a[4]==30){
			if(a[1]+a[3]<10){
				int n=a[1]+a[3];
				return "Å£"+n;
			}if(a[1]+a[3]==10||a[1]+a[3]==20){
				return "Å£Å£";
			}if(a[1]+a[3]>10&&a[1]+a[3]!=20){
				int n=a[1]+a[3]-10;
				return "Å£"+n;
			}
		}if(a[0]+a[3]+a[4]==10||a[0]+a[3]+a[4]==20||a[0]+a[3]+a[4]==30){
			if(a[1]+a[2]<10){
				int n=a[1]+a[2];
				return "Å£"+n;
			}if(a[1]+a[2]==10||a[1]+a[2]==20){
				return "Å£Å£";
			}if(a[1]+a[2]>10&&a[1]+a[2]!=20){
				int n=a[1]+a[2]-10;
				return "Å£"+n;
			}
		}if(a[1]+a[2]+a[3]==10||a[1]+a[2]+a[3]==20||a[1]+a[2]+a[3]==30){
			if(a[0]+a[4]<10){
				int n=a[0]+a[4];
				return "Å£"+n;
			}if(a[0]+a[4]==10||a[0]+a[4]==20){
				return "Å£Å£";
			}if(a[0]+a[4]>10&&a[0]+a[4]!=20){
				int n=a[0]+a[4]-10;
				return "Å£"+n;
			}
		}if(a[1]+a[2]+a[4]==10||a[1]+a[2]+a[4]==20||a[1]+a[2]+a[4]==30){
			if(a[0]+a[3]<10){
				int n=a[0]+a[3];
				return "Å£"+n;
			}if(a[0]+a[3]==10||a[0]+a[3]==20){
				return "Å£Å£";
			}if(a[0]+a[3]>10&&a[0]+a[3]!=20){
				int n=a[0]+a[3]-10;
				return "Å£"+n;
			}
		}if(a[1]+a[3]+a[4]==10||a[1]+a[3]+a[4]==20||a[1]+a[3]+a[4]==30){
			if(a[0]+a[2]<10){
				int n=a[0]+a[2];
				return "Å£"+n;
			}if(a[0]+a[2]==10||a[0]+a[2]==20){
				return "Å£Å£";
			}if(a[0]+a[2]>10&&a[0]+a[2]!=20){
				int n=a[0]+a[2]-10;
				return "Å£"+n;
			}
		}if(a[2]+a[3]+a[4]==10||a[2]+a[3]+a[4]==20||a[2]+a[3]+a[4]==30){
			if(a[0]+a[1]<10){
				int n=a[0]+a[1];
				return "Å£"+n;
			}if(a[0]+a[1]==10||a[0]+a[1]==20){
				return "Å£Å£";
			}if(a[0]+a[1]>10&&a[0]+a[1]!=20){
				int n=a[0]+a[1]-10;
				return "Å£"+n;
			}
		}else{
			return "Å£²»Í¨";
		}
		return "bug";
	}
	
	static int[] replace(List<String> card){
		int[] nub={case1(card.get(0)),case1(card.get(1)),case1(card.get(2)),case1(card.get(3)),case1(card.get(4))};
		return nub;
	}
	
	static int case1(String words){
		StringBuffer sb=new StringBuffer(words);
		sb.replace(0, 2, "");
		if(sb.indexOf("A")==0){
			sb.deleteCharAt(0);
			sb.append(1);
			return Integer.parseInt(sb.toString());
		}
		if(sb.indexOf("J")==0||sb.indexOf("Q")==0||sb.indexOf("K")==0){
			sb.deleteCharAt(0);
			sb.append(10);
			return Integer.parseInt(sb.toString());
		}
		return Integer.parseInt(sb.toString());
	}
	
	
	static int case3(Person N){ 
		if(N.getNiu().indexOf("Å£1")==0){
			return 1;
		}
		if(N.getNiu().indexOf("Å£2")==0){
			return 2;
		}
		if(N.getNiu().indexOf("Å£3")==0){
			return 3;
		}
		if(N.getNiu().indexOf("Å£4")==0){
			return 4;
		}
		if(N.getNiu().indexOf("Å£5")==0){
			return 5;
		}
		if(N.getNiu().indexOf("Å£6")==0){
			return 6;
		}
		if(N.getNiu().indexOf("Å£7")==0){
			N.setDouble(2);
			return 7;
		}
		if(N.getNiu().indexOf("Å£8")==0){
			N.setDouble(2);
			return 8;
		}
		if(N.getNiu().indexOf("Å£9")==0){
			N.setDouble(2);
			return 9;
		}
		if(N.getNiu().indexOf("Å£Å£")==0){
			N.setDouble(3);
			return 10;
		}else{
			return 0;
		}
	}
	
	
	static void Room(Person a,Person b,Person c,Person d){
		 P1_Money=a.getMoney();
		 P2_Money=b.getMoney();
		 P3_Money=c.getMoney();
		 P4_Money=d.getMoney();
		//¼ÆËã½ðÇ®³öÈë
		Result(a,b);Result(a,c);Result(a,d);
		//ÉÏÒ»°Ñ±¶Êý¹é1
		a.setDouble(1);b.setDouble(1);c.setDouble(1);d.setDouble(1);
		//ÖØÐÂÏ´ÅÆ
		a.setCards(Cards.GetCard());b.setCards(Cards.GetCard());c.setCards(Cards.GetCard());d.setCards(Cards.GetCard());
		//ÅÐ¶Ï×ÜÌåÊÕÈë£¬²¢Êä³öÐÅÏ¢
		System.out.println(a.getMoney()-P1_Money+"\t  "+a.getType()+":"+a.getMoney());
		System.out.println(b.getMoney()-P2_Money+"\t  "+b.getType()+":"+b.getMoney());
		System.out.println(c.getMoney()-P3_Money+"\t  "+c.getType()+":"+c.getMoney());
		System.out.println(d.getMoney()-P4_Money+"\t  "+d.getType()+":"+d.getMoney());
	}
	
	static void Result(Person first,Person second){
		if(case3(first)>case3(second)){
			first.setMoney(first.getMoney()+500*first.getDouble());
			second.setMoney(second.getMoney()-500*first.getDouble());
		}else if(case3(first)<case3(second)){
			first.setMoney(first.getMoney()-500*second.getDouble());
			second.setMoney(second.getMoney()+500*second.getDouble());
		}else{
			first.setMoney(first.getMoney()+500*first.getDouble());
			second.setMoney(second.getMoney()-500*first.getDouble());
		}

	}
	
	
}
