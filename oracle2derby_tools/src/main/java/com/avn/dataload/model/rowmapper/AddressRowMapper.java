package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Address;

public class AddressRowMapper<T> implements RowMapper<Address> {

	@Override
	public Address mapRow(ResultSet rs, int rowNum) throws SQLException {
		Address obj = new Address();
		
		obj.setState(rs.getString("STATE"));
		obj.setAddresstype(rs.getString("ADDRESSTYPE"));
		obj.setOrgunitname(rs.getString("ORGUNITNAME"));
		obj.setBillingcode(rs.getString("BILLINGCODE"));
		obj.setBillingcodetype(rs.getString("BILLINGCODETYPE"));
		obj.setPersontitle(rs.getString("PERSONTITLE"));
		obj.setBusinesstitle(rs.getString("BUSINESSTITLE"));
		obj.setPublishphone1(rs.getBigDecimal("PUBLISHPHONE1"));
		obj.setPublishphone2(rs.getBigDecimal("PUBLISHPHONE2"));
		obj.setBestcallingtime(rs.getString("BESTCALLINGTIME"));
		obj.setPackagesuppression(rs.getBigDecimal("PACKAGESUPPRESSION"));
		obj.setOfficeaddress(rs.getString("OFFICEADDRESS"));
		obj.setSelfaddress(rs.getBigDecimal("SELFADDRESS"));
		obj.setShippinggeocode(rs.getString("SHIPPINGGEOCODE"));
		obj.setMobilephone1(rs.getString("MOBILEPHONE1"));
		obj.setMobilephone1cntry(rs.getString("MOBILEPHONE1CNTRY"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getString("FIELD1"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setField2(rs.getString("FIELD2"));
		obj.setAddrbookId(rs.getBigDecimal("ADDRBOOK_ID"));
		obj.setAddressId(rs.getBigDecimal("ADDRESS_ID"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setStatus(rs.getString("STATUS"));
		obj.setOrgname(rs.getString("ORGNAME"));
		obj.setIsprimary(rs.getBigDecimal("ISPRIMARY"));
		obj.setLastname(rs.getString("LASTNAME"));
		obj.setFirstname(rs.getString("FIRSTNAME"));
		obj.setMiddlename(rs.getString("MIDDLENAME"));
		obj.setPhone1(rs.getString("PHONE1"));
		obj.setFax1(rs.getString("FAX1"));
		obj.setPhone2(rs.getString("PHONE2"));
		obj.setAddress1(rs.getString("ADDRESS1"));
		obj.setFax2(rs.getString("FAX2"));
		obj.setNickname(rs.getString("NICKNAME"));
		obj.setAddress2(rs.getString("ADDRESS2"));
		obj.setAddress3(rs.getString("ADDRESS3"));
		obj.setCity(rs.getString("CITY"));
		obj.setCountry(rs.getString("COUNTRY"));
		obj.setZipcode(rs.getString("ZIPCODE"));
		obj.setEmail1(rs.getString("EMAIL1"));
		obj.setEmail2(rs.getString("EMAIL2"));
		obj.setPhone1type(rs.getString("PHONE1TYPE"));
		obj.setPhone2type(rs.getString("PHONE2TYPE"));
		obj.setLastcreate(rs.getDate("LASTCREATE"));
		obj.setTaxgeocode(rs.getString("TAXGEOCODE"));
		
		return obj;
	}

}
