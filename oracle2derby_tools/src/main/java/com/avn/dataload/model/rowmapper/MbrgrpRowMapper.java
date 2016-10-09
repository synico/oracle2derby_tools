package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Mbrgrp;

public class MbrgrpRowMapper<T> implements RowMapper<Mbrgrp> {

	@Override
	public Mbrgrp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Mbrgrp obj = new Mbrgrp();
		
		obj.setOid(rs.getString("OID"));
		obj.setLastupdatedby(rs.getString("LASTUPDATEDBY"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setMbrgrpId(rs.getBigDecimal("MBRGRP_ID"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setLastupdate(rs.getDate("LASTUPDATE"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setOwnerId(rs.getBigDecimal("OWNER_ID"));
		obj.setDn(rs.getString("DN"));
		obj.setMbrgrpname(rs.getString("MBRGRPNAME"));
		
		return obj;
	}

}
