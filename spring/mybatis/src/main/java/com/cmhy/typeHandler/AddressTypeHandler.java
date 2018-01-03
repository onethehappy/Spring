package com.cmhy.typeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import com.cmhy.model.Address;

public class AddressTypeHandler extends BaseTypeHandler<Address>{

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Address parameter, JdbcType jdbcType)
			throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Address getNullableResult(ResultSet rs, String columnName) throws SQLException {
		// TODO Auto-generated method stub
		 return new Address(resultSet.getLong(s));
	}

	@Override
	public Address getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
