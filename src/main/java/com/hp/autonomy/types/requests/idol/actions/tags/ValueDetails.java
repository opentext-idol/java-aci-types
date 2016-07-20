package com.hp.autonomy.types.requests.idol.actions.tags;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Represents the value details response from an IDOL GetQueryTagValues or a HOD GetParametricValues request.
 */
@Data
public class ValueDetails {
    private final double min;
    private final double max;
    private final double average;
    private final double sum;
    private final int totalValues;

    @Setter
    @Accessors(chain = true)
    @NoArgsConstructor
    public static class Builder {
        private double min;
        private double max;
        private double average;
        private double sum;
        private int totalValues;

        public Builder (final ValueDetails valueDetails) {
            min = valueDetails.min;
            max = valueDetails.max;
            average = valueDetails.average;
            sum = valueDetails.sum;
            totalValues = valueDetails.totalValues;
        }

        public ValueDetails build() {
            return new ValueDetails(min, max, average, sum, totalValues);
        }
    }
}
