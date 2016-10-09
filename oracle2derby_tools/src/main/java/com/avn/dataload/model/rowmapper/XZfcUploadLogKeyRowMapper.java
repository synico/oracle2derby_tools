package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XZfcUploadLogKey;

public class XZfcUploadLogKeyRowMapper<T> implements RowMapper<XZfcUploadLogKey> {

	@Override
	public XZfcUploadLogKey mapRow(ResultSet rs, int rowNum) throws SQLException {
		XZfcUploadLogKey obj = new XZfcUploadLogKey();
		
		obj.setFcastrecvddate(rs.getDate("FCASTRECVDDATE"));
		obj.setVtweg(rs.getString("VTWEG"));
		obj.setMandt(rs.getString("MANDT"));
		obj.setZzfpa(rs.getString("ZZFPA"));
		obj.setZzcma(rs.getString("ZZCMA"));
		obj.setVkorg(rs.getString("VKORG"));
		obj.setMatnr(rs.getString("MATNR"));
		obj.setFcastweek(rs.getString("FCASTWEEK"));
		
		return obj;
	}

}
