package chapter10.ten_one;

public final class StringOverride {	//宣言時にfinalが付けられたクラスは継承できない
	
	public final void slip() {//宣言時にfinalが付けられたメソッドは、子クラスにオーバーライドできない
							  //一部のメソッドのみ継承したくない時に使用する
	}

	public void run() {//runメソッドは子クラスでオーバーライド可能
		
	}
	
	//※またStringクラスはAPIで継承できない事になっている
	
	
}
