package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.MBRATTRVAL;

public class MBRATTRVALRowMapper<T> implements RowMapper<MBRATTRVAL> {

	@Override
	public MBRATTRVAL mapRow(ResultSet rs, int rowNum) throws SQLException {
		MBRATTRVAL obj = new MBRATTRVAL();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setATTRTYPE_ID(rs.getString("ATTRTYPE_ID"));
		obj.setSTRINGVALUE(rs.getString("STRINGVALUE"));
		obj.setINTEGERVALUE(rs.getBigDecimal("INTEGERVALUE"));
		obj.setFLOATVALUE(rs.getBigDecimal("FLOATVALUE"));
		obj.setMBRATTR_ID(rs.getBigDecimal("MBRATTR_ID"));
		obj.setMBRATTRVAL_ID(rs.getBigDecimal("MBRATTRVAL_ID"));
		obj.setDATETIMEVALUE(rs.getTimestamp("DATETIMEVALUE"));
		
		return obj;
	}

}
