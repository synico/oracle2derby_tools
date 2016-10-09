package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Acattr;

public class AcattrRowMapper<T> implements RowMapper<Acattr> {

	@Override
	public Acattr mapRow(ResultSet rs, int rowNum) throws SQLException {
		Acattr obj = new Acattr();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setAcattrId(rs.getBigDecimal("ACATTR_ID"));
		obj.setAttrname(rs.getString("ATTRNAME"));
		obj.setDatatype(rs.getBigDecimal("DATATYPE"));
		
		return obj;
	}

}
