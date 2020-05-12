package fight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cards {
	// TODO Auto-generated method stub
	static List<String> GetCard(){
		Random random = new Random ();
		List<String> allCard = new ArrayList<String>();			// 所有的卡牌，未打乱状态
		List<String> result = new ArrayList<String>();			// 打乱后的结果
		String[] cardType = { "红桃", "黑桃", "方块", "梅花" };
		String[] cardValue = {"A","2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		for(int i=0;i<cardType.length;i++){
			for(int j=0;j<cardValue.length;j++){
				allCard.add(cardType[i] + cardValue[j]);
			}
		}
			
		// 循环52次，把未打乱的卡牌数组乱序存到新的数组里
		for (int a = 0; a < cardType.length * cardValue.length; a++) {
				int randomIndex = random.nextInt(52-a);
	  			String temp=allCard.get(randomIndex);
	  			result.add(temp);
				allCard.remove(randomIndex);
		}
		List<String> a=result.subList(5, 10);
		return a;
	}
}
