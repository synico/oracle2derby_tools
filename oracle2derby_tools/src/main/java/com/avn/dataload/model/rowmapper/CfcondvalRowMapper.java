package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Cfcondval;

public class CfcondvalRowMapper<T> implements RowMapper<Cfcondval> {

	@Override
	public Cfcondval mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cfcondval obj = new Cfcondval();
		
		obj.setStringvalue(rs.getString("STRINGVALUE"));
		obj.setIntegervalue(rs.getBigDecimal("INTEGERVALUE"));
		obj.setField4(rs.getBigDecimal("FIELD4"));
		obj.setAttrvalId(rs.getBigDecimal("ATTRVAL_ID"));
		obj.setFloatvalue(rs.getBigDecimal("FLOATVALUE"));
		obj.setCfcondvalId(rs.getBigDecimal("CFCONDVAL_ID"));
		obj.setField5(rs.getBigDecimal("FIELD5"));
		obj.setCfcondId(rs.getBigDecimal("CFCOND_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		
		return obj;
	}

}
