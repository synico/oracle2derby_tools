package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PX_ELEMENTNVP;

public class PX_ELEMENTNVPRowMapper<T> implements RowMapper<PX_ELEMENTNVP> {

    private static final Logger log = Logger.getLogger(PX_ELEMENTNVPRowMapper.class);

	@Override
	public PX_ELEMENTNVP mapRow(ResultSet rs, int rowNum) throws SQLException {
		PX_ELEMENTNVP obj = new PX_ELEMENTNVP();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setNAME(rs.getString("NAME"));
		obj.setPX_ELEMENT_ID(rs.getBigDecimal("PX_ELEMENT_ID"));
		obj.setPX_ELEMENTNVP_ID(rs.getBigDecimal("PX_ELEMENTNVP_ID"));
		obj.setVALUE(rs.getString("VALUE"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
