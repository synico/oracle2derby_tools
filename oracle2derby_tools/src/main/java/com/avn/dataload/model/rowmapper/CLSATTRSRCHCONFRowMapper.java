package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CLSATTRSRCHCONF;

public class CLSATTRSRCHCONFRowMapper<T> implements RowMapper<CLSATTRSRCHCONF> {

	@Override
	public CLSATTRSRCHCONF mapRow(ResultSet rs, int rowNum) throws SQLException {
		CLSATTRSRCHCONF obj = new CLSATTRSRCHCONF();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setATTRNAME(rs.getString("ATTRNAME"));
		obj.setATTRTYPE_ID(rs.getString("ATTRTYPE_ID"));
		obj.setMASTERCATALOG_ID(rs.getBigDecimal("MASTERCATALOG_ID"));
		obj.setSRCHFIELDNAME(rs.getString("SRCHFIELDNAME"));
		obj.setTEMPTABLEPFIX(rs.getString("TEMPTABLEPFIX"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setSEPARATOR(rs.getString("SEPARATOR"));
		obj.setCLSATTRSRCHCONF_ID(rs.getBigDecimal("CLSATTRSRCHCONF_ID"));
		
		return obj;
	}

}
