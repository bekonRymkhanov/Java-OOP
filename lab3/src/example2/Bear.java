package example2;

public class Bear extends Objectss implements Runnable {

	public Bear() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bear(String name, int weight, String material, int posX, int posY) {
		super(name, weight, material, posX, posY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Move(int x, int y) {
		super.setPosX(super.getPosX()+x);
		super.setPosY(super.getPosY()+y);	
	}

	@Override
	public void run(int x,int y,int speed) {
		this.Move(x*speed, y*speed);
	}

}
