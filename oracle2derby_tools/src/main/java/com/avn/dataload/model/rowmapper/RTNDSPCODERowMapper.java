package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.RTNDSPCODE;

public class RTNDSPCODERowMapper<T> implements RowMapper<RTNDSPCODE> {

	@Override
	public RTNDSPCODE mapRow(ResultSet rs, int rowNum) throws SQLException {
		RTNDSPCODE obj = new RTNDSPCODE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setCODE(rs.getString("CODE"));
		obj.setRTNDSPCODE_ID(rs.getBigDecimal("RTNDSPCODE_ID"));
		obj.setRETURNTOINVENTORY(rs.getString("RETURNTOINVENTORY"));
		
		return obj;
	}

}
