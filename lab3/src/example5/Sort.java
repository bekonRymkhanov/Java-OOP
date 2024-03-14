package example5;

import java.util.Arrays;

public class Sort{
	static <E> void swap(E []array,int i,int j) {
        E tempPerson = array[i];
        array[i] = array[j];
        array[j] = tempPerson;
	}
	static int parent(int i) {
		return i/2;
	}
	static int leftChild(int i) {
		return i*2;
	}
	static int rightChild(int i) {
		return (i*2)+1;
	}
	static <E extends Comparable<E>> void heapyfyUp(E []arr,int i) {
	    while (i > 1 && arr[parent(i)].compareTo(arr[i])==1) {
	        swap(arr,parent(i), i);
	         i = parent(i);
	    }
	}
	static <E extends Comparable<E>> void heapyfyDown(E []arr,int i,int heapSize) {
		int maxIndex = i;
	    int l = leftChild(i);
	    if (l <= heapSize && arr[l].compareTo(arr[maxIndex])==-1) {
	        maxIndex = l;
	    }
	    int r = rightChild(i);
	    if (r <= heapSize && arr[r].compareTo(arr[maxIndex]) ==-1 ) {
	        maxIndex = r;
	    }
	    if (i != maxIndex) {
	        swap(arr,i,maxIndex);
	        heapyfyDown(arr,maxIndex,heapSize);
	    }
	}
	
	static <E extends Comparable<E>> void  merge(E []array,int left,int leftEnd,int rightStart,int right){
	    E[] LeftArr= Arrays.copyOf(array,leftEnd+1-left);	   
	    E[] RightArr= Arrays.copyOf(array,right+1-rightStart);
	    for (int i = 0; i < leftEnd+1-left; i++)
	        LeftArr[i] = array[left + i];
	    for (int j = 0; j < right+1-rightStart; j++)
	        RightArr[j] = array[rightStart + j];

	    int i=0,j=0,k=left;
	    
	    while(i<leftEnd+1-left && j<right+1-rightStart){
	        if(LeftArr[i].compareTo(RightArr[j])==1){
	            array[k]=RightArr[j];
	            j++;
	        }else{
	            array[k]=LeftArr[i];
	            i++;
	        }
	        k++;
	    }
	    
	    while(i<leftEnd+1-left){
	        array[k]=LeftArr[i];
	        i++;
	        k++;
	    }
	    while(j<right+1-rightStart){
	        array[k]=RightArr[j];
	        j++;
	        k++;
	    }

	}
	static <E extends Comparable<E>> void heapSort(E []array) {
		E[] arr= Arrays.copyOf(array,array.length+1);
		for(int i=1;i<=array.length;i++) {
			arr[i]=array[i-1];
			heapyfyUp(arr,i);
		}
		int size=arr.length-1;
		for(int i=0;i<array.length;i++) {
			array[i]=arr[1];
			swap(arr,1,size);
			size--;
			heapyfyDown(arr,1,size);
		}
	}
	static <E extends Comparable<E>> void mergeSort(E []array,int left,int right) {
	    if(right==left){
	        return;
	    }
	    mergeSort(array,left,left+(right-left)/2);
	    mergeSort(array,(left+(right-left)/2)+1,right);
	    merge(array,left,left+(right-left)/2,(left+(right-left)/2)+1,right);
	}
}
