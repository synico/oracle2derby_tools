package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Atchobjtyp;

public class AtchobjtypRowMapper<T> implements RowMapper<Atchobjtyp> {

	@Override
	public Atchobjtyp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Atchobjtyp obj = new Atchobjtyp();
		
		obj.setAtchobjtypId(rs.getBigDecimal("ATCHOBJTYP_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setIdentifier(rs.getString("IDENTIFIER"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
