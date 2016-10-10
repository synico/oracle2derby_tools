package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.CALRANGE;

public class CALRANGERowMapper<T> implements RowMapper<CALRANGE> {

	@Override
	public CALRANGE mapRow(ResultSet rs, int rowNum) throws SQLException {
		CALRANGE obj = new CALRANGE();
		
		obj.setFIELD1(rs.getBigDecimal("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setFIELD2(rs.getBigDecimal("FIELD2"));
		obj.setFIELD3(rs.getString("FIELD3"));
		obj.setMARKFORDELETE(rs.getBigDecimal("MARKFORDELETE"));
		obj.setRANGESTART(rs.getBigDecimal("RANGESTART"));
		obj.setCUMULATIVE(rs.getBigDecimal("CUMULATIVE"));
		obj.setCALMETHOD_ID(rs.getBigDecimal("CALMETHOD_ID"));
		obj.setCALRANGE_ID(rs.getBigDecimal("CALRANGE_ID"));
		obj.setCALSCALE_ID(rs.getBigDecimal("CALSCALE_ID"));
		
		return obj;
	}

}
