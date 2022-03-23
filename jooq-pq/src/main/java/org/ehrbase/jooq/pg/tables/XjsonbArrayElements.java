/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.tables;


import org.ehrbase.jooq.pg.Ehr;
import org.ehrbase.jooq.pg.tables.records.XjsonbArrayElementsRecord;
import org.jooq.Field;
import org.jooq.JSONB;
import org.jooq.Name;
import org.jooq.Row1;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XjsonbArrayElements extends TableImpl<XjsonbArrayElementsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ehr.xjsonb_array_elements</code>
     */
    public static final XjsonbArrayElements XJSONB_ARRAY_ELEMENTS = new XjsonbArrayElements();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<XjsonbArrayElementsRecord> getRecordType() {
        return XjsonbArrayElementsRecord.class;
    }

    /**
     * The column <code>ehr.xjsonb_array_elements.xjsonb_array_elements</code>.
     */
    public final TableField<XjsonbArrayElementsRecord, JSONB> XJSONB_ARRAY_ELEMENTS_ = createField(DSL.name("xjsonb_array_elements"), SQLDataType.JSONB, this, "");

    private XjsonbArrayElements(Name alias, Table<XjsonbArrayElementsRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.JSONB)
        });
    }

    private XjsonbArrayElements(Name alias, Table<XjsonbArrayElementsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>ehr.xjsonb_array_elements</code> table reference
     */
    public XjsonbArrayElements(String alias) {
        this(DSL.name(alias), XJSONB_ARRAY_ELEMENTS);
    }

    /**
     * Create an aliased <code>ehr.xjsonb_array_elements</code> table reference
     */
    public XjsonbArrayElements(Name alias) {
        this(alias, XJSONB_ARRAY_ELEMENTS);
    }

    /**
     * Create a <code>ehr.xjsonb_array_elements</code> table reference
     */
    public XjsonbArrayElements() {
        this(DSL.name("xjsonb_array_elements"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Ehr.EHR;
    }

    @Override
    public XjsonbArrayElements as(String alias) {
        return new XjsonbArrayElements(DSL.name(alias), this, parameters);
    }

    @Override
    public XjsonbArrayElements as(Name alias) {
        return new XjsonbArrayElements(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public XjsonbArrayElements rename(String name) {
        return new XjsonbArrayElements(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public XjsonbArrayElements rename(Name name) {
        return new XjsonbArrayElements(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<JSONB> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public XjsonbArrayElements call(
          JSONB entry
    ) {
        XjsonbArrayElements result = new XjsonbArrayElements(DSL.name("xjsonb_array_elements"), null, new Field[] {
            DSL.val(entry, SQLDataType.JSONB)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public XjsonbArrayElements call(
          Field<JSONB> entry
    ) {
        XjsonbArrayElements result = new XjsonbArrayElements(DSL.name("xjsonb_array_elements"), null, new Field[] {
            entry
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
