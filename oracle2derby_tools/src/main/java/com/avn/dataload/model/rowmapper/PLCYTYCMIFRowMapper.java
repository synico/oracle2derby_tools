package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PLCYTYCMIF;

public class PLCYTYCMIFRowMapper<T> implements RowMapper<PLCYTYCMIF> {

    private static final Logger log = Logger.getLogger(PLCYTYCMIFRowMapper.class);

	@Override
	public PLCYTYCMIF mapRow(ResultSet rs, int rowNum) throws SQLException {
		PLCYTYCMIF obj = new PLCYTYCMIF();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPOLICYTYPE_ID(rs.getString("POLICYTYPE_ID"));
		obj.setBUSINESSCMDIF(rs.getString("BUSINESSCMDIF"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
