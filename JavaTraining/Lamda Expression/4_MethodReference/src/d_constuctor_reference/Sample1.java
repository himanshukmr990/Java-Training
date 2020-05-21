package d_constuctor_reference;

class BMWCar {
	private String carId;
	private double price;

	public BMWCar() {
		System.out.println("BMWCar()");
	}

	public BMWCar(String carId) {
		System.out.println("String carId");
		this.carId = carId;
	}

	public BMWCar(double price) {
		this.price = price;
	}

	public BMWCar(String carId, double price) {
		System.out.println("String carId,double price");
		this.carId = carId;
		this.price = price;
	}

	public void printCarModel() {
		System.out.println("Car Model - " + carId + " ,Car price - " + price);
	}
}

@FunctionalInterface
interface I_Car1 {
	BMWCar getCar();
}

interface I_Car2 {
	BMWCar getCar(String name);
}

interface I_Car3 {
	BMWCar getCar(String name, int price);
}

public class Sample1 {
	public static void main(String[] args) {

		// I_Car1 car1 = () -> new BMWCar();
		//I_Car1 car1 = BMWCar::new;
		//BMWCar mycar1 = car1.getCar();
		// mycar1.printCarModel();

		// I_Car2 car2=(String name) -> new BMWCar(name);
		 I_Car2 car2 = BMWCar::new;
		 BMWCar mycar2 = car2.getCar("FARAI ");
		// mycar2.printCarModel();

		// I_Car3 car3 = (String name,int price) -> new BMWCar(name,price);
		// I_Car3 car3=BMWCar::new;
		// BMWCar mycar3 = car3.getCar("My car", 7777);
		// mycar3.printCarModel();

	}
}
