package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xordattr;

public class XordattrRowMapper<T> implements RowMapper<Xordattr> {

	@Override
	public Xordattr mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xordattr obj = new Xordattr();
		
		obj.setName(rs.getString("NAME"));
		obj.setValue(rs.getString("VALUE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setOrdersId(rs.getBigDecimal("ORDERS_ID"));
		obj.setOrdattrId(rs.getBigDecimal("ORDATTR_ID"));
		
		return obj;
	}

}
