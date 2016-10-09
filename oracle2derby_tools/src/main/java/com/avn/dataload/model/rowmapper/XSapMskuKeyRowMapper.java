package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XSapMskuKey;

public class XSapMskuKeyRowMapper<T> implements RowMapper<XSapMskuKey> {

	@Override
	public XSapMskuKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		XSapMskuKey obj = new XSapMskuKey();
		
		obj.setMskuKunnr(rs.getString("MSKU_KUNNR"));
		obj.setMskuMatnr(rs.getString("MSKU_MATNR"));
		obj.setMskuWerks(rs.getString("MSKU_WERKS"));
		
		return obj;
	}

}
