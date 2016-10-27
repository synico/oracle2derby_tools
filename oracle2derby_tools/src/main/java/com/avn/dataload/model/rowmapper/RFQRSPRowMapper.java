package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.RFQRSP;

public class RFQRSPRowMapper<T> implements RowMapper<RFQRSP> {

    private static final Logger log = Logger.getLogger(RFQRSPRowMapper.class);

	@Override
	public RFQRSP mapRow(ResultSet rs, int rowNum) throws SQLException {
		RFQRSP obj = new RFQRSP();
		
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setFIELD4(rs.getString("FIELD4"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setNAME(rs.getString("NAME"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setSTATE(rs.getBigDecimal("STATE"));
		obj.setFIELD5(rs.getTimestamp("FIELD5"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setMAJORVERSION(rs.getBigDecimal("MAJORVERSION"));
		obj.setMINORVERSION(rs.getBigDecimal("MINORVERSION"));
		obj.setTFTRADENG_ID(rs.getBigDecimal("TFTRADENG_ID"));
		obj.setVERSIONFLAGS(rs.getBigDecimal("VERSIONFLAGS"));
		obj.setREJECTREASON(rs.getString("REJECTREASON"));
		obj.setACCEPTACTION(rs.getBigDecimal("ACCEPTACTION"));
		obj.setEXTRFQRESPONSENUM(rs.getString("EXTRFQRESPONSENUM"));
		obj.setCREATETIME(rs.getTimestamp("CREATETIME"));
		obj.setRFQ_ID(rs.getBigDecimal("RFQ_ID"));
		obj.setUPDATETIME(rs.getTimestamp("UPDATETIME"));
		obj.setCANCELTIME(rs.getTimestamp("CANCELTIME"));
		obj.setFIELD6(rs.getTimestamp("FIELD6"));
		obj.setREMARKS(rs.getString("REMARKS"));
		obj.setRFQRSP_ID(rs.getBigDecimal("RFQRSP_ID"));
		obj.setPREVRSP(rs.getBigDecimal("PREVRSP"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
