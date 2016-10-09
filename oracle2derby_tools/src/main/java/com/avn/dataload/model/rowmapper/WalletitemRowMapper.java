package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Walletitem;

public class WalletitemRowMapper<T> implements RowMapper<Walletitem> {

	@Override
	public Walletitem mapRow(ResultSet rs, int rowNum) throws SQLException {
		Walletitem obj = new Walletitem();
		
		obj.setName(rs.getString("NAME"));
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setField1(rs.getBigDecimal("FIELD1"));
		obj.setField2(rs.getBigDecimal("FIELD2"));
		obj.setType(rs.getBigDecimal("TYPE"));
		obj.setField3(rs.getString("FIELD3"));
		obj.setWalletitemId(rs.getBigDecimal("WALLETITEM_ID"));
		obj.setCreationdate(rs.getDate("CREATIONDATE"));
		obj.setContent(rs.getString("CONTENT"));
		obj.setDeletable(rs.getBigDecimal("DELETABLE"));
		obj.setWalletId(rs.getBigDecimal("WALLET_ID"));
		obj.setUnread(rs.getBigDecimal("UNREAD"));
		obj.setMovable(rs.getBigDecimal("MOVABLE"));
		obj.setRenamable(rs.getBigDecimal("RENAMABLE"));
		
		return obj;
	}

}
