package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORDERS;

public class ORDERSRowMapper<T> implements RowMapper<ORDERS> {

    private static final Logger log = Logger.getLogger(ORDERSRowMapper.class);

	@Override
	public ORDERS mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORDERS obj = new ORDERS();
		
		obj.setTRANSFERSTATUS(rs.getBigDecimal("TRANSFERSTATUS"));
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setTYPE(rs.getString("TYPE"));
		obj.setADDRESS_ID(rs.getBigDecimal("ADDRESS_ID"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setSTATUS(rs.getString("STATUS"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setORGENTITY_ID(rs.getBigDecimal("ORGENTITY_ID"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setCURRENCY(rs.getString("CURRENCY"));
		obj.setCOMMENTS(rs.getString("COMMENTS"));
		obj.setBLOCKED(rs.getBigDecimal("BLOCKED"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setBUSCHN_ID(rs.getBigDecimal("BUSCHN_ID"));
		obj.setBUYERPO_ID(rs.getBigDecimal("BUYERPO_ID"));
		obj.setNOTIFICATIONID(rs.getBigDecimal("NOTIFICATIONID"));
		obj.setTOTALPRODUCT(rs.getBigDecimal("TOTALPRODUCT"));
		obj.setTOTALADJUSTMENT(rs.getBigDecimal("TOTALADJUSTMENT"));
		obj.setORMORDER(rs.getString("ORMORDER"));
		obj.setTOTALTAX(rs.getBigDecimal("TOTALTAX"));
		obj.setLOCKED(rs.getString("LOCKED"));
		obj.setTIMEPLACED(rs.getTimestamp("TIMEPLACED"));
		obj.setEDITOR_ID(rs.getBigDecimal("EDITOR_ID"));
		obj.setSOURCEID(rs.getBigDecimal("SOURCEID"));
		obj.setEXPIREDATE(rs.getTimestamp("EXPIREDATE"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		obj.setTOTALSHIPPING(rs.getBigDecimal("TOTALSHIPPING"));
		obj.setTOTALTAXSHIPPING(rs.getBigDecimal("TOTALTAXSHIPPING"));
		obj.setPROVIDERORDERNUM(rs.getBigDecimal("PROVIDERORDERNUM"));
		obj.setSHIPASCOMPLETE(rs.getString("SHIPASCOMPLETE"));
		obj.setORDCHNLTYP_ID(rs.getBigDecimal("ORDCHNLTYP_ID"));
		obj.setOPSYSTEM_ID(rs.getBigDecimal("OPSYSTEM_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
