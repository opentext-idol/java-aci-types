/*
 * Copyright 2015-2016 Hewlett-Packard Development Company, L.P.
 * Licensed under the MIT License (the "License"); you may not use this file except in compliance with the License.
 */

package com.hp.autonomy.types.requests.idol.actions.view.params;

/**
 * View Action Parameters
 */
public enum ViewParams {
    Boolean,
    ConversionTimeoutSeconds,
    Cookie,
    DeleteOriginal,
    EmbedImages,
    EndTag,
    HighlightTagTerm,
    IgnoreCache,
    LanguageType,
    Links,
    MultiHighlight,
    NoACI,
    OEMEncryption,
    OriginalBaseURL,
    OutputType,
    Page,
    Reference,
    StartTag,
    StripScript,
    UrlPrefix,
    UseReferencePrefix,
    ViewTemplate,
    ViewUpload;

    public static ViewParams fromValue(final String value) {
        for (final ViewParams param : values()) {
            if (param.name().equalsIgnoreCase(value)) {
                return param;
            }
        }

        throw new IllegalArgumentException("Unknown parameter " + value);
    }
}
