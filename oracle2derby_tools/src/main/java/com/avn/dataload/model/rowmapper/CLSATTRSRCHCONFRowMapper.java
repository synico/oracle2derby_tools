package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CLSATTRSRCHCONF;

public class CLSATTRSRCHCONFRowMapper<T> implements RowMapper<CLSATTRSRCHCONF> {

    private static final Logger log = Logger.getLogger(CLSATTRSRCHCONFRowMapper.class);

	@Override
	public CLSATTRSRCHCONF mapRow(ResultSet rs, int rowNum) throws SQLException {
		CLSATTRSRCHCONF obj = new CLSATTRSRCHCONF();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setATTRNAME(rs.getString("ATTRNAME"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		obj.setATTRTYPE_ID(rs.getString("ATTRTYPE_ID"));
		obj.setMASTERCATALOG_ID(rs.getBigDecimal("MASTERCATALOG_ID"));
		obj.setSRCHFIELDNAME(rs.getString("SRCHFIELDNAME"));
		obj.setTEMPTABLEPFIX(rs.getString("TEMPTABLEPFIX"));
		obj.setSEPARATOR(rs.getString("SEPARATOR"));
		obj.setCLSATTRSRCHCONF_ID(rs.getBigDecimal("CLSATTRSRCHCONF_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
