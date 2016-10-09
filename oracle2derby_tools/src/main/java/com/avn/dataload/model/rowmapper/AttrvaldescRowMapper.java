package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Attrvaldesc;

public class AttrvaldescRowMapper<T> implements RowMapper<Attrvaldesc> {

	@Override
	public Attrvaldesc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Attrvaldesc obj = new Attrvaldesc();
		
		obj.setValue(rs.getString("VALUE"));
		obj.setStringvalue(rs.getString("STRINGVALUE"));
		obj.setIntegervalue(rs.getBigDecimal("INTEGERVALUE"));
		obj.setAttrId(rs.getBigDecimal("ATTR_ID"));
		obj.setQtyunitId(rs.getString("QTYUNIT_ID"));
		obj.setValusage(rs.getBigDecimal("VALUSAGE"));
		obj.setFloatvalue(rs.getBigDecimal("FLOATVALUE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setImage1(rs.getString("IMAGE1"));
		obj.setImage2(rs.getString("IMAGE2"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		
		return obj;
	}

}
