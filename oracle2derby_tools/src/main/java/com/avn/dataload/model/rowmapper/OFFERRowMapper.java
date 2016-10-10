package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.OFFER;

public class OFFERRowMapper<T> implements RowMapper<OFFER> {

	@Override
	public OFFER mapRow(ResultSet rs, int rowNum) throws SQLException {
		OFFER obj = new OFFER();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setIDENTIFIER(rs.getBigDecimal("IDENTIFIER"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setQTYUNIT_ID(rs.getString("QTYUNIT_ID"));
		obj.setOID(rs.getString("OID"));
		obj.setPUBLISHED(rs.getBigDecimal("PUBLISHED"));
		obj.setSTARTDATE(rs.getTimestamp("STARTDATE"));
		obj.setENDDATE(rs.getTimestamp("ENDDATE"));
		obj.setFLAGS(rs.getBigDecimal("FLAGS"));
		obj.setPRECEDENCE(rs.getBigDecimal("PRECEDENCE"));
		obj.setCATENTRY_ID(rs.getBigDecimal("CATENTRY_ID"));
		obj.setTRADEPOSCN_ID(rs.getBigDecimal("TRADEPOSCN_ID"));
		obj.setOFFER_ID(rs.getBigDecimal("OFFER_ID"));
		obj.setMINIMUMQUANTITY(rs.getBigDecimal("MINIMUMQUANTITY"));
		obj.setMAXIMUMQUANTITY(rs.getBigDecimal("MAXIMUMQUANTITY"));
		
		return obj;
	}

}
