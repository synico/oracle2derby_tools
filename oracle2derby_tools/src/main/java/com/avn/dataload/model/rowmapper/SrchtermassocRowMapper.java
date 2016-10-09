package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Srchtermassoc;

public class SrchtermassocRowMapper<T> implements RowMapper<Srchtermassoc> {

	@Override
	public Srchtermassoc mapRow(ResultSet rs, int rowNum) throws SQLException {
		Srchtermassoc obj = new Srchtermassoc();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLanguageId(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setType(rs.getString("TYPE"));
		obj.setStatus(rs.getBigDecimal("STATUS"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setSrchtermassocId(rs.getBigDecimal("SRCHTERMASSOC_ID"));
		obj.setAssociationtype(rs.getBigDecimal("ASSOCIATIONTYPE"));
		obj.setScope(rs.getString("SCOPE"));
		
		return obj;
	}

}
