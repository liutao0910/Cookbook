package com.nsx.cookbook.bean.custom;

import java.util.List;


public class Solarterms {

    /**
     * classid : 561
     * name : 场景
     * parentid : 0
     * list : [{"classid":"602","name":"立春","parentid":"561"},{"classid":"603","name":"雨水","parentid":"561"},{"classid":"604","name":"惊蛰","parentid":"561"},{"classid":"605","name":"春分","parentid":"561"},{"classid":"606","name":"清明","parentid":"561"},{"classid":"607","name":"谷雨","parentid":"561"},{"classid":"608","name":"立夏","parentid":"561"},{"classid":"609","name":"小满","parentid":"561"},{"classid":"610","name":"芒种","parentid":"561"},{"classid":"611","name":"夏至","parentid":"561"},{"classid":"612","name":"小暑","parentid":"561"},{"classid":"613","name":"大暑","parentid":"561"},{"classid":"614","name":"立秋","parentid":"561"},{"classid":"615","name":"处暑","parentid":"561"},{"classid":"616","name":"白露","parentid":"561"},{"classid":"617","name":"秋分","parentid":"561"},{"classid":"618","name":"寒露","parentid":"561"},{"classid":"619","name":"霜降","parentid":"561"},{"classid":"620","name":"立冬","parentid":"561"},{"classid":"621","name":"小雪","parentid":"561"},{"classid":"622","name":"大雪","parentid":"561"},{"classid":"623","name":"冬至","parentid":"561"},{"classid":"624","name":"小寒","parentid":"561"},{"classid":"625","name":"大寒","parentid":"561"}]
     */

    private String classid;
    private String name;
    private String parentid;
    private List<ListBean> list;

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * classid : 602
         * name : 立春
         * parentid : 561
         */

        private String classid;
        private String name;
        private String parentid;

        public String getClassid() {
            return classid;
        }

        public void setClassid(String classid) {
            this.classid = classid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getParentid() {
            return parentid;
        }

        public void setParentid(String parentid) {
            this.parentid = parentid;
        }
    }
}
