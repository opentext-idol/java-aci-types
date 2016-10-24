/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * Warnings returned alongside IDOL/Hod responses.
 */
@Data
@AllArgsConstructor
public class Warnings implements Serializable {
    private static final long serialVersionUID = -1591490695879653571L;

    /**
     * @serial The list of databases sent in the query request which do not exist.
     */
    private Set<? extends Serializable> invalidDatabases;
}
