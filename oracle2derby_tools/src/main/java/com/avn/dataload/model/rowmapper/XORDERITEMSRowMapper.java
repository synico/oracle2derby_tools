package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XORDERITEMS;

public class XORDERITEMSRowMapper<T> implements RowMapper<XORDERITEMS> {

	@Override
	public XORDERITEMS mapRow(ResultSet rs, int rowNum) throws SQLException {
		XORDERITEMS obj = new XORDERITEMS();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setFIELD4(rs.getString("FIELD4"));
		obj.setFIELD5(rs.getString("FIELD5"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		obj.setFIELD7(rs.getString("FIELD7"));
		obj.setATTENTION(rs.getString("ATTENTION"));
		obj.setPHONENO(rs.getString("PHONENO"));
		obj.setEMAIL(rs.getString("EMAIL"));
		obj.setLEADTIME(rs.getBigDecimal("LEADTIME"));
		obj.setLEADTIME_UOM(rs.getString("LEADTIME_UOM"));
		obj.setSHIPCOMPLETE(rs.getString("SHIPCOMPLETE"));
		obj.setPARENTITEM_ID(rs.getBigDecimal("PARENTITEM_ID"));
		obj.setORDERITEMTYPE(rs.getString("ORDERITEMTYPE"));
		obj.setCUSTOMERREFNO(rs.getString("CUSTOMERREFNO"));
		obj.setAVN_AVLQUANTITY(rs.getBigDecimal("AVN_AVLQUANTITY"));
		obj.setBONDED_AVLQUANTITY(rs.getBigDecimal("BONDED_AVLQUANTITY"));
		obj.setFACTORY_AVLQUANTITY(rs.getBigDecimal("FACTORY_AVLQUANTITY"));
		obj.setORDERITEMS_ID(rs.getBigDecimal("ORDERITEMS_ID"));
		obj.setRFQ_ID(rs.getString("RFQ_ID"));
		obj.setFIELD6(rs.getString("FIELD6"));
		
		return obj;
	}

}
