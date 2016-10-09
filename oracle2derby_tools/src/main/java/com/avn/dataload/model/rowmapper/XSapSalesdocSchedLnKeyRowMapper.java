package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XSapSalesdocSchedLnKey;

public class XSapSalesdocSchedLnKeyRowMapper<T> implements RowMapper<XSapSalesdocSchedLnKey> {

	@Override
	public XSapSalesdocSchedLnKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		XSapSalesdocSchedLnKey obj = new XSapSalesdocSchedLnKey();
		
		obj.setVbakVbeln(rs.getString("VBAK_VBELN"));
		obj.setVbapPosnr(rs.getString("VBAP_POSNR"));
		obj.setVbepEtenr(rs.getString("VBEP_ETENR"));
		
		return obj;
	}

}
