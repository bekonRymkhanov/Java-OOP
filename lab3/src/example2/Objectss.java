package example2;

import java.util.Objects;

public class Objectss  {
	
	private String name;
	private int weight;
	private String material;
	private int PosX;
	private int PosY;
	
	public Objectss() {
	}
	public Objectss(String name, int weight, String material, int posX, int posY) {
		super();
		this.name = name;
		this.weight = weight;
		this.material = material;
		PosX = posX;
		PosY = posY;
	}
	
	public String getName() {
		return name;
	}public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getMaterial() {
		return material;
	}public void setMaterial(String material) {
		this.material = material;
	}
	public int getPosX() {
		return PosX;
	}public void setPosX(int posX) {
		PosX = posX;
	}
	public int getPosY() {
		return PosY;
	}public void setPosY(int posY) {
		PosY = posY;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(PosX, PosY, material, name, weight);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Objectss other = (Objectss) obj;
		return PosX == other.PosX && PosY == other.PosY && Objects.equals(material, other.material)
				&& Objects.equals(name, other.name) && weight == other.weight;
	}
	
	@Override
	public String toString() {
		return " name: " + name + " weight: " + weight + " material: " + material+" posx: "+PosX+"posy: "+PosY;
	}
	
}
