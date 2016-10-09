package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Atchrlus;

public class AtchrlusRowMapper<T> implements RowMapper<Atchrlus> {

	@Override
	public Atchrlus mapRow(ResultSet rs, int rowNum) throws SQLException {
		Atchrlus obj = new Atchrlus();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setIdentifier(rs.getString("IDENTIFIER"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		obj.setAtchrlusId(rs.getBigDecimal("ATCHRLUS_ID"));
		obj.setImage(rs.getString("IMAGE"));
		
		return obj;
	}

}
