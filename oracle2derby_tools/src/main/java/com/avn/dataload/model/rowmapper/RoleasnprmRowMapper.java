package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Roleasnprm;

public class RoleasnprmRowMapper<T> implements RowMapper<Roleasnprm> {

	@Override
	public Roleasnprm mapRow(ResultSet rs, int rowNum) throws SQLException {
		Roleasnprm obj = new Roleasnprm();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setOrgentityId(rs.getBigDecimal("ORGENTITY_ID"));
		obj.setRoleasnprmId(rs.getBigDecimal("ROLEASNPRM_ID"));
		obj.setAssigningRoleId(rs.getBigDecimal("ASSIGNING_ROLE_ID"));
		obj.setAssignableRoleId(rs.getBigDecimal("ASSIGNABLE_ROLE_ID"));
		
		return obj;
	}

}
