package patron.state;

public class HabitacionMantenimiento implements HabitacionEstado{
	
	@Override
	public HabitacionEstado ocupar() {
		System.out.println("La habitacion no puede ser ocupada");
		return this;
	}

	@Override
	public HabitacionEstado liberar() {
		System.out.println("La habitacion ha cambiado al estado ocupada vacia");
		return new HabitacionOcupadaVacia();
	}

	@Override
	public HabitacionEstado limpiar() {
		System.out.println("La habitacion ya esta siendo limpiada");
		return this;
	}

	@Override
	public HabitacionEstado salir() {
		System.out.println("La habitacion no ha cambiado de estado por que esta en mantenimiento");
		return this;
	}
}
