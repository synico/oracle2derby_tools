package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ROLEASNPRM;

public class ROLEASNPRMRowMapper<T> implements RowMapper<ROLEASNPRM> {

    private static final Logger log = Logger.getLogger(ROLEASNPRMRowMapper.class);

	@Override
	public ROLEASNPRM mapRow(ResultSet rs, int rowNum) throws SQLException {
		ROLEASNPRM obj = new ROLEASNPRM();
		
		obj.setORGENTITY_ID(rs.getBigDecimal("ORGENTITY_ID"));
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setROLEASNPRM_ID(rs.getBigDecimal("ROLEASNPRM_ID"));
		obj.setASSIGNING_ROLE_ID(rs.getBigDecimal("ASSIGNING_ROLE_ID"));
		obj.setASSIGNABLE_ROLE_ID(rs.getBigDecimal("ASSIGNABLE_ROLE_ID"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
