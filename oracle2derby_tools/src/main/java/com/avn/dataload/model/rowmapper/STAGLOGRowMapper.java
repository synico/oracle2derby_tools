package com.avn.dataload.model.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import org.springframework.jdbc.core.RowMapper;

import com.avn.dataload.model.STAGLOG;

public class STAGLOGRowMapper<T> implements RowMapper<STAGLOG> {

    private static final Logger log = Logger.getLogger(STAGLOGRowMapper.class);

	@Override
	public STAGLOG mapRow(ResultSet rs, int rowNum) throws SQLException {
		STAGLOG obj = new STAGLOG();
		
		obj.setOPTCOUNTER(rs.getBigDecimal("OPTCOUNTER"));
		obj.setSTGRFNBR(rs.getBigDecimal("STGRFNBR"));
		obj.setSTGSTMP(rs.getTimestamp("STGSTMP"));
		obj.setSTGTABLE(rs.getString("STGTABLE"));
		obj.setSTGOP(rs.getString("STGOP"));
		obj.setSTGMENBR(rs.getBigDecimal("STGMENBR"));
		obj.setSTGPKEY(rs.getBigDecimal("STGPKEY"));
		obj.setSTGOKEY1(rs.getBigDecimal("STGOKEY1"));
		obj.setSTGOKEY2(rs.getBigDecimal("STGOKEY2"));
		obj.setSTGOKEY3(rs.getString("STGOKEY3"));
		obj.setSTGOKEY4(rs.getBigDecimal("STGOKEY4"));
		obj.setSTGOKEY5(rs.getString("STGOKEY5"));
		obj.setSTGNKEY1(rs.getBigDecimal("STGNKEY1"));
		obj.setSTGNKEY2(rs.getBigDecimal("STGNKEY2"));
		obj.setSTGNKEY3(rs.getString("STGNKEY3"));
		obj.setSTGNKEY4(rs.getBigDecimal("STGNKEY4"));
		obj.setSTGNKEY5(rs.getString("STGNKEY5"));
		obj.setSTGLDPTH(rs.getString("STGLDPTH"));
		obj.setSTGLDCOLS(rs.getString("STGLDCOLS"));
		obj.setSTGFILTER(rs.getBigDecimal("STGFILTER"));
		obj.setSTGMENBRNAME(rs.getString("STGMENBRNAME"));
		obj.setSTGPKEYNAME(rs.getString("STGPKEYNAME"));
		obj.setSTGKEY1NAME(rs.getString("STGKEY1NAME"));
		obj.setSTGKEY2NAME(rs.getString("STGKEY2NAME"));
		obj.setSTGKEY3NAME(rs.getString("STGKEY3NAME"));
		obj.setSTGKEY4NAME(rs.getString("STGKEY4NAME"));
		obj.setSTGKEY5NAME(rs.getString("STGKEY5NAME"));
		obj.setSTGPROCESSED(rs.getBigDecimal("STGPROCESSED"));
		obj.setSTGRESERVED1(rs.getBigDecimal("STGRESERVED1"));
		
		log.debug("Value of obj: " + obj.toString());
		
		return obj;
	}

}
