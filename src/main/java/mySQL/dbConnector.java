package mySQL;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.json.JSONArray;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class dbConnector {


    private String url;
    private String username;
    private String password;

    public dbConnector(dbConfig config) {
        this.url = config.url;
        this.username = config.user;
        this.password = config.password;
    }

    protected <T> List<T> queryList(String sql, Class<T> resultClass, Object... params) throws SQLException {
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            return new QueryRunner().query(conn, sql, new BeanListHandler<T>(resultClass), params);
        }
    }

    protected <T> T query(String sql, Class<T> resultClass, Object... params) throws SQLException {
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            return new QueryRunner().query(conn, sql, new BeanHandler<T>(resultClass), params);
        }
    }

    //new function to serve location connector
    protected <T> T queryWithoutParam(String sql, Class<T> resultClass) throws SQLException {
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            return new QueryRunner().query(conn, sql, new BeanHandler<T>(resultClass));
        }
    }

    protected int updateQuery(String sql, Object... params) throws SQLException {
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            return new QueryRunner().update(conn, sql, params);
        }
    }

    protected <T> String getTableCount(String sql) throws SQLException {

        int count = 0;
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                count = rs.getInt("count(*)");
            }
            return (String) new QueryRunner().query(conn, sql, new BeanHandler<T>((Class<T>) Long.class));
        } catch (Exception ex) {

        }
        return String.valueOf(count);
    }

    protected JSONArray getAtgFromResult(String sql) {

        JSONArray hotelList = new JSONArray();
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {

                hotelList.put(rs.getInt("atg_hotel_id"));
            }
            return hotelList;
        } catch (Exception ex) {

        }
        return hotelList;
    }

    protected ArrayList getAtgFromResultOrdered(String sql) {

        ArrayList hotelList = new ArrayList();
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {

                hotelList.add(rs.getInt("atg_hotel_id"));
            }
            return hotelList;
        } catch (Exception ex) {
        }
        return hotelList;
    }
}
