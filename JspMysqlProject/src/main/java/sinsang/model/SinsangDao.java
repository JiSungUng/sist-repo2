package sinsang.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import mysql.db.DbConnect;

public class SinsangDao {
	DbConnect db = new DbConnect();

	public void insertSingsang(SinsangDto dto) {
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;

		String sql = "insert into mysinsang values (null, ?, ?, ?, ?)";

		try {
			// ?바인딩
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getBlood());
			pstmt.setString(3, dto.getHp());
			pstmt.setString(4, dto.getBirth());
			// 실행
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	}

	// select
	public List<SinsangDto> getAllDatas() {
		List<SinsangDto> list = new ArrayList<>();
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from mysinsang order by num desc";

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				SinsangDto dto = new SinsangDto();
				dto.setNum(rs.getString("num"));
				dto.setName(rs.getString("name"));
				dto.setHp(rs.getString("hp"));
				dto.setBlood(rs.getString("blood"));
				dto.setBirth(rs.getString("birth"));

				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}
		return list;
	}

	// num에 의한 dto값얻기
	public SinsangDto getData(String num) {
		SinsangDto dto = new SinsangDto();

		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from mysinsang where num = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				dto.setNum(rs.getString("num"));
				dto.setName(rs.getString("name"));
				dto.setHp(rs.getString("hp"));
				dto.setBlood(rs.getString("blood"));
				dto.setBirth(rs.getString("birth"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}
		return dto;
	}

	// 수정
	public void updateSinsang(SinsangDto dto) {
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;

		String sql = "update mysinsang set name=?, blood=?, hp=?, birth=? where num=?";

		try {
			pstmt = conn.prepareStatement(sql);

			// ?바인딩
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getBlood());
			pstmt.setString(3, dto.getHp());
			pstmt.setString(4, dto.getBirth());
			pstmt.setString(5, dto.getNum());
			// 실행
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(null, pstmt, conn);
		}
	}

	// 삭제
	public void deleteSinsang(String num) {
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;

		String sql = "delete from mysinsang where num=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}

	}
}
