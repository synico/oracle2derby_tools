package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XSapSalesdocItemKey;

public class XSapSalesdocItemKeyRowMapper<T> implements RowMapper<XSapSalesdocItemKey> {

	@Override
	public XSapSalesdocItemKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		XSapSalesdocItemKey obj = new XSapSalesdocItemKey();
		
		obj.setVbakVbeln(rs.getString("VBAK_VBELN"));
		obj.setVbapPosnr(rs.getString("VBAP_POSNR"));
		
		return obj;
	}

}
