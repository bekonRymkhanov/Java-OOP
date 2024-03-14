package example3;

import java.util.Arrays;

public class SomeCollection implements MyCollection {
	
	private int[] container;
	private int i;
	
	
	public SomeCollection(int size) {
		this.container=new int[size];
		this.i=0;
	}

	@Override
	public boolean add(int x) {
		container[i]=x;
		this.i++;
		return true;
	}

	@Override
	public boolean delete(int index) {
		int[] newArray = Arrays.copyOf(container, container.length - 1);
        System.arraycopy(container, 0, newArray, 0, index);
        System.arraycopy(container, index + 1, newArray, index,container.length - index - 1);
        container = newArray;
        this.i--;
        
		return true;
	}

	@Override
	public boolean contains(int x) {
		for(int j:container) {
			if(j==x) return true;
		}
		return false;
	}

	@Override
	public void clear() {
		int[] newArray = Arrays.copyOf(container, container.length - 1);
		container=newArray;
		this.i=0;
	}

	@Override
	public int size() {
		return this.i;
	}

	@Override
	public int elementAt(int index) {
		return container[index];
	}

}
