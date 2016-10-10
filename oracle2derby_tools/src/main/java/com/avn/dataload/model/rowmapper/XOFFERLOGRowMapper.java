package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XOFFERLOG;

public class XOFFERLOGRowMapper<T> implements RowMapper<XOFFERLOG> {

	@Override
	public XOFFERLOG mapRow(ResultSet rs, int rowNum) throws SQLException {
		XOFFERLOG obj = new XOFFERLOG();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCURRENCY(rs.getString("CURRENCY"));
		obj.setSTARTDATE(rs.getString("STARTDATE"));
		obj.setENDDATE(rs.getString("ENDDATE"));
		obj.setQUANTITY(rs.getString("QUANTITY"));
		obj.setCUSTOMERID(rs.getString("CUSTOMERID"));
		obj.setPRICE(rs.getString("PRICE"));
		obj.setPROCESSED(rs.getString("PROCESSED"));
		obj.setUOM(rs.getString("UOM"));
		obj.setPRICELISTNAME(rs.getString("PRICELISTNAME"));
		obj.setCATENTRYPARTNUMBER(rs.getString("CATENTRYPARTNUMBER"));
		obj.setMINQUANTITY(rs.getString("MINQUANTITY"));
		obj.setMAXQUANTITY(rs.getString("MAXQUANTITY"));
		obj.setPRICEPERQUANTITY(rs.getString("PRICEPERQUANTITY"));
		
		return obj;
	}

}
