package example1;

public class Classical extends Music{
	
	
	public Classical() {
	}
	public Classical(int lengthOfMusic, String name){
		super(lengthOfMusic,name);
	}
	@Override
	void fealingAfterMusic() {
		System.out.print(" im sad ");
		
	}

}
