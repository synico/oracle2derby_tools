package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Emspot;

public class EmspotRowMapper<T> implements RowMapper<Emspot> {

	@Override
	public Emspot mapRow(ResultSet rs, int rowNum) throws SQLException {
		Emspot obj = new Emspot();
		
		obj.setName(rs.getString("NAME"));
		obj.setLastupdatedby(rs.getString("LASTUPDATEDBY"));
		obj.setSupportedtypes(rs.getString("SUPPORTEDTYPES"));
		obj.setDefaultrule(rs.getString("DEFAULTRULE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setEmspotId(rs.getBigDecimal("EMSPOT_ID"));
		obj.setUidisplayable(rs.getBigDecimal("UIDISPLAYABLE"));
		obj.setManagingtool(rs.getBigDecimal("MANAGINGTOOL"));
		obj.setUsagetype(rs.getString("USAGETYPE"));
		
		return obj;
	}

}
