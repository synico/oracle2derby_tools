package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ATTRDICTSRCHCONF;

public class ATTRDICTSRCHCONFRowMapper<T> implements RowMapper<ATTRDICTSRCHCONF> {

    private static final Logger log = Logger.getLogger(ATTRDICTSRCHCONFRowMapper.class);

	@Override
	public ATTRDICTSRCHCONF mapRow(ResultSet rs, int rowNum) throws SQLException {
		ATTRDICTSRCHCONF obj = new ATTRDICTSRCHCONF();
		
		obj.setATTR_ID(rs.getBigDecimal("ATTR_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setATTRTYPE_ID(rs.getString("ATTRTYPE_ID"));
		obj.setATTRDICTSRCHCNF_ID(rs.getBigDecimal("ATTRDICTSRCHCNF_ID"));
		obj.setMASTERCATALOG_ID(rs.getBigDecimal("MASTERCATALOG_ID"));
		obj.setSRCHFIELDNAME(rs.getString("SRCHFIELDNAME"));
		obj.setTEMPTABLEPFIX(rs.getString("TEMPTABLEPFIX"));
		obj.setSEPARATOR(rs.getString("SEPARATOR"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
