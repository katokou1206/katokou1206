package chapter10.ten_two;


public class SuperHeroRework extends Hero {	//「基本的には　Hero　と同じ」と宣言する
	
boolean frying = false;


	//追加したfly()
	public void fly() {
		this.frying = true;
		System.out.println("飛び上がった");
	}
	
	//追加したland()
	public void land() {
		this.frying = false;
		System.out.println("着地した");
	}
	
	public void run() {
		System.out.println(this.name + "は撤退した");
	}//親クラスにも定義してあるが、子クラスで再定義（上書き）するメソッド。
	//親クラスのメンバを子クラスで上書きすることをオーバーライドという。
	
	
	
	
	public void attack(Matango m) {

		super.attack(m);		//親インスタンス部分のattack()を呼び出し
		if(this.frying) {
			super.attack(m);	//親インスタンス部分のattack()を呼び出し
	}
}
}