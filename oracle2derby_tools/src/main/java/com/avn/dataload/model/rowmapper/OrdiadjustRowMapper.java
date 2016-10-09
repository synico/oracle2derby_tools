package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Ordiadjust;

public class OrdiadjustRowMapper<T> implements RowMapper<Ordiadjust> {

	@Override
	public Ordiadjust mapRow(ResultSet rs, int rowNum) throws SQLException {
		Ordiadjust obj = new Ordiadjust();
		
		obj.setAmount(rs.getBigDecimal("AMOUNT"));
		obj.setOrdadjustId(rs.getBigDecimal("ORDADJUST_ID"));
		obj.setOrderitemsId(rs.getBigDecimal("ORDERITEMS_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setOrdiadjustId(rs.getBigDecimal("ORDIADJUST_ID"));
		
		return obj;
	}

}
