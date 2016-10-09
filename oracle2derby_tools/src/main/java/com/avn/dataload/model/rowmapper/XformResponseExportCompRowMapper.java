package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XformResponseExportComp;

public class XformResponseExportCompRowMapper<T> implements RowMapper<XformResponseExportComp> {

	@Override
	public XformResponseExportComp mapRow(ResultSet rs, int rowNum) throws SQLException {
		XformResponseExportComp obj = new XformResponseExportComp();
		
		obj.setAddressId(rs.getBigDecimal("ADDRESS_ID"));
		obj.setOrdersId(rs.getBigDecimal("ORDERS_ID"));
		
		return obj;
	}

}
