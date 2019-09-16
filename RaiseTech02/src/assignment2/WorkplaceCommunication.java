package assignment2;

import java.util.Scanner;

public class WorkplaceCommunication implements Communication {

	public static void main(String[] args) {
		WorkplaceCommunication workplacecommunication = new WorkplaceCommunication();
		workplacecommunication.greet();
		workplacecommunication.inworkplace();
		workplacecommunication.greetToWho();
	}

	@Override
	//インターフェース実装
	//※static使用すると、使えないとエラー出る
	//Helloを返す
	public void greet() {
		String greeting = "Hello";
		if(greeting == "Hello") {
			System.out.println("Hello");
		}
	}

	//職場であれば挨拶する
	public void inworkplace() {
		if(isWorkPlace) {
			System.out.println("Hello");
		}else {
			System.out.println("「...」");
		}
	}

	//誰が来たかで挨拶変える＋例外処理
	public void greetToWho() {
		System.out.println("誰が来ましたか？ \n入力してください [ boss or co-worker]");
		Scanner scan = new Scanner(System.in);
		String who = scan.nextLine();
		scan.close();

		//bossかco-workerなら挨拶する
		if(who.equals("boss")) {
			System.out.println("Hello,boss!");
		}else if(who.equals("co-worker")){
			System.out.println("Hi!");
		}

		//例外処理
		try {
			if(!(who.equals("boss") || who.equals("co-worker"))){
				throw new Exception();
			}
		}catch(Exception e){
			System.out.println("Call security!");
		}
	}
}
