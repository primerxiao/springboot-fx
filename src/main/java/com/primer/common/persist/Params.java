package com.primer.common.persist;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedHashMap;

/**
 * 自定义参数
 */
@Data
public class Params {

    private final List<String> and;
    private final LinkedHashMap<String ,Object> andPara;

    private final List<String> or;
    private final LinkedHashMap<String ,Object> orPara;

    private final List<String> between;
    private final LinkedHashMap<String, List> betweenPara;

    private final List<String> lessThan;
    private final LinkedHashMap<String ,Object> lessThanPara;

    private final List<String> moreThan;
    private final LinkedHashMap<String ,Object> moreThanPara;

    private final List<String> like;
    private final LinkedHashMap<String ,Object> likePara;

    private final List<String> notLike;
    private final LinkedHashMap<String ,Object> notLikePara;

    private final List<String> orderBy;
    private final LinkedHashMap<String ,Object> orderByPara;

    private final List<String> not;
    private final LinkedHashMap<String ,Object> notPara;

    private final List<String> in;
    private final LinkedHashMap<String ,List> inPara;

    private final List<String> notIn;
    private final LinkedHashMap<String ,List> notInPara;

    private final List<String> limit;
    private final LinkedHashMap<String ,List<Object>> limitPara;

    private Params(Bulider bulider){
        this.and = bulider.and;
        this.andPara = bulider.andPara;
        this.or = bulider.or;
        this.orPara = bulider.orPara;
        this.between = bulider.between;
        this.betweenPara = bulider.betweenPara;
        this.lessThan = bulider.lessThan;
        this.lessThanPara = bulider.lessThanPara;
        this.moreThan = bulider.moreThan;
        this.moreThanPara = bulider.moreThanPara;
        this.like = bulider.like;
        this.likePara = bulider.likePara;
        this.notLike = bulider.notLike;
        this.notLikePara = bulider.notLikePara;
        this.orderBy = bulider.orderBy;
        this.orderByPara = bulider.orderByPara;
        this.not = bulider.not;
        this.notPara = bulider.notPara;
        this.in = bulider.in;
        this.inPara = bulider.inPara;
        this.notIn = bulider.notIn;
        this.notInPara = bulider.notInPara;
        this.limit = bulider.limit;
        this.limitPara = bulider.limitPara;
    }

    public static Params.Bulider builder() {
        return new Params.Bulider();
    }

    public static class Bulider{
        private List<String> and;
        private LinkedHashMap<String ,Object> andPara;

        private List<String> or;
        private LinkedHashMap<String ,Object> orPara;

        private List<String> between;
        private LinkedHashMap<String, List> betweenPara;

        private List<String> lessThan;
        private LinkedHashMap<String ,Object> lessThanPara;

        private List<String> moreThan;
        private LinkedHashMap<String ,Object> moreThanPara;

        private List<String> like;
        private LinkedHashMap<String ,Object> likePara;

        private List<String> notLike;
        private LinkedHashMap<String ,Object> notLikePara;

        private List<String> orderBy;
        private LinkedHashMap<String ,Object> orderByPara;

        private List<String> not;
        private LinkedHashMap<String ,Object> notPara;

        private List<String> in;
        private LinkedHashMap<String, List> inPara;

        private List<String> notIn;
        private LinkedHashMap<String, List> notInPara;

        private List<String> limit;
        private LinkedHashMap<String, List<Object>> limitPara;

        public Bulider euqal(String key , Object value){
            this.and = new ArrayList<>();
            this.andPara = new LinkedHashMap<>();
            this.and.add("=");
            this.andPara.put(key,value);
            return this;
        }

        public Bulider or(String key , Object value){
            this.or = new ArrayList<>();
            this.orPara = new LinkedHashMap<>();
            this.or.add("or");
            this.orPara.put(key,value);
            return this;
        }

        public Bulider between(String key , Object value1 , Object value2){
            this.between = new ArrayList<>();
            this.betweenPara = new LinkedHashMap<>();
            List<Object> value = new ArrayList<>();
            value.add(value1);
            value.add(value2);
            this.between.add("between");
            this.betweenPara.put(key,value);
            return this;
        }

        public Bulider lessThan(String key , Object value){
            this.lessThan = new ArrayList<>();
            this.lessThanPara = new LinkedHashMap<>();
            this.lessThan.add("<");
            this.lessThanPara.put(key,value);
            return this;
        }

        public Bulider moreThan(String key , Object value){
            this.moreThan = new ArrayList<>();
            this.moreThanPara = new LinkedHashMap<>();
            this.moreThan.add(">");
            this.moreThanPara.put(key,value);
            return this;
        }

        public Bulider like(String key , Object value){
            this.like = new ArrayList<>();
            this.likePara = new LinkedHashMap<>();
            this.like.add("like");
            this.likePara.put(key,value);
            return this;
        }

        public Bulider notLike(String key , Object value){
            this.notLike = new ArrayList<>();
            this.notLikePara = new LinkedHashMap<>();
            this.notLike.add("notlike");
            this.notLikePara.put(key,value);
            return this;
        }

        public Bulider orderBy(String key , Object value){
            this.orderBy = new ArrayList<>();
            this.orderByPara = new LinkedHashMap<>();
            this.orderBy.add("orderby");
            this.orderByPara.put(key,value);
            return this;
        }

        public Bulider notEqual(String key , Object value){
            this.not = new ArrayList<>();
            this.notPara = new LinkedHashMap<>();
            this.not.add("!=");
            this.notPara.put(key,value);
            return this;
        }

        public Bulider in(String key , Object ... values){
            this.in = new ArrayList<>();
            this.inPara = new LinkedHashMap<>();
            List<Object> list = new ArrayList<>(Arrays.asList(values));
            this.in.add("in");
            this.inPara.put(key,list);
            return this;
        }

        public Bulider notIn(String key , Object ... values){
            this.notIn = new ArrayList<>();
            this.notInPara = new LinkedHashMap<>();
            List<Object> list = new ArrayList<>(Arrays.asList(values));
            this.notIn.add("notin");
            this.notInPara.put(key,list);
            return this;
        }

        public Bulider limit(Integer value1 , Integer value2){
            this.limit = new ArrayList<>();
            this.limitPara = new LinkedHashMap<>();
            List<Object> list = new ArrayList<>();
            list.add(value1);
            list.add(value2);
            this.limit.add("limit");
            this.limitPara.put("limit",list);
            return this;
        }

        public Params build() {
            return new Params(this);
        }
    }

}