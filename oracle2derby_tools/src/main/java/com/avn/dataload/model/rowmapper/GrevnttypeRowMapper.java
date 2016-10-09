package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Grevnttype;

public class GrevnttypeRowMapper<T> implements RowMapper<Grevnttype> {

	@Override
	public Grevnttype mapRow(ResultSet rs, int rowNum) throws SQLException {
		Grevnttype obj = new Grevnttype();
		
		obj.setEventtypeId(rs.getBigDecimal("EVENTTYPE_ID"));
		obj.setEventtypename(rs.getString("EVENTTYPENAME"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setStatus(rs.getBigDecimal("STATUS"));
		obj.setSortorder(rs.getBigDecimal("SORTORDER"));
		obj.setStoreid(rs.getBigDecimal("STOREID"));
		
		return obj;
	}

}
