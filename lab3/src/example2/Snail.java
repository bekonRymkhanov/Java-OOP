package example2;

public class Snail extends Objectss implements Movable{

	public Snail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Snail(String name, int weight, String material, int posX, int posY) {
		super(name, weight, material, posX, posY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Move(int x, int y) {
		super.setPosX(super.getPosX()+x);
		super.setPosY(super.getPosY()+y);
	}

}
