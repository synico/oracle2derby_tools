package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Iseditatt;

public class IseditattRowMapper<T> implements RowMapper<Iseditatt> {

	@Override
	public Iseditatt mapRow(ResultSet rs, int rowNum) throws SQLException {
		Iseditatt obj = new Iseditatt();
		
		obj.setIseditattId(rs.getBigDecimal("ISEDITATT_ID"));
		obj.setInterspecattname(rs.getString("INTERSPECATTNAME"));
		obj.setInterspecattvalue(rs.getString("INTERSPECATTVALUE"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setProfileId(rs.getBigDecimal("PROFILE_ID"));
		obj.setCustomizable(rs.getBigDecimal("CUSTOMIZABLE"));
		
		return obj;
	}

}
