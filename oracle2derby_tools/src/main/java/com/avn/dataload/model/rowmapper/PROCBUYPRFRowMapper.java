package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PROCBUYPRF;

public class PROCBUYPRFRowMapper<T> implements RowMapper<PROCBUYPRF> {

	@Override
	public PROCBUYPRF mapRow(ResultSet rs, int rowNum) throws SQLException {
		PROCBUYPRF obj = new PROCBUYPRF();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setORGENTITY_ID(rs.getBigDecimal("ORGENTITY_ID"));
		obj.setPROCPROTCL_ID(rs.getBigDecimal("PROCPROTCL_ID"));
		obj.setORGUNITPARM(rs.getString("ORGUNITPARM"));
		obj.setCONTRACTPARM(rs.getString("CONTRACTPARM"));
		obj.setREQIDPARM(rs.getString("REQIDPARM"));
		
		return obj;
	}

}
