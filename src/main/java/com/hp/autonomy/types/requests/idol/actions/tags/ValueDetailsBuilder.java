/*
 * Copyright 2017 Hewlett Packard Enterprise Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

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
