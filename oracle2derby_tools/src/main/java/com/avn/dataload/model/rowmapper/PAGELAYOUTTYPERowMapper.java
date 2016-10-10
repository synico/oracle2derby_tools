package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.PAGELAYOUTTYPE;

public class PAGELAYOUTTYPERowMapper<T> implements RowMapper<PAGELAYOUTTYPE> {

	@Override
	public PAGELAYOUTTYPE mapRow(ResultSet rs, int rowNum) throws SQLException {
		PAGELAYOUTTYPE obj = new PAGELAYOUTTYPE();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setPAGELAYOUTTYPE_ID(rs.getString("PAGELAYOUTTYPE_ID"));
		obj.setISSTATIC(rs.getBigDecimal("ISSTATIC"));
		
		return obj;
	}

}
