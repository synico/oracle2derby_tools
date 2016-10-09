package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Dmacttype;

public class DmacttypeRowMapper<T> implements RowMapper<Dmacttype> {

	@Override
	public Dmacttype mapRow(ResultSet rs, int rowNum) throws SQLException {
		Dmacttype obj = new Dmacttype();
		
		obj.setDmacttypeId(rs.getBigDecimal("DMACTTYPE_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setType(rs.getString("TYPE"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
