package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Orgentity;

public class OrgentityRowMapper<T> implements RowMapper<Orgentity> {

	@Override
	public Orgentity mapRow(ResultSet rs, int rowNum) throws SQLException {
		Orgentity obj = new Orgentity();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setStatus(rs.getBigDecimal("STATUS"));
		obj.setDescription(rs.getString("DESCRIPTION"));
		obj.setOrgentityId(rs.getBigDecimal("ORGENTITY_ID"));
		obj.setOrgentitytype(rs.getString("ORGENTITYTYPE"));
		obj.setOrgentityname(rs.getString("ORGENTITYNAME"));
		obj.setBusinesscategory(rs.getString("BUSINESSCATEGORY"));
		obj.setAdminfirstname(rs.getString("ADMINFIRSTNAME"));
		obj.setAdminlastname(rs.getString("ADMINLASTNAME"));
		obj.setAdminmiddlename(rs.getString("ADMINMIDDLENAME"));
		obj.setPreferreddelivery(rs.getString("PREFERREDDELIVERY"));
		obj.setDn(rs.getString("DN"));
		obj.setLegalid(rs.getString("LEGALID"));
		obj.setTaxpayerid(rs.getString("TAXPAYERID"));
		
		return obj;
	}

}
