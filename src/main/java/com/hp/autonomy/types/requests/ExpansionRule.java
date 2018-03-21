/*
 * Copyright (c) 2018, Micro Focus International plc.
 */

package com.hp.autonomy.types.requests;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExpansionRule implements Serializable {

    private static final long serialVersionUID = -3759977893073373750L;

    private final String reference;
    private final String type;

}
