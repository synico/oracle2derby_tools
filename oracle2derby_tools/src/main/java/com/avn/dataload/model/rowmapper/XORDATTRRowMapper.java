package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XORDATTR;

public class XORDATTRRowMapper<T> implements RowMapper<XORDATTR> {

	@Override
	public XORDATTR mapRow(ResultSet rs, int rowNum) throws SQLException {
		XORDATTR obj = new XORDATTR();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setVALUE(rs.getString("VALUE"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		obj.setORDATTR_ID(rs.getBigDecimal("ORDATTR_ID"));
		
		return obj;
	}

}
