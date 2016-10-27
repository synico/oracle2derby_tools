package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PLWIDGETNVP;

public class PLWIDGETNVPRowMapper<T> implements RowMapper<PLWIDGETNVP> {

    private static final Logger log = Logger.getLogger(PLWIDGETNVPRowMapper.class);

	@Override
	public PLWIDGETNVP mapRow(ResultSet rs, int rowNum) throws SQLException {
		PLWIDGETNVP obj = new PLWIDGETNVP();
		
		obj.setSEQUENCE(rs.getBigDecimal("SEQUENCE"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setPLWIDGETNVP_ID(rs.getBigDecimal("PLWIDGETNVP_ID"));
		obj.setPROPERTIES(rs.getString("PROPERTIES"));
		obj.setVALUE(rs.getString("VALUE"));
		obj.setPLWIDGET_ID(rs.getBigDecimal("PLWIDGET_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
