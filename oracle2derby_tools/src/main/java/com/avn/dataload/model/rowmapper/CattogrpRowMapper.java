package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Cattogrp;

public class CattogrpRowMapper<T> implements RowMapper<Cattogrp> {

	@Override
	public Cattogrp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cattogrp obj = new Cattogrp();
		
		obj.setCatalogIdLink(rs.getBigDecimal("CATALOG_ID_LINK"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		
		return obj;
	}

}
