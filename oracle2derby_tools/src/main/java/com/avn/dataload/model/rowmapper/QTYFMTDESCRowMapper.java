package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.QTYFMTDESC;

public class QTYFMTDESCRowMapper<T> implements RowMapper<QTYFMTDESC> {

	@Override
	public QTYFMTDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		QTYFMTDESC obj = new QTYFMTDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setQTYUNIT_ID(rs.getString("QTYUNIT_ID"));
		obj.setRADIXPOINT(rs.getString("RADIXPOINT"));
		obj.setNUMBRUSG_ID(rs.getBigDecimal("NUMBRUSG_ID"));
		obj.setDISPLAYLOCALE(rs.getString("DISPLAYLOCALE"));
		obj.setGROUPINGCHAR(rs.getString("GROUPINGCHAR"));
		obj.setNUMBERPATTERN(rs.getString("NUMBERPATTERN"));
		obj.setUNITPREFIXPOS(rs.getString("UNITPREFIXPOS"));
		obj.setUNITSUFFIXPOS(rs.getString("UNITSUFFIXPOS"));
		obj.setCUSTOMIZEDQTYSTR(rs.getString("CUSTOMIZEDQTYSTR"));
		obj.setUNITPREFIXNEG(rs.getString("UNITPREFIXNEG"));
		obj.setUNITSUFFIXNEG(rs.getString("UNITSUFFIXNEG"));
		obj.setUNITSYMBOL(rs.getString("UNITSYMBOL"));
		
		return obj;
	}

}
