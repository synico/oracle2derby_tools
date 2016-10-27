package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CFCONDVAL;

public class CFCONDVALRowMapper<T> implements RowMapper<CFCONDVAL> {

    private static final Logger log = Logger.getLogger(CFCONDVALRowMapper.class);

	@Override
	public CFCONDVAL mapRow(ResultSet rs, int rowNum) throws SQLException {
		CFCONDVAL obj = new CFCONDVAL();
		
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setFIELD4(rs.getBigDecimal("FIELD4"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setFIELD5(rs.getBigDecimal("FIELD5"));
		obj.setCFCOND_ID(rs.getBigDecimal("CFCOND_ID"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setSTRINGVALUE(rs.getString("STRINGVALUE"));
		obj.setINTEGERVALUE(rs.getBigDecimal("INTEGERVALUE"));
		obj.setATTRVAL_ID(rs.getBigDecimal("ATTRVAL_ID"));
		obj.setFLOATVALUE(rs.getBigDecimal("FLOATVALUE"));
		obj.setCFCONDVAL_ID(rs.getBigDecimal("CFCONDVAL_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
