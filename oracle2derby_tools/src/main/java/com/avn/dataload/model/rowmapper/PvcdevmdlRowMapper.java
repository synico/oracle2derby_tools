package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Pvcdevmdl;

public class PvcdevmdlRowMapper<T> implements RowMapper<Pvcdevmdl> {

	@Override
	public Pvcdevmdl mapRow(ResultSet rs, int rowNum) throws SQLException {
		Pvcdevmdl obj = new Pvcdevmdl();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setSessiontype(rs.getString("SESSIONTYPE"));
		obj.setVendor(rs.getString("VENDOR"));
		obj.setModelId(rs.getBigDecimal("MODEL_ID"));
		obj.setModelname(rs.getString("MODELNAME"));
		obj.setDevmdlname(rs.getString("DEVMDLNAME"));
		
		return obj;
	}

}
