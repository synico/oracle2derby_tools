package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Acpolicy;

public class AcpolicyRowMapper<T> implements RowMapper<Acpolicy> {

	@Override
	public Acpolicy mapRow(ResultSet rs, int rowNum) throws SQLException {
		Acpolicy obj = new Acpolicy();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setAcactgrpId(rs.getBigDecimal("ACACTGRP_ID"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setAcpolicyId(rs.getBigDecimal("ACPOLICY_ID"));
		obj.setPolicyname(rs.getString("POLICYNAME"));
		obj.setAcrelgrpId(rs.getBigDecimal("ACRELGRP_ID"));
		obj.setAcresgrpId(rs.getBigDecimal("ACRESGRP_ID"));
		obj.setPolicytype(rs.getBigDecimal("POLICYTYPE"));
		obj.setMbrgrpId(rs.getBigDecimal("MBRGRP_ID"));
		obj.setAcrelationId(rs.getBigDecimal("ACRELATION_ID"));
		
		return obj;
	}

}
