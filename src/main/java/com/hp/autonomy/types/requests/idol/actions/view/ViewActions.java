/*
 * Copyright 2015-2016 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.view;

/**
 * ViewServer actions
 */
public enum ViewActions {
    Export,
    GetLink,
    ResetCache,
    ViewGetDocInfo,
    View,
    ViewImportViewTemplate;

    public static ViewActions fromValue(final String value) {
        for (final ViewActions action : values()) {
            if (action.name().equalsIgnoreCase(value)) {
                return action;
            }
        }

        throw new IllegalArgumentException("Unknown action " + value);
    }
}
