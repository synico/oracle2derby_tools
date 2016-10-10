package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ATCHRLUS;

public class ATCHRLUSRowMapper<T> implements RowMapper<ATCHRLUS> {

	@Override
	public ATCHRLUS mapRow(ResultSet rs, int rowNum) throws SQLException {
		ATCHRLUS obj = new ATCHRLUS();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setATCHRLUS_ID(rs.getBigDecimal("ATCHRLUS_ID"));
		obj.setIMAGE(rs.getString("IMAGE"));
		
		return obj;
	}

}
