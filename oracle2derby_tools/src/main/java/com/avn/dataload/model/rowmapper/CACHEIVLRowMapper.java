package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CACHEIVL;

public class CACHEIVLRowMapper<T> implements RowMapper<CACHEIVL> {

	@Override
	public CACHEIVL mapRow(ResultSet rs, int rowNum) throws SQLException {
		CACHEIVL obj = new CACHEIVL();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTEMPLATE(rs.getString("TEMPLATE"));
		obj.setDATAID(rs.getString("DATAID"));
		obj.setINSERTTIME(rs.getTimestamp("INSERTTIME"));
		
		return obj;
	}

}
