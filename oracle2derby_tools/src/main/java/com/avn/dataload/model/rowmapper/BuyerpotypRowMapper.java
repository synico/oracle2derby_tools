package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Buyerpotyp;

public class BuyerpotypRowMapper<T> implements RowMapper<Buyerpotyp> {

	@Override
	public Buyerpotyp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Buyerpotyp obj = new Buyerpotyp();
		
		obj.setBuyerpotypId(rs.getBigDecimal("BUYERPOTYP_ID"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		
		return obj;
	}

}
