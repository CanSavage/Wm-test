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
				return "ţ"+n;
			}if(a[3]+a[4]==10||a[3]+a[4]==20){
				return "ţţ";
			}if(a[3]+a[4]>10&&a[3]+a[4]!=20){
				int n=a[3]+a[4]-10;
				return "ţ"+n;
			}
		}if(a[0]+a[1]+a[3]==10||a[0]+a[1]+a[3]==20||a[0]+a[1]+a[3]==30){
			if(a[2]+a[4]<10){
				int n=a[2]+a[4];
				return "ţ"+n;
			}if(a[2]+a[4]==10||a[2]+a[4]==20){
				return "ţţ";
			}if(a[2]+a[4]>10&&a[2]+a[4]!=20){
				int n=a[4]+a[2]-10;
				return "ţ"+n;
			}
		}if(a[0]+a[1]+a[4]==10||a[0]+a[1]+a[4]==20||a[0]+a[1]+a[4]==30){
			if(a[2]+a[3]<10){
				int n=a[2]+a[3];
				return "ţ"+n;
			}if(a[2]+a[3]==10||a[2]+a[3]==20){
				return "ţţ";
			}if(a[2]+a[3]>10&&a[2]+a[3]!=20){
				int n=a[2]+a[3]-10;
				return "ţ"+n;
			}
		}if(a[0]+a[2]+a[3]==10||a[0]+a[2]+a[3]==20||a[0]+a[2]+a[3]==30){
			if(a[1]+a[4]<10){
				int n=a[1]+a[4];
				return "ţ"+n;
			}if(a[1]+a[4]==10||a[1]+a[4]==20){
				return "ţţ";
			}if(a[1]+a[4]>10&&a[1]+a[4]!=20){
				int n=a[1]+a[4]-10;
				return "ţ"+n;
			}
		}if(a[0]+a[2]+a[4]==10||a[0]+a[2]+a[4]==20||a[0]+a[2]+a[4]==30){
			if(a[1]+a[3]<10){
				int n=a[1]+a[3];
				return "ţ"+n;
			}if(a[1]+a[3]==10||a[1]+a[3]==20){
				return "ţţ";
			}if(a[1]+a[3]>10&&a[1]+a[3]!=20){
				int n=a[1]+a[3]-10;
				return "ţ"+n;
			}
		}if(a[0]+a[3]+a[4]==10||a[0]+a[3]+a[4]==20||a[0]+a[3]+a[4]==30){
			if(a[1]+a[2]<10){
				int n=a[1]+a[2];
				return "ţ"+n;
			}if(a[1]+a[2]==10||a[1]+a[2]==20){
				return "ţţ";
			}if(a[1]+a[2]>10&&a[1]+a[2]!=20){
				int n=a[1]+a[2]-10;
				return "ţ"+n;
			}
		}if(a[1]+a[2]+a[3]==10||a[1]+a[2]+a[3]==20||a[1]+a[2]+a[3]==30){
			if(a[0]+a[4]<10){
				int n=a[0]+a[4];
				return "ţ"+n;
			}if(a[0]+a[4]==10||a[0]+a[4]==20){
				return "ţţ";
			}if(a[0]+a[4]>10&&a[0]+a[4]!=20){
				int n=a[0]+a[4]-10;
				return "ţ"+n;
			}
		}if(a[1]+a[2]+a[4]==10||a[1]+a[2]+a[4]==20||a[1]+a[2]+a[4]==30){
			if(a[0]+a[3]<10){
				int n=a[0]+a[3];
				return "ţ"+n;
			}if(a[0]+a[3]==10||a[0]+a[3]==20){
				return "ţţ";
			}if(a[0]+a[3]>10&&a[0]+a[3]!=20){
				int n=a[0]+a[3]-10;
				return "ţ"+n;
			}
		}if(a[1]+a[3]+a[4]==10||a[1]+a[3]+a[4]==20||a[1]+a[3]+a[4]==30){
			if(a[0]+a[2]<10){
				int n=a[0]+a[2];
				return "ţ"+n;
			}if(a[0]+a[2]==10||a[0]+a[2]==20){
				return "ţţ";
			}if(a[0]+a[2]>10&&a[0]+a[2]!=20){
				int n=a[0]+a[2]-10;
				return "ţ"+n;
			}
		}if(a[2]+a[3]+a[4]==10||a[2]+a[3]+a[4]==20||a[2]+a[3]+a[4]==30){
			if(a[0]+a[1]<10){
				int n=a[0]+a[1];
				return "ţ"+n;
			}if(a[0]+a[1]==10||a[0]+a[1]==20){
				return "ţţ";
			}if(a[0]+a[1]>10&&a[0]+a[1]!=20){
				int n=a[0]+a[1]-10;
				return "ţ"+n;
			}
		}else{
			return "ţ��ͨ";
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
		if(N.getNiu().indexOf("ţ1")==0){
			return 1;
		}
		if(N.getNiu().indexOf("ţ2")==0){
			return 2;
		}
		if(N.getNiu().indexOf("ţ3")==0){
			return 3;
		}
		if(N.getNiu().indexOf("ţ4")==0){
			return 4;
		}
		if(N.getNiu().indexOf("ţ5")==0){
			return 5;
		}
		if(N.getNiu().indexOf("ţ6")==0){
			return 6;
		}
		if(N.getNiu().indexOf("ţ7")==0){
			N.setDouble(2);
			return 7;
		}
		if(N.getNiu().indexOf("ţ8")==0){
			N.setDouble(2);
			return 8;
		}
		if(N.getNiu().indexOf("ţ9")==0){
			N.setDouble(2);
			return 9;
		}
		if(N.getNiu().indexOf("ţţ")==0){
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
		//�����Ǯ����
		Result(a,b);Result(a,c);Result(a,d);
		//��һ�ѱ�����1
		a.setDouble(1);b.setDouble(1);c.setDouble(1);d.setDouble(1);
		//����ϴ��
		a.setCards(Cards.GetCard());b.setCards(Cards.GetCard());c.setCards(Cards.GetCard());d.setCards(Cards.GetCard());
		//�ж��������룬�������Ϣ
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
