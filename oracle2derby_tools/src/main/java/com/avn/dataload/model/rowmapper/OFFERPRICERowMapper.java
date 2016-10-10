package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.OFFERPRICE;

public class OFFERPRICERowMapper<T> implements RowMapper<OFFERPRICE> {

	@Override
	public OFFERPRICE mapRow(ResultSet rs, int rowNum) throws SQLException {
		OFFERPRICE obj = new OFFERPRICE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setCURRENCY(rs.getString("CURRENCY"));
		obj.setOFFER_ID(rs.getBigDecimal("OFFER_ID"));
		obj.setPRICE(rs.getBigDecimal("PRICE"));
		obj.setCOMPAREPRICE(rs.getBigDecimal("COMPAREPRICE"));
		
		return obj;
	}

}
