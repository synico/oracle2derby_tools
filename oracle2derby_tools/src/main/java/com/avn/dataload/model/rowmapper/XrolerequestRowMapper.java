package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Xrolerequest;

public class XrolerequestRowMapper<T> implements RowMapper<Xrolerequest> {

	@Override
	public Xrolerequest mapRow(ResultSet rs, int rowNum) throws SQLException {
		Xrolerequest obj = new Xrolerequest();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMbrgrpId(rs.getBigDecimal("MBRGRP_ID"));
		obj.setStatus(rs.getBigDecimal("STATUS"));
		obj.setRoleId(rs.getBigDecimal("ROLE_ID"));
		obj.setApproverId(rs.getBigDecimal("APPROVER_ID"));
		
		return obj;
	}

}
