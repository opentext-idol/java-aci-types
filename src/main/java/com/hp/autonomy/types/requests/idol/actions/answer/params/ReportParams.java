package com.hp.autonomy.types.requests.idol.actions.answer.params;

public enum ReportParams {
    Entity,
    Context,
    CustomizationData,
    FirstResult,
    MaxResults,
    SystemNames,
    Timeout,
    TotalResults;

    public static ReportParams fromValue(final String value) {
        for (final ReportParams param : values()) {
            if (param.name().equalsIgnoreCase(value)) {
                return param;
            }
        }

        throw new IllegalArgumentException("Unknown parameter " + value);
    }
}
