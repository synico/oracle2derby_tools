package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CURFORMAT;

public class CURFORMATRowMapper<T> implements RowMapper<CURFORMAT> {

    private static final Logger log = Logger.getLogger(CURFORMATRowMapper.class);

	@Override
	public CURFORMAT mapRow(ResultSet rs, int rowNum) throws SQLException {
		CURFORMAT obj = new CURFORMAT();
		
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSETCCURR(rs.getString("SETCCURR"));
		obj.setNUMBRUSG_ID(rs.getBigDecimal("NUMBRUSG_ID"));
		obj.setROUNDINGMULTIPLE(rs.getBigDecimal("ROUNDINGMULTIPLE"));
		obj.setROUNDINGMETHOD(rs.getString("ROUNDINGMETHOD"));
		obj.setDECIMALPLACES(rs.getBigDecimal("DECIMALPLACES"));
		obj.setMINAPPROVEAMOUNT(rs.getBigDecimal("MINAPPROVEAMOUNT"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
