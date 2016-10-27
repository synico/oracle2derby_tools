package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ATCHASTLG;

public class ATCHASTLGRowMapper<T> implements RowMapper<ATCHASTLG> {

    private static final Logger log = Logger.getLogger(ATCHASTLGRowMapper.class);

	@Override
	public ATCHASTLG mapRow(ResultSet rs, int rowNum) throws SQLException {
		ATCHASTLG obj = new ATCHASTLG();
		
		obj.setATCHAST_ID(rs.getBigDecimal("ATCHAST_ID"));
		obj.setATCHASTLG_ID(rs.getBigDecimal("ATCHASTLG_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
