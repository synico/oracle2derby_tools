package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.POLICYCMD;

public class POLICYCMDRowMapper<T> implements RowMapper<POLICYCMD> {

    private static final Logger log = Logger.getLogger(POLICYCMDRowMapper.class);

	@Override
	public POLICYCMD mapRow(ResultSet rs, int rowNum) throws SQLException {
		POLICYCMD obj = new POLICYCMD();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setBUSINESSCMDCLASS(rs.getString("BUSINESSCMDCLASS"));
		obj.setPROPERTIES(rs.getString("PROPERTIES"));
		obj.setPOLICY_ID(rs.getBigDecimal("POLICY_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
