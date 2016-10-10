package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.SUBORDERS;

public class SUBORDERSRowMapper<T> implements RowMapper<SUBORDERS> {

	@Override
	public SUBORDERS mapRow(ResultSet rs, int rowNum) throws SQLException {
		SUBORDERS obj = new SUBORDERS();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCURRENCY(rs.getString("CURRENCY"));
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setADDRESS_ID(rs.getBigDecimal("ADDRESS_ID"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setCOUNTRY(rs.getString("COUNTRY"));
		obj.setTOTALTAX(rs.getBigDecimal("TOTALTAX"));
		obj.setORDERS_ID(rs.getBigDecimal("ORDERS_ID"));
		obj.setSUBORDER_ID(rs.getBigDecimal("SUBORDER_ID"));
		obj.setTOTALPRODUCT(rs.getBigDecimal("TOTALPRODUCT"));
		obj.setTOTALADJUSTMENT(rs.getBigDecimal("TOTALADJUSTMENT"));
		obj.setTOTALSHIPPING(rs.getBigDecimal("TOTALSHIPPING"));
		obj.setTOTALTAXSHIPPING(rs.getBigDecimal("TOTALTAXSHIPPING"));
		
		return obj;
	}

}
