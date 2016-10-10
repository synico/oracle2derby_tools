package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CURCONVERT;

public class CURCONVERTRowMapper<T> implements RowMapper<CURCONVERT> {

	@Override
	public CURCONVERT mapRow(ResultSet rs, int rowNum) throws SQLException {
		CURCONVERT obj = new CURCONVERT();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setFROMCURR(rs.getString("FROMCURR"));
		obj.setTOCURR(rs.getString("TOCURR"));
		obj.setFACTOR(rs.getBigDecimal("FACTOR"));
		obj.setUPDATABLE(rs.getString("UPDATABLE"));
		obj.setMULTIPLYORDIVIDE(rs.getString("MULTIPLYORDIVIDE"));
		obj.setBIDIRECTIONAL(rs.getString("BIDIRECTIONAL"));
		obj.setCURCONVERT_ID(rs.getBigDecimal("CURCONVERT_ID"));
		
		return obj;
	}

}
