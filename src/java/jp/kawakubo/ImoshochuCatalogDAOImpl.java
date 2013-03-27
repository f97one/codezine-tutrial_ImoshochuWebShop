/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.kawakubo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kazutoshi
 */
public class ImoshochuCatalogDAOImpl implements ImoshochuCatalogDAO {
    
    private final static String url = "jdbc:mysql://localhost:3306/imoshop";
    private final static String sql ="select * from meigara";
        
    private ArrayList imoCatalog = new ArrayList();

//    public ImoshochuCatalogDAOImpl() {
//	
//	imoCatalog.add(new ImoshochuCatalogItem("がんこ焼酎屋",
//		"がんこしょうちゅうや",
//		25,
//		"白",
//		"ジョイホワイト",
//		"大石酒造",
//		1.8f,
//		2630));
//	imoCatalog.add(new ImoshochuCatalogItem("貴心樹",
//		"きしんじゅ",
//		25,
//		"黒",
//		"黄金千貫",
//		"オガタマ酒造",
//		1.8f,
//		1724));
//	imoCatalog.add(new ImoshochuCatalogItem("鴨神楽",
//		"かもかぐら",
//		25,
//		"白",
//		"黄金千貫",
//		"小牧醸造",
//		1.8f,
//		2930));
//	imoCatalog.add(new ImoshochuCatalogItem("一壺春",
//		"いっこしゅん",
//		25,
//		"白",
//		"ジョイホワイト",
//		"古澤醸造",
//		0.72f,
//		1360));
//	imoCatalog.add(new ImoshochuCatalogItem("杜氏潤平紅芋原酒",
//		"とうじじゅんぺいべにいもげんしゅ",
//		38,
//		"白",
//		"紅芋コトブキ",
//		"小玉醸造",
//		0.5f,
//		2050));
//	imoCatalog.add(new ImoshochuCatalogItem("宝山蒸撰綾紫酒精乃雫",
//		"ほうざんじょうせんあやむらさきしゅせいのしずく",
//		34,
//		"白",
//		"南薩産綾紫",
//		"西酒造",
//		0.72f,
//		2050));
//	imoCatalog.add(new ImoshochuCatalogItem("角玉",
//		"かくたま",
//		25,
//		"黒",
//		"黄金千貫",
//		"佐多宗二商店",
//		1.8f,
//		2050));
//	imoCatalog.add(new ImoshochuCatalogItem("古の千鶴",
//		"いにしえのちづる",
//		25,
//		"黒",
//		"黄金千貫",
//		"神酒造",
//		1.8f,
//		2625));
//    }

    @Override
    public ArrayList getImoshochuCatalogList() {
	Connection conn = null;
	Statement statement = null;
	ResultSet rs = null;
	ArrayList imoCatalog = new ArrayList();
	
	try {
	    Class.forName("com.mysql.jdbc.Driver");
	    conn = (Connection) DriverManager.getConnection(url, "root", "loki1029");
	    statement = (Statement) conn.createStatement();
	    rs = statement.executeQuery(sql);
	    ImoshochuCatalogItem imoItem = null;
	    
	    while (rs.next()) {
		imoItem = new ImoshochuCatalogItem();
		imoItem.setName(rs.getString("name"));
		imoItem.setNameKana(rs.getString("nameKana"));
		imoItem.setDosu(rs.getInt("dosu"));
		imoItem.setKoji(rs.getString("koji"));
		imoItem.setSweetPotatoName(rs.getString("sweetPotatoName"));
		imoItem.setManufacturer(rs.getString("manufacturer"));
		imoItem.setVolume(rs.getFloat("volume"));
		imoItem.setPrice(rs.getInt("price"));
		imoCatalog.add(imoItem);
	    }
	} catch (SQLException se) {
	    se.printStackTrace();
	} catch (Exception e) {
	    e.printStackTrace();
	} finally {
	    try {
		if (statement != null) {
		    statement.close();
		}
	    } catch(SQLException se) {
		se.printStackTrace();
	    }
	    try {
		if (rs != null) {
		    rs.close();
		}
	    } catch (SQLException se) {
		se.printStackTrace();
	    }
	    try {
		if (conn != null) {
		    conn.close();
		}
	    } catch (SQLException se) {
		se.printStackTrace();
	    }
	}
	
	return imoCatalog;
    }
}
