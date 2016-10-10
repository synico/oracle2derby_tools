package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CURFORMAT;

public class CURFORMATRowMapper<T> implements RowMapper<CURFORMAT> {

	@Override
	public CURFORMAT mapRow(ResultSet rs, int rowNum) throws SQLException {
		CURFORMAT obj = new CURFORMAT();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setSETCCURR(rs.getString("SETCCURR"));
		obj.setNUMBRUSG_ID(rs.getBigDecimal("NUMBRUSG_ID"));
		obj.setROUNDINGMULTIPLE(rs.getBigDecimal("ROUNDINGMULTIPLE"));
		obj.setROUNDINGMETHOD(rs.getString("ROUNDINGMETHOD"));
		obj.setDECIMALPLACES(rs.getBigDecimal("DECIMALPLACES"));
		obj.setMINAPPROVEAMOUNT(rs.getBigDecimal("MINAPPROVEAMOUNT"));
		
		return obj;
	}

}
