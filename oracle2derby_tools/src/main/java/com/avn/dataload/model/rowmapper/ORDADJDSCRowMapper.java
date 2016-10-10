package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORDADJDSC;

public class ORDADJDSCRowMapper<T> implements RowMapper<ORDADJDSC> {

	@Override
	public ORDADJDSC mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORDADJDSC obj = new ORDADJDSC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setORDADJUST_ID(rs.getBigDecimal("ORDADJUST_ID"));
		
		return obj;
	}

}
