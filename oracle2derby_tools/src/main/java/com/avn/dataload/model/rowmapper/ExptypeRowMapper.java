package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Exptype;

public class ExptypeRowMapper<T> implements RowMapper<Exptype> {

	@Override
	public Exptype mapRow(ResultSet rs, int rowNum) throws SQLException {
		Exptype obj = new Exptype();
		
		obj.setName(rs.getString("NAME"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setExptypeId(rs.getBigDecimal("EXPTYPE_ID"));
		obj.setImplcls(rs.getString("IMPLCLS"));
		obj.setObjcls(rs.getString("OBJCLS"));
		
		return obj;
	}

}
