package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.X_ZFC_CUSTMAT_CEM;

public class X_ZFC_CUSTMAT_CEMRowMapper<T> implements RowMapper<X_ZFC_CUSTMAT_CEM> {

    private static final Logger log = Logger.getLogger(X_ZFC_CUSTMAT_CEMRowMapper.class);

	@Override
	public X_ZFC_CUSTMAT_CEM mapRow(ResultSet rs, int rowNum) throws SQLException {
		X_ZFC_CUSTMAT_CEM obj = new X_ZFC_CUSTMAT_CEM();
		
		obj.setMANDT(rs.getString("MANDT"));
		obj.setZZFPA(rs.getString("ZZFPA"));
		obj.setZZCMA(rs.getString("ZZCMA"));
		obj.setVKORG(rs.getString("VKORG"));
		obj.setVTWEG(rs.getString("VTWEG"));
		obj.setKUNNR_CEM(rs.getString("KUNNR_CEM"));
		obj.setUPDATED_FLAG(rs.getString("UPDATED_FLAG"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
