/*
 * Copyright 2015 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types;

import java.io.Serializable;

/**
 * Interface for Idol Database information. Implementations expected to be POJOs.
 */
public interface IdolDatabase extends Serializable, Identifier {
    /**
     * Database / Index name
     *
     * @return The name identifying the database
     */
    String getName();

    /**
     * The number of documents in the database / index
     *
     * @return The number of documents in the database / index
     */
    long getDocuments();
}
