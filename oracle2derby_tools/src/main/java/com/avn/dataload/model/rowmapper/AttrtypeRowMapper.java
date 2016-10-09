package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Attrtype;

public class AttrtypeRowMapper<T> implements RowMapper<Attrtype> {

	@Override
	public Attrtype mapRow(ResultSet rs, int rowNum) throws SQLException {
		Attrtype obj = new Attrtype();
		
		obj.setAttrtypeId(rs.getString("ATTRTYPE_ID"));
		obj.setOid(rs.getString("OID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
