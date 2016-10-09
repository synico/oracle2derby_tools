package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.XformResaleAddress;

public class XformResaleAddressRowMapper<T> implements RowMapper<XformResaleAddress> {

	@Override
	public XformResaleAddress mapRow(ResultSet rs, int rowNum) throws SQLException {
		XformResaleAddress obj = new XformResaleAddress();
		
		obj.setResaleAddressTx01(rs.getString("RESALE_ADDRESS_TX01"));
		obj.setResaleAddressTx02(rs.getString("RESALE_ADDRESS_TX02"));
		obj.setResaleAddressTx03(rs.getString("RESALE_ADDRESS_TX03"));
		obj.setResaleCityNm(rs.getString("RESALE_CITY_NM"));
		obj.setResaleCompanyNm(rs.getString("RESALE_COMPANY_NM"));
		obj.setResaleCountryNm(rs.getString("RESALE_COUNTRY_NM"));
		obj.setResaleStateNm(rs.getString("RESALE_STATE_NM"));
		obj.setResalePostalCd(rs.getString("RESALE_POSTAL_CD"));
		
		return obj;
	}

}
