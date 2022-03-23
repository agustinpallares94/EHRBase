/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.routines;


import org.ehrbase.jooq.pg.Ehr;
import org.ehrbase.jooq.pg.udt.records.CodePhraseRecord;
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
public class JsCodePhrase1 extends AbstractRoutine<JSON> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>ehr.js_code_phrase.RETURN_VALUE</code>.
     */
    public static final Parameter<JSON> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.JSON, false, false);

    /**
     * The parameter <code>ehr.js_code_phrase.codephrase</code>.
     */
    public static final Parameter<CodePhraseRecord> CODEPHRASE = Internal.createParameter("codephrase", org.ehrbase.jooq.pg.udt.CodePhrase.CODE_PHRASE.getDataType(), false, false);

    /**
     * Create a new routine call instance
     */
    public JsCodePhrase1() {
        super("js_code_phrase", Ehr.EHR, SQLDataType.JSON);

        setReturnParameter(RETURN_VALUE);
        addInParameter(CODEPHRASE);
        setOverloaded(true);
    }

    /**
     * Set the <code>codephrase</code> parameter IN value to the routine
     */
    public void setCodephrase(CodePhraseRecord value) {
        setValue(CODEPHRASE, value);
    }

    /**
     * Set the <code>codephrase</code> parameter to the function to be used with
     * a {@link org.jooq.Select} statement
     */
    public void setCodephrase(Field<CodePhraseRecord> field) {
        setField(CODEPHRASE, field);
    }
}
