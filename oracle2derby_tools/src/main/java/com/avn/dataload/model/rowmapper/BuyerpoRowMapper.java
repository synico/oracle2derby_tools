package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Buyerpo;

public class BuyerpoRowMapper<T> implements RowMapper<Buyerpo> {

	@Override
	public Buyerpo mapRow(ResultSet rs, int rowNum) throws SQLException {
		Buyerpo obj = new Buyerpo();
		
		obj.setState(rs.getBigDecimal("STATE"));
		obj.setBuyerpotypId(rs.getBigDecimal("BUYERPOTYP_ID"));
		obj.setBuyerpoId(rs.getBigDecimal("BUYERPO_ID"));
		obj.setSetccurr(rs.getString("SETCCURR"));
		obj.setPonumber(rs.getString("PONUMBER"));
		obj.setAmount(rs.getBigDecimal("AMOUNT"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setAccountId(rs.getBigDecimal("ACCOUNT_ID"));
		
		return obj;
	}

}
