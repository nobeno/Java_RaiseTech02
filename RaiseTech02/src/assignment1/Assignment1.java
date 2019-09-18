package assignment1;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment1 {
	public static void main(String[] args) {
		helloWorld();
		addOneToTen();
		dayOfWeek();
		judgeZeroOrOne(0);
		arrayTest();
	}

	//HelloWorld出力、変数使用
	private static void helloWorld() {
		String greeting = "HelloWorld";
		System.out.println(greeting);
	}

	//1~10まで加算合計出力
	private static void addOneToTen() {
		int sum = 0;
		for(int i = 0; i <= 10; i++){
			sum += i;
		}
		System.out.println(sum);
	}

	//3年後の今日の曜日を出力
	private static void dayOfWeek() {
		LocalDateTime date = LocalDateTime.now().plusYears(3);
		DayOfWeek week = date.getDayOfWeek();
		System.out.println(week);
	}

	//引数0なら偽、1なら真出力
	private static void judgeZeroOrOne(int num) {
		if(num == 0) {
			System.out.print("偽" + "\n");
		}else if(num == 1){
			System.out.print("真" + "\n");
		}else {
			System.out.print("0か1を入力してください" + "\n");
		}
	}

	//配列表示
	private static void arrayTest() {
		//List
		List<String> list = new ArrayList<String>(Arrays.asList("apple", "banana", "grape", "peach"));
		for(int i = 0; i < list.size() ; i++) {
			System.out.print(list.get(i) + "\n");
		}

		//Map
		Map<String, Integer> ages = new HashMap<String,Integer>();
		ages.put("Kanemura", 17);
		ages.put("Matuda", 20);
		ages.put("Saito", 22);

		for(String key : ages.keySet()) {
			System.out.println(key + ":" + ages.get(key) + "歳");
		}
	}
}
