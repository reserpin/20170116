package lib;

public class Calculation_lib {
	private int m,n;
	
	public Calculation_lib(int m,int n){
		this.m = m;
		this.n = n;	
	}
	
	public int getPlus(){
		return n+m;	
}
public void double_num(int m,int n ){
	this.m = m*2;
	this.n = n*2;
}
public int getMinus(){
	return n-m;		
}

public int getProduct(){
	return n*m;
}
public int getDivide(){
	return n/m;
}
public int getMod(){
	return n%m;
	}
}


