package example5;

import java.lang.reflect.Array;

import example4.Employee;
import example4.Mananger;

public class Test {

	public static void main(String[] args) {
//		Chocolate choc=new Chocolate(2.2,"ssss");
//		Chocolate choc2=new Chocolate(33.3,"aeaef");
//		Chocolate choc3=new Chocolate(2.55,"www");
//		Chocolate choc4=new Chocolate(4.666,"werf");
//		Chocolate choc5=new Chocolate(1.33,"eafsef");
//		Chocolate[] arr=new Chocolate[5];
		Mananger[] arr=new Mananger[5];
		arr[0]=new Mananger("asd",123.12,"qwewqe",10);
		arr[1]=new Mananger("wef",12.32,"qwefeqe",1);
		arr[2]=new Mananger("223d",3.2,"fhjqe",30);
		arr[3]=new Mananger("fffffasd",3.2,"wqe",9);
		arr[4]=new Mananger("werwt",563.12,"e",20);
		Sort.mergeSort(arr, 0, 4);
		for(Mananger i:arr) {
	    System.out.println(i.toString());
        }
//		Sort.swap(arr, 2, 3);
//		for(Chocolate i:arr) {
//		    System.out.println(i.toString());
//	    }
//		Sort.mergeSort(arr, 0,4);
//		for(Chocolate i:arr) {
//			System.out.println(i.toString());
//		}
//		Sort.heapSort(arr);
//		for(Chocolate i:arr) {
//			System.out.println(i.toString());
//		}
	}

}
