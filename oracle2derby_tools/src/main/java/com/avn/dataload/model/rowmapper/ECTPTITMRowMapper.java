package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.ECTPTITM;

public class ECTPTITMRowMapper<T> implements RowMapper<ECTPTITM> {

	@Override
	public ECTPTITM mapRow(ResultSet rs, int rowNum) throws SQLException {
		ECTPTITM obj = new ECTPTITM();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setECRFNBR(rs.getBigDecimal("ECRFNBR"));
		obj.setECITMRFNBR(rs.getBigDecimal("ECITMRFNBR"));
		obj.setECSEQNO(rs.getBigDecimal("ECSEQNO"));
		obj.setECNAME(rs.getString("ECNAME"));
		obj.setECSIZE(rs.getBigDecimal("ECSIZE"));
		obj.setECISTAG(rs.getString("ECISTAG"));
		obj.setECFLDDT(rs.getString("ECFLDDT"));
		
		return obj;
	}

}
