package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PLCYTYCMIF;

public class PLCYTYCMIFRowMapper<T> implements RowMapper<PLCYTYCMIF> {

	@Override
	public PLCYTYCMIF mapRow(ResultSet rs, int rowNum) throws SQLException {
		PLCYTYCMIF obj = new PLCYTYCMIF();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPOLICYTYPE_ID(rs.getString("POLICYTYPE_ID"));
		obj.setBUSINESSCMDIF(rs.getString("BUSINESSCMDIF"));
		
		return obj;
	}

}
