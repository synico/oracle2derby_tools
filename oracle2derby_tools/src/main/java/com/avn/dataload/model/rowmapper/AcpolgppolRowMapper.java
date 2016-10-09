package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Acpolgppol;

public class AcpolgppolRowMapper<T> implements RowMapper<Acpolgppol> {

	@Override
	public Acpolgppol mapRow(ResultSet rs, int rowNum) throws SQLException {
		Acpolgppol obj = new Acpolgppol();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
