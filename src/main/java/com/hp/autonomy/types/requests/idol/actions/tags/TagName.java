/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.tags;

import lombok.Data;

import java.io.Serializable;

@SuppressWarnings({"WeakerAccess", "unused"})
@Data
public class TagName implements Serializable {
    private static final long serialVersionUID = -6221132711228529797L;
    private final String id;
    private final String name;

    public TagName(final String name, final String path) {
        this.name = name;
        this.id = path;
    }
}
