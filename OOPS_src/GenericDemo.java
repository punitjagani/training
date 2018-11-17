
public class GenericDemo<Z> {
	private Z data;
	
	public GenericDemo(Z data) {
		this.data = data;
	}
	
	public Z getData() {
		return data;
	}

	public void setData(Z data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		GenericDemo<String> g1 = new GenericDemo<String>("Hola");
		System.out.println(g1.getData());
		
		GenericDemo<Integer> g2 = new GenericDemo<Integer>(500);
		System.out.println(g2.getData());
		
		
	}
	
	

}
