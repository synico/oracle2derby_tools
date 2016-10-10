package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.XPCATENTRY;

public class XPCATENTRYRowMapper<T> implements RowMapper<XPCATENTRY> {

	@Override
	public XPCATENTRY mapRow(ResultSet rs, int rowNum) throws SQLException {
		XPCATENTRY obj = new XPCATENTRY();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setFIELD4(rs.getString("FIELD4"));
		obj.setCATENTRY_ID(rs.getBigDecimal("CATENTRY_ID"));
		obj.setFIELD5(rs.getString("FIELD5"));
		obj.setKITINCLUDE(rs.getString("KITINCLUDE"));
		obj.setFAMILYNAME(rs.getString("FAMILYNAME"));
		obj.setUNSPSCCODE(rs.getString("UNSPSCCODE"));
		obj.setLEADFREE(rs.getString("LEADFREE"));
		obj.setTOPSELLERFLAG(rs.getString("TOPSELLERFLAG"));
		obj.setPRODUCTAPPLICATIONS(rs.getString("PRODUCTAPPLICATIONS"));
		obj.setNEWPRODUCTFLAG(rs.getString("NEWPRODUCTFLAG"));
		obj.setUNSPSCVERSIONCODE(rs.getString("UNSPSCVERSIONCODE"));
		obj.setGREENCOMPLIANTFLAG(rs.getString("GREENCOMPLIANTFLAG"));
		obj.setMILITARYPRODUCTFL(rs.getString("MILITARYPRODUCTFL"));
		obj.setPRODUCTNUMBER(rs.getString("PRODUCTNUMBER"));
		obj.setFIELD6(rs.getString("FIELD6"));
		
		return obj;
	}

}
