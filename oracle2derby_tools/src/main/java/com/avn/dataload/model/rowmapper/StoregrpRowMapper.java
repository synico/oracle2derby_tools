package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Storegrp;

public class StoregrpRowMapper<T> implements RowMapper<Storegrp> {

	@Override
	public Storegrp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Storegrp obj = new Storegrp();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setStoregrpId(rs.getBigDecimal("STOREGRP_ID"));
		
		return obj;
	}

}
