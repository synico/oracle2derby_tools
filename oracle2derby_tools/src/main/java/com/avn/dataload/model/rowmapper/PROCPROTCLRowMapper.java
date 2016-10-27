package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PROCPROTCL;

public class PROCPROTCLRowMapper<T> implements RowMapper<PROCPROTCL> {

    private static final Logger log = Logger.getLogger(PROCPROTCLRowMapper.class);

	@Override
	public PROCPROTCL mapRow(ResultSet rs, int rowNum) throws SQLException {
		PROCPROTCL obj = new PROCPROTCL();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setPROCSYSNAME(rs.getString("PROCSYSNAME"));
		obj.setPROTOCOLNAME(rs.getString("PROTOCOLNAME"));
		obj.setTWOSTEPMODE(rs.getString("TWOSTEPMODE"));
		obj.setPROCPROTCLCOMMENT(rs.getString("PROCPROTCLCOMMENT"));
		obj.setCLASSIFDOMAIN(rs.getString("CLASSIFDOMAIN"));
		obj.setUOMSTANDARD(rs.getString("UOMSTANDARD"));
		obj.setPROCPROTCL_ID(rs.getBigDecimal("PROCPROTCL_ID"));
		obj.setAUTHTYPE(rs.getBigDecimal("AUTHTYPE"));
		obj.setVERSION(rs.getString("VERSION"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
