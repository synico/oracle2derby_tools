package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Preletpltgrp;

public class PreletpltgrpRowMapper<T> implements RowMapper<Preletpltgrp> {

	@Override
	public Preletpltgrp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Preletpltgrp obj = new Preletpltgrp();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setIdentifier(rs.getString("IDENTIFIER"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setPreletpltgrpId(rs.getBigDecimal("PRELETPLTGRP_ID"));
		
		return obj;
	}

}
