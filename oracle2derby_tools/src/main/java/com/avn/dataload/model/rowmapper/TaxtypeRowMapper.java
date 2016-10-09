package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Taxtype;

public class TaxtypeRowMapper<T> implements RowMapper<Taxtype> {

	@Override
	public Taxtype mapRow(ResultSet rs, int rowNum) throws SQLException {
		Taxtype obj = new Taxtype();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSequence(rs.getBigDecimal("SEQUENCE"));
		obj.setTxcdschemeId(rs.getBigDecimal("TXCDSCHEME_ID"));
		obj.setTaxtypeId(rs.getBigDecimal("TAXTYPE_ID"));
		
		return obj;
	}

}
