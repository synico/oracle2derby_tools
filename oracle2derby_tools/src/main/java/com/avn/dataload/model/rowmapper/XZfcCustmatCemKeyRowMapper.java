package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XZfcCustmatCemKey;

public class XZfcCustmatCemKeyRowMapper<T> implements RowMapper<XZfcCustmatCemKey> {

	@Override
	public XZfcCustmatCemKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		XZfcCustmatCemKey obj = new XZfcCustmatCemKey();
		
		obj.setVtweg(rs.getString("VTWEG"));
		obj.setMandt(rs.getString("MANDT"));
		obj.setZzfpa(rs.getString("ZZFPA"));
		obj.setZzcma(rs.getString("ZZCMA"));
		obj.setVkorg(rs.getString("VKORG"));
		obj.setKunnrCem(rs.getString("KUNNR_CEM"));
		
		return obj;
	}

}
