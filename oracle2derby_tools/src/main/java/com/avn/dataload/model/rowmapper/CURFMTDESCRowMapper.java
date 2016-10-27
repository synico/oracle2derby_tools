package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CURFMTDESC;

public class CURFMTDESCRowMapper<T> implements RowMapper<CURFMTDESC> {

    private static final Logger log = Logger.getLogger(CURFMTDESCRowMapper.class);

	@Override
	public CURFMTDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		CURFMTDESC obj = new CURFMTDESC();
		
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setSETCCURR(rs.getString("SETCCURR"));
		obj.setNUMBRUSG_ID(rs.getBigDecimal("NUMBRUSG_ID"));
		obj.setCURRENCYSYMBOL(rs.getString("CURRENCYSYMBOL"));
		obj.setCUSTOMIZEDCURRSTR(rs.getString("CUSTOMIZEDCURRSTR"));
		obj.setCURRENCYPREFIXPOS(rs.getString("CURRENCYPREFIXPOS"));
		obj.setCURRENCYSUFFIXPOS(rs.getString("CURRENCYSUFFIXPOS"));
		obj.setDISPLAYLOCALE(rs.getString("DISPLAYLOCALE"));
		obj.setCURRENCYPREFIXNEG(rs.getString("CURRENCYPREFIXNEG"));
		obj.setCURRENCYSUFFIXNEG(rs.getString("CURRENCYSUFFIXNEG"));
		obj.setGROUPINGCHAR(rs.getString("GROUPINGCHAR"));
		obj.setNUMBERPATTERN(rs.getString("NUMBERPATTERN"));
		obj.setRADIXPOINT(rs.getString("RADIXPOINT"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
