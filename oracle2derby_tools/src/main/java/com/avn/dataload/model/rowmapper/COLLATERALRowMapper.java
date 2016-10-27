package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.COLLATERAL;

public class COLLATERALRowMapper<T> implements RowMapper<COLLATERAL> {

    private static final Logger log = Logger.getLogger(COLLATERALRowMapper.class);

	@Override
	public COLLATERAL mapRow(ResultSet rs, int rowNum) throws SQLException {
		COLLATERAL obj = new COLLATERAL();
		
		obj.setURL(rs.getString("URL"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setNAME(rs.getString("NAME"));
		obj.setCOLLATERAL_ID(rs.getBigDecimal("COLLATERAL_ID"));
		obj.setCOLLTYPE_ID(rs.getBigDecimal("COLLTYPE_ID"));
		obj.setUIDISPLAYABLE(rs.getBigDecimal("UIDISPLAYABLE"));
		obj.setMANAGINGTOOL(rs.getBigDecimal("MANAGINGTOOL"));
		obj.setOVRMKTLIMIT(rs.getBigDecimal("OVRMKTLIMIT"));
		obj.setBEHAVIOR(rs.getBigDecimal("BEHAVIOR"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
