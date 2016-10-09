package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XZfcCustmat;

public class XZfcCustmatRowMapper<T> implements RowMapper<XZfcCustmat> {

	@Override
	public XZfcCustmat mapRow(ResultSet rs, int rowNum) throws SQLException {
		XZfcCustmat obj = new XZfcCustmat();
		
		obj.setReserving(rs.getString("RESERVING"));
		obj.setErzeit(rs.getDate("ERZEIT"));
		obj.setConsignment(rs.getString("CONSIGNMENT"));
		obj.setUpdatedFlag(rs.getString("UPDATED_FLAG"));
		
		return obj;
	}

}
