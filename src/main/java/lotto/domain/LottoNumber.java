package lotto.domain;

import static lotto.common.Messages.LOTTO_NUMBER_OUT_OF_RANGE;

public class LottoNumber {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 45;

    private final int number;

    public LottoNumber(int number) {
        validateRangeNumber(number);
        this.number = number;
    }

    private void validateRangeNumber(int number) {
        if (MIN_NUMBER > number || MAX_NUMBER < number) {
            throw new IllegalArgumentException(LOTTO_NUMBER_OUT_OF_RANGE);
        }
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }
}
