package com.hp.autonomy.types.requests.idol.actions.tags;

import lombok.Builder;
import lombok.Data;

/**
 * Represents the value details response from an IDOL GetQueryTagValues or a HOD GetParametricValues request.
 */
@SuppressWarnings({"unused", "WeakerAccess"})
@Data
@Builder
public class NumericValueDetails implements ValueDetails<Double> {
    private static final long serialVersionUID = -5944398367052500489L;

    private final Double min;
    private final Double max;
    private final Double average;
    private final double sum;
    private final int totalValues;

    public static class NumericValueDetailsBuilder implements ValueDetailsBuilder<Double, NumericValueDetails, NumericValueDetailsBuilder> {
    }
}
