package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Seopagedef;

public class SeopagedefRowMapper<T> implements RowMapper<Seopagedef> {

	@Override
	public Seopagedef mapRow(ResultSet rs, int rowNum) throws SQLException {
		Seopagedef obj = new Seopagedef();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		obj.setSeopagedefId(rs.getBigDecimal("SEOPAGEDEF_ID"));
		obj.setCreatedtime(rs.getDate("CREATEDTIME"));
		obj.setPagename(rs.getString("PAGENAME"));
		
		return obj;
	}

}
