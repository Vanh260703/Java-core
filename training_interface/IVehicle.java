package training_interface;

public interface IVehicle {
	int max_speed = 120;

	void start();

	default void stop() {
		System.out.println("Vehicle stopped.");
	}
}
