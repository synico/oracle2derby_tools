package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.DMTRIGLSTN;

public class DMTRIGLSTNRowMapper<T> implements RowMapper<DMTRIGLSTN> {

	@Override
	public DMTRIGLSTN mapRow(ResultSet rs, int rowNum) throws SQLException {
		DMTRIGLSTN obj = new DMTRIGLSTN();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getBigDecimal("FIELD3"));
		obj.setSTOREENT_ID(rs.getBigDecimal("STOREENT_ID"));
		obj.setFIELD4(rs.getString("FIELD4"));
		obj.setALLUSERS(rs.getBigDecimal("ALLUSERS"));
		obj.setDMACTIVITY_ID(rs.getBigDecimal("DMACTIVITY_ID"));
		obj.setDMELEMENT_ID(rs.getBigDecimal("DMELEMENT_ID"));
		
		return obj;
	}

}
