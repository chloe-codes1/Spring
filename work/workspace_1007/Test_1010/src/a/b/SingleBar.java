package a.b;

public class SingleBar {

	// [Singleton을 만드는 이유]
	// : instance를 하나만 만들기 위해
	
	private static SingleBar singleBar;
	
	private SingleBar() {
		//-> singleton 객체의 생성자는 abstract하거나 private 해야함
		
//		if(singleBar==null)
//		singleBar = new SingleBar();
			//-> 굳이 else 필요 없음! null일때만 instance 만들어서 넘겨주면 되므로~
	}
	
	public static SingleBar getInstance() {
		//getInstance로 받을 수 있는 것
		// : 대체로 singleton
		
		if(singleBar==null)
			singleBar = new SingleBar();
			// -> 생성자에서 하지 않고 여기서 해도 됨!
		return singleBar;
	}

}
