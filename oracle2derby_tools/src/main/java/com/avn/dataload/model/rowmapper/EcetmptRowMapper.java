package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Ecetmpt;

public class EcetmptRowMapper<T> implements RowMapper<Ecetmpt> {

	@Override
	public Ecetmpt mapRow(ResultSet rs, int rowNum) throws SQLException {
		Ecetmpt obj = new Ecetmpt();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setEccommandname(rs.getString("ECCOMMANDNAME"));
		obj.setEcrfnbr(rs.getBigDecimal("ECRFNBR"));
		obj.setEcdoctyp(rs.getString("ECDOCTYP"));
		obj.setEcdocver(rs.getString("ECDOCVER"));
		obj.setEcrectyp(rs.getString("ECRECTYP"));
		obj.setEcrecver(rs.getString("ECRECVER"));
		
		return obj;
	}

}
