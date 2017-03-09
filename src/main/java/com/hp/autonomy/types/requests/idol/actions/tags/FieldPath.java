package com.hp.autonomy.types.requests.idol.actions.tags;

import java.io.Serializable;

@SuppressWarnings({"WeakerAccess", "ComparableImplementedButEqualsNotOverridden", "unused"})
public interface FieldPath extends Serializable, Comparable<FieldPath> {
    String getNormalisedPath();

    String getFieldName();

    @Override
    default int compareTo(final FieldPath other) {
        return getNormalisedPath().compareTo(other.getNormalisedPath());
    }
}
