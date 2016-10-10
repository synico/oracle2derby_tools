package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ATCHREL;

public class ATCHRELRowMapper<T> implements RowMapper<ATCHREL> {

	@Override
	public ATCHREL mapRow(ResultSet rs, int rowNum) throws SQLException {
		ATCHREL obj = new ATCHREL();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setATCHTGT_ID(rs.getBigDecimal("ATCHTGT_ID"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setATCHOBJTYP_ID(rs.getBigDecimal("ATCHOBJTYP_ID"));
		obj.setATCHRLUS_ID(rs.getBigDecimal("ATCHRLUS_ID"));
		obj.setBIGINTOBJECT_ID(rs.getBigDecimal("BIGINTOBJECT_ID"));
		obj.setATCHREL_ID(rs.getBigDecimal("ATCHREL_ID"));
		obj.setOBJECT_ID(rs.getString("OBJECT_ID"));
		obj.setLASTUPDATE(rs.getTimestamp("LASTUPDATE"));
		
		return obj;
	}

}
