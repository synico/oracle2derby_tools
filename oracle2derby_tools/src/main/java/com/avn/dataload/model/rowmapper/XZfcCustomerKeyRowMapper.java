package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XZfcCustomerKey;

public class XZfcCustomerKeyRowMapper<T> implements RowMapper<XZfcCustomerKey> {

	@Override
	public XZfcCustomerKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		XZfcCustomerKey obj = new XZfcCustomerKey();
		
		obj.setVtweg(rs.getString("VTWEG"));
		obj.setMandt(rs.getString("MANDT"));
		obj.setZzfpa(rs.getString("ZZFPA"));
		obj.setVkorg(rs.getString("VKORG"));
		
		return obj;
	}

}
