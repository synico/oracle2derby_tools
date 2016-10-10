package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ATTRDICTSRCHCONF;

public class ATTRDICTSRCHCONFRowMapper<T> implements RowMapper<ATTRDICTSRCHCONF> {

	@Override
	public ATTRDICTSRCHCONF mapRow(ResultSet rs, int rowNum) throws SQLException {
		ATTRDICTSRCHCONF obj = new ATTRDICTSRCHCONF();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setATTRTYPE_ID(rs.getString("ATTRTYPE_ID"));
		obj.setATTRDICTSRCHCNF_ID(rs.getBigDecimal("ATTRDICTSRCHCNF_ID"));
		obj.setMASTERCATALOG_ID(rs.getBigDecimal("MASTERCATALOG_ID"));
		obj.setSRCHFIELDNAME(rs.getString("SRCHFIELDNAME"));
		obj.setTEMPTABLEPFIX(rs.getString("TEMPTABLEPFIX"));
		obj.setATTR_ID(rs.getBigDecimal("ATTR_ID"));
		obj.setSEPARATOR(rs.getString("SEPARATOR"));
		
		return obj;
	}

}
