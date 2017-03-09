/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.tags;

import java.io.Serializable;

@SuppressWarnings({"WeakerAccess", "ComparableImplementedButEqualsNotOverridden"})
public interface TagName extends Serializable, Comparable<TagName> {
    FieldPath getId();

    String getDisplayName();

    @Override
    default int compareTo(final TagName other) {
        return getId().compareTo(other.getId());
    }
}
