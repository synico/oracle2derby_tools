package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.X_ZFC_UPLOAD_LOG;

public class X_ZFC_UPLOAD_LOGRowMapper<T> implements RowMapper<X_ZFC_UPLOAD_LOG> {

    private static final Logger log = Logger.getLogger(X_ZFC_UPLOAD_LOGRowMapper.class);

	@Override
	public X_ZFC_UPLOAD_LOG mapRow(ResultSet rs, int rowNum) throws SQLException {
		X_ZFC_UPLOAD_LOG obj = new X_ZFC_UPLOAD_LOG();
		
		obj.setMANDT(rs.getString("MANDT"));
		obj.setZZFPA(rs.getString("ZZFPA"));
		obj.setZZCMA(rs.getString("ZZCMA"));
		obj.setVKORG(rs.getString("VKORG"));
		obj.setVTWEG(rs.getString("VTWEG"));
		obj.setMATNR(rs.getString("MATNR"));
		obj.setFCASTWEEK(rs.getString("FCASTWEEK"));
		obj.setFCASTRAW(rs.getBigDecimal("FCASTRAW"));
		obj.setUPDATED_FLAG(rs.getString("UPDATED_FLAG"));
		obj.setFCASTRECVDDATE(rs.getTimestamp("FCASTRECVDDATE"));
		obj.setFCASTAMENDED(rs.getBigDecimal("FCASTAMENDED"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
