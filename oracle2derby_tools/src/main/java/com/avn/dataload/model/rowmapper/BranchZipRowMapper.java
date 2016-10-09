package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.BranchZip;

public class BranchZipRowMapper<T> implements RowMapper<BranchZip> {

	@Override
	public BranchZip mapRow(ResultSet rs, int rowNum) throws SQLException {
		BranchZip obj = new BranchZip();
		
		obj.setBranchZipId(rs.getBigDecimal("BRANCH_ZIP_ID"));
		obj.setLowPostalCd(rs.getString("LOW_POSTAL_CD"));
		obj.setHighPostalCd(rs.getString("HIGH_POSTAL_CD"));
		obj.setSalesOffice(rs.getString("SALES_OFFICE"));
		obj.setBranchId(rs.getString("BRANCH_ID"));
		obj.setCountryCd(rs.getString("COUNTRY_CD"));
		obj.setDisplayFl(rs.getString("DISPLAY_FL"));
		obj.setSalesOrg(rs.getString("SALES_ORG"));
		
		return obj;
	}

}
