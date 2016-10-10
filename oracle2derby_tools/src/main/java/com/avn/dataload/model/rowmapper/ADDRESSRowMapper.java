package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ADDRESS;

public class ADDRESSRowMapper<T> implements RowMapper<ADDRESS> {

	@Override
	public ADDRESS mapRow(ResultSet rs, int rowNum) throws SQLException {
		ADDRESS obj = new ADDRESS();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setSTATE(rs.getString("STATE"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setADDRESS_ID(rs.getBigDecimal("ADDRESS_ID"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setSTATUS(rs.getString("STATUS"));
		obj.setORGNAME(rs.getString("ORGNAME"));
		obj.setISPRIMARY(rs.getBigDecimal("ISPRIMARY"));
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
		obj.setPHONE1TYPE(rs.getString("PHONE1TYPE"));
		obj.setPHONE2TYPE(rs.getString("PHONE2TYPE"));
		obj.setLASTCREATE(rs.getTimestamp("LASTCREATE"));
		obj.setTAXGEOCODE(rs.getString("TAXGEOCODE"));
		obj.setADDRBOOK_ID(rs.getBigDecimal("ADDRBOOK_ID"));
		obj.setADDRESSTYPE(rs.getString("ADDRESSTYPE"));
		obj.setORGUNITNAME(rs.getString("ORGUNITNAME"));
		obj.setBILLINGCODE(rs.getString("BILLINGCODE"));
		obj.setBILLINGCODETYPE(rs.getString("BILLINGCODETYPE"));
		obj.setPERSONTITLE(rs.getString("PERSONTITLE"));
		obj.setBUSINESSTITLE(rs.getString("BUSINESSTITLE"));
		obj.setPUBLISHPHONE1(rs.getBigDecimal("PUBLISHPHONE1"));
		obj.setPUBLISHPHONE2(rs.getBigDecimal("PUBLISHPHONE2"));
		obj.setBESTCALLINGTIME(rs.getString("BESTCALLINGTIME"));
		obj.setPACKAGESUPPRESSION(rs.getBigDecimal("PACKAGESUPPRESSION"));
		obj.setOFFICEADDRESS(rs.getString("OFFICEADDRESS"));
		obj.setSELFADDRESS(rs.getBigDecimal("SELFADDRESS"));
		obj.setSHIPPINGGEOCODE(rs.getString("SHIPPINGGEOCODE"));
		obj.setMOBILEPHONE1(rs.getString("MOBILEPHONE1"));
		obj.setMOBILEPHONE1CNTRY(rs.getString("MOBILEPHONE1CNTRY"));
		
		return obj;
	}

}
