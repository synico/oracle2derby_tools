package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CALUSAGE;

public class CALUSAGERowMapper<T> implements RowMapper<CALUSAGE> {

    private static final Logger log = Logger.getLogger(CALUSAGERowMapper.class);

	@Override
	public CALUSAGE mapRow(ResultSet rs, int rowNum) throws SQLException {
		CALUSAGE obj = new CALUSAGE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setCALUSAGE_ID(rs.getBigDecimal("CALUSAGE_ID"));
		obj.setSTRELTYPNAMECFG(rs.getString("STRELTYPNAMECFG"));
		obj.setSTRELTYPNAMERT(rs.getString("STRELTYPNAMERT"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
