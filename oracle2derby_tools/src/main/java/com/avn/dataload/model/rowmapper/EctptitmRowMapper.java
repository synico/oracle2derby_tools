package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.emdi.Ectptitm;

public class EctptitmRowMapper<T> implements RowMapper<Ectptitm> {

	@Override
	public Ectptitm mapRow(ResultSet rs, int rowNum) throws SQLException {
		Ectptitm obj = new Ectptitm();
		
		obj.setOptcounter(rs.getBigDecimal("OPTCOUNTER"));
		obj.setEcrfnbr(rs.getBigDecimal("ECRFNBR"));
		obj.setEcitmrfnbr(rs.getBigDecimal("ECITMRFNBR"));
		obj.setEcseqno(rs.getBigDecimal("ECSEQNO"));
		obj.setEcname(rs.getString("ECNAME"));
		obj.setEcsize(rs.getBigDecimal("ECSIZE"));
		obj.setEcistag(rs.getString("ECISTAG"));
		obj.setEcflddt(rs.getString("ECFLDDT"));
		
		return obj;
	}

}
