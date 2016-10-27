package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XERPPARTNUMBER;

public class XERPPARTNUMBERRowMapper<T> implements RowMapper<XERPPARTNUMBER> {

    private static final Logger log = Logger.getLogger(XERPPARTNUMBERRowMapper.class);

	@Override
	public XERPPARTNUMBER mapRow(ResultSet rs, int rowNum) throws SQLException {
		XERPPARTNUMBER obj = new XERPPARTNUMBER();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDIVISIONCODE(rs.getString("DIVISIONCODE"));
		obj.setERPPARTNUMBER(rs.getString("ERPPARTNUMBER"));
		obj.setMFCODE(rs.getString("MFCODE"));
		obj.setISACTIVE(rs.getString("ISACTIVE"));
		obj.setCATENTRY_ID(rs.getBigDecimal("CATENTRY_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
