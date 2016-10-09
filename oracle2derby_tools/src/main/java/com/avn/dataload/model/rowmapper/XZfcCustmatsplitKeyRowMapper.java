package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XZfcCustmatsplitKey;

public class XZfcCustmatsplitKeyRowMapper<T> implements RowMapper<XZfcCustmatsplitKey> {

	@Override
	public XZfcCustmatsplitKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		XZfcCustmatsplitKey obj = new XZfcCustmatsplitKey();
		
		obj.setVtweg(rs.getString("VTWEG"));
		obj.setMandt(rs.getString("MANDT"));
		obj.setZzfpa(rs.getString("ZZFPA"));
		obj.setZzcma(rs.getString("ZZCMA"));
		obj.setVkorg(rs.getString("VKORG"));
		obj.setMatnr(rs.getString("MATNR"));
		
		return obj;
	}

}
