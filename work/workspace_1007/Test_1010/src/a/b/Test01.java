package a.b;

public class Test01 {

	public static void main(String[] args) {

		Bar bar1 = new Bar();
		Bar bar2 = new Bar();
		Bar bar3 = new Bar();
		Bar bar4 = new Bar();
		
		System.out.println(bar1 + "\n" + bar2 + "\n" + bar3 + "\n" + bar4 + "\n");
		// -> 각각 다른 주소 찍힘
		//    => 싱글톤이 아닌 것 확인 가능
		
//		SingleBar singleBar = new SingleBar();
		// -> 에러남!!!! 
		//	  => singleton은 new로 만들어서 호출할 수가 없음
		
		SingleBar singleBar1 = SingleBar.getInstance();
		SingleBar singleBar2 = SingleBar.getInstance();
		SingleBar singleBar3 = SingleBar.getInstance();
		System.out.println(singleBar1 + "\n" + singleBar2 + "\n" + singleBar3 + "\n");
		// -> 같은 주소 찍힘
		//    => 싱글톤인 것 확인 가능
	}

}
