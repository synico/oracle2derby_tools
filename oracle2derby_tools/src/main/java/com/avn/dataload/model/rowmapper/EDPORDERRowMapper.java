package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.EDPORDER;

public class EDPORDERRowMapper<T> implements RowMapper<EDPORDER> {

    private static final Logger log = Logger.getLogger(EDPORDERRowMapper.class);

	@Override
	public EDPORDER mapRow(ResultSet rs, int rowNum) throws SQLException {
		EDPORDER obj = new EDPORDER();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setSTORE_ID(rs.getBigDecimal("STORE_ID"));
		obj.setCURRENCY(rs.getString("CURRENCY"));
		obj.setORDER_ID(rs.getBigDecimal("ORDER_ID"));
		obj.setBLOCKED(rs.getBigDecimal("BLOCKED"));
		obj.setTOTALAMOUNT(rs.getBigDecimal("TOTALAMOUNT"));
		obj.setEDPORDER_ID(rs.getBigDecimal("EDPORDER_ID"));
		obj.setINITIALAMOUNT(rs.getBigDecimal("INITIALAMOUNT"));
		obj.setBGJOBSTATUS(rs.getBigDecimal("BGJOBSTATUS"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
