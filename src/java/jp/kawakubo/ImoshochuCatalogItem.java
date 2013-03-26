/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.kawakubo;

/**
 *
 * @author kazutoshi
 */
public class ImoshochuCatalogItem {
    private String name = "";
    private String nameKana = "";
    private int dosu = 0;
    private String koji = "";
    private String sweetPotatoName = "";
    private String manufacturer = "";
    private float volume = 0f;
    private int price = 0;
    
    public ImoshochuCatalogItem() {
	
    }
    
    public ImoshochuCatalogItem(String name,
	    String nameKana,
	    int dosu,
	    String koji,
	    String sweetPotatoName,
	    String manufacturer,
	    float volume,
	    int price) {
	this.name = name;
	this.nameKana = nameKana;
	this.dosu = dosu;
	this.koji = koji;
	this.sweetPotatoName = sweetPotatoName;
	this.manufacturer = manufacturer;
	this.volume = volume;
	this.price = price;
    }

    public String getName() {
	return name;
    }

    public String getNameKana() {
	return nameKana;
    }

    public int getDosu() {
	return dosu;
    }

    public String getKoji() {
	return koji;
    }

    public String getSweetPotatoName() {
	return sweetPotatoName;
    }

    public String getManufacturer() {
	return manufacturer;
    }

    public float getVolume() {
	return volume;
    }

    public int getPrice() {
	return price;
    }
    
}
