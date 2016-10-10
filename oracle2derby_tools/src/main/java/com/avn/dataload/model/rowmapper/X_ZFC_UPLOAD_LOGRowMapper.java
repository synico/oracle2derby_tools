package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.X_ZFC_UPLOAD_LOG;

public class X_ZFC_UPLOAD_LOGRowMapper<T> implements RowMapper<X_ZFC_UPLOAD_LOG> {

	@Override
	public X_ZFC_UPLOAD_LOG mapRow(ResultSet rs, int rowNum) throws SQLException {
		X_ZFC_UPLOAD_LOG obj = new X_ZFC_UPLOAD_LOG();
		
		obj.setUPDATED_FLAG(rs.getString("UPDATED_FLAG"));
		obj.setFCASTRECVDDATE(rs.getTimestamp("FCASTRECVDDATE"));
		obj.setFCASTAMENDED(rs.getBigDecimal("FCASTAMENDED"));
		obj.setFCASTWEEK(rs.getString("FCASTWEEK"));
		obj.setFCASTRAW(rs.getBigDecimal("FCASTRAW"));
		obj.setMANDT(rs.getString("MANDT"));
		obj.setZZFPA(rs.getString("ZZFPA"));
		obj.setZZCMA(rs.getString("ZZCMA"));
		obj.setVKORG(rs.getString("VKORG"));
		obj.setVTWEG(rs.getString("VTWEG"));
		obj.setMATNR(rs.getString("MATNR"));
		
		return obj;
	}

}
