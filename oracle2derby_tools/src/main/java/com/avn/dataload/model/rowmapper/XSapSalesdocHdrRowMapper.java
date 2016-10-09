package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XSapSalesdocHdr;

public class XSapSalesdocHdrRowMapper<T> implements RowMapper<XSapSalesdocHdr> {

	@Override
	public XSapSalesdocHdr mapRow(ResultSet rs, int rowNum) throws SQLException {
		XSapSalesdocHdr obj = new XSapSalesdocHdr();
		
		obj.setVbakVbeln(rs.getString("VBAK_VBELN"));
		obj.setSoldTo(rs.getString("SOLD_TO"));
		obj.setVbakAuart(rs.getString("VBAK_AUART"));
		obj.setVbkdBstdk(rs.getDate("VBKD_BSTDK"));
		obj.setUpdatedFlag(rs.getString("UPDATED_FLAG"));
		
		return obj;
	}

}
