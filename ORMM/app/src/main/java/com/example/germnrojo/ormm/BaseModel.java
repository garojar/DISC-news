package com.example.germnrojo.ormm;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Created by Germán Rojo on 15-05-2017.
 */
public abstract class BaseModel extends com.raizlabs.android.dbflow.structure.BaseModel {
    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
