package firstgradleproject.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import firstgradleproject.data.Address;
import firstgradleproject.data.Customer;

public class CustomerDAOImpl implements CustomerDAO {
	
	@Override
	public Customer createCustomer(Customer customer) {
		Connection conn;
		Address address = new Address();
		Customer cust = new Customer();
		try{
		conn = DriverManager.getConnection
			("jdbc:postgresql://localhost:5432/varun","postgres","root");
		PreparedStatement pstmt = conn.prepareStatement("insert into customer(customername, mobile, email, address)values(?,?,?,?);");
//		pstmt.setInt(1,customer.getCustomerId());
		pstmt.setString(1, customer.getCustomerName());
		pstmt.setLong(2, customer.getMobile());
		pstmt.setString(3, customer.getEmail());
		pstmt.setInt(4,customer.getAddress().getAddressId());
		
		int row = pstmt.executeUpdate();
		
		if(row>0) {
			PreparedStatement prepstmt = conn.prepareStatement("select * from customer where mobile=?;");
			prepstmt.setLong(1,customer.getMobile());
			ResultSet resultSet =prepstmt.executeQuery();
			if(resultSet.next()) {
				cust.setCustomerId(resultSet.getInt(1));
				cust.setCustomerName(resultSet.getString("customername"));
				cust.setEmail(resultSet.getString(3));
				cust.setMobile(resultSet.getLong(4));
				PreparedStatement ppstmt = conn.prepareStatement("select * from address where addressid=?");
				ppstmt.setInt(1, resultSet.getInt("addressid"));
				ResultSet rs = ppstmt.executeQuery();
				if(rs.next()) {
					address.setAddressId(rs.getInt(1));
					address.setCity("Konnur");
					address.setCountry("India");
					address.setHouseNo(242);
					address.setState("Karnataka");
					address.setStreet("Killa");
					
				}
				cust.setAddress(address);
			} else {
				//Do nothing
			}
		}
		
		
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return cust;
	}

	@Override
	public Customer getCustomerById(Integer customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCustomerById(Integer customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomerByName(String customerName) {
		// TODO Auto-generated method stub
		return null;
	}

}
