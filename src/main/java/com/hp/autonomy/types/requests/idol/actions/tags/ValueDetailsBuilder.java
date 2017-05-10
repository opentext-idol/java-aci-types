package com.hp.autonomy.types.requests.idol.actions.tags;

@SuppressWarnings("unused")
public interface ValueDetailsBuilder<T extends Comparable<? super T>, V extends ValueDetails<T>, B extends ValueDetailsBuilder<T, V, B>> {
    B min(T min);

    B max(T max);

    B average(T average);

    B sum(double sum);

    B totalValues(int totalValues);

    V build();
}
