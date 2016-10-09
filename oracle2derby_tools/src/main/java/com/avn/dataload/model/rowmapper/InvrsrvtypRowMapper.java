package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Invrsrvtyp;

public class InvrsrvtypRowMapper<T> implements RowMapper<Invrsrvtyp> {

	@Override
	public Invrsrvtyp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Invrsrvtyp obj = new Invrsrvtyp();
		
		obj.setInvrsrvtypId(rs.getBigDecimal("INVRSRVTYP_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
