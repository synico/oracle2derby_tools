package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Dmexptype;

public class DmexptypeRowMapper<T> implements RowMapper<Dmexptype> {

	@Override
	public Dmexptype mapRow(ResultSet rs, int rowNum) throws SQLException {
		Dmexptype obj = new Dmexptype();
		
		obj.setDmexptypeId(rs.getBigDecimal("DMEXPTYPE_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setType(rs.getString("TYPE"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
