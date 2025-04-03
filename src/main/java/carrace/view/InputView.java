package carrace.view;

import java.util.Arrays;

public class InputView {

    public Integer receiveCarNum(int numCar) {
        System.out.println("자동차 대수는 몇 대 인가요?");
        if (numCar > 0) {
            return numCar;
        }
        throw new RuntimeException("자동차 대수는 1 이상의 값이어야합니다.");
    }

    public Integer receiveNumTry(int numTry) {
        if (numTry > 0) {
            return numTry;
        }
        throw new RuntimeException("시도할 회수는 1 이상의 값이어야 합니다.");
    }

    public String[] receiveCarNames(String input) {
        String[] names = input.split(",");
        if (names.length <= 1) {
            throw new RuntimeException("자동차 대수는 2 이상의 값이어야합니다.");
        }

        Arrays.stream(names)
                .forEach(
                        name -> {
                            if (name.length() > 5) {
                                throw new RuntimeException("자동차 이름은 5자 이하만 가능합니다.");
                            }
                        });

        return names;
    }
}
