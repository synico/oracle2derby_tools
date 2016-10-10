package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.POLICYCMD;

public class POLICYCMDRowMapper<T> implements RowMapper<POLICYCMD> {

	@Override
	public POLICYCMD mapRow(ResultSet rs, int rowNum) throws SQLException {
		POLICYCMD obj = new POLICYCMD();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPROPERTIES(rs.getString("PROPERTIES"));
		obj.setBUSINESSCMDCLASS(rs.getString("BUSINESSCMDCLASS"));
		obj.setPOLICY_ID(rs.getBigDecimal("POLICY_ID"));
		
		return obj;
	}

}
