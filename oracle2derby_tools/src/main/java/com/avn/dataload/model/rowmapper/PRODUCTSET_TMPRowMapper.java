package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PRODUCTSET_TMP;

public class PRODUCTSET_TMPRowMapper<T> implements RowMapper<PRODUCTSET_TMP> {

	@Override
	public PRODUCTSET_TMP mapRow(ResultSet rs, int rowNum) throws SQLException {
		PRODUCTSET_TMP obj = new PRODUCTSET_TMP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setNAME(rs.getString("NAME"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setPRODUCTSET_ID(rs.getBigDecimal("PRODUCTSET_ID"));
		obj.setXMLDEFINITION(rs.getClob("XMLDEFINITION"));
		obj.setPUBLISHTIME(rs.getTimestamp("PUBLISHTIME"));
		obj.setSTATIC(rs.getString("STATIC"));
		
		return obj;
	}

}
