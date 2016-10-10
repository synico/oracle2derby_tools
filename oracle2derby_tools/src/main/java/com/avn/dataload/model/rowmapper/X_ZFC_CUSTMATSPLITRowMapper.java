package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.X_ZFC_CUSTMATSPLIT;

public class X_ZFC_CUSTMATSPLITRowMapper<T> implements RowMapper<X_ZFC_CUSTMATSPLIT> {

	@Override
	public X_ZFC_CUSTMATSPLIT mapRow(ResultSet rs, int rowNum) throws SQLException {
		X_ZFC_CUSTMATSPLIT obj = new X_ZFC_CUSTMATSPLIT();
		
		obj.setUPDATED_FLAG(rs.getString("UPDATED_FLAG"));
		obj.setWERKS(rs.getString("WERKS"));
		obj.setMANDT(rs.getString("MANDT"));
		obj.setZZFPA(rs.getString("ZZFPA"));
		obj.setZZCMA(rs.getString("ZZCMA"));
		obj.setVKORG(rs.getString("VKORG"));
		obj.setVTWEG(rs.getString("VTWEG"));
		obj.setERZEIT(rs.getTimestamp("ERZEIT"));
		obj.setMATNR(rs.getString("MATNR"));
		obj.setMFRPN(rs.getString("MFRPN"));
		obj.setMFRNR(rs.getString("MFRNR"));
		
		return obj;
	}

}
