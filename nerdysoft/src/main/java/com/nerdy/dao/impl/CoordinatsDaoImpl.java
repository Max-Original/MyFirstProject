package com.nerdy.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import com.nerdy.dao.CoordinatsDao;
import com.nerdysoft.Coordinats;
import com.nerdysoft.utils.ConnectionUtils;

public class CoordinatsDaoImpl implements CoordinatsDao {

	private static String CREAT = "insert into canvas(`firstA`,`firstB`,`secondA`,`secondB`,`thirdA`,`thirdB`,`fourthA`,`fourthB`) values (?,?,?,?,?,?,?,?)";
	private static String READE_BY_ID = "select * from canvas where id=?";
	
	private static Logger LOGGER = Logger.getLogger(CoordinatsDaoImpl.class);
	
	private Connection connection;
	private PreparedStatement preparedStatement;
	
	public  CoordinatsDaoImpl() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		connection = ConnectionUtils.connectToDB();
	}
	
	@Override
	public Coordinats creat(Coordinats coordinats) {
		try {
			preparedStatement = connection.prepareStatement(CREAT);
			preparedStatement.setInt(1, coordinats.getFirstA());
			preparedStatement.setInt(2, coordinats.getFirstB());
			preparedStatement.setInt(3, coordinats.getSecondA());
			preparedStatement.setInt(4, coordinats.getSecondB());
			preparedStatement.setInt(5, coordinats.getThirdA());
			preparedStatement.setInt(6, coordinats.getThirdB());
			preparedStatement.setInt(7, coordinats.getFourthA());
			preparedStatement.setInt(8, coordinats.getFourthB());
			preparedStatement.executeUpdate();
			
			ResultSet resultSet = preparedStatement.getGeneratedKeys();
			resultSet.next();
			
			coordinats.setId(resultSet.getInt(1));
			
		} catch (Exception e) {
			LOGGER.error(e);
		}
		
		return coordinats;
	}

	@Override
	public Coordinats readById(Integer id) {
		Coordinats coordinats = null;
		try {
			preparedStatement = connection.prepareStatement(READE_BY_ID);
			preparedStatement.setInt(1, id);
			ResultSet result = preparedStatement.executeQuery();
			result.next();
			
			Integer coordinatsId = result.getInt("id");
			Integer firstA = result.getInt("firstA");
			Integer firstB = result.getInt("firstB");
			Integer secondA = result.getInt("secondA");
			Integer secondB = result.getInt("secondB");
			Integer thirdA = result.getInt("thirdA");
			Integer thirdB = result.getInt("thirdB");
			Integer fourthA = result.getInt("fourthA");
			Integer fourthB = result.getInt("fourthB");
			
			coordinats = new Coordinats(coordinatsId, firstA, firstB, secondA, secondB, thirdA, thirdB, fourthA, fourthB);
			
		} catch (Exception e) {
			LOGGER.error(e);
		} 
		
		return coordinats;
		}

	@Override
	public Coordinats update(Coordinats coordinats) {
		throw new IllegalStateException("we dont need this now, but maybe we will need it in the future");
	}

	@Override
	public void delete(Integer id) {
		throw new IllegalStateException("we dont need this now, but maybe we will need it in the future");
	}

	@Override
	public List<Coordinats> readAll() {
		throw new IllegalStateException("we dont need this now, but maybe we will need it in the future");
	}





}
