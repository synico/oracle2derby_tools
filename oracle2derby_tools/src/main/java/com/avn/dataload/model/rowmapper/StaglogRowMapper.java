package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Staglog;

public class StaglogRowMapper<T> implements RowMapper<Staglog> {

	@Override
	public Staglog mapRow(ResultSet rs, int rowNum) throws SQLException {
		Staglog obj = new Staglog();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setStgmenbrname(rs.getString("STGMENBRNAME"));
		obj.setStgpkeyname(rs.getString("STGPKEYNAME"));
		obj.setStgkey1name(rs.getString("STGKEY1NAME"));
		obj.setStgkey2name(rs.getString("STGKEY2NAME"));
		obj.setStgkey3name(rs.getString("STGKEY3NAME"));
		obj.setStgkey4name(rs.getString("STGKEY4NAME"));
		obj.setStgkey5name(rs.getString("STGKEY5NAME"));
		obj.setStgprocessed(rs.getBigDecimal("STGPROCESSED"));
		obj.setStgreserved1(rs.getBigDecimal("STGRESERVED1"));
		obj.setStgrfnbr(rs.getBigDecimal("STGRFNBR"));
		obj.setStgstmp(rs.getDate("STGSTMP"));
		obj.setStgtable(rs.getString("STGTABLE"));
		obj.setStgop(rs.getString("STGOP"));
		obj.setStgmenbr(rs.getBigDecimal("STGMENBR"));
		obj.setStgpkey(rs.getBigDecimal("STGPKEY"));
		obj.setStgokey1(rs.getBigDecimal("STGOKEY1"));
		obj.setStgokey2(rs.getBigDecimal("STGOKEY2"));
		obj.setStgokey3(rs.getString("STGOKEY3"));
		obj.setStgokey4(rs.getBigDecimal("STGOKEY4"));
		obj.setStgokey5(rs.getString("STGOKEY5"));
		obj.setStgnkey1(rs.getBigDecimal("STGNKEY1"));
		obj.setStgnkey2(rs.getBigDecimal("STGNKEY2"));
		obj.setStgnkey3(rs.getString("STGNKEY3"));
		obj.setStgnkey4(rs.getBigDecimal("STGNKEY4"));
		obj.setStgnkey5(rs.getString("STGNKEY5"));
		obj.setStgldpth(rs.getString("STGLDPTH"));
		obj.setStgldcols(rs.getString("STGLDCOLS"));
		obj.setStgfilter(rs.getBigDecimal("STGFILTER"));
		
		return obj;
	}

}
