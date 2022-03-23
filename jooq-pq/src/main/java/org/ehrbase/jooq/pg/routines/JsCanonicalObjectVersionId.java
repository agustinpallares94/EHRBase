/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.routines;


import org.ehrbase.jooq.pg.Ehr;
import org.jooq.Field;
import org.jooq.JSON;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JsCanonicalObjectVersionId extends AbstractRoutine<JSON> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>ehr.js_canonical_object_version_id.RETURN_VALUE</code>.
     */
    public static final Parameter<JSON> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.JSON, false, false);

    /**
     * The parameter <code>ehr.js_canonical_object_version_id.id_value</code>.
     */
    public static final Parameter<String> ID_VALUE = Internal.createParameter("id_value", SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public JsCanonicalObjectVersionId() {
        super("js_canonical_object_version_id", Ehr.EHR, SQLDataType.JSON);

        setReturnParameter(RETURN_VALUE);
        addInParameter(ID_VALUE);
    }

    /**
     * Set the <code>id_value</code> parameter IN value to the routine
     */
    public void setIdValue(String value) {
        setValue(ID_VALUE, value);
    }

    /**
     * Set the <code>id_value</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setIdValue(Field<String> field) {
        setField(ID_VALUE, field);
    }
}
