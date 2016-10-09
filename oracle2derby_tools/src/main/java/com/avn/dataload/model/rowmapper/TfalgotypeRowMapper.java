package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Tfalgotype;

public class TfalgotypeRowMapper<T> implements RowMapper<Tfalgotype> {

	@Override
	public Tfalgotype mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tfalgotype obj = new Tfalgotype();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setTfalgotypeId(rs.getBigDecimal("TFALGOTYPE_ID"));
		
		return obj;
	}

}
