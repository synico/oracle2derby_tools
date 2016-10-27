package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.QTYFMTDESC;

public class QTYFMTDESCRowMapper<T> implements RowMapper<QTYFMTDESC> {

    private static final Logger log = Logger.getLogger(QTYFMTDESCRowMapper.class);

	@Override
	public QTYFMTDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		QTYFMTDESC obj = new QTYFMTDESC();
		
		obj.setQTYUNIT_ID(rs.getString("QTYUNIT_ID"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setCUSTOMIZEDQTYSTR(rs.getString("CUSTOMIZEDQTYSTR"));
		obj.setUNITPREFIXNEG(rs.getString("UNITPREFIXNEG"));
		obj.setUNITSUFFIXNEG(rs.getString("UNITSUFFIXNEG"));
		obj.setUNITSYMBOL(rs.getString("UNITSYMBOL"));
		obj.setNUMBRUSG_ID(rs.getBigDecimal("NUMBRUSG_ID"));
		obj.setDISPLAYLOCALE(rs.getString("DISPLAYLOCALE"));
		obj.setGROUPINGCHAR(rs.getString("GROUPINGCHAR"));
		obj.setNUMBERPATTERN(rs.getString("NUMBERPATTERN"));
		obj.setRADIXPOINT(rs.getString("RADIXPOINT"));
		obj.setUNITPREFIXPOS(rs.getString("UNITPREFIXPOS"));
		obj.setUNITSUFFIXPOS(rs.getString("UNITSUFFIXPOS"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
