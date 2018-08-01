package com.zhx.app.retrofitdemo.beans;

import java.util.List;

/**
 * Created by Administrator on 2018/7/27.
 */

public class GoodsEntry {

    /**
     * code : 10000
     * msg : 查询信息成功
     * data : [{"goods_id":"314","goods_sn":"GSSG20170910174540","goods_name":"海南红心木瓜（8斤）","goods_number":"967","click_count":"2016","market_price":"39.60","shop_price":"33.00","promote_price":"0.00","keywords":"","goods_brief":"海南红心木瓜，口感柔滑，肉质细腻（偏远地区暂不发货，购买前可咨询客服哦）","goods_thumb":"images/201803/thumb_img/314_thumb_G_1522305692908.jpg","youfei":"0","sale_count":"143"},{"goods_id":"128","goods_sn":"GPXSX2SL20161228181335","goods_name":"粉条（3斤）","goods_number":"889","click_count":"4188","market_price":"71.88","shop_price":"59.90","promote_price":"0.00","keywords":"年货必备 粉条 礼盒","goods_brief":"农家自产红薯原料，纯天然无污染，传统工艺制作，烹饪拌馅必备。\r\n","goods_thumb":"images/201802/thumb_img/128_thumb_G_1519369727818.jpg","youfei":"0","sale_count":"71"},{"goods_id":"113","goods_sn":"WGLYX1MM20161228165738","goods_name":"小米礼袋（5斤）","goods_number":"749","click_count":"4727","market_price":"64.80","shop_price":"54.00","promote_price":"0.00","keywords":"小米在线购买 小米礼盒","goods_brief":"黄河滩优质小米，天然健康，无污染无添加，能熬出米油的好小米。","goods_thumb":"images/201802/thumb_img/113_thumb_G_1519369637548.jpg","youfei":"0","sale_count":"89"},{"goods_id":"130","goods_sn":"WGLYX1MM20161228183308","goods_name":"面粉礼袋装（9斤）","goods_number":"845","click_count":"4425","market_price":"78.00","shop_price":"65.00","promote_price":"0.00","keywords":"石磨面粉 尚谷尚品 石磨面粉在线购买","goods_brief":"石磨低温冷磨，保留原汁原味，无添加剂。","goods_thumb":"images/201806/thumb_img/130_thumb_G_1528102710566.jpg","youfei":"0","sale_count":"77"}]
     */

    private String code;
    private String msg;
    private List<DataBean> data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * goods_id : 314
         * goods_sn : GSSG20170910174540
         * goods_name : 海南红心木瓜（8斤）
         * goods_number : 967
         * click_count : 2016
         * market_price : 39.60
         * shop_price : 33.00
         * promote_price : 0.00
         * keywords :
         * goods_brief : 海南红心木瓜，口感柔滑，肉质细腻（偏远地区暂不发货，购买前可咨询客服哦）
         * goods_thumb : images/201803/thumb_img/314_thumb_G_1522305692908.jpg
         * youfei : 0
         * sale_count : 143
         */

        private String goods_id;
        private String goods_sn;
        private String goods_name;
        private String goods_number;
        private String click_count;
        private String market_price;
        private String shop_price;
        private String promote_price;
        private String keywords;
        private String goods_brief;
        private String goods_thumb;
        private String youfei;
        private String sale_count;

        @Override
        public String toString() {
            return "DataBean{" +
                    "goods_id='" + goods_id + '\'' +
                    ", goods_sn='" + goods_sn + '\'' +
                    ", goods_name='" + goods_name + '\'' +
                    ", goods_number='" + goods_number + '\'' +
                    ", click_count='" + click_count + '\'' +
                    ", market_price='" + market_price + '\'' +
                    ", shop_price='" + shop_price + '\'' +
                    ", promote_price='" + promote_price + '\'' +
                    ", keywords='" + keywords + '\'' +
                    ", goods_brief='" + goods_brief + '\'' +
                    ", goods_thumb='" + goods_thumb + '\'' +
                    ", youfei='" + youfei + '\'' +
                    ", sale_count='" + sale_count + '\'' +
                    '}';
        }

        public String getGoods_id() {
            return goods_id;
        }

        public void setGoods_id(String goods_id) {
            this.goods_id = goods_id;
        }

        public String getGoods_sn() {
            return goods_sn;
        }

        public void setGoods_sn(String goods_sn) {
            this.goods_sn = goods_sn;
        }

        public String getGoods_name() {
            return goods_name;
        }

        public void setGoods_name(String goods_name) {
            this.goods_name = goods_name;
        }

        public String getGoods_number() {
            return goods_number;
        }

        public void setGoods_number(String goods_number) {
            this.goods_number = goods_number;
        }

        public String getClick_count() {
            return click_count;
        }

        public void setClick_count(String click_count) {
            this.click_count = click_count;
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

        public String getPromote_price() {
            return promote_price;
        }

        public void setPromote_price(String promote_price) {
            this.promote_price = promote_price;
        }

        public String getKeywords() {
            return keywords;
        }

        public void setKeywords(String keywords) {
            this.keywords = keywords;
        }

        public String getGoods_brief() {
            return goods_brief;
        }

        public void setGoods_brief(String goods_brief) {
            this.goods_brief = goods_brief;
        }

        public String getGoods_thumb() {
            return goods_thumb;
        }

        public void setGoods_thumb(String goods_thumb) {
            this.goods_thumb = goods_thumb;
        }

        public String getYoufei() {
            return youfei;
        }

        public void setYoufei(String youfei) {
            this.youfei = youfei;
        }

        public String getSale_count() {
            return sale_count;
        }

        public void setSale_count(String sale_count) {
            this.sale_count = sale_count;
        }
    }

    @Override
    public String toString() {
        return "GoodsEntry{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
