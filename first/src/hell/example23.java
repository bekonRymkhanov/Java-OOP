package hell;

public class example23 {
	public static void main(String[] args) {
		Time t=new Time(11,59,50);
		Time t2=new Time(14,6,11);
		t.add(t2);
		System.out.println(t.toStandard());
		System.out.println(t.toUniversal());
	
	}
}
