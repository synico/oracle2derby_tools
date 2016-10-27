package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PRICERULE;

public class PRICERULERowMapper<T> implements RowMapper<PRICERULE> {

    private static final Logger log = Logger.getLogger(PRICERULERowMapper.class);

	@Override
	public PRICERULE mapRow(ResultSet rs, int rowNum) throws SQLException {
		PRICERULE obj = new PRICERULE();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setTYPE(rs.getBigDecimal("TYPE"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setSTATE(rs.getBigDecimal("STATE"));
		obj.setLASTUPDATETIME(rs.getTimestamp("LASTUPDATETIME"));
		obj.setPRICERULE_ID(rs.getBigDecimal("PRICERULE_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setCREATETIME(rs.getTimestamp("CREATETIME"));
		obj.setDEPENDENT(rs.getBigDecimal("DEPENDENT"));
		obj.setSTARTTIME(rs.getTimestamp("STARTTIME"));
		obj.setENDTIME(rs.getTimestamp("ENDTIME"));
		obj.setVERSION(rs.getBigDecimal("VERSION"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
