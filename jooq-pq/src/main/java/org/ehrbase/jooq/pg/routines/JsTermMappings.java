/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.routines;


import org.ehrbase.jooq.pg.Ehr;
import org.jooq.Field;
import org.jooq.JSONB;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JsTermMappings extends AbstractRoutine<JSONB[]> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>ehr.js_term_mappings.RETURN_VALUE</code>.
     */
    public static final Parameter<JSONB[]> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.JSONB.getArrayDataType(), false, false);

    /**
     * The parameter <code>ehr.js_term_mappings.mappings</code>.
     */
    public static final Parameter<String[]> MAPPINGS = Internal.createParameter("mappings", SQLDataType.CLOB.getArrayDataType(), false, false);

    /**
     * Create a new routine call instance
     */
    public JsTermMappings() {
        super("js_term_mappings", Ehr.EHR, SQLDataType.JSONB.getArrayDataType());

        setReturnParameter(RETURN_VALUE);
        addInParameter(MAPPINGS);
    }

    /**
     * Set the <code>mappings</code> parameter IN value to the routine
     */
    public void setMappings(String[] value) {
        setValue(MAPPINGS, value);
    }

    /**
     * Set the <code>mappings</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setMappings(Field<String[]> field) {
        setField(MAPPINGS, field);
    }
}
