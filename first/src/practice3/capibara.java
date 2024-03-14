package practice3;

public class capibara extends Animal{
	public capibara() {
		super();
		
	}public capibara(String name){
		super(name);
	}
	
	public String chillTime() {
		return "2 hours";
	}
	
	public String waterTemperature(String temp) {
		if(temp.equals("Hot") || temp.equals("Warm")) {
			return "okay i pull up";
		}else {
			return "angry capibara";
		}
	}
	public String waterTemperature(int temp) {
		if(temp>36 && temp<60) {
			return "okay i pull up";
		}else {
			return "angry capibara";
		}
	}
    public String getName() {
        return super.name; 
    }
    public int getLegs() {
        return super.numOfLegs; 
    }
	
	
}
