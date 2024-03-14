package lab1;

class Data11 {
	private int maximum;
	private double avarage;
	private double value;
	public Data11(){
		this.value=0;
	}
	public void plus (int number) {
		if(number>this.maximum) {
			this.maximum=number;
		}
		this.value+=number;
	}
	public double avarage(int index) {
		this.avarage=this.value/index;
		return this.avarage;
	}
	public double maximum() {
		return this.maximum;
	}
	
}
