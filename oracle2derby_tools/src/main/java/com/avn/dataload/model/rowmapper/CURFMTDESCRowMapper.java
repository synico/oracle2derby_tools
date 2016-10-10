package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CURFMTDESC;

public class CURFMTDESCRowMapper<T> implements RowMapper<CURFMTDESC> {

	@Override
	public CURFMTDESC mapRow(ResultSet rs, int rowNum) throws SQLException {
		CURFMTDESC obj = new CURFMTDESC();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setSETCCURR(rs.getString("SETCCURR"));
		obj.setRADIXPOINT(rs.getString("RADIXPOINT"));
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
		
		return obj;
	}

}
