package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XZfcCustmatKey;

public class XZfcCustmatKeyRowMapper<T> implements RowMapper<XZfcCustmatKey> {

	@Override
	public XZfcCustmatKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		XZfcCustmatKey obj = new XZfcCustmatKey();
		
		obj.setVtweg(rs.getString("VTWEG"));
		obj.setMandt(rs.getString("MANDT"));
		obj.setZzfpa(rs.getString("ZZFPA"));
		obj.setZzcma(rs.getString("ZZCMA"));
		obj.setVkorg(rs.getString("VKORG"));
		
		return obj;
	}

}
