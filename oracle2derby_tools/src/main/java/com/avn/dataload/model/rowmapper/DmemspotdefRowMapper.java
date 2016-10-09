package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Dmemspotdef;

public class DmemspotdefRowMapper<T> implements RowMapper<Dmemspotdef> {

	@Override
	public Dmemspotdef mapRow(ResultSet rs, int rowNum) throws SQLException {
		Dmemspotdef obj = new Dmemspotdef();
		
		obj.setDmemspotdefId(rs.getBigDecimal("DMEMSPOTDEF_ID"));
		obj.setContenttype(rs.getString("CONTENTTYPE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		obj.setEmspotId(rs.getBigDecimal("EMSPOT_ID"));
		obj.setContent(rs.getString("CONTENT"));
		
		return obj;
	}

}
