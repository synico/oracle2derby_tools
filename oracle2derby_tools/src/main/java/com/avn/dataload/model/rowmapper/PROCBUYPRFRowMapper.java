package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PROCBUYPRF;

public class PROCBUYPRFRowMapper<T> implements RowMapper<PROCBUYPRF> {

    private static final Logger log = Logger.getLogger(PROCBUYPRFRowMapper.class);

	@Override
	public PROCBUYPRF mapRow(ResultSet rs, int rowNum) throws SQLException {
		PROCBUYPRF obj = new PROCBUYPRF();
		
		obj.setFIELD2(rs.getString("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setORGENTITY_ID(rs.getBigDecimal("ORGENTITY_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setORGUNITPARM(rs.getString("ORGUNITPARM"));
		obj.setCONTRACTPARM(rs.getString("CONTRACTPARM"));
		obj.setPROCPROTCL_ID(rs.getBigDecimal("PROCPROTCL_ID"));
		obj.setREQIDPARM(rs.getString("REQIDPARM"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
