package com.zhx.app.retrofitdemo.beans;

import java.util.List;


/**
 * Created by Administrator on 2016/12/30.
 */
public class Goods {

    /**
     * 商品分类id
     */
    public String cart_id;

    /**
     * 商品id
     */
    public int goods_id;
    /**
     * 商品名
     */
    public String goods_name;
    /**
     * 购买数量
     */
    public int goods_number;
    /**
     * 商品单价
     */
    public String goods_price;
    /**
     * 商品缩略图
     */
    public String goods_img;

    /**
     * 商品货号
     */
    public String goods_sn;

    /**
     * 商品规格
     */
    public String goods_attr;

    /**
     * 抢购商品广告图
     */
    public String content;


    /**
     * 是否抢购（0：非；1：是）
     */
    public String is_promote;
    /**
     * 抢购价格
     */
    public String promote_price;

    /**
     * 抢购开始时间
     */
    public long promote_start_date;


    /**
     * 抢购结束时间
     */
    public long promote_end_date;


    /**
     * 商品描述
     */
    public String goods_brief;

    /**
     * 商品重量
     */
    public String goods_weight;

    /**
     * 商品图片
     */
    public String goods_thumb;

    /**
     * 市场价
     */
    public String market_price;

    /**
     * 售价
     */
    public String shop_price;

    /**
     * 排序编号
     */
    public double sort_order;

    /**
     * 销量
     */
    public String sale_count;

    /**
     * 点击数
     */
    public int click_count;

    /**
     * 关键词
     */
    public String keywords;

    public boolean isChecked;

    /**
     * 是否团购（0：非；1：是）
     */
    public String is_volume;

    /**
     * 团购数量
     */
    public String volume_number;

    /**
     * 团购价格
     */
    public String volume_price;

    /**
     * 全国配货(0：是；1：否)
     */
    public String area_status;

    /**
     *
     */
    public String youfei;

    /**
     *
     */
    public String brand_name;

    /**
     * 可以配送(0：是；1：否)
     */
    public String check_area;

    /**
     * 商品详情
     */
    public List<String> goods_desc;

    /**
     * 商品轮播图
     */
    public List<String> goods_imgs;

    /**
     * 分类名称
     */
    public String cat_name;
    /**
     * 分类分成比例
     */
    public String cat_scale;

    /**
     * 购物车数量
     */
    public String goods_cnumber;

    /**
     * 评论
     */


    /**
     * 用来控制CheckBox的选中状况
     */
    public boolean selected = false;

    /**
     * 快递信息
     */


    /**
     * 快递公司
     */
    public String track_comp;
    /**
     * 快递单号
     */
    public String track_num;

    /**
     * 默认地址
     */


    public List<Goods> goods_info;



    public String total;

    public String free;


    public String getCart_id() {
        return cart_id;
    }

