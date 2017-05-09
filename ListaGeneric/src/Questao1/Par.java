package Questao1;



public class Par <E extends Object, A extends Object>{
	E ob1;
	A obj2;
	
	public Par(E ob1, A obj2) {
		this.ob1 = ob1;
		this.obj2 = obj2;
	}
	public E getOb1() {
		return ob1;
	}
	public void setOb1(E ob1) {
		this.ob1 = ob1;
	}
	public A getObj2() {
		return obj2;
	}
	public void setObj2(A obj2) {
		this.obj2 = obj2;
	}
	

}
