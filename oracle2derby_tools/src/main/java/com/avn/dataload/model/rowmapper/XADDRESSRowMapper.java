package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XADDRESS;

public class XADDRESSRowMapper<T> implements RowMapper<XADDRESS> {

	@Override
	public XADDRESS mapRow(ResultSet rs, int rowNum) throws SQLException {
		XADDRESS obj = new XADDRESS();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMEMBER_ID(rs.getBigDecimal("MEMBER_ID"));
		obj.setSTATE(rs.getString("STATE"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setADDRESS_ID(rs.getBigDecimal("ADDRESS_ID"));
		obj.setSTATUS(rs.getString("STATUS"));
		obj.setLASTNAME(rs.getString("LASTNAME"));
		obj.setFIRSTNAME(rs.getString("FIRSTNAME"));
		obj.setADDRESS1(rs.getString("ADDRESS1"));
		obj.setADDRESS2(rs.getString("ADDRESS2"));
		obj.setADDRESS3(rs.getString("ADDRESS3"));
		obj.setCITY(rs.getString("CITY"));
		obj.setCOUNTRY(rs.getString("COUNTRY"));
		obj.setZIPCODE(rs.getString("ZIPCODE"));
		obj.setADDRESSTYPE(rs.getString("ADDRESSTYPE"));
		obj.setSELFADDRESS(rs.getBigDecimal("SELFADDRESS"));
		obj.setLANGUAGE_ID(rs.getBigDecimal("LANGUAGE_ID"));
		
		return obj;
	}

}
