package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.RTNREASON;

public class RTNREASONRowMapper<T> implements RowMapper<RTNREASON> {

	@Override
	public RTNREASON mapRow(ResultSet rs, int rowNum) throws SQLException {
		RTNREASON obj = new RTNREASON();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setCODE(rs.getString("CODE"));
		obj.setRTNREASON_ID(rs.getBigDecimal("RTNREASON_ID"));
		obj.setREASONTYPE(rs.getString("REASONTYPE"));
		
		return obj;
	}

}
