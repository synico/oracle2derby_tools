package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PLWIDGETNVP;

public class PLWIDGETNVPRowMapper<T> implements RowMapper<PLWIDGETNVP> {

	@Override
	public PLWIDGETNVP mapRow(ResultSet rs, int rowNum) throws SQLException {
		PLWIDGETNVP obj = new PLWIDGETNVP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setVALUE(rs.getString("VALUE"));
		obj.setPROPERTIES(rs.getString("PROPERTIES"));
		obj.setPLWIDGET_ID(rs.getBigDecimal("PLWIDGET_ID"));
		obj.setPLWIDGETNVP_ID(rs.getBigDecimal("PLWIDGETNVP_ID"));
		
		return obj;
	}

}
