package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.COLLATERAL;

public class COLLATERALRowMapper<T> implements RowMapper<COLLATERAL> {

	@Override
	public COLLATERAL mapRow(ResultSet rs, int rowNum) throws SQLException {
		COLLATERAL obj = new COLLATERAL();
		
		obj.setURL(rs.getString("URL"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setBEHAVIOR(rs.getBigDecimal("BEHAVIOR"));
		obj.setCOLLATERAL_ID(rs.getBigDecimal("COLLATERAL_ID"));
		obj.setCOLLTYPE_ID(rs.getBigDecimal("COLLTYPE_ID"));
		obj.setUIDISPLAYABLE(rs.getBigDecimal("UIDISPLAYABLE"));
		obj.setMANAGINGTOOL(rs.getBigDecimal("MANAGINGTOOL"));
		obj.setOVRMKTLIMIT(rs.getBigDecimal("OVRMKTLIMIT"));
		
		return obj;
	}

}
