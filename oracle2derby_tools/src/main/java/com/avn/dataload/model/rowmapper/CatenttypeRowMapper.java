package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Catenttype;

public class CatenttypeRowMapper<T> implements RowMapper<Catenttype> {

	@Override
	public Catenttype mapRow(ResultSet rs, int rowNum) throws SQLException {
		Catenttype obj = new Catenttype();
		
		obj.setOid(rs.getString("OID"));
		obj.setCatenttypeId(rs.getString("CATENTTYPE_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		
		return obj;
	}

}
