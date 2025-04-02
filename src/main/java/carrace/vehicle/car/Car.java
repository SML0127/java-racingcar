package carrace.vehicle.car;

import carrace.common.Vehicle;
import carrace.movement.car.CarMovement;

public class Car implements Vehicle {

    private static final int MOVE_CONDITION = 4;
    private static final int LOWER_BOUND = 0;
    private static final int UPPER_BOUND = 9;

    public static final String IDENTIFIER = "CAR";
    private CarMovement CAR_MOVEMENT;

    private final String name;

    public Car(String name, CarMovement carPosition) {
        this.name = name;
        this.CAR_MOVEMENT = carPosition;
    }

    @Override
    public String identifier() {
        return IDENTIFIER;
    }

    // 상하좌우가 추가 될 경우 맞춰 if 조건 추가
    @Override
    public void move(int randomVal) {
        if (randomVal < LOWER_BOUND || randomVal > UPPER_BOUND) {
            throw new RuntimeException("랜덤 값은 0에서 9사이의 값이어야합니다.");
        }

        if (randomVal >= MOVE_CONDITION) {
            CAR_MOVEMENT.moveForward();
        }
    }

    public String getCurrentPosition() {
        return CAR_MOVEMENT.get();
    }

    public String getCarName() {
        return name;
    }
}
