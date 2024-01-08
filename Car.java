public class Car {
    private final String carState;
    private final String carPlateNum;

    public Car(String state, String plates) {
        carState = state;
        carPlateNum = plates;
    }

    public String getCar() {
        return carState;
    }

    public String getState() {
        return carPlateNum;
    }
}
