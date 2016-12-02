/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.tags;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@SuppressWarnings({"WeakerAccess", "unused"})
@Getter
@NoArgsConstructor
@EqualsAndHashCode
public class TagName implements Serializable {
    private static final long serialVersionUID = -6221132711228529797L;
    private String id;
    private String name;

    @JsonCreator
    public TagName(final String path) {
        name = getFieldNameFromPath(path);
        id = adjustFieldPath(path, name);
    }

    private String adjustFieldPath(final String fieldPath, final String fieldName) {
        // Need an extra '/' to be able to query a field by its root path (since wildcards in Idol config file take the form */SOME_FIELD)
        // However, for the special autn_date field which does not have a path, adding such a '/' would break the query
        return fieldName.equals(fieldPath) || fieldPath.startsWith("/") ? fieldPath : '/' + fieldPath;
    }

    private String getFieldNameFromPath(final String value) {
        return value.contains("/") ? value.substring(value.lastIndexOf('/') + 1) : value;
    }
}
