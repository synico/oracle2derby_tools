package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XERPPARTNUMBER;

public class XERPPARTNUMBERRowMapper<T> implements RowMapper<XERPPARTNUMBER> {

	@Override
	public XERPPARTNUMBER mapRow(ResultSet rs, int rowNum) throws SQLException {
		XERPPARTNUMBER obj = new XERPPARTNUMBER();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCATENTRY_ID(rs.getBigDecimal("CATENTRY_ID"));
		obj.setDIVISIONCODE(rs.getString("DIVISIONCODE"));
		obj.setERPPARTNUMBER(rs.getString("ERPPARTNUMBER"));
		obj.setMFCODE(rs.getString("MFCODE"));
		obj.setISACTIVE(rs.getString("ISACTIVE"));
		
		return obj;
	}

}
