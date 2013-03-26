/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.kawakubo;

import java.util.ArrayList;

/**
 *
 * @author kazutoshi
 */
public class ImoshochuCatalogDAOImpl implements ImoshochuCatalogDAO {
    
    private ArrayList imoCatalog = new ArrayList();

    public ImoshochuCatalogDAOImpl() {
	
	imoCatalog.add(new ImoshochuCatalogItem("がんこ焼酎屋",
		"がんこしょうちゅうや",
		25,
		"白",
		"ジョイホワイト",
		"大石酒造",
		1.8f,
		2630));
	imoCatalog.add(new ImoshochuCatalogItem("貴心樹",
		"きしんじゅ",
		25,
		"黒",
		"黄金千貫",
		"オガタマ酒造",
		1.8f,
		1724));
	imoCatalog.add(new ImoshochuCatalogItem("鴨神楽",
		"かもかぐら",
		25,
		"白",
		"黄金千貫",
		"小牧醸造",
		1.8f,
		2930));
	imoCatalog.add(new ImoshochuCatalogItem("一壺春",
		"いっこしゅん",
		25,
		"白",
		"ジョイホワイト",
		"古澤醸造",
		0.72f,
		1360));
	imoCatalog.add(new ImoshochuCatalogItem("杜氏潤平紅芋原酒",
		"とうじじゅんぺいべにいもげんしゅ",
		38,
		"白",
		"紅芋コトブキ",
		"小玉醸造",
		0.5f,
		2050));
	imoCatalog.add(new ImoshochuCatalogItem("宝山蒸撰綾紫酒精乃雫",
		"ほうざんじょうせんあやむらさきしゅせいのしずく",
		34,
		"白",
		"南薩産綾紫",
		"西酒造",
		0.72f,
		2050));
	imoCatalog.add(new ImoshochuCatalogItem("角玉",
		"かくたま",
		25,
		"黒",
		"黄金千貫",
		"佐多宗二商店",
		1.8f,
		2050));
	imoCatalog.add(new ImoshochuCatalogItem("古の千鶴",
		"いにしえのちづる",
		25,
		"黒",
		"黄金千貫",
		"神酒造",
		1.8f,
		2625));
    }

    @Override
    public ArrayList getImoshochuCatalogList() {
	return imoCatalog;
    }
}
