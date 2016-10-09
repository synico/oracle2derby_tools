package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Attrval;

public class AttrvalRowMapper<T> implements RowMapper<Attrval> {

	@Override
	public Attrval mapRow(ResultSet rs, int rowNum) throws SQLException {
		Attrval obj = new Attrval();
		
		obj.setAttrId(rs.getBigDecimal("ATTR_ID"));
		obj.setAttrvalId(rs.getBigDecimal("ATTRVAL_ID"));
		obj.setValusage(rs.getBigDecimal("VALUSAGE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setIdentifier(rs.getString("IDENTIFIER"));
		
		return obj;
	}

}
