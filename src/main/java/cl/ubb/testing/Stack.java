package cl.ubb.testing;

public class Stack {
	
	private int top;
	
	public Stack(){
		this.top = 0;
	}
	
	public String floors(){
		if (top == 0){ 
			return "Vacia";
		}else{
			return "No Vacia";
		}
	}
	
	public void add(int n){
		this.top = this.top + n;
	}
}
