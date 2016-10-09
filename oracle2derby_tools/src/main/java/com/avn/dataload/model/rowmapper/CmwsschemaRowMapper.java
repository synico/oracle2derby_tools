package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Cmwsschema;

public class CmwsschemaRowMapper<T> implements RowMapper<Cmwsschema> {

	@Override
	public Cmwsschema mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cmwsschema obj = new Cmwsschema();
		
		obj.setWorkspace(rs.getString("WORKSPACE"));
		obj.setBaseschema(rs.getString("BASESCHEMA"));
		obj.setReadschema(rs.getString("READSCHEMA"));
		obj.setAllocated(rs.getBigDecimal("ALLOCATED"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCmwsschemaId(rs.getBigDecimal("CMWSSCHEMA_ID"));
		obj.setWriteschema(rs.getString("WRITESCHEMA"));
		obj.setSyncrequired(rs.getBigDecimal("SYNCREQUIRED"));
		
		return obj;
	}

}
