package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Rtndspcode;

public class RtndspcodeRowMapper<T> implements RowMapper<Rtndspcode> {

	@Override
	public Rtndspcode mapRow(ResultSet rs, int rowNum) throws SQLException {
		Rtndspcode obj = new Rtndspcode();
		
		obj.setCode(rs.getString("CODE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		obj.setRtndspcodeId(rs.getBigDecimal("RTNDSPCODE_ID"));
		obj.setReturntoinventory(rs.getString("RETURNTOINVENTORY"));
		
		return obj;
	}

}
