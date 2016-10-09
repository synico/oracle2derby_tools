package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Ordpayinfo;

public class OrdpayinfoRowMapper<T> implements RowMapper<Ordpayinfo> {

	@Override
	public Ordpayinfo mapRow(ResultSet rs, int rowNum) throws SQLException {
		Ordpayinfo obj = new Ordpayinfo();
		
		obj.setName(rs.getString("NAME"));
		obj.setValue(rs.getString("VALUE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setOrdpayinfoId(rs.getBigDecimal("ORDPAYINFO_ID"));
		obj.setOrdersId(rs.getBigDecimal("ORDERS_ID"));
		
		return obj;
	}

}
