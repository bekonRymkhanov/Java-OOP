package example1;

import java.util.Objects;

public abstract class Music {
	private int lengthOfMusic;
	private String name;
	private int Rating;
	
	public Music() {
	}
	public Music(int lengthOfMusic, String name) {
		this.lengthOfMusic = lengthOfMusic;
		this.name = name;
	}

	public int getLengthOfMusic() {
		return lengthOfMusic;
	}
	public void setLengthOfMusic(int lengthOfMusic) {
		this.lengthOfMusic = lengthOfMusic;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	abstract void fealingAfterMusic();
	
	public void GiveRate(int Rating) {
		this.Rating=Rating;
	}

	@Override
	public int hashCode() {
		return Objects.hash(lengthOfMusic, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		return lengthOfMusic == other.lengthOfMusic && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return " lengthOfMusic: " + lengthOfMusic + " name: " + name;
	}
	
	
	
}
