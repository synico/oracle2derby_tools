package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ORDERITEMS;

public class ORDERITEMSRowMapper<T> implements RowMapper<ORDERITEMS> {

    private static final Logger log = Logger.getLogger(ORDERITEMSRowMapper.class);

	@Override
	public ORDERITEMS mapRow(ResultSet rs, int rowNum) throws SQLException {
		ORDERITEMS obj = new ORDERITEMS();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setADDRESS_ID(rs.getBigDecimal("ADDRESS_ID"));
		obj.setSTATUS(rs.getString("STATUS"));
		obj.setLASTCREATE(rs.getTimestamp("LASTCREATE"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setCURRENCY(rs.getString("CURRENCY"));
		obj.setCOMMENTS(rs.getString("COMMENTS"));
		obj.setSHIPTAXAMOUNT(rs.getBigDecimal("SHIPTAXAMOUNT"));
		obj.setESTAVAILTIME(rs.getTimestamp("ESTAVAILTIME"));
		obj.setALLOCATIONGROUP(rs.getBigDecimal("ALLOCATIONGROUP"));
		obj.setBASECURRENCY(rs.getString("BASECURRENCY"));
		obj.setTRACKNUMBER(rs.getString("TRACKNUMBER"));
		obj.setPREPAREFLAGS(rs.getBigDecimal("PREPAREFLAGS"));
		obj.setCORRELATIONGROUP(rs.getBigDecimal("CORRELATIONGROUP"));
		obj.setPROMISEDAVAILTIME(rs.getTimestamp("PROMISEDAVAILTIME"));
		obj.setSHIPPINGOFFSET(rs.getBigDecimal("SHIPPINGOFFSET"));
		obj.setNEEDEDQUANTITY(rs.getBigDecimal("NEEDEDQUANTITY"));
		obj.setALLOCQUANTITY(rs.getBigDecimal("ALLOCQUANTITY"));
		obj.setALLOCFFMC_ID(rs.getBigDecimal("ALLOCFFMC_ID"));
		obj.setCONFIGURATIONID(rs.getString("CONFIGURATIONID"));
		obj.setSUPPLIERDATA(rs.getString("SUPPLIERDATA"));
		obj.setSUPPLIERPARTNUMBER(rs.getString("SUPPLIERPARTNUMBER"));
		obj.setAVAILQUANTITY(rs.getBigDecimal("AVAILQUANTITY"));
		obj.setISEXPEDITED(rs.getString("ISEXPEDITED"));
		obj.setREQUESTEDSHIPDATE(rs.getTimestamp("REQUESTEDSHIPDATE"));
		obj.setORDERITEMS_ID(rs.getBigDecimal("ORDERITEMS_ID"));
		obj.setTRADING_ID(rs.getBigDecimal("TRADING_ID"));
		obj.setQUANTITY(rs.getBigDecimal("QUANTITY"));
		obj.setITEMSPC_ID(rs.getBigDecimal("ITEMSPC_ID"));
		obj.setFFMCENTER_ID(rs.getBigDecimal("FFMCENTER_ID"));
		obj.setORDRELEASENUM(rs.getBigDecimal("ORDRELEASENUM"));
		obj.setSHIPMODE_ID(rs.getBigDecimal("SHIPMODE_ID"));
		obj.setDESCRIPTION(rs.getString("DESCRIPTION"));
		obj.setCATENTRY_ID(rs.getBigDecimal("CATENTRY_ID"));
		obj.setTERMCOND_ID(rs.getBigDecimal("TERMCOND_ID"));
		obj.setALLOCADDRESS_ID(rs.getBigDecimal("ALLOCADDRESS_ID"));
		obj.setLINEITEMTYPE(rs.getString("LINEITEMTYPE"));
		obj.setINVENTORYSTATUS(rs.getString("INVENTORYSTATUS"));
		obj.setFULFILLMENTSTATUS(rs.getString("FULFILLMENTSTATUS"));
		obj.setLASTALLOCUPDATE(rs.getTimestamp("LASTALLOCUPDATE"));
		obj.setTIMERELEASED(rs.getTimestamp("TIMERELEASED"));
		obj.setTIMESHIPPED(rs.getTimestamp("TIMESHIPPED"));
		obj.setTOTALPRODUCT(rs.getBigDecimal("TOTALPRODUCT"));
		obj.setTOTALADJUSTMENT(rs.getBigDecimal("TOTALADJUSTMENT"));
		obj.setOFFER_ID(rs.getBigDecimal("OFFER_ID"));
		obj.setPRICE(rs.getBigDecimal("PRICE"));
		obj.setPARTNUM(rs.getString("PARTNUM"));
		obj.setOUTPUTQ_ID(rs.getBigDecimal("OUTPUTQ_ID"));
		obj.setTAXAMOUNT(rs.getBigDecimal("TAXAMOUNT"));
		obj.setSHIPCHARGE(rs.getBigDecimal("SHIPCHARGE"));
		obj.setBASEPRICE(rs.getBigDecimal("BASEPRICE"));
		obj.setTRACKDATE(rs.getTimestamp("TRACKDATE"));
		obj.setTIECODE(rs.getBigDecimal("TIECODE"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
