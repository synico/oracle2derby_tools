package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STGSITETAB;

public class STGSITETABRowMapper<T> implements RowMapper<STGSITETAB> {

    private static final Logger log = Logger.getLogger(STGSITETABRowMapper.class);

	@Override
	public STGSITETAB mapRow(ResultSet rs, int rowNum) throws SQLException {
		STGSITETAB obj = new STGSITETAB();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTABNBR(rs.getBigDecimal("TABNBR"));
		obj.setTABNAME(rs.getString("TABNAME"));
		obj.setUPDATABLE_UK_COL(rs.getString("UPDATABLE_UK_COL"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
