package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.X_ZFC_CUSTMAT;

public class X_ZFC_CUSTMATRowMapper<T> implements RowMapper<X_ZFC_CUSTMAT> {

    private static final Logger log = Logger.getLogger(X_ZFC_CUSTMATRowMapper.class);

	@Override
	public X_ZFC_CUSTMAT mapRow(ResultSet rs, int rowNum) throws SQLException {
		X_ZFC_CUSTMAT obj = new X_ZFC_CUSTMAT();
		
		obj.setCONSIGNMENT(rs.getString("CONSIGNMENT"));
		obj.setRESERVING(rs.getString("RESERVING"));
		obj.setMANDT(rs.getString("MANDT"));
		obj.setZZFPA(rs.getString("ZZFPA"));
		obj.setZZCMA(rs.getString("ZZCMA"));
		obj.setVKORG(rs.getString("VKORG"));
		obj.setVTWEG(rs.getString("VTWEG"));
		obj.setERZEIT(rs.getTimestamp("ERZEIT"));
		obj.setUPDATED_FLAG(rs.getString("UPDATED_FLAG"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
