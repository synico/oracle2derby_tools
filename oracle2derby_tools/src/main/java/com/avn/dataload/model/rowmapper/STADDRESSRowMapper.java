package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STADDRESS;

public class STADDRESSRowMapper<T> implements RowMapper<STADDRESS> {

	@Override
	public STADDRESS mapRow(ResultSet rs, int rowNum) throws SQLException {
		STADDRESS obj = new STADDRESS();
		
		obj.setURL(rs.getString("URL"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setSTATE(rs.getString("STATE"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setLASTNAME(rs.getString("LASTNAME"));
		obj.setFIRSTNAME(rs.getString("FIRSTNAME"));
		obj.setMIDDLENAME(rs.getString("MIDDLENAME"));
		obj.setPHONE1(rs.getString("PHONE1"));
		obj.setFAX1(rs.getString("FAX1"));
		obj.setPHONE2(rs.getString("PHONE2"));
		obj.setADDRESS1(rs.getString("ADDRESS1"));
		obj.setFAX2(rs.getString("FAX2"));
		obj.setNICKNAME(rs.getString("NICKNAME"));
		obj.setADDRESS2(rs.getString("ADDRESS2"));
		obj.setADDRESS3(rs.getString("ADDRESS3"));
		obj.setCITY(rs.getString("CITY"));
		obj.setCOUNTRY(rs.getString("COUNTRY"));
		obj.setZIPCODE(rs.getString("ZIPCODE"));
		obj.setEMAIL1(rs.getString("EMAIL1"));
		obj.setEMAIL2(rs.getString("EMAIL2"));
		obj.setTAXGEOCODE(rs.getString("TAXGEOCODE"));
		obj.setPERSONTITLE(rs.getString("PERSONTITLE"));
		obj.setBUSINESSTITLE(rs.getString("BUSINESSTITLE"));
		obj.setSHIPPINGGEOCODE(rs.getString("SHIPPINGGEOCODE"));
		obj.setSTADDRESS_ID(rs.getBigDecimal("STADDRESS_ID"));
		
		return obj;
	}

}
