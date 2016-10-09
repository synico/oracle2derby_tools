package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Chargetype;

public class ChargetypeRowMapper<T> implements RowMapper<Chargetype> {

	@Override
	public Chargetype mapRow(ResultSet rs, int rowNum) throws SQLException {
		Chargetype obj = new Chargetype();
		
		obj.setCode(rs.getString("CODE"));
		obj.setChargetypeId(rs.getBigDecimal("CHARGETYPE_ID"));
		obj.setDisplayaggregated(rs.getString("DISPLAYAGGREGATED"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		
		return obj;
	}

}
