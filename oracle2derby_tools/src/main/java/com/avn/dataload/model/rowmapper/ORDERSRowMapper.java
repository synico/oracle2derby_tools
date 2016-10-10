package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORDERS;

public class ORDERSRowMapper<T> implements RowMapper<ORDERS> {

	@Override
	public ORDERS mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORDERS obj = new ORDERS();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setCURRENCY(rs.getString("CURRENCY"));
		obj.setCOMMENTS(rs.getString("COMMENTS"));
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setTYPE(rs.getString("TYPE"));
		obj.setADDRESS_ID(rs.getBigDecimal("ADDRESS_ID"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setSTATUS(rs.getString("STATUS"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setORGENTITY_ID(rs.getBigDecimal("ORGENTITY_ID"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setBUSCHN_ID(rs.getBigDecimal("BUSCHN_ID"));
		obj.setBUYERPO_ID(rs.getBigDecimal("BUYERPO_ID"));
		obj.setORMORDER(rs.getString("ORMORDER"));
		obj.setTOTALTAX(rs.getBigDecimal("TOTALTAX"));
		obj.setLOCKED(rs.getString("LOCKED"));
		obj.setTIMEPLACED(rs.getTimestamp("TIMEPLACED"));
		obj.setEDITOR_ID(rs.getBigDecimal("EDITOR_ID"));
		obj.setSOURCEID(rs.getBigDecimal("SOURCEID"));
		obj.setEXPIREDATE(rs.getTimestamp("EXPIREDATE"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		obj.setPROVIDERORDERNUM(rs.getBigDecimal("PROVIDERORDERNUM"));
		obj.setSHIPASCOMPLETE(rs.getString("SHIPASCOMPLETE"));
		obj.setORDCHNLTYP_ID(rs.getBigDecimal("ORDCHNLTYP_ID"));
		obj.setOPSYSTEM_ID(rs.getBigDecimal("OPSYSTEM_ID"));
		obj.setTRANSFERSTATUS(rs.getBigDecimal("TRANSFERSTATUS"));
		obj.setBLOCKED(rs.getBigDecimal("BLOCKED"));
		obj.setNOTIFICATIONID(rs.getBigDecimal("NOTIFICATIONID"));
		obj.setTOTALPRODUCT(rs.getBigDecimal("TOTALPRODUCT"));
		obj.setTOTALADJUSTMENT(rs.getBigDecimal("TOTALADJUSTMENT"));
		obj.setTOTALSHIPPING(rs.getBigDecimal("TOTALSHIPPING"));
		obj.setTOTALTAXSHIPPING(rs.getBigDecimal("TOTALTAXSHIPPING"));
		
		return obj;
	}

}