    public void setCart_id(String cart_id) {
        this.cart_id = cart_id;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public int getGoods_number() {
        return goods_number;
    }

    public void setGoods_number(int goods_number) {
        this.goods_number = goods_number;
    }

    public String getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(String goods_price) {
        this.goods_price = goods_price;
    }

    public String getGoods_img() {
        return goods_img;
    }

    public void setGoods_img(String goods_img) {
        this.goods_img = goods_img;
    }

    public String getGoods_sn() {
        return goods_sn;
    }

    public void setGoods_sn(String goods_sn) {
        this.goods_sn = goods_sn;
    }

    public String getGoods_attr() {
        return goods_attr;
    }

    public void setGoods_attr(String goods_attr) {
        this.goods_attr = goods_attr;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIs_promote() {
        return is_promote;
    }

    public void setIs_promote(String is_promote) {
        this.is_promote = is_promote;
    }

    public String getPromote_price() {
        return promote_price;
    }

    public void setPromote_price(String promote_price) {
        this.promote_price = promote_price;
    }

    public long getPromote_start_date() {
        return promote_start_date;
    }

    public void setPromote_start_date(long promote_start_date) {
        this.promote_start_date = promote_start_date;
    }

    public long getPromote_end_date() {
        return promote_end_date;
    }

    public void setPromote_end_date(long promote_end_date) {
        this.promote_end_date = promote_end_date;
    }

    public String getGoods_brief() {
        return goods_brief;
    }

    public void setGoods_brief(String goods_brief) {
        this.goods_brief = goods_brief;
    }

    public String getGoods_weight() {
        return goods_weight;
    }

    public void setGoods_weight(String goods_weight) {
        this.goods_weight = goods_weight;
    }

    public String getGoods_thumb() {
        return goods_thumb;
    }

    public void setGoods_thumb(String goods_thumb) {
        this.goods_thumb = goods_thumb;
    }

    public String getMarket_price() {
        return market_price;
    }

    public void setMarket_price(String market_price) {
        this.market_price = market_price;
    }

    public String getShop_price() {
        return shop_price;
    }

    public void setShop_price(String shop_price) {
        this.shop_price = shop_price;
    }

    public double getSort_order() {
        return sort_order;
    }

    public void setSort_order(double sort_order) {
        this.sort_order = sort_order;
    }

    public String getSale_count() {
        return sale_count;
    }

    public void setSale_count(String sale_count) {
        this.sale_count = sale_count;
    }

    public int getClick_count() {
        return click_count;
    }

    public void setClick_count(int click_count) {
        this.click_count = click_count;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public String getIs_volume() {
        return is_volume;
    }

    public void setIs_volume(String is_volume) {
        this.is_volume = is_volume;
    }

    public String getVolume_number() {
        return volume_number;
    }

    public void setVolume_number(String volume_number) {
        this.volume_number = volume_number;
    }

    public String getVolume_price() {
        return volume_price;
    }

    public void setVolume_price(String volume_price) {
        this.volume_price = volume_price;
    }

    public String getArea_status() {
        return area_status;
    }

    public void setArea_status(String area_status) {
        this.area_status = area_status;
    }

    public String getYoufei() {
        return youfei;
    }

    public void setYoufei(String youfei) {
        this.youfei = youfei;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getCheck_area() {
        return check_area;
    }

    public void setCheck_area(String check_area) {
        this.check_area = check_area;
    }

    public List<String> getGoods_desc() {
        return goods_desc;
    }

    public void setGoods_desc(List<String> goods_desc) {
        this.goods_desc = goods_desc;
    }

    public List<String> getGoods_imgs() {
        return goods_imgs;
    }

    public void setGoods_imgs(List<String> goods_imgs) {
        this.goods_imgs = goods_imgs;
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }

    public String getCat_scale() {
        return cat_scale;
    }

    public void setCat_scale(String cat_scale) {
        this.cat_scale = cat_scale;
    }

    public String getGoods_cnumber() {
        return goods_cnumber;
    }

    public void setGoods_cnumber(String goods_cnumber) {
        this.goods_cnumber = goods_cnumber;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public String getTrack_comp() {
        return track_comp;
    }

    public void setTrack_comp(String track_comp) {
        this.track_comp = track_comp;
    }

    public String getTrack_num() {
        return track_num;
    }

    public void setTrack_num(String track_num) {
        this.track_num = track_num;
    }

    public List<Goods> getGoods_info() {
        return goods_info;
    }

    public void setGoods_info(List<Goods> goods_info) {
        this.goods_info = goods_info;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "cart_id='" + cart_id + '\'' +
                ", goods_id=" + goods_id +
                ", goods_name='" + goods_name + '\'' +
                ", goods_number=" + goods_number +
                ", goods_price='" + goods_price + '\'' +
                ", goods_img='" + goods_img + '\'' +
                ", goods_sn='" + goods_sn + '\'' +
                ", goods_attr='" + goods_attr + '\'' +
                ", content='" + content + '\'' +
                ", is_promote='" + is_promote + '\'' +
                ", promote_price='" + promote_price + '\'' +
                ", promote_start_date=" + promote_start_date +
                ", promote_end_date=" + promote_end_date +
                ", goods_brief='" + goods_brief + '\'' +
                ", goods_weight='" + goods_weight + '\'' +
                ", goods_thumb='" + goods_thumb + '\'' +
                ", market_price='" + market_price + '\'' +
                ", shop_price='" + shop_price + '\'' +
                ", sort_order=" + sort_order +
                ", sale_count='" + sale_count + '\'' +
                ", click_count=" + click_count +
                ", keywords='" + keywords + '\'' +
                ", isChecked=" + isChecked +
                ", is_volume='" + is_volume + '\'' +
                ", volume_number='" + volume_number + '\'' +
                ", volume_price='" + volume_price + '\'' +
                ", area_status='" + area_status + '\'' +
                ", youfei='" + youfei + '\'' +
                ", brand_name='" + brand_name + '\'' +
                ", check_area='" + check_area + '\'' +
                ", goods_desc=" + goods_desc +
                ", goods_imgs=" + goods_imgs +
                ", cat_name='" + cat_name + '\'' +
                ", cat_scale='" + cat_scale + '\'' +
                ", goods_cnumber='" + goods_cnumber + '\'' +
                ", selected=" + selected +
                ", track_comp='" + track_comp + '\'' +
                ", track_num='" + track_num + '\'' +
                ", goods_info=" + goods_info +
                ", total='" + total + '\'' +
                ", free='" + free + '\'' +
                '}';
    }
}
