
public class Car {
	private String model;
	private String[] features;
	public Car(String model, String... features) {
		this.model = model;
		this.features = features;
	}
	
	public void specs() {
		System.out.println("Features of " + model);
		for (String feature: features)
			System.out.println(feature);
		
	}
	
	public static void main(String[] args) {
		//String[] af = {"Power Window","Power Steering","Keyless Entry"};
		Car alto = new Car("Alto", "Power Window","Power Steering","Keyless Entry");
		//here the compiler will automatically understand the first field is model and the rest are features
		
		//String[] fi20 = {"ABS","Keyless", "6 Air Bags", "Pano Roof", "Auto"};
		Car i20 = new Car("i20","ABS","Keyless", "6 Air Bags", "Pano Roof", "Auto");
		
		alto.specs();
		i20.specs();
	}
}
