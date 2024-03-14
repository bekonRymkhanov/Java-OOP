package example1;

public class PopMusic extends Music{

	
	public PopMusic() {
	}
	public PopMusic(int lengthOfMusic, String name) {
		super(lengthOfMusic, name);
	}

	@Override
	void fealingAfterMusic() {
		System.out.print(" im happy ");
	}
	
	

}
