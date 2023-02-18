package team.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import info.model.InfoDto;
import oracle.db.DbConnect;

public class TeamDao {
	DbConnect db = new DbConnect();
	// insert
	public void insertTeam(TeamDto dto) {
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;

		String sql = "insert into info values(seq_1.nextval, ?, ?,?, sysdate)";
		try {
			pstmt = conn.prepareStatement(sql);

			// 바인딩
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getLic());
			pstmt.setString(3, dto.getHp());

			// update
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	}

	//select
	public Vector<InfoDto> getInfoAllDatas() {
		Vector<InfoDto> list = new Vector<>();

		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from team order by num asc";

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			// 여러개의 데이터는 while
			while (rs.next()) {
				// while문 안에서 dto를 선언한다.
				InfoDto dto = new InfoDto();
				dto.setNum(rs.getString("num"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString(""));
				dto.setSdate(rs.getTimestamp("sdate"));
				list.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}

		return list;
	}
}
