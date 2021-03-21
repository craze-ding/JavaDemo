class Fu{
	void show(){
		//不让覆盖
	}
}

class Zi extends Fu{
	void show(){
		final int x=9;
		//x=0;不能修改final常量
		System.out.println("haha!"+x);
	}
}

class FinalDemo{
	public static void main(String[] args) {
		Zi s=new Zi();
		s.show();
	}
}