package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.POLICY;

public class POLICYRowMapper<T> implements RowMapper<POLICY> {

	@Override
	public POLICY mapRow(ResultSet rs, int rowNum) throws SQLException {
		POLICY obj = new POLICY();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPOLICYNAME(rs.getString("POLICYNAME"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setPROPERTIES(rs.getString("PROPERTIES"));
		obj.setSTARTTIME(rs.getTimestamp("STARTTIME"));
		obj.setENDTIME(rs.getTimestamp("ENDTIME"));
		obj.setPOLICYTYPE_ID(rs.getString("POLICYTYPE_ID"));
		obj.setPOLICY_ID(rs.getBigDecimal("POLICY_ID"));
		
		return obj;
	}

}
