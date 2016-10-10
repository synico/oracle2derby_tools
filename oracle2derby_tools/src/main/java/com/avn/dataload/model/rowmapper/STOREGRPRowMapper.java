package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STOREGRP;

public class STOREGRPRowMapper<T> implements RowMapper<STOREGRP> {

	@Override
	public STOREGRP mapRow(ResultSet rs, int rowNum) throws SQLException {
		STOREGRP obj = new STOREGRP();
		
		obj.setFIELD1(rs.getString("FIELD1"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTOREGRP_ID(rs.getBigDecimal("STOREGRP_ID"));
		
		return obj;
	}

}
