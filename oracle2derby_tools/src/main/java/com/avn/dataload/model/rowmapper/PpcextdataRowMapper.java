package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Ppcextdata;

public class PpcextdataRowMapper<T> implements RowMapper<Ppcextdata> {

	@Override
	public Ppcextdata mapRow(ResultSet rs, int rowNum) throws SQLException {
		Ppcextdata obj = new Ppcextdata();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setMarkfordelete(rs.getBigDecimal("MARKFORDELETE"));
		obj.setPpcextdataId(rs.getBigDecimal("PPCEXTDATA_ID"));
		obj.setPpcpayinstId(rs.getBigDecimal("PPCPAYINST_ID"));
		obj.setPpcpaytranId(rs.getBigDecimal("PPCPAYTRAN_ID"));
		obj.setAttributetype(rs.getBigDecimal("ATTRIBUTETYPE"));
		obj.setAttributename(rs.getString("ATTRIBUTENAME"));
		obj.setSearchvalue(rs.getString("SEARCHVALUE"));
		obj.setEncrypted(rs.getBigDecimal("ENCRYPTED"));
		obj.setDatavalue(rs.getString("DATAVALUE"));
		obj.setPpcbatchId(rs.getBigDecimal("PPCBATCH_ID"));
		
		return obj;
	}

}
