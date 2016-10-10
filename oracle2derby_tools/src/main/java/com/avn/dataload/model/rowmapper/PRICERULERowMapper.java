package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PRICERULE;

public class PRICERULERowMapper<T> implements RowMapper<PRICERULE> {

	@Override
	public PRICERULE mapRow(ResultSet rs, int rowNum) throws SQLException {
		PRICERULE obj = new PRICERULE();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTATE(rs.getBigDecimal("STATE"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setTYPE(rs.getBigDecimal("TYPE"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setIDENTIFIER(rs.getString("IDENTIFIER"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setLASTUPDATETIME(rs.getTimestamp("LASTUPDATETIME"));
		obj.setSTARTTIME(rs.getTimestamp("STARTTIME"));
		obj.setENDTIME(rs.getTimestamp("ENDTIME"));
		obj.setVERSION(rs.getBigDecimal("VERSION"));
		obj.setPRICERULE_ID(rs.getBigDecimal("PRICERULE_ID"));
		obj.setCREATETIME(rs.getTimestamp("CREATETIME"));
		obj.setDEPENDENT(rs.getBigDecimal("DEPENDENT"));
		
		return obj;
	}

}
