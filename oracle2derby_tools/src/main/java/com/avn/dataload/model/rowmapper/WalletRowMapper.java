package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Wallet;

public class WalletRowMapper<T> implements RowMapper<Wallet> {

	@Override
	public Wallet mapRow(ResultSet rs, int rowNum) throws SQLException {
		Wallet obj = new Wallet();
		
		obj.setName(rs.getString("NAME"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setMemberId(rs.getBigDecimal("MEMBER_ID"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setStoreentId(rs.getBigDecimal("STOREENT_ID"));
		obj.setWalletId(rs.getBigDecimal("WALLET_ID"));
		
		return obj;
	}

}
