package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CFCONDVAL;

public class CFCONDVALRowMapper<T> implements RowMapper<CFCONDVAL> {

	@Override
	public CFCONDVAL mapRow(ResultSet rs, int rowNum) throws SQLException {
		CFCONDVAL obj = new CFCONDVAL();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setSTRINGVALUE(rs.getString("STRINGVALUE"));
		obj.setINTEGERVALUE(rs.getBigDecimal("INTEGERVALUE"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setFIELD4(rs.getBigDecimal("FIELD4"));
		obj.setATTRVAL_ID(rs.getBigDecimal("ATTRVAL_ID"));
		obj.setFLOATVALUE(rs.getBigDecimal("FLOATVALUE"));
		obj.setCFCONDVAL_ID(rs.getBigDecimal("CFCONDVAL_ID"));
		obj.setFIELD5(rs.getBigDecimal("FIELD5"));
		obj.setCFCOND_ID(rs.getBigDecimal("CFCOND_ID"));
		
		return obj;
	}

}
