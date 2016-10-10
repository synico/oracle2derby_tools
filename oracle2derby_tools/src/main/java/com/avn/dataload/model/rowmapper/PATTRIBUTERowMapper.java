package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PATTRIBUTE;

public class PATTRIBUTERowMapper<T> implements RowMapper<PATTRIBUTE> {

	@Override
	public PATTRIBUTE mapRow(ResultSet rs, int rowNum) throws SQLException {
		PATTRIBUTE obj = new PATTRIBUTE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setATTRTYPE_ID(rs.getString("ATTRTYPE_ID"));
		obj.setPATTRIBUTE_ID(rs.getBigDecimal("PATTRIBUTE_ID"));
		obj.setACCESSBEANNAME(rs.getString("ACCESSBEANNAME"));
		obj.setENCRYPTFLAG(rs.getBigDecimal("ENCRYPTFLAG"));
		
		return obj;
	}

}
