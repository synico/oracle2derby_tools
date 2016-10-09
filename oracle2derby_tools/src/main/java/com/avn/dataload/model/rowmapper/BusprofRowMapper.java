package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Busprof;

public class BusprofRowMapper<T> implements RowMapper<Busprof> {

	@Override
	public Busprof mapRow(ResultSet rs, int rowNum) throws SQLException {
		Busprof obj = new Busprof();
		
		obj.setEmployeetype(rs.getString("EMPLOYEETYPE"));
		obj.setDepartmentnum(rs.getString("DEPARTMENTNUM"));
		obj.setAlternateid(rs.getString("ALTERNATEID"));
		obj.setRequisitionerid(rs.getString("REQUISITIONERID"));
		obj.setUsersId(rs.getBigDecimal("USERS_ID"));
		obj.setEmployeeid(rs.getString("EMPLOYEEID"));
		obj.setOrgId(rs.getBigDecimal("ORG_ID"));
		obj.setOrgunitId(rs.getBigDecimal("ORGUNIT_ID"));
		obj.setManager(rs.getString("MANAGER"));
		obj.setSecretary(rs.getString("SECRETARY"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
