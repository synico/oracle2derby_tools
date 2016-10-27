package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PPCEXTDATA;

public class PPCEXTDATARowMapper<T> implements RowMapper<PPCEXTDATA> {

    private static final Logger log = Logger.getLogger(PPCEXTDATARowMapper.class);

	@Override
	public PPCEXTDATA mapRow(ResultSet rs, int rowNum) throws SQLException {
		PPCEXTDATA obj = new PPCEXTDATA();
		
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setSEARCHVALUE(rs.getString("SEARCHVALUE"));
		obj.setPPCBATCH_ID(rs.getBigDecimal("PPCBATCH_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPPCEXTDATA_ID(rs.getBigDecimal("PPCEXTDATA_ID"));
		obj.setPPCPAYINST_ID(rs.getBigDecimal("PPCPAYINST_ID"));
		obj.setPPCPAYTRAN_ID(rs.getBigDecimal("PPCPAYTRAN_ID"));
		obj.setATTRIBUTETYPE(rs.getBigDecimal("ATTRIBUTETYPE"));
		obj.setATTRIBUTENAME(rs.getString("ATTRIBUTENAME"));
		obj.setENCRYPTED(rs.getBigDecimal("ENCRYPTED"));
		obj.setDATAVALUE(rs.getString("DATAVALUE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
